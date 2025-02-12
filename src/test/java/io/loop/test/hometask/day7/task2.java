package io.loop.test.hometask.day7;

import io.loop.test.base.TestBase;
import io.loop.test.utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class task2 {
    /*
    1. login as an advisor
    2. go to users
    3. validate that full name for alex.de.souza@gmail.com is Alex De Souza - we did in class
    4. validate that user name for alex.de.souza@gmail.com is alexdesouze
    5. validate that phone number for alex.de.souza@gmail.com is +994512060042
    6. validate that role for alex.de.souza@gmail.com is client
    7. validate that advisor for alex.de.souza@gmail.com is  Batch1 Group1
     */
    String actual, expected;
    @Test
    public void testAdvisor() throws InterruptedException {
        // login as an advisor
        Driver.getDriver().get(ConfigurationReader.getProperties("env"));

        DocuportUtils.login(Driver.getDriver(), "advisor");
        //go to users
        WebElement users = Driver.getDriver().findElement(By.xpath("//span[.='Users']"));
        users.click();
        //3. validate that full name for alex.de.souza@gmail.com is Alex De Souza - we did in class
        expected = "alexdesouze";
        actual = DocuportWebTableUtils.returnAnyField(Driver.getDriver(), "alex.de.souza@gmail.com", "username");
        assertEquals(actual, expected, "Actual does not match expected");

        //validate that phone number for alex.de.souza@gmail.com is +994512060042
         expected = "+994512060042";
         actual = DocuportWebTableUtils.returnAnyField(Driver.getDriver(), "alex.de.souza@gmail.com", "phone number");
        assertEquals(actual, expected, "Actual does not match expected");

        //validate that role for alex.de.souza@gmail.com is client
        expected = "Client";
        actual = DocuportWebTableUtils.returnAnyField(Driver.getDriver(), "alex.de.souza@gmail.com", "role");
        assertEquals(actual, expected, "Actual does not match expected");

        //validate that advisor for alex.de.souza@gmail.com is  Batch1 Group1

        expected = "Batch1 Group1";
        actual = DocuportWebTableUtils.returnAnyField(Driver.getDriver(), "alex.de.souza@gmail.com", "advisor");
        assertEquals(actual, expected, "Actual does not match expected");











    }
}
