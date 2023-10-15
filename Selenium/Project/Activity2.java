package CRM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://alchemy.hguy.co/crm/");

        //WebElement img = driver.findElement(By.xpath("//*[@id=\"form\"]/div[1]/img"));
        WebElement img = driver.findElement(By.xpath("//img[@alt='SuiteCRM']"));
        String url = img.getAttribute("src");
        System.out.println("Header image url: " + url);
        // Close the browser
        driver.close();
    }
}
