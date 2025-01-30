package io.loop.test.hometask;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T00_placeHolder {
    /*
    1. go to https://loopcamp.vercel.app/forgot-password.html
2. locate 5 elements, forgot password, email, email input, retrieve password, powered by LOOPCAMP
3. use css
4. Validate those elements are displayed

task 2
=============
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
    public static void main(String[] args) {
        WebDriver driver = WebDriverUtil.getDriver(DocuportConstants.BROWSER);
        driver.manage().window().maximize();
        driver.get("https://loopcamp.vercel.app/forgot-password.html");

        WebElement ForgotPassword = driver.findElement(By.cssSelector("h2"));

       if (ForgotPassword.isDisplayed()){
           System.out.println( "Test Passed : " + ForgotPassword.getText() + " isDisplayed" );
       }else
           System.out.println("Test Failed: " + ForgotPassword.getText() + "is not displayed" );

       WebElement Email = driver.findElement(By.cssSelector("label[for='email']"));
       if (Email.isDisplayed()){
           System.out.println( "Test Passed : " + Email.getText() + " isDisplayed" );
       }else
           System.out.println("Test Failed: " + Email.getText() + "is not displayed" );

        WebElement emailInput = driver.findElement(By.cssSelector("label[for='email']"));
        if (Email.isDisplayed()){
            System.out.println( "Test Passed : " + emailInput.getText() + " isDisplayed" );
        }else
            System.out.println("Test Failed: " + emailInput.getText() + "is not displayed" );

        WebElement passwordInput = driver.findElement(By.cssSelector("input[ name='email']"));
        if (passwordInput.isDisplayed()){
            System.out.println( "Test Passed : " + passwordInput.getText() + "Email input isDisplayed" );

        }else
            System.out.println("Test Failed: " + passwordInput.getText() + "is not displayed" );

        WebElement retrievePassword = driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));
        if (Email.isDisplayed()){
            System.out.println( "Test Passed : " + retrievePassword.getText() + " isDisplayed" );
        }else
            System.out.println("Test Failed: " + retrievePassword.getText() + "is not displayed" );

        WebElement poweredLOOPCAMP = driver.findElement(By.cssSelector("div[style='text-align: center.;']"));
        if (Email.isDisplayed()){
            System.out.println( "Test Passed : " + poweredLOOPCAMP.getText() + " isDisplayed" );
        }else
            System.out.println("Test Failed: " + poweredLOOPCAMP.getText() + "is not displayed" );
    }


}
