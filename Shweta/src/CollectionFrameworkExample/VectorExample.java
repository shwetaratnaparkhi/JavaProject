package CollectionFrameworkExample;

import java.util.Vector;

public class VectorExample {

	public static void main(String[]args)
	{
		
	
	// create default vectror
	
	Vector v = new Vector();
	
	v.add(0, 1);
	v.add(1, 2);
	v.add(2, "geeks");
	v.add(3, "forgeeks");
	v.add(3, 5);
	v.add(3, "abhi");
	
	System.out.println(v.get(4));
	System.out.println(v.get(3));
	
	System.out.println("vector is"+v);
	
	}
	
}
