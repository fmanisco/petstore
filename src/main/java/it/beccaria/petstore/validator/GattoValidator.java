package it.beccaria.petstore.validator;

import javax.validation.ConstraintValidatorContext;



import it.beccaria.petstore.dto.valid.GattoDtoValid;
import it.beccaria.validator.AbstractValidator;
import it.beccaria.petstore.annotation.CheckGatto;


public class GattoValidator  extends AbstractValidator<CheckGatto,GattoDtoValid> {
	
	
	@Override
	public boolean isValid(GattoDtoValid value, ConstraintValidatorContext context) {	
		
		return true;
	
	}


}