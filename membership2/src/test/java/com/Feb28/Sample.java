package com.Feb28;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {
	@Test(priority=1)
	public void loginTc() {
		System.out.println("Login completed..");
		AssertJUnit.assertEquals("aaa","bbb");
	}
	@Test(priority=2)
	public void search() {
		System.out.println("Search done...");
		AssertJUnit.assertEquals("aaa","aaa");
	}
	@Test(priority=3)
	public void logoutTc() {
		System.out.println("LogoutDone...");
		AssertJUnit.assertEquals("aaa", "aaa");
	}
}
