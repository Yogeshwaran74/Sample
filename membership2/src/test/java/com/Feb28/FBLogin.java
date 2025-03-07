package com.Feb28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FBLogin {
	@Test(dataProvider="credentials")
	public void login(String name,String password) {
		WebDriver dr = new EdgeDriver();
		dr.get("https://www.facebook.com/");
		dr.navigate().refresh();
		SoftAssert s = new SoftAssert();
		s.assertEquals(dr.getTitle(), "Facebook – log in or sign up");
		dr.findElement(By.id("email")).sendKeys(name);
		WebElement pwd = dr.findElement(By.id("pass"));
		s.assertTrue(pwd.isDisplayed());
		pwd.sendKeys(password);
		WebElement btn = dr.findElement(By.name("login"));
		s.assertTrue(btn.isDisplayed());
		btn.click();
	}
	@DataProvider
	public Object[][]credentials(){
		return new Object[][] {
			{"user1","123"},
			{"user2","456"},
			{"user3","789"}
			
	};
}
}
