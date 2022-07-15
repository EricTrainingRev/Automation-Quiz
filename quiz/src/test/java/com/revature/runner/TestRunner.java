package com.revature.runner;

import com.revature.poms.PageOne;
import com.revature.poms.PageTwo;
import com.revature.poms.PageThree;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features/PageOneFeatureFile.feature","classpath:features/PageTwoFeatureFile.feature","classpath:features/PageThreeFeatureFile.feature"},glue = "com/revature/steps")
public class TestRunner {



    public static WebDriver driver;
    public static PageOne pageOne;
    public static PageTwo pageTwo;
    public static PageThree pageThree;
    public static WebDriverWait wait;

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        pageOne = new PageOne(driver);
        pageTwo = new PageTwo(driver);
        pageThree = new PageThree(driver);
        wait = new WebDriverWait(driver, 10);
    }
    
    @AfterClass
    public static void teardown(){
        driver.quit();
    }

    
}
