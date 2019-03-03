package ExceptionHandlingExamples;

public class TryCatchExample {
	
	public static void main(String[]args)
	{
		try
		{
			int a[] = new int[5];
			a[2]=30/5;
			System.out.println(a[2]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("task1 ");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("");
		}
		catch(Exception e)
		{
			System.out.println("Common task completed ");
		}
        finally
		{
			System.out.println("Finally Block is always executed");
		}
		System.out.println("rest of the code...");
	}
	

}
