package com.revature.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.revature.runner.TestRunner;

public class PageOne {

    private WebDriver driver;
    private String randomName;

    @FindBy(id = "randomString")
    public WebElement randomStringP;
    @FindBy(id = "nameInput")
    public WebElement nameInput;
    @FindBy(id = "submitButton")
    public WebElement submitButton;

    public PageOne(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public void enterName(){
        this.randomName = this.randomStringP.getText();
        this.nameInput.sendKeys(randomName);
    }

    public void clickButton(){
        this.submitButton.click();
    }


    
}
