package SuperKeyWord;

public class SuperKeyWordConstructorImplementation1Ex extends SuperKeyWordConstructor1Ex{

	SuperKeyWordConstructorImplementation1Ex()
	{
		//super();
		//System.out.println("Implemented Class default constructor");
		super(1);
		System.out.println("Implemented Class parameterised constructor");
		
	}
	public static void main(String[]args)
	{
		SuperKeyWordConstructorImplementation1Ex cnstrctr1 = new SuperKeyWordConstructorImplementation1Ex();
		
	}
}
