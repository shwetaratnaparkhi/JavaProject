package SuperKeyWord;

public class SuperKeyWordExtendEx extends SuperKeyWordEx{
	
	String var1="Hello world";
	void method2()
	{
	System.out.println(var1);
	System.out.println(super.var1);
	}
	public static void main(String[]args)
	{
		SuperKeyWordExtendEx msg= new SuperKeyWordExtendEx();
		msg.method2();
	}
	
}
