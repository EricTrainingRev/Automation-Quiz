package com.revature.runner;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.revature.pom.PageOne;
import com.revature.pom.PageTwo;
import com.revature.pom.PageThree;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue= "com/revature/steps", plugin = "pretty")
public class TestRunner {
    
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static PageOne pageone;
    public static PageTwo pagetwo;
    public static PageThree pagethree;
    



    
    @BeforeClass
    public static void setup(){
    
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver=new ChromeDriver();
        wait=new WebDriverWait(driver, 6);
        pageone=new PageOne(driver);
        pagetwo=new PageTwo(driver);
        pagethree=new PageThree(driver);




    }


        @AfterClass
        public static void teardown(){
            driver.quit();
        }

}
















}
