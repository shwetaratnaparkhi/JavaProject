package LogicTesting;

import Configuration.config;

public class Testing2
{
	public static void main(String[] args) 
	{	//we can write this way instead of writing hard coded path
		
		//System.out.println(System.getProperty("user.dir"));  //to get project path
		String str="C:\\Users\\user\\eclipse-workspace\\DataDrivenFramework"+"\\BrowserDrivers\\chromedriver.exe";//to get path of exe
		String str2=System.getProperty("user.dir")+"\\BrowserDrivers\\chromedriver.exe";
		
		System.out.println(str);
		System.out.println(str2);
		
		//config.URL=""; //cannot be reinitialize because it is final variable
	}

}
