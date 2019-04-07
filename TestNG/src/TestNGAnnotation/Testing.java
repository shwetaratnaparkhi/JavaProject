package TestNGAnnotation;//priority

import org.testng.annotations.Test;

public class Testing {
	
	@Test(priority=1)  //annotation
	
	public void test1()
	{
		System.out.println("test1");	
	}
	@Test(priority=0)
	public void atest2()
	{
		System.out.println("test2");	
	}
	@Test(priority=2)
	public void test3()
	{
		System.out.println("test3");	
	}
	@Test(priority=3)
	public void test4()
	{
		System.out.println("test4");	
	}

}
