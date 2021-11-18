package it.beccaria.petstore.assembler;



import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import it.beccaria.assembler.BeccariaGenericAssembler;
import it.beccaria.petstore.dto.valid.PetDtoValid;
import it.beccaria.petstore.model.Pet;

@Component
public class PetAssembler
		implements BeccariaGenericAssembler<Pet, PetDtoValid> {


	@Override
	public Pet createFrom(PetDtoValid dto) {
		final var entity = new Pet();
		BeanUtils.copyProperties(dto,entity );
		return entity;
	}

	@Override
	public PetDtoValid createFrom(Pet entity) {
		final var dto = new PetDtoValid();
		BeanUtils.copyProperties(entity,dto);
		return dto;
	}

	@Override
	public Pet updateEntity(Pet source, Pet target,
			boolean ignoreNulls) {
		BeanUtils.copyProperties( source,target);
		return target;
	}


}
