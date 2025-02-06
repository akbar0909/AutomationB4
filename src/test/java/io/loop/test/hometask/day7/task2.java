package io.loop.test.hometask.day7;

import io.loop.test.base.TestBase;
import io.loop.test.utilities.ConfigurationReader;
import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.DocuportUtils;
import io.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

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

    @Test
    public void testAdvisor() throws InterruptedException {
        // login as an advisor
        Driver.getDriver().get(ConfigurationReader.getProperties("env"));
        Thread.sleep(5000);
        DocuportUtils.login(Driver.getDriver(), "advisor");








    }
}
