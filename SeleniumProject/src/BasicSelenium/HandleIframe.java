package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Seleniumdriver\\chromedriver.exe");
		ChromeDriver dr =new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://paytm.com/");
		Thread.sleep(2000);
		dr.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		Thread.sleep(3000);
		//dr.switchTo().frame(0);
		dr.switchTo().frame(dr.findElement(By.tagName("iframe")));
		dr.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
		dr.switchTo().defaultContent();
		dr.findElement(By.xpath("//a[@title='Close']")).click();
	}
}
