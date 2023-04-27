package com.demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstJenkinsTest {
	
	@Test
	public void firstTest() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://tutorialsninja.com/demo/");
		 Assert.assertTrue(driver.getTitle().contains("Store"),"Title is not displayed");
		 driver.quit();
	}

}
