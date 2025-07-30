package com.example.adapter.input.controller.routes

import com.example.adapter.input.controller.UserController
import io.ktor.server.application.Application
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.post
import io.ktor.server.routing.routing

fun Application.configureRouting(userController: UserController) {
  routing {
    get("/") {
      call.respondText("Hello World!")
    }
    get("/user/:userEmail") {
      userController.FindUserByEmail()
    }
    get("/user/:userId") {
      userController.FindUserByID()
    }
    post("/user") {
      userController.CreateUser()
    }
  }
}
