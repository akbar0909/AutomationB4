package io.loop.test.hometask;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T00_DocApp{

    public static void main(String[] args) throws InterruptedException {

        /*
        1. login to docuport application
2. logout from docuport application
3. Validate successful login
4. Validate successful logout

task 3
=============
1. navigate to docuport application
2. validate placeholders for user name and password
3. without sending username and password click login button
4. validate username and password error messages
         */
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();
        driver.get(DocuportConstants.DOCUPORT_TEST);
        WebElement userName = driver.findElement(By.cssSelector("input[id='input-14']"));
        userName.sendKeys(DocuportConstants.USERNAME_CLIENT);
        WebElement password = driver.findElement(By.cssSelector("input[id='input-15']"));
        password.sendKeys(DocuportConstants.DOCUPORT_PASSWORD);
        WebElement submitButton = driver.findElement(By.cssSelector("*[class='v-btn__content']"));
        submitButton.click();

        Thread.sleep(3000);
        WebElement Continue = driver.findElement(By.cssSelector("*[type='submit']"));
        Continue.click();
        Continue.isDisplayed();
        System.out.println("yor are log in Successfully");


        WebElement elementAfterLogin = driver.findElement(By.cssSelector("div[class='v-avatar primary']"));
        Thread.sleep(3000);
        elementAfterLogin.click();


        WebElement logOut = driver.findElement(By.cssSelector("div[id='list-item-154']"));
        Thread.sleep(3000);
        logOut.click();

        if (logOut.isDisplayed()){
            System.out.println("You are logged out successfully");
        }else
            System.out.println("You are not logged out");


    }

}
