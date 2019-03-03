package ExceptionHandlingExamples;

public class ThrowExample {
	static void checkingeligibility(int age,int stuweight) {
		if(age<18 && stuweight<40)
		{
			System.out.println("Welcome to registration");
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException("Student is not eligible");
		}
	}
	
      public static void main(String[]args)
      {
    	  System.out.println("Welcome to registration process");
    	  //if age or weight not satisfying if condition then it will throw error which is in else condition
    	 //checkingeligibility(10, 50);
    	  checkingeligibility(10, 30);
    	  System.out.println("Have a nice day...");
      }
}

