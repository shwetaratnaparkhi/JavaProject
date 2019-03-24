package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {
	public static void main(String[] args)
	{
		//HashSet==we get output in random order
		HashSet<String> set=new HashSet<>();
		set.add("Priyanka");
		set.add("priyanka");//case sensetive
		set.add("Shweta");
		set.add("Shrikant");
		set.add("Abhi");
		set.add("Shri");
		set.add("xyz");
		
		for(String s:set)
		{
			System.out.println(s);
		}
		
		//LinkedHashSet== we get output in insertion order
		LinkedHashSet<String> set1=new LinkedHashSet<>();
		set1.add("Priyanka");
		set1.add("priyanka");//case sensetive
		set1.add("Shweta");
		set1.add("Shrikant");
		set1.add("Abhi");
		set1.add("Shri");
		set1.add("xyz");
		
		for(String s:set1)
		{
			System.out.println(s);
		}
		
		//TreeSet== we get output in sorted order like capital first in assending order then small letters in assending order
				TreeSet<String> set2=new TreeSet<>();
				set2.add("Priyanka");
				set2.add("priyanka");//case sensetive
				set2.add("Shweta");
				set2.add("Shrikant");
				set2.add("Abhi");
				set2.add("shri");
				set2.add("xyz");
				
				for(String s:set2)
				{
					System.out.println(s);
				}
		
	}

}
