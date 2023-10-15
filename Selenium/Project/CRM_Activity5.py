# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

# Set up the Firefox Driver with WebDriverManger
service = FirefoxService(GeckoDriverManager().install())

# Start the Driver
with webdriver.Firefox(service=service) as driver:
    # Navigate to the URL
    driver.get("https://alchemy.hguy.co/crm/")
    #Activity4
    #userid
    userid = driver.find_element(By.XPATH,("//*[@id='user_name']"));
    #password
    password = driver.find_element(By.XPATH,("//*[@id='username_password']"));
    #login
    login = driver.find_element(By.XPATH,("//*[@name='Login']"));
    userid.send_keys("admin");
    
    password.send_keys("pa$$w0rd");
    login.click();

    print("logged into " + driver.title);


    #color of navigation menu
    navigationbar = driver.find_element(By.XPATH,("//*[@id=\"toolbar\"]"));

    color = navigationbar.value_of_css_property("color")
    print("Color of the navigation bar is "+color);
    #Close the browser
    driver.close();



