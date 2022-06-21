package com.bridglabz.junit;

import java.util.regex.Pattern;

public class UserRegistration {
    public static final String LAST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    public boolean isLastNameValid(String lastName){
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }
}
