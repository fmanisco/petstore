package it.beccaria.petstore.validator;

import javax.validation.ConstraintValidatorContext;



import it.beccaria.petstore.dto.valid.CaneDtoValid;
import it.beccaria.validator.AbstractValidator;
import it.beccaria.petstore.annotation.CheckCane;


public class CaneValidator  extends AbstractValidator<CheckCane,CaneDtoValid> {
	
	
	@Override
	public boolean isValid(CaneDtoValid value, ConstraintValidatorContext context) {	
		
		return true;
	
	}


}