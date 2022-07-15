import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.revature.steps.PageOne;
import com.revature.steps.PageThree;
import com.revature.steps.PageTwo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:features", glue="com/revature/steps")
public class TestRunner {

    public static WebDriver driver;
    public static PageOne pageOne;
    public static PageTwo pageTwo;
    public static PageThree pageThree;
    public static TestRunner testRunner;
    public static WebDriverWait wait;

    @BeforeClass // this makes the method execute before all the steps
    public static void setup(){
        // make sure to set the value for the key as the full relative path to the chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        pageOne = new PageOne();
        pageTwo = new PageTwo();
        pageThree = new PageThree();
        new TestRunner();

        // the WebDriverWait is used to tell Selenium to wait up to a set amount of time for a given condition
        wait = new WebDriverWait(driver, 2);
    }

    @AfterClass // this makes the method execute after all the steps
    public static void teardown(){
       driver.quit();
    }

    
}