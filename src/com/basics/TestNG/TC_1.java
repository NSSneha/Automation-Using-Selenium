package com.basics.TestNG;

import org.testng.annotations.*;

public class TC_1 {
    @BeforeClass
    public void beforeClass() {
        System.out.println("I execute before every class");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("I execute after every class");
    }
    @BeforeMethod
    public void beforeMethods() {
        System.out.println("Executes before every method..");
    }
    @AfterMethod
    public void afterMethods() {
        System.out.println("Executes after every method..");
    }
    @Test
    public void test1() {
        System.out.println("Test 1");
    }
    @Test
    public void test2() {
        System.out.println("Test 2");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("Executes before test");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("Executes after test");
    }
}
