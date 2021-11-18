package it.beccaria.petstore.validator;

import javax.validation.ConstraintValidatorContext;



import it.beccaria.petstore.dto.PetstoreDto;
import it.beccaria.petstore.validator.annotation.CheckPetstore;
import it.beccaria.validator.AbstractValidator;


public class PetstoreValidator  extends AbstractValidator<CheckPetstore,PetstoreDto> {
	
	
	@Override
	public boolean isValid(PetstoreDto value, ConstraintValidatorContext context) {	
		
		return true;
	
	}


}