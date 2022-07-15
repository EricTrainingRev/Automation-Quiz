package com.revature.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.revature.poms.PageOne;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = "com/revature/steps")

public class TestRunner {

    
    public static WebDriver driver;
    public static PageOne pageOne;
    public static WebDriverWait wait;


    @BeforeClass // Before class 
    public static void setup(){

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        pageOne = new PageOne(driver);


        wait = new WebDriverWait(driver, 2);

}



    @AfterClass // tears it all down after.
    public static void teardown(){
        driver.quit();
    }

}


