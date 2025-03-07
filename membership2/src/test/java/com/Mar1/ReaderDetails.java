package com.Mar1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReaderDetails {
	public static String getpropertiesdetails(String key) throws IOException {
		String value = null;
		FileInputStream fis = new FileInputStream("src\\test\\java\\com\\Mar1\\locators.properties");
		Properties property = new Properties();
		property.load(fis);
		value = property.getProperty(key);
		return value;
	}
	public static WebElement getElementRef(String key1 , WebDriver driver) throws IOException
	{
		 WebElement ele = null;
		String value= getpropertiesdetails(key1); //name:pass
		String[] info= value.split(":"); // info[0]= name , info[1]=pass
		switch(info[0])
		{
		case "id":
			 ele= driver.findElement(By.id(info[1]));
			break;
		case "name":
			 ele=driver.findElement(By.name(info[1]));
			 break;
		case "xpath":
			 ele=driver.findElement(By.xpath(info[1]));
			 break;
		case "linkText":
			 ele=driver.findElement(By.linkText(info[1]));
			 break;
		case "className":
			 ele=driver.findElement(By.className(info[1]));
			 break;
			 default:
			 System.out.println("Unknown Locator found");
		}
		return ele;
		
	}
	 
}
