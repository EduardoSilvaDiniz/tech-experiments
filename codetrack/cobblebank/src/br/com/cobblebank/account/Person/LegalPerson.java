package br.com.cobblebank.account.Person;

public class LegalPerson extends Person {
  private String EIN;

    public LegalPerson(String firstName, String lastName, String address, int dateOfBirth, String contact, String EIN) {
        super(firstName, lastName, address, dateOfBirth, contact);
        this.EIN = EIN;
    }

    public String getEIN() {
        return EIN;
    }

    public void setEIN(String EIN) {
        this.EIN = EIN;
    }
}
