package br.org.mdm.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import br.org.mdm.record.Participant;
import br.org.mdm.vo.Address;
import br.org.mdm.vo.CPF;
import br.org.mdm.vo.MaritalStatus;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "participants")
public class ParticipantEntity extends PanacheEntity {
  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private String phone;

  @Column(nullable = false)
  private Address address;

  @Column(name = "marital_status", nullable = false)
  private MaritalStatus maritalStatus;

  @Column(nullable = false)
  private CPF cpf;

  public ParticipantEntity() {}

  public ParticipantEntity(Participant entity) {
    this.id = entity.id();
    this.name = entity.name();
    this.phone = entity.phone();
		this.address = entity.address();
		this.maritalStatus = entity.maritalStatus();
		this.cpf = entity.cpf();
  }

  // @PrePersist
  // public void prePersist(
  //     Integer number, String district, String street, MaritalStatus maritalStatus) {
  //   this.address = new Address(number, district, street);
  //   this.maritalStatus = maritalStatus;
  // }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    ParticipantEntity other = (ParticipantEntity) obj;
    return Objects.equals(id, other.id);
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public MaritalStatus getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(MaritalStatus maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public CPF getCpf() {
    return cpf;
  }

  public void setCpf(CPF cpf) {
    this.cpf = cpf;
  }
}
