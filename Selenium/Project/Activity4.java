package CRM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://alchemy.hguy.co/crm/");

        //userid
        WebElement userid = driver.findElement(By.xpath("//*[@id='user_name']"));
        //password
        WebElement password = driver.findElement(By.xpath("//*[@id='username_password']"));
        //login
        WebElement login = driver.findElement(By.xpath("//*[@name='Login']"));
        userid.sendKeys("admin");
        password.sendKeys("pa$$w0rd");
        login.click();

        System.out.println("logged into " + driver.getTitle());
        // Close the browser
        driver.close();
    }
}
