package StaticExample;

public class NestedClassExample {
	private int x =10;
	private static int y = 20;
	
	private class NonStatic
	{
		void display()
		{
			System.out.println("private int x = " +x);
			System.out.println(+y);
		}
	}
	static class StaticNested
	{
		void display()
		{  //you can not only access the static members
			//System.out.println("Private int x=" +x);
		  //you can only access the static members
			System.out.println("Private static int =" +y);			
		}
		
	}
	
	public static void main(String[]args)
	{
		NestedClassExample nc =new NestedClassExample();
		//instantiation of inner non-static class
		NestedClassExample.NonStatic nonStatic= nc.new NonStatic();
		nonStatic.display();
		// you can directly instantiate nested static class
		StaticNested StaticNested = new StaticNested();
		StaticNested.display();
		
		
	}

}
