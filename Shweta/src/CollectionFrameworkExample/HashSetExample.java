package CollectionFrameworkExample;
import java.util.HashSet;
public class HashSetExample {
	
	
	public static void main(String [] args)
	{
			
	//creating hashset
		HashSet hs= new HashSet();

		boolean b1 =hs.add("b");
				boolean b2=hs.add("a");
				hs.add("f");
				hs.add("z");
				//adding duplicate element(whiich is not accept in Set)
				boolean b3=hs.add("a");
				
				//printing b1,b2,b3
				System.out.println("b1= "+b1);
				System.out.println("b2= "+b2);
				System.out.println("b3= "+b3);
				//printing all elements of hashset
				System.out.println(hs);
				
		
	}

}
