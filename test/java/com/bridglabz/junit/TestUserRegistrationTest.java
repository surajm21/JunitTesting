package com.bridglabz.junit;

import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistrationTest {

    @Test
    public void givenEmail_whenValid_thenReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean result = user.isMobileNoValid("91 9087654321");
        System.out.println(result);
        Assert.assertTrue(result);
    }
}
