package it.beccaria.petstore.repository;

import org.springframework.stereotype.Repository;

import it.beccaria.repository.BeccariaJpaRepository;
import it.beccaria.petstore.model.Pesce;

@Repository
public interface PesceJpaRepository extends BeccariaJpaRepository<Pesce, Long> {

}
