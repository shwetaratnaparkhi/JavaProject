package StaticExample;

public class StaticVariableExample2 {
	
	  int rollno;
	 String Name;
	 static String college = "oriental";
	 
	 static void change()
	 	 {
		 college = "LNCT";
		// rollno = 10;//static method can not take non static variable
	 }
	// constructor to initialize the variable
	 StaticVariableExample2 (int r, String n)
	 {
		 rollno =r;
		 Name=n;
	 }
	 //method to display values
	 void display()
	 {
		 System.out.println(rollno+" "+Name+" "+college);
	 }
}
