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

	wg.Add(2)

	fun1()

	fun2()

	wg.Wait()
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
	wg.Done()
}
