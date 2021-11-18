package it.beccaria.petstore.service;

import org.springframework.stereotype.Service;

import it.beccaria.petstore.dto.TipoGattoDto;
import it.beccaria.petstore.model.TipoGatto;
import it.beccaria.petstore.repository.TipoGattoJpaRepository;
import it.beccaria.service.BeccariaGenericRestService;

@Service
public class TipoGattoRestService extends
		BeccariaGenericRestService<TipoGatto, TipoGattoDto, Long, TipoGattoJpaRepository> {

}