package CollectionFrameworkExample;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample1 {
	
	 public static void main(String[]args)
	 {
		 // here argument is defined as String
		 
		 ArrayList<String> list= new ArrayList<String>();
		 list.add("ABhi");
		 list.add("Shrikant");
		 list.add("Shri");
		 list.add("Shweta");
		 
		 //Tranversing list through Iterator
		 Iterator<String> itr = list.iterator();
		 while(itr.hasNext());
		 {
			 System.out.println(itr.next());
		 }
		 
		 
		 //Tranversing list through for each loop
		// for(String obj:list)
		// {
			// System.out.println(obj);
		 //}
	 }

}
