package Alert;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertrobotclass {
	public static WebDriver driver;

	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "F:\\se\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://spreadsheetpage.com/index.php/file/c35/p10/");
		driver.manage().window().maximize();
		
		Robot robot = new Robot();
		 Thread.sleep(1000);
		 robot.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(1000);
		 robot.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(1000);
		 robot.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(1000);
		 robot.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(1000);
		 robot.keyPress(KeyEvent.VK_UP);
		 Thread.sleep(1000);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 Thread.sleep(1000);
		driver.close();
		
	}

}
