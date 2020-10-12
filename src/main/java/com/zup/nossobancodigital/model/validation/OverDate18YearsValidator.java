package com.zup.nossobancodigital.model.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class OverDate18YearsValidator implements ConstraintValidator<OverDate18Years, LocalDate> {
    @Override
    public void initialize(OverDate18Years constraintAnnotation) {
    }

    @Override
    public boolean isValid(LocalDate localDate, ConstraintValidatorContext constraintValidatorContext) {
        if(localDate == null){
            return false;
        }

        LocalDate dataAtual = LocalDate.now();

        Long anos = localDate.until(dataAtual, ChronoUnit.YEARS);

        return anos >= 18;
    }
}
