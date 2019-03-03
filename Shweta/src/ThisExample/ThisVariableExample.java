package ThisExample;

public class ThisVariableExample {

	int rollno;
	String name;
	float number;
	
	ThisVariableExample(int rollno,String name,float number)
	{
		this.rollno=rollno;
		this.name=name;
		this.number=number;
		
	}
	void display()
	 {
		System.out.println(rollno+" "+name+" "+number);
	 }
	public static void main(String[]args)
	{
		ThisVariableExample ts = new ThisVariableExample(12345,"Shweta",5000f);
		ThisVariableExample hg = new ThisVariableExample(88523,"Sss",4000f);
		ts.display();
		hg.display();
	}
	
}
	

