package io.loop.test.day3;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_getAttribute_css {
    /*
     go to docuport app
        identify docuport with css
        get value of the attribute
        validate if it is "Docuport"

        the rest is home work
        locate:
        username
        password
        login
            with css
        login to docuport
        locate home icon of docuport after login or any other element after login
        validated that you logged in

     */
    public static void main(String[] args) {
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();
        driver.navigate().to(DocuportConstants.DOCUPORT_TEST);

        // Go to the URl
        WebElement logo = driver.findElement(By.cssSelector("img[src='/img/logo.d7557277.svg']"));
        String docuport = logo.getAttribute("alt");

        // String docuportName = docuport.getAttribute("alt");

        System.out.println("docuport = " + docuport);

        if (DocuportConstants.LOGO_DOCUPORT.equals(docuport)) {
            System.out.println("Expected result matches with actual result");
            System.out.println("Test Passed= " + docuport);

        } else {
            System.out.println("Expected result DOES NOT matches with actual result");
            System.out.println("Test Failed = " + docuport);

        }
    }
}
