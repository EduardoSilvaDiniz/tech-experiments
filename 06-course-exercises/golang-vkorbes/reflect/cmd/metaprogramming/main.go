package main

import (
	"fmt"
	"metaprogramming/internal"
)

func main() {
	person := internal.Person{
		Name: "edu",
		Age:  0,
	}
	internal.CheckRequired(&person)

	fmt.Println(person.Name)

	internal.ChangeField(&person, "Name", "lalalal")

	internal.CallfuncSaudacao(person.Name)

	internal.DynamicConstrutor("jose")

	list := []string{"a", "b", "c"}
	internal.DynamicSlices(list)

	// personMapInterface := internal.StructToMap(person)
	//
	// fmt.Println(personMapInterface["Name"])
}
