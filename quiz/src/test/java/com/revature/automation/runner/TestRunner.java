package com.revature.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

import com.revature.automation.poms.PageOne;
import com.revature.automation.poms.PageTwo;
import com.revature.automation.poms.PageThree;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/revature/automation/steps",
        plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber.json"}
        )
public class TestRunner {
    public static WebDriver driver;
    public static PageOne pageOne;
    public static PageTwo pageTwo;
    public static PageThree pageThree;
    public static WebDriverWait wait;


    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        pageOne = new PageOne(driver);
        pageTwo = new PageTwo(driver);
        
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
