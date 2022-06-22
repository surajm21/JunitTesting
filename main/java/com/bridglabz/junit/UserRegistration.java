package com.bridglabz.junit;

import java.util.regex.Pattern;

public class UserRegistration {
    public static final String MOBILE_NO_PATTERN = "^[0-9]{2}\\\\s[1-9]{1}[0-9]{9}$";
    public boolean isMobileNoValid(String mobileNo){
        Pattern pattern = Pattern.compile(MOBILE_NO_PATTERN);
        return pattern.matcher(mobileNo).matches();
    }
}
