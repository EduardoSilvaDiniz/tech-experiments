package main

import "fmt"

func main() {
	sum(1, 2)
	sum(1, 2, 3)

	nums := []int{1, 2, 3, 4}
	sum(nums...)

	saudacao("edu")
}

func sum(nums ...int) {
	fmt.Print(nums, " ")
	total := 0
	// defer fmt.Println(total) // aqui por algum motivo não funciona

	for _, num := range nums {
		total += num
	}
	fmt.Println(total)
}

func saudacao(name string) {
	if name != "" {
		defer fmt.Println(name)
	}

	fmt.Println("saudacao")
}
