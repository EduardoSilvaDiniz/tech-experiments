package br.org.mdm.record;

import br.org.mdm.entity.ParticipantEntity;
import br.org.mdm.vo.Address;
import br.org.mdm.vo.CPF;
import br.org.mdm.vo.MaritalStatus;

public record Participant(
    Long id, String name, String phone, Address address, MaritalStatus maritalStatus, CPF cpf) {

  public static Participant fromEntity(ParticipantEntity entity) {
    return new Participant(
        entity.getId(),
        entity.getName(),
        entity.getPhone(),
        entity.getAddress(),
        entity.getMaritalStatus(),
        entity.getCpf());
  }
}
