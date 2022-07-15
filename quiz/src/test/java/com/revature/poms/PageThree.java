package com.revature.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageThree {
    private WebDriver driver;

    public PageThree(WebDriver driver){
        this.driver = driver; // this initializes the private driver field
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="input")
    public WebElement input;
    @FindBy(id="button")
    public WebElement button;

}
