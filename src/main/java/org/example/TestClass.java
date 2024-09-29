package org.example;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestClass {
    @Test
    public void run() {
        System.out.println("hihi");
    }
    @Test
    public void run1() {
        System.out.println("hehe");
        Assert.assertEquals(1,2,"1 not equals to 2");
    }
    @BeforeMethod
    public void run3(){
        System.out.println("haha");

    }
    @AfterMethod
    public void run4(){
        System.out.println("hmhm");
    }
}
