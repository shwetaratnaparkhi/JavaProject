package TestNGAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Module1 {
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("before test 1");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("after test 1");
	}
	
	
	@BeforeClass
	public void beforeClass()
	{
	System.out.println("M1 Before class");	
	}
	@AfterClass
	public void afterClass()
	{
	System.out.println("M1 After class");	
	}
	
	//before method
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("M1 Before method");
	}
	//after method
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("M1 After method");
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
