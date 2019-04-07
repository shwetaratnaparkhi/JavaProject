package BasicSelenium;

import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWIndows2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Seleniumdriver\\chromedriver.exe");
		ChromeDriver dr =new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.naukri.com/");
		HashMap<String, String> windows = new HashMap<>();
		String mainWindow= dr.getWindowHandle();
		System.out.println(mainWindow);
		Set<String> mainWindow1=dr.getWindowHandles();
		
		for(String s: mainWindow1)
		{
			dr.switchTo().window(s);
			windows.put(dr.getTitle(), s);
		}
		
		dr.switchTo().window(windows.get("HCL"));
		dr.findElement(By.xpath("//img[@alt='HCL']")).click();

	

	}

}
