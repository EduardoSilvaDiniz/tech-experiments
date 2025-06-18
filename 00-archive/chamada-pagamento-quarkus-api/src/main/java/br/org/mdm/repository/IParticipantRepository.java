package br.org.mdm.repository;

import jakarta.enterprise.context.ApplicationScoped;

import br.org.mdm.entity.ParticipantEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public interface IParticipantRepository extends PanacheRepository<ParticipantEntity> {}
