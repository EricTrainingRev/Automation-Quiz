package com.revature.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.junit.Cucumber;

//import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:features", glue="com/revature/steps")


public class TestRunner {

    public static WebDriver driver;
    public static PageThree pagethree;
    public static WebDriverWait wait;
    public static PageOne pageone;
    public static WebDriverWait wait2;
    public static PageTwo pagetwo;

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver","C:/Users/swond/OneDrive/Desktop/Automation-Quiz/quiz/src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
       pagethree = new PageThree(driver);
        wait = new WebDriverWait(driver, 5);
        pageone = new PageOne(driver);
        pagetwo = new PageTwo(driver);
}
}