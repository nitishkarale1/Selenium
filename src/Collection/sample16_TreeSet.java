package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class sample16_TreeSet 
{
	public static void main(String[] args)
	{
		TreeSet tr=new TreeSet();
		tr.add("Maharashtra");
		tr.add("Rajasthan");
		tr.add("Punjab");
		tr.add("Bihar");
		tr.add("Kerala");
		tr.add("Sikkim");
		tr.add("Andhra Pradesh");
	//	tr.add(500);
		System.out.println(tr);
		
		System.out.println(tr.contains("Punjab"));
		
		System.out.println(tr.size());
		
		System.out.println(tr.first());
		
		System.out.println(tr.last());
		
		tr.pollFirst();
		tr.pollLast();
		
		System.out.println(tr);
		
		System.out.println("--print all data using iterator cursor--");
		Iterator itr = tr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---print all data using foreach loop---");
		for(Object s1:tr)
		{
			System.out.println(s1);
		}
		
		System.out.println("---print all data in descending order---");
		Iterator ditr=tr.descendingIterator();
		while(ditr.hasNext())
		{
			System.out.println(ditr.next());
		}
		
	}
}
