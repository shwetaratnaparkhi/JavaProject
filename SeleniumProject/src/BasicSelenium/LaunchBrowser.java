package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Seleniumdriver\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();//to maximize window
		dr.get("http://newtours.demoaut.com/");
		
		//login
		dr.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
		dr.findElement(By.xpath("//input[@name='login']")).click();
		Thread.sleep(500);
		dr.findElement(By.xpath("//input[@name='findFlights']")).click();
		Thread.sleep(500);
		dr.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		Thread.sleep(500);
		dr.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("rahul");
		dr.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("sharma");
		Select dr1 = new Select(dr.findElement(By.name("pass.0.meal")));
		dr1.selectByVisibleText("Hindu");
		Select dr2 = new Select(dr.findElement(By.name("creditCard")));
		dr2.selectByVisibleText("MasterCard");
		dr.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("451241256589");
		Select dr3 = new Select(dr.findElement(By.name("cc_exp_dt_mn")));
		dr3.selectByVisibleText("03");
		Select dr4 = new Select(dr.findElement(By.name("cc_exp_dt_yr")));
		dr4.selectByVisibleText("2010");
		dr.findElement(By.xpath("//input[@name='cc_frst_name']")).sendKeys("rahul");
		dr.findElement(By.xpath("//input[@name='cc_mid_name']")).sendKeys("harsh");
		dr.findElement(By.xpath("//input[@name='cc_last_name']")).sendKeys("sharma");
		
				//dr.close();//to close window
	}

}
