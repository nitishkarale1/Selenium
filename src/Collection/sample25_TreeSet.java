package Collection;

import java.util.Iterator;
import java.util.TreeSet;
public class sample25_TreeSet 
{
	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet();
		ts.add("nitish");
		ts.add("arpita");
		ts.add("pratik");
		ts.add("rutuja");
		ts.add("pooja");
		ts.add("rahul");
		
		System.out.println(ts);
		System.out.println(ts.isEmpty());
		System.out.println(ts.size());
		System.out.println(ts.contains("nitish"));
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts);
		
		ts.pollFirst(); 
		System.out.println(ts);
		
		ts.pollLast();
		System.out.println(ts);
		
		System.out.println("---print all data using Iterator Cursor---");
		
		Iterator itr=ts.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---print all data using for each loop---");
		
		for(Object s1:ts)
		{
			System.out.println(s1);
		}
		
		System.out.println("---print all data in descending order---");
		
		Iterator ditr = ts.descendingIterator();
		
		while(ditr.hasNext())
		{
			System.out.println(ditr.next());
		}
		
	}
	
	
}
