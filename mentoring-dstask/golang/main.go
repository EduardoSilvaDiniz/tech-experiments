package main

import (
	f "fmt"
	"os"
	"os/exec"
	"runtime"
)

type task struct {
	value int
	id    int
	next  *task
}

var cleanTUI map[string]func()

func main() {
	queueHead := &task{}
	listHead := &task{}
	stackHead := &task{}
	var choise int

	for {
		CallClear()
		displayMenu()

		f.Printf("choose an option: ")
		f.Scan(&choise)

		if choise == 0 {
			f.Printf("Exiting program\n")
			break
		}

		switch choise {
		case 1:
			// CREATE A TASK, THEN ADD TO PENDING QUEUE
			newTask := createTask()
			addTask(queueHead, newTask)

		case 2:
			// SEE ALL TASKS FROM PENDING QUEUE
			ShowTasks(queueHead)

		case 3:
			// COMPLETE FIRST PENDING TASK
			firstTask := getFirstTask(queueHead)
			if firstTask != nil {
				addToCompletedList(listHead, firstTask)
			}

		case 4:
			// SEE ALL TASKS FROM COMPLETED LIST
			seeAllCompletedList(listHead)

		case 5:
			// SET COMPLETED TASK TO DRAFT
			var id int

			f.Printf("Enter Task ID (number): ")
			f.Scan(&id)

			task := removeFromCompletedListByItsId(listHead, id)
			if task != nil {
				pushToDraftStack(stackHead, task)
			}

		case 6:
			// SEE ALL TASKS FROM DRAFT STACK
			seeAllDraftStack(stackHead)

		case 7:
			// SET LAST DRAFT AS PENDING TASK
			lastTask := popFromDraftStack(stackHead)
			if lastTask != nil {
				putToPendingQueue(queueHead, lastTask)
			}

		default:
			f.Printf("Invalid choice\n")
		}
	}
}

func createTask() *task {
	var value int
	var id int

	f.Printf("digite o valor: ")
	f.Scan(&value)

	f.Printf("digite o id: ")
	f.Scan(&id)

	newTask := &task{value: value, id: id, next: nil}
	return newTask
}

func addTask(head *task, newTask *task) {
	if head == nil {
		return
	}
	curr := head

	for curr.next != nil {
		curr = curr.next
	}
	curr.next = newTask
}

func ShowTasks(head *task) {
	curr := head.next
	var input string

	f.Printf("\n")
	for curr != nil {
		f.Printf("value: %v id: %v -> ", curr.value, curr.id)
		curr = curr.next
	}
	f.Printf("Nil \n")

	f.Print("aperte enter para continuar")
	f.Scan(&input)
}

func getFirstTask(head *task) *task {
	if head.next == nil {
		return nil
	} else {
		curr := head.next
		head.next = curr.next
		curr.next = nil
		return curr
	}
}

func addToCompletedList(head *task, firstTask *task) {
	if head == nil {
		return
	} else {
		curr := head
		for curr.next != nil {
			curr = curr.next
		}
		curr.next = firstTask
	}
}

func seeAllCompletedList(head *task) {
	curr := head.next
	var input string

	f.Printf("\n")
	for curr != nil {
		f.Printf("value: %v id: %v -> ", curr.value, curr.id)
		curr = curr.next
	}
	f.Printf("Nil \n")

	f.Print("aperte enter para continuar")
	f.Scan(&input)
}

func removeFromCompletedListByItsId(head *task, id int) *task {
	if head == nil {
		return nil
	}

	curr := head.next

	for curr.next != nil {
		if curr.next.id == id {
			swapTask := curr.next
			curr.next = swapTask.next
			swapTask.next = nil
			return swapTask
		}

		curr = curr.next
	}
	return nil
}

func pushToDraftStack(head *task, task *task) {
	if head == nil {
		return
	}
	curr := head

	for curr.next != nil {
		curr = curr.next
	}
	curr.next = task
}

func seeAllDraftStack(head *task) {
	curr := head.next
	var input string

	f.Printf("\n")
	for curr != nil {
		f.Printf("value: %v id: %v -> ", curr.value, curr.id)
		curr = curr.next
	}
	f.Printf("Nil \n")

	f.Print("aperte enter para continuar")
	f.Scan(&input)

}

func popFromDraftStack(head *task) *task {
	if head == nil {
		return nil
	}

	curr := head.next

	for curr.next.next != nil {
		curr = curr.next
	}
	swapTask := curr.next
	curr.next = nil

	return swapTask
}

func putToPendingQueue(head *task, task *task) {
	if head == nil {
		return
	}

	curr := head.next

	for curr.next != nil {
		curr = curr.next
	}

	curr.next = task
}

func init() {
	cleanTUI = make(map[string]func())
	cleanTUI["linux"] = func() {
		cmd := exec.Command("clear")
		cmd.Stdout = os.Stdout
		cmd.Run()
	}
	cleanTUI["windows"] = func() {
		cmd := exec.Command("cmd", "/c", "cls")
		cmd.Stdout = os.Stdout
		cmd.Run()
	}
}

func CallClear() {
	value, ok := cleanTUI[runtime.GOOS]
	if ok {
		value()
	} else {
		panic("your platform is unsuppoted!")
	}
}

func displayMenu() {
	f.Printf("\nMenu:\n")
	f.Printf("1 - Create New Pending Task\n")
	f.Printf("2 - See All Pending Tasks\n")
	f.Printf("3 - Complete First Pending Task\n")
	f.Printf("4 - See All Completed Tasks\n")
	f.Printf("5 - Set Completed Task as Draft by its ID\n")
	f.Printf("6 - See All Draft Tasks\n")
	f.Printf("7 - Set Last Draft Task as Pending Task\n")
	f.Printf("0 - Exit\n")
}
