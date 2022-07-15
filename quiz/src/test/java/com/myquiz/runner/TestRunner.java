package com.myquiz.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.myquiz.steps.PageOneFeatureFile;
import com.myquiz.steps.PageThreeFeatureFile;
import com.myquiz.steps.PageTwoFeatureFile;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = "java/com/myquiz/steps")
public class TestRunner {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static PageOneFeatureFile pageOne;
    public static PageTwoFeatureFile pageTwo;
    public static PageThreeFeatureFile pageThree;

@BeforeClass
public static void setup(){
System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
driver = new ChromeDriver();
pageOne = new PageOneFeatureFile(driver);
pageTwo = new PageTwoFeatureFile(driver);
pageThree = new PageThreeFeatureFile(driver);

wait = new WebDriverWait(driver, 10);
}

@AfterClass
public static void teardown(){
    driver.quit();

}
    
}
