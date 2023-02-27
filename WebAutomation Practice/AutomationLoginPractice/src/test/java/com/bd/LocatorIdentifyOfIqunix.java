package com.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
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
		 * Xpath
		 */
		WebElement loginButton = driver.findElement(By.xpath("//a[@class='cb chp db push_side']"));
		loginButton.click();
		
//		WebElement email = driver.findElement(By.id("#nt_login_canvas"));
//		email.sendKeys("mehruzsaif007@gmail.com");
		
		Thread.sleep(10000);
	}
}