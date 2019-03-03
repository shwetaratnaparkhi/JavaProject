package CollectionFrameworkExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String []args)
	{
		//here<String, Integer> it shows <keys,values>)
		//HashMap is interface
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		hm.put("wagholi", new Integer(412207));
		hm.put("kharadi", new Integer(411014));
		hm.put("hinjewadi", new Integer(411057));
		hm.put("vimannagar", new Integer(411014));
		//it will overwrite
		hm.put("wagholi", new Integer(412208));
		hm.put("aundh",12344);
		hm.put(null,23);
		
		//returns set view
		
		Set<Map.Entry<String,Integer>> st = hm.entrySet();
		for(Map.Entry<String,Integer> me:st)
		{
			System.out.print(me.getKey()+":");
			//println will print in next line
			System.out.println(me.getValue());
		}
	}

}
