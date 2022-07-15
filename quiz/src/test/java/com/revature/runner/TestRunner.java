package com.revature.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "classpath:features", glue = "com/revature/steps")
public class TestRunner {
    public static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.out.println("this method runs before the class");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("this method runs after the class");
        driver.quit();
    }
}