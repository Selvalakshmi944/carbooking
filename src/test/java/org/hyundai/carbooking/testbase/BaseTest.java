package org.hyundai.carbooking.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
	
	public BaseTest() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	public void loadURL(String url) {
		driver.get(url);
	}

	public void sendKeys(WebElement webElement, String keys) {
		webElement.sendKeys(keys);
	}
	
	public void selectDropdown(WebElement webElement, int selectIndex) {
		Select s = new Select(webElement);
		s.selectByIndex(selectIndex);
	}
	
	

	public void selectDropdown(WebElement webElement, String selectOption) {
		Select s = new Select(webElement);
		s.selectByVisibleText(selectOption);
	}	
	
	public static void close() {
		driver.close();
	}

}
