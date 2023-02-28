package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class sample8_linkedlist 
{
	public static void main(String[] args)
	{
		LinkedList ll=new LinkedList();
		ll.add("rahul");
		ll.add(151);
		ll.add('A');
		ll.add(75.5f);
		ll.add("rahul");
		ll.add(null);
		ll.add(null);
		
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.get(4));
		System.out.println(ll.contains(75.5f));
		System.out.println(ll.isEmpty());
		
		System.out.println("------------------");
		
		ll.add(700);
		System.out.println(ll);
		System.out.println(ll.size());
		
		
		ll.remove(7);
		System.out.println(ll);
		System.out.println(ll.size());
		
		ll.set(2, 'C');
		System.out.println(ll);
		System.out.println(ll.size());
		
		System.out.println("----print all data using iterator cursor----");
		Iterator itr = ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("----print  all data using listiterator cursor----");
		ListIterator litr = ll.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("----print all data using for loop----");
		for(int i=0; i<=ll.size()-1; i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("----print all data using foreach loop----");
		for(Object A1:ll)
		{
			System.out.println(A1);
		}
		
		
	}
}
