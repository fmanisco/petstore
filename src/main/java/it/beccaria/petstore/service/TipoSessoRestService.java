package it.beccaria.petstore.service;

import org.springframework.stereotype.Service;

import it.beccaria.petstore.dto.TipoSessoDto;
import it.beccaria.petstore.model.TipoSesso;
import it.beccaria.petstore.repository.TipoSessoJpaRepository;
import it.beccaria.service.BeccariaGenericRestService;

@Service
public class TipoSessoRestService extends
		BeccariaGenericRestService<TipoSesso, TipoSessoDto, Long, TipoSessoJpaRepository> {

}