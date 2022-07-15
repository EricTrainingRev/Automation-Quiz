package com.revature.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageTwo {
    private WebDriver driver;

    @FindBy(id = "one")
    public WebElement one;

    @FindBy(id = "two")
    public WebElement two;

    @FindBy(id = "three")
    public WebElement three;

    @FindBy(id = "four")
    public WebElement four;

    @FindBy(id = "submit")
    public WebElement submit;

    public PageTwo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOne() {
        this.one.click();
    }
    
}
