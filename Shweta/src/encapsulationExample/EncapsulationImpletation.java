package encapsulationExample;

public class EncapsulationImpletation {
	
	public static void main(String[]args) 
	{
		Encapsulation1Example obj = new Encapsulation1Example();
		obj.SetEmpName("SHWETA");
		obj.SetEmpAge(23);
		obj.SetEmpSSN(1000);
		System.out.println("Employee Name:"+obj.getEmpName());
		System.out.println("Employee Age:" +obj.getEmpAge());
		System.out.println("Employee SSN:" +obj.getEmpSSN());
	}	
}
