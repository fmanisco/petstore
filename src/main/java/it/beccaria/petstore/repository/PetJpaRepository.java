package it.beccaria.petstore.repository;

import org.springframework.stereotype.Repository;

import it.beccaria.repository.BeccariaJpaRepository;
import it.beccaria.petstore.model.Pet;

@Repository
public interface PetJpaRepository extends BeccariaJpaRepository<Pet, Long> {

}
