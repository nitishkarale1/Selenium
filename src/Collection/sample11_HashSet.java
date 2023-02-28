package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class sample11_HashSet 
{
	public static void main(String[] args) 
	{
		HashSet hs1=new HashSet();
		
		hs1.add("nitish");
		hs1.add("pritish");
		hs1.add("nitish");
		hs1.add(221);
		hs1.add('B');
		hs1.add(88.5f);
		hs1.add(null);
		hs1.add(null);
		
		System.out.println(hs1);
		
		System.out.println(hs1.size());
		
		System.out.println(hs1.contains(221));
		
		System.out.println(hs1.isEmpty());
		
		hs1.remove('B');
		System.out.println(hs1);
		
		hs1.add('B');
		
		System.out.println("----print all data using iterator cursor---");
		Iterator A=hs1.iterator();
		while(A.hasNext())
		{
			System.out.println(A.next());
		}
		
		System.out.println("---print all data using foreach loop---");
		for( Object S1:hs1)
		{
			System.out.println(S1);
		}
		
		
	}
}
