package it.beccaria.petstore.service;

import org.springframework.stereotype.Service;

import it.beccaria.petstore.dto.PetstoreDto;
import it.beccaria.petstore.model.Petstore;
import it.beccaria.petstore.repository.PetstoreJpaRepository;
import it.beccaria.service.BeccariaGenericRestService;

@Service
public class PetstoreRestService extends
		BeccariaGenericRestService<Petstore, PetstoreDto, Long, PetstoreJpaRepository> {

}