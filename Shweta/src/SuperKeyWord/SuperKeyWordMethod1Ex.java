package SuperKeyWord;

public class SuperKeyWordMethod1Ex extends SuperKeyWordMethodEx{

	void method1()
	{
		System.out.println("This is method of implemented class");
	}
	
	void method2()
	{
		super.method1();
	}
	public static void main(String[]args)
	{
		SuperKeyWordMethod1Ex mthd = new SuperKeyWordMethod1Ex();
		SuperKeyWordMethod1Ex mthd1 = new SuperKeyWordMethod1Ex();
		mthd.method1();
		mthd1.method2();
	}
}
