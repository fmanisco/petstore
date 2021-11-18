package it.beccaria.petstore.service;

import org.springframework.stereotype.Service;

import it.beccaria.petstore.dto.valid.TitolareDtoValid;
import it.beccaria.petstore.model.Titolare;
import it.beccaria.petstore.repository.TitolareJpaRepository;
import it.beccaria.service.BeccariaGenericRestService;

@Service
public class TitolareRestService extends
		BeccariaGenericRestService<Titolare, TitolareDtoValid, Long, TitolareJpaRepository> {

}