package com.ravature.runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ravature.poms.Page1;
import com.ravature.poms.Page2;
import com.ravature.poms.Page3;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:features", glue="com/quiz/steps", plugin = {"pretty", "html:src/test/resources/reports/html-reports.html"})

public class TestRunner {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Page1 page1;
    public static Page2 page2;
    public static Page3 page3;
    
    

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/web-pages/chromedriver.exe");
        driver = new ChromeDriver();
        page1 = new Page1(driver);
        page2 = new Page2(driver);
        page3 = new Page3(driver);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 5);
        
        
    }

    @AfterClass
    public static void teardown(){
        driver.quit();
        
    }















}
