package LogicTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class returnClassObject 
{
	public int test()
	{
		return 10;//return integer value
	}
	
	public ChromeDriver test2()
	{
		//return new ChromeDriver() ;//return object of chromedriver
		//or
		ChromeDriver dr= new ChromeDriver();
		return dr;
	}

	public WebDriver test3(String browserName)
	{
		WebDriver dr= null;
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			dr=new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("FireFox"))
		{
			dr=new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("Edge"))
		{
			dr=new EdgeDriver();
		}
		return dr;
	}
	
}
