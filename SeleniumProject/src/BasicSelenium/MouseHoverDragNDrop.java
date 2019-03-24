package BasicSelenium;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHoverDragNDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		ChromeDriver dr =new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.flipkart.com/");
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //implicit wait waits for presence of your element on DOM
		
		//Excpilicit wait waits for the specific property of element;
		
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		Actions act= new Actions(dr);
		WebElement ele= dr.findElement(By.xpath("//span[text()='Women']"));
		act.moveToElement(ele).build().perform();
		
		//click on flats
		//Thread.sleep(100);
		WebDriverWait wait= new WebDriverWait(dr, 2);
		wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//a[text()='Flats']"))));
		dr.findElement(By.xpath("//a[text()='Flats']")).click();
		
		//draganddrop price section on flipkart
		wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]"))));
		act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]")), 50, 0).build().perform();
		
	}
}
