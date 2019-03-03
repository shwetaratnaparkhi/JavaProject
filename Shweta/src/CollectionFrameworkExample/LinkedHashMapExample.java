package CollectionFrameworkExample;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	
	public static void main(String [] args)
	{
		//create and populate linked hash map
		Map<Integer,String> lhmap= new LinkedHashMap<Integer,String>();
		lhmap.put(101,"let us c");
		lhmap.put(104,"rasd");
		lhmap.put(102,"operating system");
		lhmap.put(103,"data communication and networking");
		
		System.out.println("Values before remove:"+ lhmap);
		//remove value for key 104
		lhmap.remove(104);
		System.out.println("Values after remove:"+ lhmap);
	}

}
