package internal

import (
	"fmt"
	"reflect"
)

type Person struct {
	Name string `required:"true"`
	Age  int
}

func StructToMap(obj any) map[string]any {
	result := make(map[string]any)

	typ := reflect.TypeOf(obj)
	val := reflect.ValueOf(obj)
	if val.Kind() == reflect.Ptr {
		val = val.Elem()
		typ = typ.Elem()
	}

	for i := range val.NumField() {
		field := typ.Field(i)

		result[field.Name] = val.Field(i).Interface()
	}
	return result
}

func CheckRequired(obj any) {
	typ := reflect.TypeOf(obj)
	val := reflect.ValueOf(obj)
	if val.Kind() == reflect.Ptr {
		val = val.Elem()
		typ = typ.Elem()
	}

	for i := range val.NumField() {
		field := typ.Field(i)
		tag := field.Tag.Get("required")

		if tag == "true" {
			fieldVal := val.Field(i)
			zero := reflect.Zero(field.Type).Interface()
			actual := fieldVal.Interface()

			if reflect.DeepEqual(actual, zero) {
				fmt.Println("Campo obrigatorio vazio:", field.Name)
			}
		}
	}
}

func ChangeField(obj any, fieldName string, value string) {
	val := reflect.ValueOf(obj).Elem()

	field := val.FieldByName(fieldName)

	if field.CanSet() {
		field.SetString(value)
	}
}

func saudacao(name string) {
	fmt.Println("Saudação", name)
}

func CallfuncSaudacao(name string) {
	funcao := reflect.ValueOf(saudacao)
	args := []reflect.Value{reflect.ValueOf(name)}
	funcao.Call(args)
}

func DynamicConstrutor(name string) {
	tipo := reflect.TypeOf(Person{})
	instancia := reflect.New(tipo).Elem()

	instancia.FieldByName("Name").SetString(name)
	fmt.Println(instancia)
}

func PrintCampos(obj any) {
	val := reflect.ValueOf(obj)
	typ := reflect.TypeOf(obj)

	for i := range val.NumField() {
		fmt.Printf("%s = %v\n", typ.Field(i).Name, val.Field(i).Interface())
	}
}

func DynamicSlices(list []string) {
	val := reflect.ValueOf(list)

	for i := range val.Len() {
		fmt.Println(val.Index(i))
	}
}

// TODO 
// CRIAR UMA FUNÇÃO QUE COPIAR APENAS DADOS PREENCHIDO E
// RETONAR UMA STRUCT COMPLETA
