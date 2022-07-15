package com.automation.runner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class) 
@CucumberOptions(features="classpath:features" , glue="com/automation/steps")
public class TestRunner {
    

     public static WebDriver driver;

     @BeforeClass
     public static void setup(){
        System.out.println("This method runs before the steps");

       
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe"); 
        
        driver = new ChromeDriver();
     }

     @AfterClass
     public static void teardown(){
        System.out.println("This method runs after the steps");

        driver.quit();
     }
    
}