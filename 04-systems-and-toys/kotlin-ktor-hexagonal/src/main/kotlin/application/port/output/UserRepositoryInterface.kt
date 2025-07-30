package com.example.application.port.output

import com.example.application.domain.UserDomain

interface UserRepositoryInterface {
  fun CreateUser(userDomain: UserDomain): UserDomain
  fun FindUserByEmail(userDomain: UserDomain): UserDomain
  fun FindUserByID(userDomain: UserDomain): UserDomain
}