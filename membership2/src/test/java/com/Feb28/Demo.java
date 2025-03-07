package com.Feb28;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void login()
	{
		System.out.println("login....");
		String s1="Java";
		String s2="java";
		
		if(s1.equals(s2))
		{
			System.out.println("Vlaid..");
		}
		else
		{
			System.out.println("InVlaid..");
		}
	}
	
	@Test
	public void search()
	{
		System.out.println("search....");
		String s1="Java";
		String s2="java";
		Assert.assertEquals(s1, s2," check the input values...");
		
		Assert.assertNotEquals("aaa", "bbb");
		
		Assert.assertTrue(10>1);
		
		Assert.assertFalse(10>100);
		Assert.assertTrue(10<1, " plz check the condition...");
	}
}
