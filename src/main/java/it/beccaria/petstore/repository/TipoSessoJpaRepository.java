package it.beccaria.petstore.repository;

import org.springframework.stereotype.Repository;

import it.beccaria.repository.BeccariaJpaRepository;
import it.beccaria.petstore.model.TipoSesso;

@Repository
public interface TipoSessoJpaRepository extends BeccariaJpaRepository<TipoSesso, Long> {

}
