package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class sample14_HashSet 
{
	public static void main(String[] args) 
	{
		HashSet S=new HashSet();
		S.add("Maharashtra");
		S.add('K');
		S.add(555);
		S.add('K');
		S.add(202);
		S.add("Aurangabad");
		S.add("Maharashtra");
		S.add(555);
		
		System.out.println(S);
		
		System.out.println(S.size());
		
		System.out.println(S.isEmpty());
		
		System.out.println(S.contains(555));
		
		S.remove(202);
		System.out.println(S);
		
		System.out.println("--print all data using iterator cursor-- ");
		
		Iterator A1=S.iterator();
		while(A1.hasNext())
		{
			System.out.println(A1.next());
		}
		
		System.out.println("--print all data using foreach loop--");
		for(Object D:S)
		{
			System.out.println(D);
		}
		
		
	}
}
