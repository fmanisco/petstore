package it.beccaria.petstore.service;

import org.springframework.stereotype.Service;

import it.beccaria.petstore.dto.valid.PetDtoValid;
import it.beccaria.petstore.model.Pet;
import it.beccaria.petstore.repository.PetJpaRepository;
import it.beccaria.service.BeccariaGenericRestService;

@Service
public class PetRestService extends
		BeccariaGenericRestService<Pet, PetDtoValid, Long, PetJpaRepository> {

}