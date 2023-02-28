package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class sample21_Vector 
{
	public static void main(String[] args) 
	{
		Vector vct=new Vector(); //default capacity is 10
		
		vct.add("Nitish");
		vct.add(51);
		vct.add('A');
		vct.add(75.45f);
		vct.add("Karale");
		vct.add(null);
		vct.add(null);
		vct.add(null);
		vct.add("Nitish");
		vct.add('X');
		
		System.out.println(vct);
		System.out.println(vct.size());
		System.out.println(vct.contains(2));
		System.out.println(vct.get(5));
		System.out.println(vct.isEmpty());

		vct.set(5, "Aurangabad");
		vct.remove(9);
		vct.add(111);
		
		System.out.println(vct.size());
		
		System.out.println("---print all data using Iterator---");
		
		Iterator itr=vct.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---print all data using List Iterator---");
		
		ListIterator Litr=vct.listIterator();
		while(Litr.hasNext())
		{
			System.out.println(Litr.next());
		}
		
		System.out.println("---print all data using Enumeration Cursor---");
		
		Enumeration enu = vct.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
		System.out.println("---print all data using for loop---");
		
		for(int i=0; i<=vct.size()-1; i++)
		{
			System.out.println(vct.get(i));
		}
		
		System.out.println("---print all data using for each loop---");
		
		for(Object s1:vct)
		{
			System.out.println(s1);
		}
		
		
		
	
		
		
	}
	
}
