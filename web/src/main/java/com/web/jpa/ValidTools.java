package com.web.jpa;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.hibernate.validator.HibernateValidator;

import javax.validation.Validation;
import javax.validation.Validator;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ValidTools {
    private static Validator validator = Validation.byProvider(HibernateValidator.class).configure().failFast(false).buildValidatorFactory().getValidator();

    public void validBean(Object obj,Class ...groups){
        validator.validate(obj,groups);
    }

}
