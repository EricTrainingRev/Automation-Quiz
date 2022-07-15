package com.revature.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageOne {
    private WebDriver driver;

    public PageOne(WebDriver driver){
        this.driver = driver; // this initializes the private driver field
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="randomString")
    public WebElement randomString;
    
    @FindBy(id = "nameInput" )
    public WebElement nameInput;

    public void enterName(String nameInput){

        // to enter a name into the input element we use sendKeys() 
        this.nameInput.sendKeys(nameInput);

    }

    @FindBy(id = "submitButton")
    public WebElement submitButton;


    public void submitButton(){
        this.submitButton.click();
    }
}
