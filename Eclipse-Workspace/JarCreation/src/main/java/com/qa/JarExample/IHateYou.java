package com.qa.JarExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IHateYou {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src\\main\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chrisperrins95.github.io/AutomatedTestingExample/");
		WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("shafeeq")));
		System.out.println(element.getText());
		Thread.sleep(3000);
		driver.close();
	}
}
