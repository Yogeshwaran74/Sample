package com.Mar4;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Log4jBrowser {

	public static WebDriver driver;
	public static Logger log;
	public static void main(String[] args) {
 
		log= LogManager.getLogger(Log4jBrowser.class);
				
 
		log.info("Chrome browser starting...");
			driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		//validate the url handle exception
		try {
		Assert.assertEquals(driver.getTitle(),"Facebook – log in or sign up");
		
		log.info("Application launched...");
		}catch (Exception e) {
			System.out.println(e.getMessage());
			log.error("Exception occured", new Exception("facebook url invalid"));
		}
		
		log.info("Logged into Facebook...");
		
		//interact with username
		try {
		WebElement username=driver.findElement(By.name("email"));
		Assert.assertTrue(username.isDisplayed());
		username.sendKeys("hon");
		
		log.info("entered username");
		
		// validate password & interact
		WebElement pass=driver.findElement(By.name("pass"));
		Assert.assertTrue(pass.isDisplayed());
		pass.sendKeys("pass@12");
		
		log.info("entered pass");
		
	
			boolean status= driver.findElement(By.name("login123")).isDisplayed();
		}
		catch(Exception e) {
			System.out.print(e.getMessage());
			log.error("Exception occured", new Exception("customized error msg Element Not Found"));
		}
		finally {
			driver.quit();
			log.info("Quitting the driver");
		}
	}
}