package it.beccaria.petstore.repository;

import org.springframework.stereotype.Repository;

import it.beccaria.repository.BeccariaJpaRepository;
import it.beccaria.petstore.model.Cane;

@Repository
public interface CaneJpaRepository extends BeccariaJpaRepository<Cane, Long> {

}
