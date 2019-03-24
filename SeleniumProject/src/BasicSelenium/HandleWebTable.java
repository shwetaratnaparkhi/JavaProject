package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		ChromeDriver dr =new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("file:///G:/Practice.html");
		int rows= dr.findElements(By.xpath("//table/tbody/tr")).size();
	//	System.out.println(dr.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).getText());
		for(int r=1; r<=rows; r++)
		{
			int cols= dr.findElements(By.xpath("//table/tbody/tr["+r+"]/td")).size();
			for (int c=1; c<=cols; c++)
			{
				System.out.println(dr.findElement(By.xpath("//table/tbody/tr["+r+"]/td["+c+"]")).getText());
			}
		}
	}

}
