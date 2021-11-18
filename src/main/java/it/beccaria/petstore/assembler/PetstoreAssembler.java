package it.beccaria.petstore.assembler;



import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import it.beccaria.petstore.dto.PetstoreDto;
import it.beccaria.petstore.model.Petstore;
import it.beccaria.assembler.BeccariaGenericAssembler;

@Component
public class PetstoreAssembler
		implements BeccariaGenericAssembler<Petstore, PetstoreDto> {



	@Override
	public Petstore createFrom(PetstoreDto dto) {
		final var entity = new Petstore();
		BeanUtils.copyProperties(dto,entity );
		return entity;
	}

	@Override
	public PetstoreDto createFrom(Petstore entity) {
		final var dto = new PetstoreDto();
		BeanUtils.copyProperties(entity,dto);
		return dto;
	}

	@Override
	public Petstore updateEntity(Petstore source, Petstore target,
			boolean ignoreNulls) {
		BeanUtils.copyProperties( source,target);
		return target;
	}

}
