package ThisExample;

public class ThisConstrutorEx {

	//instance variable
	int a;
	int b;
	
	//default constructor
	ThisConstrutorEx()
	{
		this(10, 20);
		System.out.println("Default constructor");
	}
	
	//Parameterised constructor
	ThisConstrutorEx(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Parameterised constructor");
	}
	public static void main(String[]args)
	{
		//// calling default constructor(default constructor is called as soon as we create instance of class)
		ThisConstrutorEx as = new ThisConstrutorEx();
	//// calling Parameterised constructor
	//	ThisConstrutorEx as = new ThisConstrutorEx(10, 20);
	}
	
	
	
}
