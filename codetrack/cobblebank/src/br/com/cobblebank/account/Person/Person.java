package br.com.cobblebank.account.Person;

import java.io.Serializable;

public abstract class Person implements Serializable {
  protected String firstName;
  protected String lastName;
  protected String address;
  protected int dateOfBirth;
  protected String contact;

  public Person(String firstName, String lastName, String address, int dateOfBirth, String contact) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.dateOfBirth = dateOfBirth;
    this.contact = contact;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(int dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }
}
