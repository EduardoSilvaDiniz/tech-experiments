package main

import (
	"fmt"
	"runtime"
	"sync"
	"sync/atomic"
)

var wg sync.WaitGroup

func main() {
	println("cpus", runtime.NumCPU())

	var contador int64
	contador = 0
	totaldegoroutines := 1000

	var wg sync.WaitGroup

	wg.Add(totaldegoroutines)

	for i := 0; i < totaldegoroutines; i++ {
		go func() {
			atomic.AddInt64(&contador, 1)
			runtime.Gosched()
			fmt.Printf("atomic.LoadInt64(&contador): %v\n", atomic.LoadInt64(&contador))
			wg.Done()
		}()
	}

	wg.Wait()
	fmt.Printf("contador: %v\n", contador)
}
