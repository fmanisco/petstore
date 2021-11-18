package it.beccaria.petstore.service;

import org.springframework.stereotype.Service;

import it.beccaria.petstore.dto.valid.GattoDtoValid;
import it.beccaria.petstore.model.Gatto;
import it.beccaria.petstore.repository.GattoJpaRepository;
import it.beccaria.service.BeccariaGenericRestService;

@Service
public class GattoRestService extends
		BeccariaGenericRestService<Gatto, GattoDtoValid, Long, GattoJpaRepository> {

}