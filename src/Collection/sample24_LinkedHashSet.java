package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

import com.graphbuilder.math.func.LgFunction;

public class sample24_LinkedHashSet 
{
	public static void main(String[] args) 
	{
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(1225);
		lhs.add("INDIA");
		lhs.add(null);
		lhs.add("INDIA");
		lhs.add(null);
		lhs.add('X');
		lhs.add("Australia");
		lhs.add(555.75f);
		
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.contains("INDIA"));
		System.out.println(lhs.isEmpty());
		
		lhs.remove("Australia");
		
		System.out.println("---print sll data using Iterator Cursor---");
		
		Iterator itr=lhs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---print all data using for each loop---");
		
		for(Object s1:lhs)
		{
			System.out.println(s1);
		}
		
	}
	
}
