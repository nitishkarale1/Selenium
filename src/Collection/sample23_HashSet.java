package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class sample23_HashSet 
{
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add("Pune");
		hs.add(11225);
		hs.add('A');
		hs.add(null);
		hs.add(null);
		hs.add(25.50f);
		hs.add("Pune");
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.contains("Pune"));
		System.out.println(hs.isEmpty());
		
		System.out.println("---print all data using Iterator Cusrsor---");
		
		Iterator itr = hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---print all data using for each loop---");
		
		for(Object s1:hs)
		{
			System.out.println(s1);
		}
		
		
		
		
		
		
		
		
	}
	
}
