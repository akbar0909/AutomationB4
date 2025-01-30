package io.loop.test.hometask;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T00_Docuport_Css {
    /*go to docuport app
    identify docuport with css
    get value of the attribute
    validate if it is "Docuport"

    the rest is home work
    locate:----
    username
            password
    login
    with css
    login to docuport
    locate home icon of docuport after login or any other element after login
    validated that you logged in

     */
    public static void main(String[] args) throws InterruptedException {
      //  go to docuport app
        WebDriver driver = WebDriverUtil.getDriver(DocuportConstants.BROWSER);
        driver.manage().window().maximize();
        driver.get(DocuportConstants.DOCUPORT_TEST);
        //identify docuport with css img[src ='/img/login-intro.00527dd6.svg']
        WebElement homePage = driver.findElement(By.cssSelector("img[src ='/img/login-intro.00527dd6.svg']"));
        String homePageUrl = homePage.getAttribute("alt");
//
//        get value of the attribute
//        validate if it is "Docuport"
        if (DocuportConstants.LOGO_DOCUPORT.equals(homePageUrl)) {
            System.out.println( "Test Passed: " + homePageUrl);

        }else
            System.out.println( "Test Failed: " );

        WebElement username = driver.findElement(By.cssSelector("input[id='input-14']"));
        username.sendKeys(DocuportConstants.USERNAME_CLIENT);
        WebElement password = driver.findElement(By.cssSelector("input[id='input-15']"));
        password.sendKeys(DocuportConstants.DOCUPORT_PASSWORD);
        WebElement submitButton = driver.findElement(By.cssSelector("[class='v-btn__content']"));

        submitButton.click();

        Thread.sleep(5000);
        WebElement ChooseButton = driver.findElement(By.cssSelector("button[type='submit']"));//
        ChooseButton.click();

       WebElement elementAfterLogin = driver.findElement(By.cssSelector("div[class='v-avatar primary']"));
       elementAfterLogin.click();

       Thread.sleep(5000);
       if(elementAfterLogin.isDisplayed()){
           System.out.println("Test Passed: BG = " + elementAfterLogin.getText());

       }else
           System.out.println("Test Failed:  " );





















    }


}
