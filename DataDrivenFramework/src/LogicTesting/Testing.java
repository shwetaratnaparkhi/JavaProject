package LogicTesting;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Configuration.config;
import Library.Xls_Reader;

public class Testing 
{
	@Test(dataProvider="getData")
	public void testScript(String userName, String password, String Title)
	{
		System.setProperty("webdriver.chrome.driver", config.chromeDriverPath);
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();//to maximize window
		dr.get(config.URL);
		
		dr.findElement(By.name("userName")).sendKeys(userName);
		dr.findElement(By.name("password")).sendKeys(password);
		dr.findElement(By.name("login")).click();
		System.out.println(dr.getTitle());
		
		//String expectedTitle= "Find a Flight: Mercury Tours:";
		//Validation:=	
		assertEquals(dr.getTitle(), Title);
		dr.close();		
	}
	
	//two dimentional array one for row and one for coloumn
	@DataProvider
	public String [][] getData()
	{
		Xls_Reader xl = new Xls_Reader(config.testData);
		String [][] data= new String[2][3];
		//Row1
		data[0][0]="mercury";//username
		data[0][1]="mercury";//password
		data[0][2]="Find a Flight: Mercury Tours:";
		
		//Row2
		data[1][0]="mercury";//username
		data[1][1]="mercury";//password
		data[1][2]="Find a Flight: Mercury Tours:";
		
		return data;
		
		
	}

}
