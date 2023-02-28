package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class sample17_generic 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> tr1=new TreeSet<Integer>();
		tr1.add(900);
		tr1.add(800);
		tr1.add(400);
		tr1.add(700);
		tr1.add(100);
		tr1.add(300);
		tr1.add(500);
		tr1.add(200);
		tr1.add(600);
		tr1.add(500);
		
		System.out.println(tr1);
	
		System.out.println(tr1.contains(400));
		System.out.println(tr1.isEmpty());
		System.out.println(tr1.first());
		System.out.println(tr1.last());
		
		tr1.pollFirst();
		tr1.pollLast();
		System.out.println(tr1);
		
		for(Integer s1:tr1)
		{
			System.out.println(s1);
		}
		
		System.out.println("---print all data in descending order---");
		Iterator ditr=tr1.descendingIterator();
		while(ditr.hasNext())
		{
			System.out.println(ditr.next());
		}
		
	}
}
