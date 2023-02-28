package com.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class OikkoWebAutomation extends BaseDriver {

	public String baseUrl = "https://www.oikko.com.bd/";

	@Test
	public void webTest() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(5000);

		/*
		 * XPath
		 */
		WebElement loginButton = driver.findElement(By.xpath("//a[@id='']"));
		loginButton.click();

		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
	}
}