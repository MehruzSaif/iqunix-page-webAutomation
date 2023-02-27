package com.bd;

import org.testng.annotations.Test;

public class IqunixWebAutomation extends BaseDriver {

	public String baseUrl = "https://iqunix.store/";

	@Test
	public void webTest() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();

		if (driver.getTitle().contains("IQUNIX | High-performance and superb-design mechanical keyboards")) {
			System.out.println(driver.getTitle());
		} else {
			System.out.println("Title didn't match");
		}

		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
	}
}