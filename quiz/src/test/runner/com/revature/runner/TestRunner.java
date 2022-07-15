package com.revature.runner;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", glue="com/revature/steps")
public class TestRunner {
    public static WebDriver driver;
    public static PageOne pageone;
    public static PageTwo pagetwo;
    public static PageThree pagethree;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        pageone = new PageOne(driver);
        pagetwo = new PageTwo(driver);
        pagethree = new PageThree(driver);
    }
    @AfterClass
    public static void teardown() {
        driver.quit();
    }
}
