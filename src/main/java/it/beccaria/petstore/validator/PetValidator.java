package it.beccaria.petstore.validator;

import javax.validation.ConstraintValidatorContext;



import it.beccaria.petstore.dto.valid.PetDtoValid;
import it.beccaria.validator.AbstractValidator;
import it.beccaria.petstore.annotation.CheckPet;


public class PetValidator  extends AbstractValidator<CheckPet,PetDtoValid> {
	
	
	@Override
	public boolean isValid(PetDtoValid value, ConstraintValidatorContext context) {	
		
		return true;
	
	}


}