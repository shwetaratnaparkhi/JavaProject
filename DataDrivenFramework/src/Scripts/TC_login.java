package Scripts;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Configuration.config;
import Library.Application_lib;
import Library.Xls_Reader;
import Pages.Loginpage;

public class TC_login//this program is fully automatic or dynamic, in this nothig is hard coded
{
	WebDriver dr;
	@BeforeClass//import annotation as testng parameter
	@Parameters({"browser"})
	public void preCondition(String browsername)
	{
		Application_lib lib= new Application_lib();
	//	dr=lib.launchBrowser("chrome");//for chrome, this is hard coded	
		dr=lib.launchBrowser(browsername);// this is for dynamic URL	
		dr.manage().window().maximize();//to maximize window
		dr.get(config.URL);
	}
	@AfterClass
	public void tearDown()
	{
		dr.close();	
	}
	
	@Test(dataProvider="getData")
	public void script(String userName, String password, String Title)	
	{
		//perform login
		Loginpage obj_login = new Loginpage(dr);//we have to create object of that class which we want to call in this class
		obj_login.login(userName, password);
		assertEquals(dr.getTitle(), Title);
		
	}
	//this is used for excel data
	@DataProvider
	public String [][] getData() throws IOException
	{
		Xls_Reader xl=new Xls_Reader(config.testData);
        String sheetName= this.getClass().getSimpleName();
		
		int rows=xl.getrowcount(sheetName);
		int cols=xl.getColumncount(sheetName);
		
		String[][] data =new String[rows-1][cols];
		for(int r=2; r<=rows;r++)
		{
			for (int c=1;c<=cols;c++)
			{
				data[r-2][c-1]=xl.getCellData(sheetName, r, c);
			}
		}	
				
				return data;
	}


}
