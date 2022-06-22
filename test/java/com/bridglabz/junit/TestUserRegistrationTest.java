package com.bridglabz.junit;

import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistrationTest {

    @Test
    public void givenPassword_whenValid_thenReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean result = user.isPasswordRuleOneValid("absolute");
        System.out.println(result);
        Assert.assertTrue(result);
    }
}
