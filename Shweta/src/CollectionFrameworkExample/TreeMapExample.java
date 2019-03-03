package CollectionFrameworkExample;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String [] args)
	{
		
		TreeMap<Integer,String> lhmap= new TreeMap<>();
		lhmap.put(101,"a");
		lhmap.put(104,"f");
		lhmap.put(102,"b");
		lhmap.put(103,"z");
		
		System.out.println("Employees:"+ lhmap);
		//finding size of a treemap
		System.out.println("Employees:"+ lhmap.size());
		//check if a given key exist in treemap
		Integer id = 102;
		if(lhmap.containsKey(id))
		{
			
		}
	}

}
