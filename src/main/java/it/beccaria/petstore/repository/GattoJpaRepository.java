package it.beccaria.petstore.repository;

import org.springframework.stereotype.Repository;

import it.beccaria.repository.BeccariaJpaRepository;
import it.beccaria.petstore.model.Gatto;

@Repository
public interface GattoJpaRepository extends BeccariaJpaRepository<Gatto, Long> {

}
