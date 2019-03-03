package RadioButtonAndCheckBox;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxSelection {
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
		//xpath for type
		List<WebElement> chkbox_Profession  = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int iSize =chkbox_Profession.size();
		for(int i=0; i<iSize; i++)
		{
			String sValue = chkbox_Profession.get(i).getAttribute("value");
			System.out.println(sValue);
			if (sValue.equalsIgnoreCase("SUV"))
			{
				chkbox_Profession.get(i).click();
				break;
			}
		}
		Thread.sleep(1000);
		driver.quit();
	}

}
