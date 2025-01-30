package io.loop.test.day3;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

public class T1_locators_getText {
    public static void main(String[] args) {
        /*
         * go to docuport
         * enter username
         * do NOT enter password
         * click on login button
         * verify error message - please enter password
         */
        WebDriver driver = WebDriverUtil.getDriver(DocuportConstants.BROWSER);
        driver.manage().window().maximize();
       driver.get(DocuportConstants.DOCUPORT_TEST);
       WebElement userName = driver.findElement(By.id("input-14"));
       userName.sendKeys(DocuportConstants.USERNAME_CLIENT);

       WebElement loginButtton = driver.findElement(By.className("v-btn__content"));
       loginButtton.click();
       WebElement errorMessage = driver.findElement(By.className("v-messages__message"));
       String actualErrorMessage = errorMessage.getText();
        if(actualErrorMessage.equals(DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD)){
            System.out.println("Expected error message: " + DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD + ", matches actual error message: " + actualErrorMessage + " => TEST PASS");
        } else {
            System.err.println("Expected error message: " + DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD + ", DOES NOT MATCH actual error message: " + actualErrorMessage + " => TEST FAIL");
        }

        driver.quit();


        ;



    }
}
