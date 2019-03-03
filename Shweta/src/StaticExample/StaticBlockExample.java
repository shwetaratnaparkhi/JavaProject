package StaticExample;

public class StaticBlockExample {

	static int a=0;
	static int b;
	
	static {
		System.out.println("Static block is initialized");
		b = a * 4;		
	}
	public static void main(String []args)
	{
		System.out.println("Value of a :"+a);
		System.out.println("Value of b :"+b);
	}
	
}
