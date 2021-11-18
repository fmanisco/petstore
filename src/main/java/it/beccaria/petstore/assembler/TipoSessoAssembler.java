package it.beccaria.petstore.assembler;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import it.beccaria.petstore.dto.TipoSessoDto;
import it.beccaria.petstore.model.TipoSesso;

import it.beccaria.assembler.BeccariaGenericAssembler;

@Component
public class TipoSessoAssembler
		implements BeccariaGenericAssembler<TipoSesso, TipoSessoDto> {


	@Override
	public TipoSesso createFrom(TipoSessoDto dto) {
		final var entity = new TipoSesso();
		BeanUtils.copyProperties(dto,entity );
		return entity;
	}

	@Override
	public TipoSessoDto createFrom(TipoSesso entity) {
		final var dto = new TipoSessoDto();
		BeanUtils.copyProperties(entity,dto);
		return dto;
	}

	@Override
	public TipoSesso updateEntity(TipoSesso source, TipoSesso target,
			boolean ignoreNulls) {
		BeanUtils.copyProperties( source,target);
		return target;
	}

}
