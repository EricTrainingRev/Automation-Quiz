package com.automationquizz.runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automationquizz.poms.pullUpPage;
import com.automationquizz.poms.seleniumToWork;
import com.automationquizz.poms.seleniumWait;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="classpath:features", glue ="com/automationquizz/steps")
public class TestRunner {

    public static Object EnterTextSelenium;
    public static WebDriver driver;
    public static pullUpPage pullUpPage;
    public static seleniumWait seleniumWait;
    public static seleniumToWork seleniumToWork;
    public static WebDriverWait Wait;

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        pullUpPage = new pullUpPage(driver);
        seleniumWait = new seleniumWait(driver);
        seleniumToWork = new seleniumToWork(driver);
        Wait = new WebDriverWait(driver, 2);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
     
    @AfterClass
    public static void teardown(){
        driver.quit();
        
    }
}

    

