package io.loop.test.hometask.day7;

import io.loop.test.base.TestBase;
import io.loop.test.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class task3 extends TestBase {

    /*
    task3
=============
    1. go to https://loopcamp.vercel.app/
    2. click "Multiple Windows" link
    3. Validate "Powered by Loopcamp" is displayed
    4. Validate title is "Windows"
    5. Click - click here
    6. Switch to new window and validate title
     */

    String expected,actual;

    @Test

    public void taskWindows () throws InterruptedException {
        //go to https://loopcamp.vercel.app/
        driver.get("https://loopcamp.vercel.app/");

        // click "Multiple Windows" link
        WebElement MultipleWindows = driver.findElement(By.xpath("//a[.='Multiple Windows']"));
        Thread.sleep(2000);
        MultipleWindows.click();

        //Validate "Powered by Loopcamp" is displayed
        WebElement PoweredByLoopcamp = driver.findElement(By.xpath("// div[@style='text-align: center;']"));
        Thread.sleep(2000);
       // PoweredByLoopcamp.click();
          actual=PoweredByLoopcamp.getText();
          expected  ="Powered by LOOPCAMP";
        assertEquals(actual, expected, "Expected does not match actual");

        //Validate title is "Windows"
        actual= driver.getTitle();
        expected  ="Windows";
        assertEquals(actual, expected, "Expected does not match actual");
        System.out.printf("driver.getTitle() = %s%n", driver.getTitle());

        //Click - click here
        WebElement clickHere = driver.findElement(By.xpath("//a[.='Click Here']"));
        clickHere.click();

        //Switch to new window and validate title

//        Thread.sleep(3000);
//        BrowserUtils.switchWindowAndValidate(driver, "https://loopcamp.vercel.app/", "new window");







    }


}

