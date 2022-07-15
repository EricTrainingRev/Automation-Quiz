package com.revature.runner;



import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.revature.poms.PageOne;
import com.revature.poms.PageTwo;
import com.revature.poms.PageThree;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = "com/revature/steps"
)
public class TestRunner {

    
    public static PageOne PageOne;
    public static PageTwo PageTwo;
    public static WebDriver driver;
    public static PageThree PageThree;
    public static WebDriverWait wait;
}


@BeforeClass
    public static void setup(){
       System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
       driver = new ChromeDriver();
       PageOne = new PageOne(driver);
       PageTwo = new PageTwo(driver);
       PageThree = new PageThree(driver);
       wait = new WebDriverWait(driver,5);
    }

    @AfterClass
    public static void teardown(){
        driver.quit();

    }
    

