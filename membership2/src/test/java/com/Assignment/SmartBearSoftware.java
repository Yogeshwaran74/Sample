package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SmartBearSoftware {
	@Test
	public void order() {
		WebDriver dr = new EdgeDriver();
		dr.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
		dr.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		dr.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		dr.findElement(By.id("ctl00_MainContent_login_button")).click();
		dr.findElement(By.xpath("//a[normalize-space()='Order']")).click();
		dr.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("5");
		dr.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("Yogesh");
		dr.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("kendriyavihar");
		dr.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox3']")).sendKeys("Chennai");
		dr.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox4")).sendKeys("TamilNadu");
		dr.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox5']")).sendKeys("600077");
		dr.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_1']")).click();
		dr.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys("234567891011");
		dr.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("12/12");
		dr.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_InsertButton']")).click();
		dr.close();
	}
}
