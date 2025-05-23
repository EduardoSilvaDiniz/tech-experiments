// docker run --name {DOCKER_NAME} -e MYSQL_ROOT_PASSWORD={PASSWORD} -d mysql:8
// docker inspect {first four container id} and get "IPAddress": IP
package main

import (
	"database/sql"
	"fmt"

	_ "github.com/go-sql-driver/mysql"
)

var (
	err error
	db  *sql.DB
)

type User struct {
	Name string
	Age  int
}

func main() {
	db, err = sql.Open("mysql", "root:test123@tcp({IPAddress}:3306)/users_db")
	if err != nil {
		panic(err)
	}

	err = db.Ping()
	if err != nil {
		panic(err)
	}

	fmt.Println("conectado!")

	user := User{
		Name: "ronaldinho",
		Age:  80,
	}

	err = createUser(user)
	if err != nil {
		panic(err)
	}

	err = readUser()
	if err != nil {
		panic(err)
	}

	err = updateUser("ronaldinho", 120)
	if err != nil {
		panic(err)
	}

	err = readUser()
	if err != nil {
		panic(err)
	}

	err = deleteUser("ronaldinho")
	if err != nil {
		panic(err)
	}

	err = readUser()
	if err != nil {
		panic(err)
	}
}

func createUser(user User) error {
	_, err := db.Exec(fmt.Sprintf("INSERT INTO user_data VALUES('%s', %d)", user.Name, user.Age))
	if err != nil {
		return err
	}

	fmt.Printf("Usuario inserido com sucesso\n")
	return nil
}

func readUser() error {
	rows, err := db.Query("SELECT name, age FROM user_data")
	if err != nil {
		return err
	}

	fmt.Println("Tabela completa:")

	for rows.Next() {
		var name string
		var age int
		err = rows.Scan(&name, &age)
		if err != nil {
			return err
		}
		fmt.Printf("name: %s, age: %d\n", name, age)
	}

	return nil
}

func updateUser(name string, age int) error {
	upd, err := db.Prepare("UPDATE user_data SET Age = ? WHERE Name = ?")
	if err != nil {
		return err
	}

	_, err = upd.Exec(age, name)
	if err != nil {
		return err
	}

	fmt.Printf("usuario %s atualizado com sucesso\n", name)
	return nil
}

func deleteUser(name string) error {
	del, err := db.Prepare("DELETE FROM user_data WHERE name = ?")
	if err != nil {
		return err
	}

	_, err = del.Exec(name)
	if err != nil {
		return err
	}

	fmt.Printf("usuario %s removido com sucesso\n", name)
	return nil
}
