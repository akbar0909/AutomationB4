package io.loop.test.day9;

import io.loop.test.utilities.ConfigurationReader;
import io.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T1_actions_hoverover {

    /*
    1. Go to https://ww.google.com
    2. Hover over on Search button
    3. Hover over on Feeling Lucky button

     */


    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperties("google.url"));
        WebElement googleSearch = Driver.getDriver().findElement(By.xpath("//input[@id='gbqfbb']/preceding-sibling::input"));
        Thread.sleep(300);
        WebElement feelingLucky = Driver.getDriver().findElement(By.xpath("//input[@id='gbqfbb']"));
        Thread.sleep(300);
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(googleSearch).perform();
        Thread.sleep(300);
        actions.moveToElement(feelingLucky).perform();
        actions.sendKeys(Keys.F12).perform();
        actions.sendKeys(Keys.F5).perform();



    }
}
