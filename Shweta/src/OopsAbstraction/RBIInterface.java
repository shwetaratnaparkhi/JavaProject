package OopsAbstraction;

public interface RBIInterface extends Modi, Suprimecourt//we can acheive multiple inheritence by using interface and we cannot acheive multiple inheritance by using class
{
	//we cannot create object of interface 
	public void internetBanking();
	public void moneyTransfer();
	public void loan();
}
