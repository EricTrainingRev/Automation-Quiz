package com.quiztime.poms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageOne {
    
    private WebDriver driver;
    
    
    @FindBy(id = "randomString")
    public WebElement autoRandomString;

    @FindBy(id = "nameInput")
    public WebElement nameInput;

    @FindBy(id = "submitButton")
    public WebElement theButton;
   
    public void InputTextPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterRandomText(WebElement inputName){
    this.autoRandomString.sendKeys(randomString);
    }
    public void clickButton(){
        this.theButton.click();
    }
    public void alertSuccess(){
        WebDriverWait waitAlert = new WebDriverWait(driver,10);
            waitAlert.until(ExpectedConditions.alertIsPresent());
        Alert alertAlert = driver.switchTo().alert();
            alertAlert.accept();
    }

}