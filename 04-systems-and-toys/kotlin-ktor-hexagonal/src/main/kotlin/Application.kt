package com.example

import com.example.adapter.input.controller.UserController
import com.example.adapter.input.controller.routes.configureRouting
import com.example.application.service.UserDomainService
import io.ktor.server.application.*
import java.sql.DatabaseMetaData

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun InitDepedencies(val database: DatabaseMetaData): UserController {
    userRepo = UserRepository(database)
    userService = UserDomainService(userRepo)
    return UserController(userService)
}

fun Application.module() {
    val database: DatabaseMetaData
    userController = initDepedencies(database)
    configureRouting(userController)
}