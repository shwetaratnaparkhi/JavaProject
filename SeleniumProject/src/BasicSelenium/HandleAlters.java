package BasicSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlters {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Seleniumdriver\\chromedriver.exe");
		ChromeDriver dr =new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("E:\\Practice.html");
		
		JavascriptExecutor js = (JavascriptExecutor) dr;
		WebElement ele= dr.findElement(By.tagName("button"));
		js.executeScript("arguments[0].scrollIntoView()", ele);
		ele.click();
		Alert alt= dr.switchTo().alert();
		System.out.println(alt.getText());
		
		alt.accept();
		Thread.sleep(7000);
		
		ele.click();
		alt.dismiss();
		}
}
