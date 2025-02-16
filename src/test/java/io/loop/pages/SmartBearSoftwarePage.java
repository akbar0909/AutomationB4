package io.loop.pages;

import io.loop.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SmartBearSoftwarePage {

    public SmartBearSoftwarePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy (xpath = "//*[@id='ctl00_MainContent_username']")
    public WebElement usernameBox;

    @FindBy (xpath = "//*[@id='ctl00_MainContent_password']")
    public WebElement passwordBox;

    @FindBy (xpath = "//*[@id='ctl00_MainContent_login_button']")
    public WebElement loginButton;

    @FindBy(xpath = "//a")
    public List<WebElement> smartWebAllLinks;


}
