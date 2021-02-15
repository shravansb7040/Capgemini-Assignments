package com.springmvc.model;

import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordConstraintValidator implements ConstraintValidator<Password,String> {  
	public static final Pattern textPattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$");
	@Override
    public boolean isValid(String s, ConstraintValidatorContext cvc) {  
          if(s==null) {
        	  return false;
          }
        boolean result=isTextValid(s);  
        return result;  
    }
    public static boolean isTextValid(String textToCheck) {
        return textPattern.matcher(textToCheck).matches();
    }
}  
