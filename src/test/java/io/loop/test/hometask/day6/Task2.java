package io.loop.test.hometask.day6;

import io.loop.test.base.TestBase;
import io.loop.test.utilities.ConfigurationReader;
import io.loop.test.utilities.DocuportConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Task2 extends TestBase {

    /*
    login as an advisor
go to received document
click search
click status dropdown
choose in progress
     */

    @Test
    public void task2() throws InterruptedException {

        driver.get(ConfigurationReader.getProperties("env"));

        driver.get(ConfigurationReader.getProperties("env"));

        WebElement loginUsername = driver.findElement(By.xpath("//input[@id='input-14']"));
        loginUsername.sendKeys(DocuportConstants.USERNAME_ADVISOR);

        WebElement loginPassword = driver.findElement(By.xpath("//input[@id='input-15']"));

        loginPassword.sendKeys(DocuportConstants.DOCUPORT_PASSWORD);
        WebElement loginButton = driver.findElement(By.xpath("//span[normalize-space()='Log in']"));

        loginButton.click();

        Thread.sleep(3000);

        WebElement receivedDoc = driver.findElement(By.xpath("//h2[contains(.,'Received')]"));
        receivedDoc.click();
    }
}