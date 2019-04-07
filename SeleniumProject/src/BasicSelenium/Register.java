package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Seleniumdriver\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com/");
		
		/*driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@name='login']")).click();*/
		
		driver.findElement(By.linkText("REGISTER")).click(); 
		
		  
	    WebElement txtBox_firstname = driver.findElement(By.name("firstName")); 
	    txtBox_firstname.sendKeys("Roopali"); 
	    
	   
	    driver.findElement(By.name("lastName")).sendKeys("Maheshwari"); 
	    driver.findElement(By.name("phone")).sendKeys("2342342341"); 
	    driver.findElement(By.name("userName")).sendKeys("abchd@gmail.com"); 
	 
	   
	    Select s = new Select(driver.findElement(By.name("country"))); 
	    s.selectByVisibleText("INDIA"); 
	 
	    
	    driver.findElement(By.name("email")).sendKeys("12345"); 
	    driver.findElement(By.name("password")).sendKeys("12345"); 
	    driver.findElement(By.name("confirmPassword")).sendKeys("12345"); 
	    
	    
	    driver.findElement(By.xpath("//input[@name='register']")).click();
	 
	    driver.findElement(By.linkText("Home")).click();
	 
	    
	    driver.findElement(By.name("userName")).sendKeys("mercury"); 
	    driver.findElement(By.name("password")).sendKeys("mercury"); 
	    driver.findElement(By.xpath("//input[@name='login']")).click();
	 
		
}
}
