package com.automation.runner;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.pom.PageOnePom;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", glue="com/automation/steps", plugin = {"pretty", "html:src/test/resources/reports/html-reports.html"})
public class TestRunner {
    public static WebDriver driver;
    public static PageOnePom pageonepom;
    public static WebDriverWait wait;
   

    @BeforeClass
    public static void setup(){
    
        driver = new ChromeDriver();
        pageonepom = new PageOnePom(driver);
        wait = new WebDriverWait(driver, 15);
        
      
    }
    @AfterClass
    public static void teardown(){
        driver.quit();
    }
}
