package controllers

import (
	"fmt"
	"net/http"

	entities "menu-login/src/api/entities"

	"github.com/gin-gonic/gin"
)

type loginController struct {
	users []entities.User
}

func NewLoginController() *loginController {
	return &loginController{}
}

func (u *loginController) FindAll(ctx *gin.Context) { // GET
	ctx.JSON(http.StatusOK, gin.H{
		"message": "TUDO OK",
	})
}

func (u *loginController) Create(ctx *gin.Context) { // POST
	user := entities.NewUser()

	if err := ctx.BindJSON(&user); err != nil {
		fmt.Println(err)
		return
	}

	u.users = append(u.users, *user)

	ctx.JSON(http.StatusOK, gin.H{
		"username": user.Username, "password": user.Password,
	})
}
