package com.Mar1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FBDataProvider {
	WebDriver dr;
	@BeforeMethod
	public void setup() {
		 dr= new EdgeDriver();
		dr.get("https://www.facebook.com/");
		Assert.assertEquals(dr.getTitle(), "Facebook – log in or sign up");
	}
	@Test(dataProvider="info")
	public void LoginTC(String u,String p) throws IOException {
		 WebElement unm = ReaderDetails.getElementRef("username", dr);
			unm.sendKeys(u);
			ReaderDetails.getElementRef("password", dr).sendKeys(p);
			ReaderDetails.getElementRef("log", dr).click();
			Assert.assertEquals(0, 0);
	}
	@DataProvider
	public Object[][]info(){
		return new Object[][] {
			{"aaa","a"},
			{"bbb","b"},
			{"ccc","c"}
		};
	}
	@Test
	public void forgetPass() throws IOException {
		ReaderDetails.getElementRef("forget", dr).click();
		WebElement ele = ReaderDetails.getElementRef("forgetverify", dr);
		Assert.assertTrue(ele.isDisplayed());
		ele.click();
	}
	@AfterMethod
	public void Drop() {
		dr.close();
	}
}
