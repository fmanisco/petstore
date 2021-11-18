package it.beccaria.petstore.service;

import org.springframework.stereotype.Service;

import it.beccaria.petstore.dto.valid.PesceDtoValid;
import it.beccaria.petstore.model.Pesce;
import it.beccaria.petstore.repository.PesceJpaRepository;
import it.beccaria.service.BeccariaGenericRestService;

@Service
public class PesceRestService extends
		BeccariaGenericRestService<Pesce, PesceDtoValid, Long, PesceJpaRepository> {

}