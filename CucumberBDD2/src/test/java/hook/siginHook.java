package hook;

import org.openqa.selenium.edge.EdgeDriver;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class siginHook extends Base{
	public static Base base;
	@Before 
	public void setUp()
	{
		base.driver=new EdgeDriver();
		base.driver.get("https://rediff.com/");
	}
	@After
	public void closeSetup()
	{
		base.driver.close();
	}

}
