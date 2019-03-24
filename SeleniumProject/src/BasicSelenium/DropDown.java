package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		ChromeDriver dr =new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://www.newtours.demoaut.com/");
		//dr.findElement(By.linkText("REGISTER")).click();
		dr.findElement(By.partialLinkText("REG")).click();
		
		  Select s = new Select(dr.findElement(By.name("country"))); 
		  s.selectByIndex(0);
		  
		  Thread.sleep(2000);
		  
		// s.selectByVisibleText("INDIA"); 
		 s.selectByValue("234");
		
	}
}
