package com.revature.pom;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageOne {


    private WebDriver driver;

    @FindBy(id = "nameInput")
    public WebElement input;

    @FindBy(id = "submitButton")
    public WebElement button;

    public Alert alert;



    public PageOne(WebDriver driver){
        this.driver = driver;


        PageFactory.initElements(driver, this);
    }

    //methods

    public void enterInput(String Name){
        this.input.sendKeys(Name);
    }

    public void clickButton(){
        this.button.click();
    }
    public void alert(){
        Alert alert = this.driver.switchTo().alert();
        Assert.assertTrue(alert.getText().contains("you have succesfully typed Joe-0.8630415558508522"));
        alert.accept();

    }

    
}
