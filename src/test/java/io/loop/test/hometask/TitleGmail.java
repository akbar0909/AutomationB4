package io.loop.test.hometask;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TitleGmail {
 /*
            1- Open a chrome browser
2- Go to: https://google.com
            3- Click to Gmail from top right.
            4- Validate title contains:
    Expected: Gmail
5- Go back to Google by using the .back();
6- Validate title equals:
    Expected: Google

  */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverUtil.getDriver(DocuportConstants.BROWSER);
        driver.get(DocuportConstants.GOOGlE);
        driver.manage().window().maximize();
        WebElement gmailIcon = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));
        Thread.sleep(2000);
        gmailIcon.click();
        //Validate title contains:// // ;
        String ExpectedTitle = "Gmail";

        String ActualTitle = driver.getTitle();


        if (ActualTitle.contains(ExpectedTitle)) {
            System.out.println("Title equals ExpectedTitle: " + ExpectedTitle);
        }else {
            System.out.println("Title not equals ExpectedTitle");
        }
        // Go back to Google by using the .back();

        driver.navigate().back();
        Thread.sleep(2000);
      //  Validate title equals:
            String ExpectedSubTitle = "Google";
            String ActualSubTitle = driver.getTitle();
            if (ActualSubTitle.contains(ExpectedSubTitle)) {
                System.out.println("Title equals ExpectedSubTitle: " + ExpectedSubTitle );

            }else {
                System.out.println("Title not equals ExpectedSubTitle");
            }

    }
}

