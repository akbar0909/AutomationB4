package io.loop.test.day4;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T00_css_isDisplayed {
    /*
      https://the-internet.herokuapp.com/forgot_password
       */
    public static void main(String[] args) {
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/forgot_password");

        WebElement forgetPasswordHeading = driver.findElement(By.cssSelector("div[class='example']>h2"));
        System.out.println(" Forget password " + forgetPasswordHeading.getText());

        // isDisplayed () boolean - will return true or false depending on the element is Displayed at html
        System.out.println(" Forget password " + forgetPasswordHeading.isDisplayed());

        if (forgetPasswordHeading.isDisplayed()){
            System.out.println("Test Passed:  Forget password heading is displayed");
        } else {
            System.out.println("Test Failed:  Forget password heading is NOT displayed");
        }
      //
        //  driver.quit();
    }
    }

