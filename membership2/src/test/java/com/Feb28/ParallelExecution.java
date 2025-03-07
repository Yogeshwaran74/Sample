package com.Feb28;

import org.testng.annotations.Test;

public class ParallelExecution {
	@Test(groups={"Function"})
	  public void A()
	  {
		 Long tid=Thread.currentThread().getId();
		  System.out.println("A...."+tid);
	  }
	  
	  @Test(groups={"Function","Regression"})
	  public void B()
	  {
		  Long tid=Thread.currentThread().getId();
		  System.out.println("B..."+tid);
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
		  Long tid=Thread.currentThread().getId();
		  System.out.println("D...."+tid);
	  }
	  @Test(groups="Regression")
	  public void E()
	  {
		  Long tid=Thread.currentThread().getId();
		  System.out.println("E...."+tid);
	  }
	 
}
