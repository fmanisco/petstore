package it.beccaria.petstore.assembler;



import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import it.beccaria.assembler.BeccariaGenericAssembler;
import it.beccaria.petstore.dto.valid.CaneDtoValid;
import it.beccaria.petstore.model.Cane;

@Component
public class CaneAssembler
		implements BeccariaGenericAssembler<Cane, CaneDtoValid> {


	@Override
	public Cane createFrom(CaneDtoValid dto) {
		final var entity = new Cane();
		BeanUtils.copyProperties(dto,entity );
		return entity;
	}

	@Override
	public CaneDtoValid createFrom(Cane entity) {
		final var dto = new CaneDtoValid();
		BeanUtils.copyProperties(entity,dto);
		return dto;
	}

	@Override
	public Cane updateEntity(Cane source, Cane target,
			boolean ignoreNulls) {
		BeanUtils.copyProperties( source,target);
		return target;
	}

}
