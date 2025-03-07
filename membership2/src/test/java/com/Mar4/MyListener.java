package com.Mar4;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener  implements ITestListener
{
	public void onTestStart(ITestResult result) {
		  System.out.println(" Tc statred ");
	  }
	
	public void onTestSuccess(ITestResult result) {
		   System.out.println("Pass Tc");
		  }
	
	public void onTestFailure(ITestResult result) {
		  System.out.println("Failed Tc");
		  }
	public void onTestSkipped(ITestResult result) {
		  System.out.println("skipped Tc");
		  }
	
	public void onStart(ITestContext context) {
		  System.out.println("class started");	
		  }
	
	public void onFinish(ITestContext context) {
		  System.out.println("class ended...");
		  }
}