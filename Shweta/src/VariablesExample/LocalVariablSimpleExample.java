package VariablesExample;

public class LocalVariablSimpleExample {
	
	public void myage()
	{
		int age=2;
		age = age+29;
		System.out.println("Puppy's age is : "+ age);
	}
	public static void main(String args[])
	{
		LocalVariablSimpleExample test = new LocalVariablSimpleExample();
		test.myage();
	}
	}


