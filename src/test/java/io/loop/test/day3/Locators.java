package io.loop.test.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        WebElement searchBoxWithID = driver.findElement(By.id("APjFqb"));

        WebElement searchBoxWithName = driver.findElement(By.name("q"));
        WebElement aboutLink = driver.findElement(By.linkText("About"));

        String txtToSearch = "Feyruz is the King of Java";
        searchBoxWithID.sendKeys(txtToSearch);

       // searchBoxWithID.submit();
        searchBoxWithID.clear();

        searchBoxWithID.sendKeys("Nadir is smat"+ Keys.ENTER);


    }
}
