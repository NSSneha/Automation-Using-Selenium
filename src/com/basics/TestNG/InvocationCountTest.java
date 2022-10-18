package com.basics.TestNG;

import org.testng.annotations.Test;

public class InvocationCountTest {

    @Test(invocationCount = 10) //invocation count
    public void mySum(){
        int a = 5;
        int b = 3;
        int result = a + b;
        System.out.println("The result is: " + result);
        /**
         *invocation count is used in testng to
         * provide the no.of times a test is executed */
    }
}
