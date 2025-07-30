package com.example.application.service

import com.example.application.domain.UserDomain
import com.example.application.port.input.UserDomainInterface
import com.example.application.port.output.UserRepositoryInterface

class UserDomainService(val repository: UserRepositoryInterface) : UserDomainInterface {
  override fun CreateUserService(userDomain: UserDomain): UserDomain {
    TODO("Not yet implemented")
  }

  override fun FindUserByIDService(userDomain: UserDomain): UserDomain {
    TODO("Not yet implemented")
  }

  override fun FindUserByEmailService(userDomain: UserDomain): UserDomain {
    TODO("Not yet implemented")
  }
}