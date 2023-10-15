package CRM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity9 {
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

        for(int i=1;i<=10;i++) {

                Thread.sleep(2000);
                WebElement name = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr["+i+"]/td[3]/b/a"));
                System.out.print("Name: "+ name.getText() + "   ");
            WebElement user = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr["+i+"]/td[8]"));
            System.out.println("User: " + user.getText());
        }
        // Close the browser
        driver.close();
    }
}