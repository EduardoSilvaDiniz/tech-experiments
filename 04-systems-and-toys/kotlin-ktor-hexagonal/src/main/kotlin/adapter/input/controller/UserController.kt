package com.example.adapter.input.controller

import com.example.application.service.UserDomainService

interface UserControllerInterface {
  fun CreateUser()
  fun FindUserByID()
  fun FindUserByEmail()
}

class UserController(val service: UserDomainService) : UserControllerInterface {
  override fun CreateUser() {
    TODO("Not yet implemented")
  }

  override fun FindUserByID() {
    TODO("Not yet implemented")
  }

  override fun FindUserByEmail() {
    TODO("Not yet implemented")
  }
}