package com.revature.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageThree {
    private WebDriver driver;

    @FindBy(id = "input")
    public WebElement input;

    @FindBy(id = "submit")
    public WebElement submit;

    
}
