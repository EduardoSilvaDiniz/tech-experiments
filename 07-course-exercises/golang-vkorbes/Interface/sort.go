package main

import (
	"fmt"
	"sort"
)

type inverter []int

func (a inverter) Len() int           { return len(a) }
func (a inverter) Swap(i, j int)      { a[i], a[j] = a[j], a[i] }
func (a inverter) Less(i, j int) bool { return a[i] < a[j] }

func main() {
	si := []int{30, 10, 2, 100, 90}
	fmt.Println(si)

	//sort.Sort(inverter(si))
	sort.Ints(si)

	fmt.Println(si)

	inversa := make([]int, len(si))

	for i := 0; i < len(si); i++ {
		inversa[i] = si[len(si)-(1+i)]
	}

	fmt.Println(inversa)
}
