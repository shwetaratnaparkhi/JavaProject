package DropDownAndMultiselection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AcessDropDown {
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
		
		//for selecting one item
		Select drpCountry = new Select(driver.findElement(By.name("languages")));
	              //method 1
		drpCountry.selectByVisibleText("C#");
		          //method 2
		drpCountry.selectByIndex(2);
		          //method 3
		drpCountry.selectByValue("JavaScript");
		
		
		//Selecting Items in a Multiple Select items
		Select drpCountry1 = new Select(driver.findElement(By.name("selenium_suite")));
		drpCountry1.selectByVisibleText("Selenium RC");
		drpCountry1.selectByIndex(1);
		drpCountry1.selectByValue("IDE");
		
		//Selecting Items in a Multiple Select items for different site
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByIndex(0);
		fruits.selectByIndex(1);
		fruits.selectByIndex(2);
		Thread.sleep(1000);
		driver.quit();
	}

}
