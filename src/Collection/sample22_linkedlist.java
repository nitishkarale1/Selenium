package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import org.apache.commons.math3.analysis.function.Add;

public class sample22_linkedlist 
{
	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		
		ll.add("nitish");
		ll.add(120);
		ll.add('X');
		ll.add(205.20f);
		ll.add(null);
		ll.add(null);
		ll.add('X');
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.contains(120));
		System.out.println(ll.get(5));
		System.out.println(ll.isEmpty());
		
		ll.set(2, 'N');
		ll.remove(3);
		System.out.println(ll.size());
		
		System.out.println("---print all data using Iterator---");
		
		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---print all data using List Iterator---");
		ListIterator litr = ll.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("---print all data using for loop---");
		
		for(int i=0; i<=ll.size()-1; i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("---print all data using for each loop---");
		
		for(Object s1:ll)
		{
			System.out.println(s1);
		}
		
	}
	
}
