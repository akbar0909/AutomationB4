package io.loop.test.hometask;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class woodenSpoon {
    /*
    1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Validate title:
Expected: “Wooden spoon | Etsy”
     */
    public static void main(String[] args) {
        WebDriver driver = WebDriverUtil.getDriver(DocuportConstants.BROWSER);
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com");
        WebElement searchInput = driver.findElement(By.xpath("//input[@name='search_query']"));
        searchInput.sendKeys("wooden spoon");


    }
}
