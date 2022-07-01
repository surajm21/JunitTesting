package com.bridglabz.junit;

import java.util.regex.Pattern;

public class UserRegistration {
    public static final String PASSWORD_PATTERN = "^(?=.*[A-Z])[A-Za-z]{8,}$";
    public boolean isPasswordRuleTwoValid(String password){
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }
}
