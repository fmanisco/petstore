package it.beccaria.petstore.assembler;



import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import it.beccaria.assembler.BeccariaGenericAssembler;
import it.beccaria.petstore.dto.valid.GattoDtoValid;
import it.beccaria.petstore.model.Gatto;

@Component
public class GattoAssembler
		implements BeccariaGenericAssembler<Gatto, GattoDtoValid> {


	@Override
	public Gatto createFrom(GattoDtoValid dto) {
		final var entity = new Gatto();
		BeanUtils.copyProperties(dto,entity );
		return entity;
	}

	@Override
	public GattoDtoValid createFrom(Gatto entity) {
		final var dto = new GattoDtoValid();
		BeanUtils.copyProperties(entity,dto);
		return dto;
	}

	@Override
	public Gatto updateEntity(Gatto source, Gatto target,
			boolean ignoreNulls) {
		BeanUtils.copyProperties( source,target);
		return target;
	}

}
