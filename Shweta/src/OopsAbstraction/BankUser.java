package OopsAbstraction;

public class BankUser 
{
	
	public static void main(String[] args) 
	{
		RBIInterface obj;//non primitive datatype
		
		obj= new HDFC();
		obj.internetBanking();
		obj.moneyTransfer();
		obj.loan();
			
		obj=new ICICI();
		obj.internetBanking();
		obj.moneyTransfer();
		obj.loan();
		
		obj=new PNB();
		obj.internetBanking();
		obj.moneyTransfer();
		obj.loan();
	}
}
