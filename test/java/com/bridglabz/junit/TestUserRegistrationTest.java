package com.bridglabz.junit;

import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistrationTest {

    @Test
    public void givenEmail_whenValid_thenReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean result = user.iEmailValid("abc123@gmail.com");
        System.out.println(result);
        Assert.assertTrue(result);
    }
}
