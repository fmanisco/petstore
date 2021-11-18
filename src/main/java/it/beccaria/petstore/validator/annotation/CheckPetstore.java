package it.beccaria.petstore.validator.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import it.beccaria.petstore.validator.PetstoreValidator;

@Constraint(validatedBy = PetstoreValidator.class)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CheckPetstore {
	
	String message() default "Petstore non presente a sistema";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
