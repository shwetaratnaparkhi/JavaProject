package encapsulationExample;

public class Encapsulation1Example {
	
	private int ssn;
	private  String empName;
	private int empAge;
	
	public int getEmpSSN()
	{
		return ssn;
	}
	public String getEmpName()
	{
		return empName;
	}
	public int getEmpAge()
	{
		return empAge;
	}

	public void SetEmpAge(int newValue)
	{
		if (newValue<18||newValue>75)
		{
			throw new IllegalArgumentException();
		}
		empAge=newValue;
	}
	public void SetEmpName(String newValue)
	{
		empName=newValue;
	}
	public void SetEmpSSN(int newValue)
	{
		ssn= newValue;
	}
}
