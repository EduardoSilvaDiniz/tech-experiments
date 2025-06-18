package br.org.mdm.repository;

import br.org.mdm.entity.PayEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public interface IPayRepository extends PanacheRepository<PayEntity> {}
