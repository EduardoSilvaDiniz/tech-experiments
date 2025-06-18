package br.org.mdm.entity;

import br.org.mdm.vo.CPF;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "pays")
public class PayEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private LocalDateTime payDay;

  @Column(nullable = false)
  private LocalDate monthReference;

  @Column(nullable = false)
  private Integer value;

  @Embedded
  @Column(nullable = false)
  private CPF cpf;

  // @PrePersist
  // public void prePersist(){
  // 	this.payDay = LocalDateTime.now();
  // }

  public CPF getCpf() {
    return cpf;
  }

  public void setCpf(CPF cpf) {
    this.cpf = cpf;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDateTime getPayDay() {
    return payDay;
  }

  public void setPayDay(LocalDateTime payDay) {
    this.payDay = payDay;
  }

  public LocalDate getMonthReference() {
    return monthReference;
  }

  public void setMonthReference(LocalDate monthReference) {
    this.monthReference = monthReference;
  }

  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }
}
