package BasicSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Seleniumdriver\\chromedriver.exe");
		ChromeDriver dr =new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.naukri.com/");
		String mainWindow= dr.getWindowHandle();
		System.out.println(mainWindow);
		Set<String> mainWindow1=dr.getWindowHandles();
		
		for(String s: mainWindow1)
		{
			//closing the popup windows
			dr.switchTo().window(s);
			System.out.println(dr.getTitle());//get the title of the windows
			if(!s.equalsIgnoreCase(mainWindow))
			{
				dr.close();
			}
		}
		
		dr.switchTo().window(mainWindow);
		dr.findElement(By.xpath("//div[text()='Login'")).click();

		//dr.quit(); //will terminate all the windows
        //dr.close();		// will terminate the window which is on focus

	}
}
