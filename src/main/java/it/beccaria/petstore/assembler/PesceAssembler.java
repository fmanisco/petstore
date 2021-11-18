package it.beccaria.petstore.assembler;



import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import it.beccaria.assembler.BeccariaGenericAssembler;
import it.beccaria.petstore.dto.valid.PesceDtoValid;
import it.beccaria.petstore.model.Pesce;

@Component
public class PesceAssembler
		implements BeccariaGenericAssembler<Pesce, PesceDtoValid> {


	@Override
	public Pesce createFrom(PesceDtoValid dto) {
		final var entity = new Pesce();
		BeanUtils.copyProperties(dto,entity );
		return entity;
	}

	@Override
	public PesceDtoValid createFrom(Pesce entity) {
		final var dto = new PesceDtoValid();
		BeanUtils.copyProperties(entity,dto);
		return dto;
	}

	@Override
	public Pesce updateEntity(Pesce source, Pesce target,
			boolean ignoreNulls) {
		BeanUtils.copyProperties( source,target);
		return target;
	}

}
