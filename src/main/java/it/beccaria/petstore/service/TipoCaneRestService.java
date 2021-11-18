package it.beccaria.petstore.service;

import org.springframework.stereotype.Service;

import it.beccaria.petstore.dto.TipoCaneDto;
import it.beccaria.petstore.model.TipoCane;
import it.beccaria.petstore.repository.TipoCaneJpaRepository;
import it.beccaria.service.BeccariaGenericRestService;

@Service
public class TipoCaneRestService extends
		BeccariaGenericRestService<TipoCane, TipoCaneDto, Long, TipoCaneJpaRepository> {

}