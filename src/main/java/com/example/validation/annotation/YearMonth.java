package com.example.validation.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import validator.YearMonthValidator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = {YearMonthValidator.class})
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@NotBlank
public @interface YearMonth {
    String message() default "yearMonth 형식에 맞지 않습니다. ex)20230101";
    String pattern() default "yyyyMM";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
