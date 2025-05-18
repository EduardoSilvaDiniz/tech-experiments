package com.exemple.pattern.dependencyinjection;

public class Main {
  public static void main(String[] args) {

    // instancia a implementação
    PersonService service = new PersonServiceImpl();

    // injeção de dependencia
    PersonController controller = new PersonController(service);

    // a controller não reconhece a implementação, apenas a interface
    // "saber quando enviar uma mensagem, mas sem se preocupar em como" - Eric
    // Evans Domain-Driven Design
    Person person = controller.createPerson();

    System.out.println(person.getName() + " " + person.getAge());
  }
}
