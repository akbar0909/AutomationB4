package io.loop.test.homework.day_10;

/*

1. Open browser
2. Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
3. Enter username: “Tester”
4. Enter password: “test”
5. Click to Login button
6. Print out count of all the links on landing page
7. Print out each link text on this page
 */

import io.loop.pages.SmartBearSoftwarePage;
import io.loop.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task1 {

    SmartBearSoftwarePage smartBearSoftwarePage;

    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        smartBearSoftwarePage = new SmartBearSoftwarePage();

    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }

    @Test
    public void smartBearSoftware() {
        smartBearSoftwarePage.usernameBox.sendKeys("Tester");
        smartBearSoftwarePage.passwordBox.sendKeys("test");
        smartBearSoftwarePage.loginButton.click();

        System.out.println("smartBearSoftwarePage.smartWebAllLinks.size() = " + smartBearSoftwarePage.smartWebAllLinks.size());

        for (WebElement each : smartBearSoftwarePage.smartWebAllLinks) {
            //System.out.println(each);
            System.out.println("each.getText() = " + each.getText());

        }
    }
}
