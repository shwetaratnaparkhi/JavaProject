package VariablesExample;

public class StaticVariableSimpleExample {

	int id;
	String name;
	static String Company ="CTS";
	
	StaticVariableSimpleExample(int r, String n)
	{
		id = r;
		name = n;
	}
	
	void display ()
	{
		System.out.println(id+" "+name+" "+Company);
	}
	
	public static void main(String args[])
	{
		StaticVariableSimpleExample s1 = new StaticVariableSimpleExample(11,"Shweta");
		StaticVariableSimpleExample s2 = new StaticVariableSimpleExample(12,"Shrikant");
	
		s1.display();
		s2.display();
	}
}
