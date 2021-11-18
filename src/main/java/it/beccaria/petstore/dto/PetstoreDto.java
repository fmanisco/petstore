package it.beccaria.petstore.dto;


import javax.validation.constraints.Null;

import it.beccaria.controller.validation.PostConstraint;
import it.beccaria.dto.BeccariaIdDto;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PetstoreDto implements BeccariaIdDto<Long>{
	

	@Null(groups = { PostConstraint.class })
	private Long id;
	
	
	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id=id;		
	}

	

}
