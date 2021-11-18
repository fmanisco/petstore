package it.beccaria.petstore.repository;

import org.springframework.stereotype.Repository;

import it.beccaria.repository.BeccariaJpaRepository;
import it.beccaria.petstore.model.TipoGatto;

@Repository
public interface TipoGattoJpaRepository extends BeccariaJpaRepository<TipoGatto, Long> {

}
