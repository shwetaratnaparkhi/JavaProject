package Alert;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webalert {
	public static WebDriver driver;

	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "F:\\se\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		driver.manage().window().maximize();
		// This step will result in an alert on screen
		driver.findElement(By.id("alertBox")).click();
		Alert simpleAlert = driver.switchTo().alert();
		String alerttext = simpleAlert.getText();
		
		System.out.println("Alert text is :" + alerttext);
		Thread.sleep(1000);
		simpleAlert.accept();
		 Thread.sleep(1000);
		driver.close();
		
	}
}
