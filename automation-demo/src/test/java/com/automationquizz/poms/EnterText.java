package com.automationquizz.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterText {
    private WebDriver driver;

    @FindBy (id="randomString")
    public WebElement usernameInput;

    @FindBy (id="submitButton")
    public WebElement passwordInput;


    
    public EnterText(WebDriver driver){
        this.driver = driver;
       
        PageFactory.initElements(driver,this);
}
}


