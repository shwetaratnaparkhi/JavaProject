package FinalKeyWordExample;

public class FinalKeyWordmethod2Example  extends FinalKeyWordMethodExample{
	void run()
	{
		System.out.println("I want to override");
	}

	public static void main(String[]args)
	{
		FinalKeyWordmethod2Example fnl = new FinalKeyWordmethod2Example();
		fnl.run();
	}
}
