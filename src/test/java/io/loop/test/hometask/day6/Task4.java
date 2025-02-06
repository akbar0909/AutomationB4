package io.loop.test.hometask.day6;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task4 extends TestBase {
    /*  1. go to https://demoqa.com/nestedframes
      2. Validate "Child Iframe" text
      3. Validate "Parent Iframe" text body[contains(text(),'Parent frame')]
      4. Validate the "Sample Nested Iframe page. There are nested iframes in this page. Use browser
         inspector or firebug to check out the HTML source. In total, you can switch between the parent frame and the nested child frame."
         */

    String actual;
    String expected;

    @Test
    public void setUpIframe ()throws InterruptedException{
        driver.get("https://demoqa.com/nestedframes");
        driver.switchTo().frame("frame1"); //by //iframe[@id='frame1']
        Thread.sleep(300);

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
        Thread.sleep(300);
        // Validate "Child Iframe" text
        WebElement childIframeText = driver.findElement(By.xpath("//p[.='Child Iframe']"));
        actual=childIframeText.getText();
        expected ="Child Iframe";
        Assert.assertEquals(actual,expected,"actual does not match with expected");

        // Validate "Parent Iframe" text
        driver.switchTo().parentFrame();// go back to top level html document
        Thread.sleep(300);
        WebElement parentIframeText = driver.findElement(By.xpath("//body[.='Parent frame']"));
        Thread.sleep(300);
        String actual = parentIframeText.getText();
        String expected = "Parent frame";
        Assert.assertEquals(actual,expected,"actual does not match with expected");

        //4. Validate the "Sample Nested Iframe page. There are nested iframes in this page.

        driver.switchTo().defaultContent();
        Thread.sleep(300);

        WebElement sampleNestedIframe = driver.findElement(By.xpath("//div[@id='framesWrapper']"));
        Thread.sleep(300);
        String actual1 = sampleNestedIframe.getText();
        String expected1 = "Nested Frames\nSample Nested Iframe page. There are nested iframes in this page. " +
                "Use browser inspecter or firebug to check out the HTML source. In total you can switch between the parent frame and the nested child frame.";
        Assert.assertEquals(actual1,expected1, " does not match with expected");
















    }
}
