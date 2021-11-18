package it.beccaria.petstore.assembler;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import it.beccaria.petstore.dto.TipoGattoDto;
import it.beccaria.petstore.model.TipoGatto;

import it.beccaria.assembler.BeccariaGenericAssembler;

@Component
public class TipoGattoAssembler
		implements BeccariaGenericAssembler<TipoGatto, TipoGattoDto> {


	@Override
	public TipoGatto createFrom(TipoGattoDto dto) {
		final var entity = new TipoGatto();
		BeanUtils.copyProperties(dto,entity );
		return entity;
	}

	@Override
	public TipoGattoDto createFrom(TipoGatto entity) {
		final var dto = new TipoGattoDto();
		BeanUtils.copyProperties(entity,dto);
		return dto;
	}

	@Override
	public TipoGatto updateEntity(TipoGatto source, TipoGatto target,
			boolean ignoreNulls) {
		BeanUtils.copyProperties( source,target);
		return target;
	}

}
