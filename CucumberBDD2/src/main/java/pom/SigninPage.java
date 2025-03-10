package pom;

import org.openqa.selenium.By;

import base.Base;

public class SigninPage extends Base{
	public static Base base;
	public SigninPage(){
		
	}
	public  SigninPage(Base base) {
		this.base=base;
	}
	By signinbutton = By.xpath("//a[@title='Already a user? Sign in']");
	By username  = By.xpath("//input[@id='login1']");
	By password = By.xpath("//input[@id='password']");
	By click = By.xpath("//input[@title='Sign in']");
	public void signinbuttonclick() {
		base.driver.findElement(signinbutton).click();
	}
	public void enterusername(String user) {
		base.driver.findElement(username).sendKeys(user);
	}
	public void enterpassword(String pass) {
		base.driver.findElement(password).sendKeys(pass);
	}
	public void clicksubmit() {
		base.driver.findElement(click);
	}
}
