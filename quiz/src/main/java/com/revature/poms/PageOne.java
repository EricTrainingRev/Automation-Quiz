package com.revature.poms;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class PageOne {

    public WebDriver driver;
    @FindBy(id = "nameInput")
    public WebElement nameInput;

    @FindBy(id = "randomString")
    public WebElement randomStringInput;

    public void enternameInput(String nameInput){
        this.usernameInput.sendKeys(nameInput);
 }

 public void enterrandomString(String randomString){
     this.passwordInput.sendKeys(randomString);
 }

    @FindBy(id = "submitButton")
    public WebElement submitButton;

    public PageOne(WebDriver driver){

    PageFactory.initElements(driver,this);

    }

    public void clickButton(){
        this.submitButton.click();
  }
}
        

    

