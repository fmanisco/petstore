package it.beccaria.petstore.repository;

import org.springframework.stereotype.Repository;

import it.beccaria.repository.BeccariaJpaRepository;
import it.beccaria.petstore.model.Petstore;

@Repository
public interface PetstoreJpaRepository extends BeccariaJpaRepository<Petstore, Long> {

}
