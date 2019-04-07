package TestNGAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Module4 {
	@BeforeClass
	public void beforeClass()
	{
	System.out.println("M4 Before class");	
	}
	@AfterClass
	public void afterClass()
	{
	System.out.println("M4 After class");	
	}
	
	//before method
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("M4 Before method");
	}
	//after method
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("M4 After method");
	}
	//testcases
	@Test  //annotation
	public void test1()
	{
		System.out.println("M4 test1");	
	}

	@Test
	public void test2()
	{
		System.out.println("M4 test2");	
	}
	@Test
	public void test3()
	{
		System.out.println("M4 test3");	
	}
	@Test
	public void test4()
	{
		System.out.println("M4 test4");	
	}

}
