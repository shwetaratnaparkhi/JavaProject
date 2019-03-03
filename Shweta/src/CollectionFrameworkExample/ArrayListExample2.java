package CollectionFrameworkExample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample2 {
	
	public static void main(String[]args)
	 {
		 // here datatype is defined as String
		 ArrayList<> list= new ArrayList<>();
		 list.add("ABhi");
		 list.add(1);
		 list.add(1.5);
		 list.add("Shweta");
		 
		 //Tranversing list through Iterator
		 Iterator<> itr = list.iterator();
		 while(itr.hasNext());
		 {
			 System.out.println(itr.next());
		 }
	 }
				 
		 

}
