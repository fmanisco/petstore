package it.beccaria.petstore.assembler;



import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import it.beccaria.assembler.BeccariaGenericAssembler;
import it.beccaria.petstore.dto.valid.TitolareDtoValid;
import it.beccaria.petstore.model.Titolare;

@Component
public class TitolareAssembler
		implements BeccariaGenericAssembler<Titolare, TitolareDtoValid> {


	@Override
	public Titolare createFrom(TitolareDtoValid dto) {
		final var entity = new Titolare();
		BeanUtils.copyProperties(dto,entity );
		return entity;
	}

	@Override
	public TitolareDtoValid createFrom(Titolare entity) {
		final var dto = new TitolareDtoValid();
		BeanUtils.copyProperties(entity,dto);
		return dto;
	}

	@Override
	public Titolare updateEntity(Titolare source, Titolare target,
			boolean ignoreNulls) {
		BeanUtils.copyProperties( source,target);
		return target;
	}
}
