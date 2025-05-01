package com.exemple.pattern.dependencyinjection;

public class PersonController {

  private final PersonService service;

  public PersonController(PersonService service) {
    this.service = service;
  }

  public Person getPerson() {
    return service.getPerson();
  }

  public Person createPerson() {
    return service.createPerson();
  }
}
