package CRM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;



public class Activity7 {
    public static void main(String[] args) throws InterruptedException {
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

        //sales menu
        WebElement sales = driver.findElement(By.xpath("//*[@id=\"grouptab_0\"]"));
        sales.click();
        WebElement saleslead = driver.findElement(By.xpath("//*[@id=\"moduleTab_9_Leads\"]"));
        saleslead.click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(100));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title=\"Additional Details\"]")));
        WebElement info = driver.findElement(By.xpath("//*[@title=\"Additional Details\"]"));
        info.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class =\"phone\"]")));
        WebElement phone = driver.findElement(By.xpath("//*[@class =\"phone\"]"));
        System.out.println("Phone number is " + phone.getText());
        // Close the browser
        driver.close();
    }
}
