package SwitchTocommand;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTowindow {
	public static WebDriver driver;

	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "F:\\se\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		
		// click on the button 'new message window'
		
		driver.findElement(By.id("win1")).click();
		
		//store and print the name of all the windows open
		
		Set handles = driver.getWindowHandles();
		
		System.out.println(handles.size());
		
		System.out.println(handles);
		
		//pass a window handle to the other window
		
		for(String handle1 : driver.getWindowHandles())
		{
			driver.switchTo().window(handle1);
			
		}
		driver.close();
		
		//driver.quit(); //to close all sites
	}
}
