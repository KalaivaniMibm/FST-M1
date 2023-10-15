package CRM;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.springframework.util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.replaceAll;

public class Activity6 {
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

       //navigation menu
//        WebElement navigationbar = driver.findElement(By.xpath("//*[@id=\"toolbar\"]"));
//        String menu = navigationbar.getText();
//        System.out.println("Menu Items"+menu);

        // using list
        ArrayList<String> obtainedList = new ArrayList<>();
        List<WebElement> menus = driver.findElements(By.className("topnav"));
        for(WebElement menulist:menus){
            obtainedList.add(menulist.getText());
        }
        System.out.println(obtainedList);
       for (int i=0;i<menus.size();i++){
          String menu = menus.get(i).getText();
          String arg = menu.replaceAll("\\s+","");
          if(arg.equals("ACTIVITIES")){
              System.out.println("Activities exists");
          }
      }

        // Close the browser
        driver.close();
    }
}
