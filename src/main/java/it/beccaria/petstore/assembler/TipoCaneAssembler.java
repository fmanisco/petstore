package it.beccaria.petstore.assembler;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import it.beccaria.petstore.dto.TipoCaneDto;
import it.beccaria.petstore.model.TipoCane;

import it.beccaria.assembler.BeccariaGenericAssembler;

@Component
public class TipoCaneAssembler
		implements BeccariaGenericAssembler<TipoCane, TipoCaneDto> {


	@Override
	public TipoCane createFrom(TipoCaneDto dto) {
		final var entity = new TipoCane();
		BeanUtils.copyProperties(dto,entity );
		return entity;
	}

	@Override
	public TipoCaneDto createFrom(TipoCane entity) {
		final var dto = new TipoCaneDto();
		BeanUtils.copyProperties(entity,dto);
		return dto;
	}

	@Override
	public TipoCane updateEntity(TipoCane source, TipoCane target,
			boolean ignoreNulls) {
		BeanUtils.copyProperties( source,target);
		return target;
	}

}
