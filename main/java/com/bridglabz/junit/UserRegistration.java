package com.bridglabz.junit;

import java.util.regex.Pattern;

public class UserRegistration {
    public static final String EMAIL_PATTERN = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
    public boolean iEmailValid(String email){
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }
}
