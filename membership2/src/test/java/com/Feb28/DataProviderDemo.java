package com.Feb28;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class DataProviderDemo {
	@Test(dataProvider="dp")
	public void f(Integer n, String s) {
		System.out.println(n+"  "+s);
	}
	@DataProvider
	public Object[][]dp() {
		return new Object[][] {
			{1,"a"},
			{2,"b"},
			{3,"c"}
		};
		
		}
	@Test(dataProvider="info")
	public void f2(String s1,String s2,String s3) {
		System.out.println(s1+" "+s2+" "+s3);
	}
	@DataProvider
	public Object[][]info(){
		return new Object[][] {
			{"aaa","A","123"},
			{"bbb","B","456"},
			{"ccc","C","789"}
	};
}
}
