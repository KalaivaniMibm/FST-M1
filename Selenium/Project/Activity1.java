package CRM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;

import java.util.Objects;

public class Activity1 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://alchemy.hguy.co/crm/");

        //Activity1
        String title = driver.getTitle();
        System.out.println("Home page title: " + title);
        Assert.assertEquals("SuiteCRM",title);

        if (Objects.equals(title, "SuiteCRM"))
        {
            System.out.println("Title matched");
        }
        else {
            System.out.println("Title not matched");
        }

        // Close the browser
        driver.close();
    }
}
