package OopsAbstraction;

public class BankUser2 
{//this is run time bonding or run time polymerphesm whe we use referance of parent class and objet of child class
	public static void main(String[] args) 
	{
		RBIInterface obj=null;//non primitive datatype
		String bank="HDFC";
		
		if (bank.equals("ICICI"))
		{
			obj=new ICICI();
		}
		else if(bank.equals("PNB"))
		{
			obj=new PNB();
		}
		else if(bank.equals("HDFC"))
		{
			obj= new HDFC();
		}	
				
		obj.internetBanking();
		obj.moneyTransfer();
		obj.loan();
	}

}
