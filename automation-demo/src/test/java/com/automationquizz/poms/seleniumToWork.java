package com.automationquizz.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class seleniumToWork {
    
    private WebDriver driver;

    @FindBy (id="input")
    public WebElement usernameInput;

    @FindBy (id="Button")
    public WebElement passwordInput;


    
    public seleniumToWork(WebDriver driver){
        this.driver = driver;
       
        PageFactory.initElements(driver,this);
}
}
