package com.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageOne {
    
    private WebDriver driver;

    @FindBy(id = "randomString")
    public WebElement stringToInput;
    @FindBy(id = "nameInput")
    public WebElement inputField;
    @FindBy(id = "submitButton")
    public WebElement theButton;
    @FindBy(tagName = "alert")
    public WebElement alert;

    public PageOne(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void enterString(String randomString){
        this.inputField.sendKeys(randomString);
    }

    public void clickButton(){
        this.theButton.click();
    }

    public void alert() {
        driver.switchTo().alert().accept();
    }
    
}
