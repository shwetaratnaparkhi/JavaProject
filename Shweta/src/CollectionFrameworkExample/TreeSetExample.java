package CollectionFrameworkExample;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String [] args)
	{
		
		//creating Treeset(here null is not allow and data will print in assending order,this is not synchronised)
		
		TreeSet ts= new TreeSet();
		
				        boolean b1 =ts.add("b");
						boolean b2=ts.add("a");
						ts.add("f");
						ts.add("z");
						//null is not allow in treeset
						//ts.add(null);
					   // ts.add(null);
						//adding duplicate element(whiich is not accept in Set)
						boolean b3=ts.add("a");
						
						//printing b1,b2,b3
						System.out.println("b1= "+b1);
						System.out.println("b2= "+b2);
						System.out.println("b3= "+b3);
						//printing all elements of linkedhashset
						System.out.println(ts);
	}

}
