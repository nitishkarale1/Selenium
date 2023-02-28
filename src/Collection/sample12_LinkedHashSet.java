
package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class sample12_LinkedHashSet
{
public static void main(String[] args) 
{
	LinkedHashSet lhs=new LinkedHashSet(); 
	lhs.add("rahul");
	lhs.add('A');
	lhs.add(101);
	lhs.add(65.5f);
	lhs.add("rahul");
	lhs.add(null);
	lhs.add(null);
	lhs.add(null);
	
	System.out.println(lhs.size());
	
	System.out.println(lhs.isEmpty());
	
	System.out.println(lhs.contains('A'));
	
	lhs.remove('A');
	
	System.out.println(lhs);
	
	lhs.add('A');
	
	System.out.println("---print all data using iterator cursor---");
	
	Iterator B=lhs.iterator();
	while(B.hasNext())
	{
		System.out.println(B.next());
	}
	
	System.out.println("---print all data using foreach loop---");
	for(Object S1:lhs)
	{
		System.out.println(S1);
	}
	
	
}
}
