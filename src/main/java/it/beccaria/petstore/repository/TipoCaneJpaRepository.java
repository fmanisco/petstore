package it.beccaria.petstore.repository;

import org.springframework.stereotype.Repository;

import it.beccaria.repository.BeccariaJpaRepository;
import it.beccaria.petstore.model.TipoCane;

@Repository
public interface TipoCaneJpaRepository extends BeccariaJpaRepository<TipoCane, Long> {

}
