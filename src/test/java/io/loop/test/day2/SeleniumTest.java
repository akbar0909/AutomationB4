package io.loop.test.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args)throws InterruptedException {  //Thread.sleep();- throws InterruptedException which can be handled.


        // Setting up the web driver
       //  WebDriverManager.chromedriver().setup();

        // if you use older version of selenium (4.21) you need webdrivermanager and Boni García
        // Create WebDriver instance
        WebDriver driver = new ChromeDriver();




        // Maximize the browser window
        driver.manage().window().maximize();  //driver.manage().window().fullscreen();

        // Navigate to the first URL (page)
        driver.get("https://www.loopcamp.io");

        // Wait for 3 seconds; Thread.sleep();- throws InterruptedException which can be handled.
        Thread.sleep(3000);

        //navigate to the page
        driver.navigate().to("https://www.google.com");

      // Navigate back to the previous page
        driver.navigate().back();

        // Navigate forward to the next page
        driver.navigate().forward();

      // Refresh the current page
        driver.navigate().refresh();

      // Quit the browser
        driver.quit();


    }



}
