package com.bridglabz.junit;

import java.util.regex.Pattern;

public class UserRegistration {
    public static final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    public boolean isFirstNameValid(String firstName){
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }
}
