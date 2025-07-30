package com.example.application.port.input

import com.example.application.domain.UserDomain

interface UserDomainInterface {
  fun CreateUserService(userDomain: UserDomain) : UserDomain
  fun FindUserByIDService(userDomain: UserDomain): UserDomain
  fun FindUserByEmailService(userDomain: UserDomain): UserDomain
}