package com.basics.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWithPriority {

    @Test(priority = 1, description = "Signing up")
    public void SignUp() {
        System.out.println("Signing up and Creating an account");
    }
    @Test(priority = 2, description = "Log In")
    public void login() {
        System.out.println("Logging into account");
    }
    @Test(priority = 3, description = "Booking")
    public void bookTicket() {
        System.out.println("Book a flight ticket");
    }
    @Test(priority = 4, description = "Checkout")
    public void checkOut() {
        System.out.println("Make payment & checkout");
    }

    @Test(priority = 5, description = "Failed test")
    public void failedTest() {
        Assert.assertEquals(1, 1);
    }
}
//to run in an order we use priority, priority starts with 1