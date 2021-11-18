package it.beccaria.petstore.validator;

import javax.validation.ConstraintValidatorContext;



import it.beccaria.petstore.dto.valid.TitolareDtoValid;
import it.beccaria.validator.AbstractValidator;
import it.beccaria.petstore.annotation.CheckTitolare;


public class TitolareValidator  extends AbstractValidator<CheckTitolare,TitolareDtoValid> {
	
	
	@Override
	public boolean isValid(TitolareDtoValid value, ConstraintValidatorContext context) {	
		
		return true;
	
	}


}