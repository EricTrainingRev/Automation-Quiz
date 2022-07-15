package com.automation.poms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageOne{    
    @FindBy(id ="randomString")
    public WebElement nameInput;
    @FindBy(id = "submitButton")
    public WebElement submitButton;
   
   
public PageOne(WebDriver driver){

    PageFactory.initElements(driver, this);

}
public void nameInput(String name){

    this.nameInput.sendKeys(name);
}

public void submitButton() {
    this.submitButton.click();
}



}
