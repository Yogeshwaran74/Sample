package com.Feb28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class App {
	@Test(priority = 1)
	public void loginTc() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");

		driver.findElement(By.id("email")).sendKeys("user1");

		WebElement pwd = driver.findElement(By.id("pass"));
		Assert.assertTrue(pwd.isDisplayed());

		pwd.sendKeys("test");
		driver.findElement(By.name("login")).click();
		Assert.assertEquals(0, 0);
	}

	@Test(priority = 2)
	public void accountTc() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		driver.findElement(By.linkText("Create new account")).click();

		driver.findElement(By.name("firstname")).sendKeys("john");
		Assert.assertEquals(0, 0);
	}
}
