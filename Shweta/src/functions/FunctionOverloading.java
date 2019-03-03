package functions;

public class FunctionOverloading 
{
	public int sum(int a, int b)
	{
		return a+b;
	}
	//function ovrloading
	public int sum(int a, int b,int c)
	{
		return a+b+c;
	}
	

	
	//sum of 2 and 3 variavles
	public static void main(String[] args) {
		FunctionOverloading obj = new FunctionOverloading();
	    System.out.println(obj.sum(10, 20));
	    System.out.println(obj.sum(10, 20, 30));
	}
}
