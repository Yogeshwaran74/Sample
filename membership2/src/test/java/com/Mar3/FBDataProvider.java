package com.Mar3;

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
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		 driver= new EdgeDriver();
		driver.get("https://www.facebook.com/");
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
	}
		@Test(dataProvider="info" )
		  public void verifylogin(String u1 , String p1) throws IOException
		  {
			WebElement unm = ReaderDetails.getElementRef("username", driver);
			unm.sendKeys(u1);
			ReaderDetails.getElementRef("password", driver).sendKeys(p1);
			ReaderDetails.getElementRef("log", driver).click();
			Assert.assertEquals(0, 0);
		  }
		  
		  @DataProvider
		  public Object[][] info()
		  {
			  ReadExcel ex= new ReadExcel();
			  int rowcnt= ex.getRowCount(0);
			 short colcnt =ex.getColumnCount(0);
			 System.out.println(rowcnt+ "  "+ colcnt);
			  
			 Object[][] dataobj = new Object[rowcnt+1][colcnt];
			
			 for(int r=0 ; r<= rowcnt ; r++)
			 {
				for(int c=0; c<colcnt ;c++)
				{
					dataobj[r][c]= ex.getdata(0, r, c);
				}
			 }
			return dataobj;
		    		
		  
	}
	
//	@Test
//	public void forgetPass() throws IOException {
//		ReaderDetails.getElementRef("forget", dr).click();
//		WebElement ele = ReaderDetails.getElementRef("forgetverify", dr);
//		Assert.assertTrue(ele.isDisplayed());
//		ele.click();
//	}
	@AfterMethod
	public void Drop() {
		driver.close();
	}
}
