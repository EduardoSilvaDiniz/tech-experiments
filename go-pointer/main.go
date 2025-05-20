package main

import (
	"fmt"
)


func main() {
	for range 10 {
		newName := createPointer("edu")
		fmt.Println(&newName)
	}
}

func createPointer(name string) *string {
	newName := new(string)
	*newName = name
	return newName
}

