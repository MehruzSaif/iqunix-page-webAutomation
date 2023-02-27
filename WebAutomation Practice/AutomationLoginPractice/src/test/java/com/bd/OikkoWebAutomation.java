package com.bd;

import org.testng.annotations.Test;

public class OikkoWebAutomation extends BaseDriver {

	public String baseUrl = "https://www.oikko.com.bd/sign_in";
	
	@Test
	public void webTest() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
	}
}