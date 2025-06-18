package br.org.mdm.vo;

import jakarta.persistence.Embeddable;

@Embeddable
public class CPF {
  private String cpf;

  public CPF() {}

  public CPF(String cpf) {
    this.cpf = cpf;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
