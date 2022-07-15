package com.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.poms.PageOne;
import com.automation.poms.PageTwo;
import com.automation.poms.PageThree;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = "com/automation/steps")
public class TestRunner {
    
    public static WebDriver driver;
    public static PageOne pageone;
    public static PageTwo pagetwo;
    public static PageThree pagethree;
    public static WebDriverWait wait;

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        pageone = new PageOne(driver);
        pagetwo = new PageTwo(driver);
        pagethree = new PageThree(driver);
        wait = new WebDriverWait(driver, 5);
    }

    @AfterClass
    public static void teardown(){
        driver.quit();
    }
}