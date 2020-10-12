package com.zup.nossobancodigital.model.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = OverDate18YearsValidator.class)
@Target( { ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface OverDate18Years {
    String message() default "Data inválida, ou inferior";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
