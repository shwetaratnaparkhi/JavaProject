package Oops;

public class User {
	public static void main(String[] args) {
		Smartphone phone= new Smartphone();
		phone.intrnet();
		//to add texting and calling functionality we have to extend mobile to smartphone and telephone to mobile
		phone.texting();
		phone.calling();

		
		Telephone p = new Telephone();
		p.calling();
		//Mobile m = new Mobile();
		//m.calling();
	}
	

}
