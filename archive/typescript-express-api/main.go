package main

import f "fmt"

type task struct {
	value int
	next  *task
}

func main() {
	FifoHead := &task{}
	ListHead := &task{}
	stackHead := &task{}
	var choise int

	for {
		displayMenu()

		f.Printf("choose an option: ")
		f.Scan(&choise)
		switch choise {
		case 1:
			// CREATE A TASK, THEN ADD TO PENDING QUEUE
			newTask := createTask()
			addTask(FifoHead, newTask)

		case 2:
			// SEE ALL TASKS FROM PENDING QUEUE
			ShowTasks(FifoHead)

		case 3:
			// COMPLETE FIRST PENDING TASK
			firstTask := getFirstTask(FifoHead)
			if firstTask != nil {
				addToCompletedList(firstTask, ListHead)
			}

			// case 4:
			//   // SEE ALL TASKS FROM COMPLETED LIST
			//   seeAllCompletedList();
			//   break;
			//
			// case 5:
			//   // SET COMPLETED TASK TO DRAFT
			//   var id int
			//
			//   f.Printf("Enter Task ID (number): ");
			//   scanf("%d", &id);
			//
			//   task := removeFromCompletedListByItsId(id);
			//   if(task != NULL) {
			//     pushToDraftStack(task);
			//   }
			//   break;
			//
			// case 6:
			//   // SEE ALL TASKS FROM DRAFT STACK
			//   seeAllDraftStack();
			//   break;
			//
			// case 7:
			//   // SET LAST DRAFT AS PENDING TASK
			//   lastTask := popFromDraftStack();
			//   if(lastTask != NULL) {
			//     putToPendingQueue(task);
			//   }
			//   break;
			//
			// case 0:
			//   f.Printf("Exiting program\n");
			//   break;
			//
			// default:
			//   f.Printf("Invalid choice\n");
			//   break;
		}
	}
}

func createTask() *task {

	var value int
	f.Scan(&value)

	newTask := &task{value: value}
	return newTask
}

func addTask(FifoHead *task, newTask *task) {
	curr := FifoHead

	for curr.next != nil {
		curr = curr.next
	}
	curr.next = newTask
}

func ShowTasks(FifoHead *task) {
	curr := FifoHead.next

	for curr != nil {
		f.Printf("curr.value: %v\n", curr.value)
		curr = curr.next
	}
}

func getFirstTask(head *task) *task {
	if head == nil || head.next == nil {
		return nil
	} else {
		return head.next
	}
}

func addToCompletedList(firstTask *task, head *task) {
	if head == nil {
		f.Printf("head is nil")
	} else {
		head.next = firstTask
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
