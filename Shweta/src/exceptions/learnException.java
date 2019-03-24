package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//these are the events that occurs during execution of program and disturbs the  normal flow of execution
//it can be handled by throws keyword or either by try catch

public class learnException 
{
	public static void main(String[] args) throws FileNotFoundException, InterruptedException 
	{
		int a=10;
		int b=0;
		//it will give unchecked exception
		System.out.println(a/b);
		//it will give checked exception that is it will show compile time exception
		FileInputStream file = new FileInputStream("");
		Thread.sleep(200);
		
	}

}
