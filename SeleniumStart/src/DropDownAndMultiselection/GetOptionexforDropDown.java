package DropDownAndMultiselection;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionexforDropDown {
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
		
		Select drpDown = new Select(driver.findElement(By.name("selenium_suite")));
		List<WebElement> drpDown1  = drpDown.getOptions();
		
		int iSize =drpDown1.size();
		for(int i=0; i<iSize; i++)
		{
			//storing the value of option
			String sValue = drpDown.getOptions().get(i).getText();	
			//printing the stored value
			System.out.println(sValue);
			//Putting a check on each option that if any of the option
			if (sValue.equalsIgnoreCase("Selenium WebDriver"))
			{
				drpDown.selectByVisibleText("Selenium WebDriver");
				//drpDown1.get(i).click();
				break;
			}
		}
		Thread.sleep(1000);
		driver.quit();
	}
}
