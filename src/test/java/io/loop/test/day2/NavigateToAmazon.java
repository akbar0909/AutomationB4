package io.loop.test.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToAmazon {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        Thread.sleep(3000);
        /*
    navigate to amazon
    maximize
    navigate back
    navigate forward
    refresh
     */
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();




    }
}
