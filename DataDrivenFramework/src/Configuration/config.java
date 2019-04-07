package Configuration;

public class config 
{
	//final means can not be reinitialize
	public final static String chromeDriverPath=System.getProperty("user.dir")+"\\BrowserDrivers\\chromedriver.exe";
	public final static String firefoxDriverPath=System.getProperty("user.dir")+"\\BrowserDrivers\\geckodriver.exe";
	public final static String URL="http://newtours.demoaut.com/";
	public final static String testData=System.getProperty("user.dir")+"\\src\\TestData\\TestData.xls";
	

}
