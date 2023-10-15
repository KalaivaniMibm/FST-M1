package CRM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://alchemy.hguy.co/crm/");

        //copyright -xapth
        WebElement copyright = driver.findElement(By.xpath("//*[@id='admin_options']"));
        //copyright-id
        WebElement copyright1 = driver.findElement(By.id("admin_options"));
        String url = copyright1.getText();
        System.out.println("Copy right text: " + url);
        // Close the browser
        driver.close();
    }
}
