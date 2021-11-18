package it.beccaria.petstore.service;

import org.springframework.stereotype.Service;

import it.beccaria.petstore.dto.valid.CaneDtoValid;
import it.beccaria.petstore.model.Cane;
import it.beccaria.petstore.repository.CaneJpaRepository;
import it.beccaria.service.BeccariaGenericRestService;

@Service
public class CaneRestService extends
		BeccariaGenericRestService<Cane, CaneDtoValid, Long, CaneJpaRepository> {

}