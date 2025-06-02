package main

import (
	"fmt"
	"runtime"
	"sync"
	"time"
)

var wg sync.WaitGroup

func main() {
	println("cpus", runtime.NumCPU())
	println("goroutines:", runtime.NumGoroutine())

	contador := 0
	totaldegoroutines := 1000

	var wg sync.WaitGroup
	var wu sync.Mutex

	wg.Add(totaldegoroutines)

	for i := 0; i < totaldegoroutines; i++ {
		go func() {
			wu.Lock()
			v := contador
			runtime.Gosched()
			v++
			contador = v
			wu.Unlock()
			println("goroutines:", runtime.NumGoroutine())
			wg.Done()
		}()
	}

	wg.Wait()
	fmt.Printf("contador: %v\n", contador)
}

func fun1() {
	for i := 0; i < 100; i++ {
		fmt.Println("func1:", i)
	}
	wg.Done()
}

func fun2() {
	for i := 0; i < 100; i++ {
		fmt.Println("func2:", i)
		time.Sleep(20)
	}
}
