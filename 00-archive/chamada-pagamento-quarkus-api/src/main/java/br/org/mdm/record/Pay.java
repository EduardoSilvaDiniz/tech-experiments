package br.org.mdm.record;

import java.time.LocalDate;
import java.time.LocalDateTime;

import br.org.mdm.entity.PayEntity;
import br.org.mdm.vo.CPF;

public record Pay(Long id, CPF cpf, LocalDateTime payDay, LocalDate monthReference, Integer value) {

  public static Pay fromEntity(PayEntity entity) {
    return new Pay(
        entity.getId(),
        entity.getCpf(),
        entity.getPayDay(),
        entity.getMonthReference(),
        entity.getValue());
  }
}
