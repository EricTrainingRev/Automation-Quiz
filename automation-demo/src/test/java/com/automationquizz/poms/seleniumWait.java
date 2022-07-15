package com.automationquizz.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class seleniumWait {
    private WebDriver driver;

    @FindBy (id="one")
    public WebElement something;

    @FindBy (id="submit")
    public WebElement submitButton;


    
    public seleniumWait(WebDriver driver){
        this.driver = driver;
       
        PageFactory.initElements(driver,this);
}
}

