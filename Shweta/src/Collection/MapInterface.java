package Collection;

import java.util.HashMap;
import java.util.Hashtable;

public class MapInterface //if data is in the form of key and value pair
{
	public static void main(String[] args) 
	{   //HashMap==not thread safe,can allow null key
		HashMap<String, String> map=new HashMap<String, String>();
		
		map.put("name", "shweta");
		map.put("surname", "somvanshi");
		map.put("org", "xyz");		
		map.put(null, "xyz");	
		System.out.println(map.get("surname"));
		
		
		//Hashtable==it is thread safe,it cannot allow null key
		Hashtable<String, String> map2=new Hashtable<String, String>();
		
		map2.put("name", "shweta");
		map2.put("surname", "somvanshi");
		map2.put("org", "xyz");	
		map2.put(null, "xyz");	
		System.out.println(map2.get(null));
	}

}
