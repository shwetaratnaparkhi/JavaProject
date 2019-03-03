package CollectionFrameworkExample;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample2 {
	//it print data in descending order as per alphabetiacal order

	public static void main(String []args)
	{
		TreeSet<String> ts1= new TreeSet<>(Comparator.reverseOrder());
		
		ts1.add("x");
		ts1.add("a");
		ts1.add("s");
		ts1.add("m");
		ts1.add("n");
		ts1.add("o");
		
		System.out.println("alphabetical order="+ ts1);
	}
}
