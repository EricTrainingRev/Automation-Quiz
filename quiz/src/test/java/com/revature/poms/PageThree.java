package com.revature.poms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.revature.runner.TestRunner;

public class PageThree {

    private WebDriver driver;

    @FindBy(id = "input")
    public WebElement input;
    @FindBy(id = "button")
    public WebElement submitButton;

    public PageThree(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public void enterText(String s){
        this.input.sendKeys(s);
    }

    public void enterAllText(String s){
        for (int i = 0; i < 100; i++){
            enterText(s);
            TestRunner.wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = TestRunner.driver.switchTo().alert();
            alert.accept();
        }
    }

    public void clickButton(){
        this.submitButton.click();
    }
    
}
