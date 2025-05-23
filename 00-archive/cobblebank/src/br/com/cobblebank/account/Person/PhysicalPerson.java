package br.com.cobblebank.account.Person;

public class PhysicalPerson extends Person {
  private String SSN;

  public PhysicalPerson(String firstName, String lastName, String address, int dateOfBirth, String contact, String SSN) {
    super(firstName, lastName, address, dateOfBirth, contact);
    this.SSN = SSN;
  }

  public String getSSN() {
    return SSN;
  }

  public void setSSN(String SSN) {
    this.SSN = SSN;
  }

}
