package com.bridglabz.junit;

import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistrationTest {

    @Test
    public void givenFirstName_whenProper_thenReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean result = user.isFirstNameValid("Suraj");
        System.out.println(result);
        Assert.assertTrue(result);
    }
}
