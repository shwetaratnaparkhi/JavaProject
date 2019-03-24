package Collection;//List & Set

import java.util.ArrayList;//ctrl+shift+o== for imports
import java.util.LinkedList;
import java.util.Vector;

public class testing1 {
	public static void main(String[] args) 
	{
					//List
		ArrayList<String> stds=new ArrayList<>();//when we store the data array list is better than linked list
		stds.add("Anand");
		stds.add("shri");
		stds.add("shweta");
		
		LinkedList<String> stds1=new LinkedList<>();//when we linked the data linked list is better than array list
		stds1.add("Anand");
		stds1.add("shri");
		stds1.add("shweta");
	
		Vector<String> stds2=new Vector<>();
		stds2.add("Anand");
		stds2.add("shri");
		stds2.add("shweta");
		
		for(String s:stds)
		{
			System.out.println(s);
		}
	}

}
