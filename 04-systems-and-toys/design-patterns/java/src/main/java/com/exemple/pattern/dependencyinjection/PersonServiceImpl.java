package com.exemple.pattern.dependencyinjection;

public class PersonServiceImpl implements PersonService {

  @Override
  public Person getPerson() {
    Person person = new Person("jade", 6);
    return person;
  }

  @Override
  public Person createPerson() {
    Person person = new Person("jade", 6);
    return person;
  }
}
