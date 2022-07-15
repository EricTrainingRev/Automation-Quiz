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
    //Class
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
    // pagethree = new PageThree(driver);
    }


    @AfterClass
    public static void teardown() {
    driver.quit();
}
}
