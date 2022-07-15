package com.revature.poms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageOne {
   
    private WebDriver driver;

    @FindBy(id = "randomString")
    public WebElement randomStringInput;

    @FindBy(id = "nameInput")
    public WebElement nameInput;

    @FindBy(tagName = "button")
    public WebElement submitButton;

    public PageOne(WebDriver driver){
        this.driver = driver;

        PageFactory.initElements(driver,this);
    }

    public void enterrandomString(String randomString){
        this.randomStringInput.sendKeys(randomString);
    }

    public void enternameInput(String nameInput){
        this.nameInput.sendKeys(nameInput);
    }

    public void clickButton(){
        this.submitButton.click();
    }
}
