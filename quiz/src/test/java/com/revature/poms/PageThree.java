package com.revature.poms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageThree {
    
    private WebDriver driver;

    @FindBy(id = "input")
    public WebElement inputInput;

    @FindBy(tagName = "button")
    public WebElement submitButton;

    public PageThree(WebDriver driver){
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public void enterInput(String input){
        this.inputInput.sendKeys(input);
    }

    public void clickButton(){
        this.submitButton.click();
    }
}
