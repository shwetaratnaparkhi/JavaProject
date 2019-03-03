package StaticExample;

public class StaticVariableExample {
	//int incr=0;////will get memory each time when the instance
	static int incr=0;////will get memory only once and
	StaticVariableExample()
	{
		incr++;
		System.out.println(incr);
	}
	public static void main(String[]args)
	{
		//TODO Auto-generated method stub
		StaticVariableExample a1= new StaticVariableExample();
		StaticVariableExample a2= new StaticVariableExample();
		StaticVariableExample a3= new StaticVariableExample();

	}
}
