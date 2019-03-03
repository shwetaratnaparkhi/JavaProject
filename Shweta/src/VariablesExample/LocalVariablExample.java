package VariablesExample;

public class LocalVariablExample {
	LocalVariablExample()
	{
		int num = 10;
		num = num+10;
		System.out.println(num);
	}
	
	public void name()
	{
		float f = 10.5f;
		int a = (int) f;
		System.out.println(a);
	}
	public static void main(String args[])
	{
		System.out.println("Hello welcome to techbodhy");
		LocalVariablExample lc = new LocalVariablExample();
		lc.name();
	}

	
}
