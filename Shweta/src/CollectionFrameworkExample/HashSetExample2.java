package CollectionFrameworkExample;

import java.util.HashSet;

public class HashSetExample2 {
	
	public static void main(String [] args)
	{
			
	//creating hashset
		HashSet<String> hset= new HashSet<String>();

		
				hset.add("shweta");
				hset.add("shri");
				hset.add("nivedita");
				hset.add("Prerna");
				//java is case sensitive
				hset.add("abhi");
			    hset.add("ABHI");
			    ////adding duplicate element(whiich is not accept in Set)
			    hset.add("ABHI");
			    //addition of null values
			    hset.add(null);
			    hset.add(null);
			    
			    System.out.println(hset);
		
	}

}
