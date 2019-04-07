package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage
{
	WebDriver dr;	
	By username= By.name("userName");
	By password= By.name("password");
	By login= By.name("login");
	By registration= By.linkText("REGISTER");
	
	public Loginpage(WebDriver dr)
	{
		this.dr=dr;
	}
	
	public String login(String username, String password)
	{
		dr.findElement(this.username).sendKeys(username);
		dr.findElement(this.password).sendKeys(password);
		dr.findElement(login).click();
		return dr.getTitle();
	}
	

}
