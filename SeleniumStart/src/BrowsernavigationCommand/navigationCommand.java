package BrowsernavigationCommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationCommand {
	
	public static WebDriver driver;
	public static void main(String args[]) throws Exception
	{

		System.setProperty("webdriver.chrome.driver", "F:\\se\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.facebook.com/");
		//** other way to call url
		//String appUrl = "http://www.facebook.com/";
		//driver.get(appUrl);
	
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.partialLinkText("Forgotten account?")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(500);
	    driver.navigate().forward();
		Thread.sleep(500);
		driver.navigate().refresh();
		Thread.sleep(500);
		driver.close();
		
	}

}
