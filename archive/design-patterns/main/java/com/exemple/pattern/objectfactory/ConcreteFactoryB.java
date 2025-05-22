package com.exemple.pattern.objectfactory;

public class ConcreteFactoryB implements Factory {

  @Override
  public Product factoryMethod() {
		return new ConcreteProductB();
  }
}
