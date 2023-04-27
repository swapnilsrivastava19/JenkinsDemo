package com.demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstJenkinsTest {
	
	@Parameters("Browser")
	@Test
	public void firstTest(String browserName) {
		System.out.println("Parameter value is "+browserName);
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")){
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://tutorialsninja.com/demo/");
		 Assert.assertTrue(driver.getTitle().contains("Store"),"Title is not displayed");
		 driver.quit();
	}

}
