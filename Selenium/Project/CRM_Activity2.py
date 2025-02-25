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

    # Print the title of the page

    img = driver.find_element(By.XPATH,"//img[@alt='SuiteCRM']")
    imgURL = img.get_attribute("src")
    print("image URL", imgURL)
    driver.close()