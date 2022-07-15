package com.revature.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageOne {
 
    
    private WebDriver driver;

    @FindBy(id = "nameInput")
    public WebElement userInput;

    @FindBy(id = "submitButton")
    public WebElement pageOneButton;








    public PageOne (WebDriver driver){
        this.driver = driver;


    PageFactory.initElements(driver, this);

    }

    public void enterUserInput(String nameInput){
        this.userInput.sendKeys(nameInput);
    }

    public void clickButton(){
        this.pageOneButton.click()
    }

}
