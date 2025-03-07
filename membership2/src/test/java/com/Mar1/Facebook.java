package com.Mar1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook {
	WebDriver dr;
	@BeforeMethod
	public void setup() {
		 dr= new EdgeDriver();
		dr.get("https://www.facebook.com/");
		Assert.assertEquals(dr.getTitle(), "Facebook – log in or sign up");
	}
  @Test
  public void loginTc() throws IOException
  {
	  WebElement unm = ReaderDetails.getElementRef("username", dr);
		unm.sendKeys("user1");
		ReaderDetails.getElementRef("password", dr).sendKeys("test");
		ReaderDetails.getElementRef("log", dr).click();
		Assert.assertEquals(0, 0);
  }
  @AfterMethod
  public void tearDown()
  {
	  dr.close();
  }
 
	
}
