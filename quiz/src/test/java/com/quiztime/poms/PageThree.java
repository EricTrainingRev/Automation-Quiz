package com.quiztime.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageThree {
    private WebDriver driver;

    @FindBy(id="input")
    WebElement descriptionInput;
    
    public void createTextInput(String description) {
        this.descriptionInput.sendKeys(description);
    }
}
