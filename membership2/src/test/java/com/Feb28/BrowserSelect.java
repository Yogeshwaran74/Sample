package com.Feb28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserSelect {
WebDriver driver;
	
	@Parameters({"browser","appUrl"})
  @Test
  public WebDriver getBrowser(String browser , String appUrl)
  {
	  switch(browser)
	  {
	  case "chrome":
		  driver =new ChromeDriver();
		  break;
	  case "firefox":
//		  System.setProperty("webDriver.gecko.driver", "C:\\Users\\Hello\\Downloads\\Drivers\\geckodriver.exe");
		  driver =new FirefoxDriver();
		  break;
	  case "safari":
//		  System.setProperty("webDriver.safari.driver", "C:\\Users\\Hello\\Downloads\\Drivers\\safaridriver.exe");
		  driver =new SafariDriver();
		  break;
		  
		  default:
		  System.out.println("Unknown browser found");
	  }
	  driver.get(appUrl);
	  return driver;
}
}
