package io.loop.test.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * Navigate to Google search
 * maximize the page
 * get title of the page
 * get url of the page
 * validate the title, expected title is "Google"
 * validate the url of the page, expected url is "https://www.google.com/"
 * close the browser
 */
public class GoogleSearch {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // navigate to google
        driver.get("https://www.google.com");

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Actual title " + actualTitle+ "expected title is " + expectedTitle + "TEST PASSED");
        }else {
            System.out.println("Actual title  " + actualTitle+ " DOES NOT expected title is " + expectedTitle + " TEST FAILED");
        }

        String expectedUrl = "https://www.google.com/";
        String actualUrl = driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)) {
            System.out.println("Actual url: " + actualUrl + "expected url is " + expectedUrl + "TEST PASSED");

        }else{
            System.out.println("Actual url: " + actualUrl + " DO NOT expected url is " + expectedUrl + " TEST FAILED");
        }



    }
}
