package com.automationquizz.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pullUpPage {
    private WebDriver driver;

    @FindBy (id="randomString")
    public WebElement nameInput;

    @FindBy (id="submitButton")
    public WebElement submit;


    
    public pullUpPage(WebDriver driver){
        this.driver = driver;
       
        PageFactory.initElements(driver,this);
}



    public void submitButton() {

    }



    public void clickButton(String string) {
    }
}


