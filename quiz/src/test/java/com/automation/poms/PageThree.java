package com.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageThree {
    
    private WebDriver driver;

    @FindBy(id = "input")
    public WebElement numsGoHere;
    @FindBy(id = "submitButton")
    public WebElement submitButton;
    @FindBy(tagName = "alert")
    public WebElement alert;

    public PageThree(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void enterNums(int input){
        this.numsGoHere.sendKeys();
    }

    public void clickButton(){
        this.submitButton.click();
    }

    public void alert() {
        driver.switchTo().alert().accept();
    }
    
}