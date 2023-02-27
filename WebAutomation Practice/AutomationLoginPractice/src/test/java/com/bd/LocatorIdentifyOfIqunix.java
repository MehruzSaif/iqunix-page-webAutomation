package com.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorIdentifyOfIqunix extends BaseDriver {

	String url = "https://iqunix.store/";

	@Test
	public void testLocator() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(10000);

		/*
		 * XPath
		 */
		WebElement loginButton = driver.findElement(By.xpath("//a[@class='cb chp db push_side']"));
		loginButton.click();

		WebElement email = driver.findElement(By.xpath("//input[@id='CustomerEmail']"));
		email.sendKeys("mehruzsaif007@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@id='CustomerPassword']"));
		password.sendKeys("12345678");

		Thread.sleep(10000);
	}
}