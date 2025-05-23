package main

import (
	"database/sql"
	"fmt"
	"os/exec"
	"strings"

	_ "github.com/go-sql-driver/mysql"
)

var (
	err error
	db  *sql.DB
)

func main() {
	cmd := exec.Command("./get-ip.sh", "1783")

	output, err := cmd.Output()
	if err != nil {
		panic(err)
	}

	result := strings.TrimSpace(string(output)) // remove spaces

	db, err = sql.Open("mysql", fmt.Sprintf("root:test123@tcp(%s:3306)/users_db", result))
	if err != nil {
		panic(err)
	}

	err = db.Ping()
	if err != nil {
		panic(err)
	}

	fmt.Println("conectado!")
}
