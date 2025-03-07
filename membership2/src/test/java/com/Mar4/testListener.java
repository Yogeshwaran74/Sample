package com.Mar4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testListener {
	WebDriver dr;
	@BeforeMethod
	public void launchfb() {
		dr=new EdgeDriver();
		dr.get("https://www.facebook.com/");
		System.out.println(dr.getTitle());
	}
	@Test(priority=1)
	public void login() {
		dr.findElement(By.id("email")).sendKeys("user1");
		WebElement pass = dr.findElement(By.id("pass"));
		Assert.assertTrue(pass.isDisplayed());
		pass.sendKeys("test");
		dr.findElement(By.name("login")).click();
	}
	@Test(priority=2)
	public void forgotpass() {
		WebElement forpass=dr.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]"));
		Assert.assertTrue(forpass.isDisplayed());
		forpass.click();
	}
	@AfterMethod
	public void end() {
		dr.quit();
	}
}
