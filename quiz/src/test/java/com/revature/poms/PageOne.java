package com.revature.poms;

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

    @FindBy(id = "submitButton")
    public WebElement submitButton;

    public PageOne(WebDriver driver){
        this.driver = driver;   //This initializes private field

        //PageFactory from selenium, we provide the initElements() with the driver above 
        PageFactory.initElements(driver,this);
    }

    public void copyPasteName(){
        String x = this.randomStringInput.getText();
        this.nameInput.sendKeys(x);
    }
    public void clickSubmit(){
        this.submitButton.click();

    }

}
