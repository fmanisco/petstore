package it.beccaria.petstore.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import it.beccaria.petstore.validator.GattoValidator;

@Constraint(validatedBy = GattoValidator.class)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CheckGatto {
	
	String message() default "Gatto non presente a sistema";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
