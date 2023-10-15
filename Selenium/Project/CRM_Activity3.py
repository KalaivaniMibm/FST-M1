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
    #Activity3
    copyright = driver.find_element(By.XPATH,("//*[@id='admin_options']"));
    #copyright-id
    copyright1 = driver.find_element(By.ID,("admin_options"));
    url = copyright1.text
    print("Copy right text: " + url);
    #Close the browser
    driver.close();


