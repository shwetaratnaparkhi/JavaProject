package CollectionFrameworkExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	 public static void main(String[]args)
	 {
		 LinkedList<String> list= new LinkedList<String>();
		 list.add("ABhi");
		 list.add("Shrikant");
		 list.add("Shri");
		 list.add("Shweta");
		 
		 Iterator<String> itr= list.iterator();
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
