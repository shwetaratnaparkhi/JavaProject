package VariablesExample;

public class InstanceVariableSimpleExample {

	public String Name;
	private int Age;
	public void setName (String RecName)
	{
		Name = RecName;
	}
	public void setAge (int RecSal)
	{
		Age = RecSal;
	}
	public void printRec()
	{
		System.out.println("Name :" + Name );
		System.out.println("Age :" + Age );
	}
	
	public static void main(String args[])
	{
		InstanceVariableSimpleExample r= new InstanceVariableSimpleExample();
		r.setAge(23);
		r.setName("Shweta");
		r.printRec();
	}
}
