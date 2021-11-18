package it.beccaria.petstore.repository;

import org.springframework.stereotype.Repository;

import it.beccaria.repository.BeccariaJpaRepository;
import it.beccaria.petstore.model.Titolare;

@Repository
public interface TitolareJpaRepository extends BeccariaJpaRepository<Titolare, Long> {

}
