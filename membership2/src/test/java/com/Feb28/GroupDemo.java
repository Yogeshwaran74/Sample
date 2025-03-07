package com.Feb28;

import org.testng.annotations.Test;

public class GroupDemo {
	@Test(groups={"Function"})
	  public void A()
	  {
		  System.out.println("A....");
	  }
	  
	  @Test(groups={"Function","Regression"})
	  public void B()
	  {
		  System.out.println("B...");
	  }
	  
	  @Test(groups={"Function","Regression"})
	  public void C()
	  {
		  Long tid=Thread.currentThread().getId();
		  System.out.println("C...."+tid);
	  }
	  
	  @Test(groups="smoke")
	  public void D()
	  {
		  System.out.println("D....");
	  }
	  @Test(groups="Regression")
	  public void E()
	  {
		  System.out.println("E....");
	  }
	 
}
