package CollectionFrameworkExample;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetExample2 {

	public static void main(String [] args)
	{
			
	//creating hashset
		LinkedHashSet<String> lhset= new LinkedHashSet<String>();

		
				lhset.add("shweta");
				lhset.add("shri");
				lhset.add("a");
				lhset.add("e");
				lhset.add("x");
				System.out.println("Size of linkedhashSet = "+ lhset.size());
				System.out.println("Original LinkedHashSet= "+ lhset);
				System.out.println("Removing e from Linkedhashset= "+lhset.remove("e"));
				System.out.println("trying to remove z from linkedhashset= "+lhset.remove("z"));
				System.out.println("tchecking if shweta is present= "+lhset.contains("shweta"));
				System.out.println("update linkedhashset= "+lhset);
				
		
				
	}
	
}
