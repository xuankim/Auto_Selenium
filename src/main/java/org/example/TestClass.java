package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestClass {
    @BeforeMethod
    public void run3(){
        System.out.println("haha");
        //set update data
        WebDriverManager.chromedriver().setup();
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.google.com.vn/?hl=vi");
    }
    @Test
    public void run() {
        System.out.println("hihi");
    }
    @Test
    public void run1() {
        System.out.println("hehe");
        Assert.assertEquals(1,1,"1 not equals to 2");
        //body testscript
    }

    @AfterMethod
    public void run4(){
        System.out.println("hmhm");
    }
}
