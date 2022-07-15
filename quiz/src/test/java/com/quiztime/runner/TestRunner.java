package com.quiztime.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.quiztime.poms.PageOne;
import com.quiztime.poms.PageThree;
import com.quiztime.poms.PageTwo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


    @RunWith(Cucumber.class)
    @CucumberOptions(features = "classpath:features", glue = "com/quiztime/steps")
    
    public class TestRunner {
    
    public static WebDriver driver;
    public static PageOne pageone;
    public static PageTwo pagetwo;
    public static PageThree pagethree;
    


    @BeforeClass
        public static void setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe"); 
        driver = new ChromeDriver(); 
        pageone = new PageOne(driver);
        pagetwo = new PageTwo(driver);
        pagethree = new PageThree(driver;)
        
    }

    @AfterClass 
        public static void teardown(){
        
        driver.quit();
        }
    
    }