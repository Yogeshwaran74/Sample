package com.Feb28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FBApp {
  @Test(priority=1)
  public void LoginTC() {
	  WebDriver driver = new EdgeDriver();
	  driver.get("https://www.facebook.com/");
	  Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
	  driver.findElement(By.id("email")).sendKeys("user1");
		
		WebElement pwd=driver.findElement(By.id("pass"));
			Assert.assertTrue(pwd.isDisplayed());
			
			pwd.sendKeys("test");
  }
  @Test(priority=2)
  public void LoginTC1() {
	  WebDriver driver = new EdgeDriver();
	  driver.get("https://www.facebook.com/");
	  SoftAssert s = new SoftAssert();
	  s.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
	  System.out.println("login page found");
	  driver.findElement(By.id("Email")).sendKeys("user1");
		
		WebElement pwd=driver.findElement(By.id("pass"));
			s.assertTrue(pwd.isDisplayed());
			
			pwd.sendKeys("test");
			s.assertAll();
  }

}
