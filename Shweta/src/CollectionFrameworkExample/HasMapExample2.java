package CollectionFrameworkExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HasMapExample2 {
	
	public static void main(String []args)
	{
		
		HashMap hm = new HashMap();
		//put elements to the map
		hm.put("wagholi", new Double(3434.34));
		hm.put("kharadi", new Double(4110.14));
		hm.put("hinjewadi", new Double(4110.57));
		hm.put("vimannagar", new Double(-411.014));
		//Get a set of the entries
		Set set = hm.entrySet();
		//Get an iterator
		Iterator i = set.iterator();
		//Display elements
		while(i.hasNext())
		{
			Map.Entry me = (Map.Entry)i.next();
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
		}
		System.out.println();
		//deposit 1000 into wagholi's account
		
		double balance = ((Double)hm.get("wagholi")).doubleValue();
		hm.put("wagholi", new Double(balance + 1000));
		System.out.println("Wagholi's new balance:"+ hm.get("wagholi"));
		}

}
