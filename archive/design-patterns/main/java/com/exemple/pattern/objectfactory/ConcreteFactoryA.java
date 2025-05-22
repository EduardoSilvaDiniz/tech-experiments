package com.exemple.pattern.objectfactory;

public class ConcreteFactoryA implements Factory {

  @Override
  public Product factoryMethod() {
		return new ConcreteProductA();
  }
}
