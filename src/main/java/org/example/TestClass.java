package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass {
    ChromeDriver chromeDriver;

    @BeforeMethod
    public void Setup() {
        // set update data
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();

    }

    @Test
    public void run() {
        System.out.println("hihi");
        chromeDriver.get("https://www.google.com.vn/?hl=vi");
        sleeps(5000);
    }

    @Test
    public void run1() {
        System.out.println("hehe");
        System.out.println("hi everyone");
        Assert.assertEquals(1, 1, "1 not equals to 2");
        // body testscript
    }

    @AfterMethod
    public void CleanUp() {
        System.out.println("hmhm");
        chromeDriver.quit();
    }

    private void sleeps(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
