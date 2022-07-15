package com.ravature.poms;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Page1 {
    @FindBy(id = "randomString")
    public WebElement randomString;


    @FindBy(id = "nameInput")
    public WebElement nameInput;

    @FindBy(id = "submitButton")
    public WebElement submitButton;

    public Page1(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void enterInput(){
        randomString.sendKeys(Keys.CONTROL, "c");
        nameInput.sendKeys(Keys.CONTROL, "v");
    
        
    }

    public void clickButton(){
        this.submitButton.click();
    }

    
}
