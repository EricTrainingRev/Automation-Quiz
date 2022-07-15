package com.revature.pom;


import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageThree {
    
    private WebDriver driver;

    @FindBy(id = "input")
    public WebElement input;

    @FindBy(id = "button")
    public WebElement button;

    public Alert alert;



    public PageThree(WebDriver driver){
        this.driver = driver;


        PageFactory.initElements(driver, this);
    }

    //methods

    public void enterText(String input){
        this.input.sendKeys("input");
    }

    public void hitButton(){
        this.button.clear();
    }

    public void alert(){
        Alert alert = this.driver.switchTo().alert();
        Assert.assertTrue(alert.getText().contains("Success for page three"));
        alert.accept();

    }

}



