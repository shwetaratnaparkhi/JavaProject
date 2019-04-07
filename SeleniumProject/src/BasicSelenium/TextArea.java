package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextArea {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Seleniumdriver\\chromedriver.exe");
		ChromeDriver dr =new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://www.newtours.demoaut.com/");
		String str=dr.findElement(By.xpath("//font[starts-with(text(),'Registered')]")).getText();
		
		System.out.println(str);
	}
}
