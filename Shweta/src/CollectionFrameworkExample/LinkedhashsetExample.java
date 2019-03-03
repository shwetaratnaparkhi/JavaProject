package CollectionFrameworkExample;


import java.util.LinkedHashSet;

public class LinkedhashsetExample {
	public static void main(String [] args)
	{
		
		//creating Linkedhashset
				LinkedHashSet lhs= new LinkedHashSet();

				boolean b1 =lhs.add("b");
						boolean b2=lhs.add("a");
						lhs.add("f");
						lhs.add("z");
						//adding duplicate element(whiich is not accept in Set)
						boolean b3=lhs.add("a");
						
						//printing b1,b2,b3
						System.out.println("b1= "+b1);
						System.out.println("b2= "+b2);
						System.out.println("b3= "+b3);
						//printing all elements of linkedhashset
						System.out.println(lhs);
	}

}
