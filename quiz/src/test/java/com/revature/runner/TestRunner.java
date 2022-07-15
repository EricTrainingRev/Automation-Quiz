package com.revature.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.revature.poms.PageOne;
import com.revature.poms.PageThree;
import com.revature.poms.PageTwo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = "com/revature/steps")

public class TestRunner {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public static PageOne pageOne;
    public static PageTwo pageTwo;
    public static PageThree pageThree;


    @BeforeClass // this makes the method execute BEFORE all the steps
    public static void setup(){
        // make sure to set the value for the key as the full relative path to the chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();

        wait = new WebDriverWait(driver, 5);    // note: my manager page wasn't working because it was loading too slowly
        // so i changed the duration time to 5 seconds

        pageOne = new PageOne(driver);
        pageTwo = new PageTwo(driver);
        pageThree = new PageThree(driver);

    }

    @AfterClass // this makes the method execute AFTER all the steps
    public static void teardown(){
        driver.quit();
    }


}