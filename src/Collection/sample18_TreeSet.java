package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class sample18_TreeSet
{
	public static void main(String[] args) 
	{
		TreeSet T=new TreeSet();
		T.add("bipin");
		T.add("esha");
		T.add("dipak");
		T.add("amit");
		T.add("chetan");
		
		System.out.println(T);
		
		System.out.println(T.contains("esha"));
		System.out.println(T.isEmpty());
		System.out.println(T.first());
		System.out.println(T.last());
		
		T.pollFirst();
		T.pollLast();
		
		System.out.println(T);
		
		System.out.println("---print all data using iterator cursor---");
		Iterator itr=T.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---print all data using foreach loop---");
		for(Object s1 :T)
		{
			System.out.println(s1);
		}
		
		System.out.println("---print all data in descending order---");
		Iterator ditr = T.descendingIterator();
		while(ditr.hasNext())
		{
			System.out.println(ditr.next());
		}
		
		
	}
}

