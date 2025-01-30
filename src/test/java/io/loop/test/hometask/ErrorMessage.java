package io.loop.test.hometask;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ErrorMessage {
    /*
    1. navigate to docuport application
2. validate placeholders for user name and password
3. without sending username and password click login button
4. validate username and password error messages
     */
    public static void main(String[] args)throws InterruptedException {

        WebDriver driver = WebDriverUtil.getDriver(DocuportConstants.BROWSER);
        driver.manage().window().maximize();
        //navigate to docuport application
        driver.get(DocuportConstants.DOCUPORT_TEST);

        //validate placeholders for user name and password
        WebElement placeholderUserName = driver.findElement(By.cssSelector("input[id='input-14']"));
//        placeholderUserName.isDisplayed();
//        System.out.println("Test placeholderUserNam Passed with Frank");
        if (placeholderUserName.isDisplayed()) {
            System.out.println("Test placeholderUserNam Passed  Validated with Frank ");
        } else{
            System.out.println("Test Failed");
        }
        WebElement placeholderPassword = driver.findElement(By.cssSelector("input[id='input-15']"));
//        placeholderPassword.isDisplayed();
//        System.out.println("Test for placeholderPassword Passed with Frank");
        if (placeholderPassword.isDisplayed()) {
            System.out.println("Test for placeholderPassword Passed Validated with Frank ");
        } else{
            System.out.println("Test Failed");
        }

       // without sending username and password click login button
        WebElement emptyUserName = driver.findElement(By.cssSelector("input[id='input-14']"));
        emptyUserName.sendKeys(" ");
        if (emptyUserName.isDisplayed()) {
            System.out.println("Test emptyUserName Passed Validated with Frank ");
        }else {
            System.out.println("Test Failed");
        }
        WebElement emptyPassword = driver.findElement(By.cssSelector("input[id='input-15']"));
        emptyUserName.sendKeys(" ");
        if (emptyPassword .isDisplayed()) {
            System.out.println("Test emptyPassword  Passed Validated with Frank ");
        }else {
            System.out.println("Test Failed");
        }

        WebElement loginButton = driver.findElement(By.cssSelector("*[class='v-btn__content']"));
        loginButton.click();

        //validate username and password error messages
        WebElement errorMessages1= driver.findElement(By.cssSelector("div[class='v-messages__wrapper']>div"));
        System.out.println(errorMessages1.getText());










    }
}
