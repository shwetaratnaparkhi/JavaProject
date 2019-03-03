package RadioButtonAndCheckBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttonselection {
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
		//1st method
		driver.findElement(By.id("novels-radio-btn")).click();
		//second method
		List<WebElement> rdBtn_books  = driver.findElements(By.name("books"));
		boolean bValue = false;
		bValue = rdBtn_books.get(0).isSelected();
		
		if(bValue = true)
		{
			rdBtn_books.get(1).click();	
		}
		else
		{
			rdBtn_books.get(0).click();
		}
		//third method
		List<WebElement> rdBtn_Profession  = driver.findElements(By.name("books"));
		int iSize =rdBtn_Profession.size();
		for(int i=0; i<iSize; i++)
		{
			String sValue = rdBtn_Profession.get(i).getAttribute("value");
			if (sValue.equalsIgnoreCase("Novels"))
			{
				rdBtn_Profession.get(i).click();
				break;
			}
		}
		
		driver.close();
	}
}
