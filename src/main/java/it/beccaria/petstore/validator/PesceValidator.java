package it.beccaria.petstore.validator;

import javax.validation.ConstraintValidatorContext;



import it.beccaria.petstore.dto.valid.PesceDtoValid;
import it.beccaria.validator.AbstractValidator;
import it.beccaria.petstore.annotation.CheckPesce;


public class PesceValidator  extends AbstractValidator<CheckPesce,PesceDtoValid> {
	
	
	@Override
	public boolean isValid(PesceDtoValid value, ConstraintValidatorContext context) {	
		
		return true;
	
	}


}