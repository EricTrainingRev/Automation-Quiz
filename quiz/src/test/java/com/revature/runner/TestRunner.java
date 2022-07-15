package com.revature.runner; 

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import com.revature.poms.PageOne;
import com.revature.poms.PageTwo;
import com.revature.poms.PageThree;


@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:features", glue="com/revature/steps")

public class TestRunner {
    
    public static WebDriver driver;
    public static PageOne pageOne;
    public static PageTwo pageTwo;
    public static PageThree pageThree;
    public static WebDriverWait wait;

    @BeforeClass // this makes the method execute before all the steps
    public static void setup(){
        // make sure to set the value for the key as the full relative path to the chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        pageOne = new PageOne(driver);
        pageTwo = new PageTwo(driver);
        pageThree = new PageThree(driver);
        
        wait = new WebDriverWait(driver, 2);
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass // this makes the method execute after all the steps
    public static void teardown(){
        driver.quit();
    }  
}
