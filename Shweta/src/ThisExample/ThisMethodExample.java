package ThisExample;

public class ThisMethodExample {
	
	void a()
	{
		System.out.println("Hi");
	}
	
	void b()
	{
		System.out.println("Hello");
		a();
	}
	public static void main(String []args)
	{
		ThisMethodExample ba = new ThisMethodExample();
		ba.b();
	}
}
