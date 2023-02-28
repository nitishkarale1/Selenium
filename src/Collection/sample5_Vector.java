package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class sample5_Vector
{
	public static void main(String[] args)
	{
		Vector V=new Vector();
		
		V.add("Nitish");
		V.add("Karale");
		V.add(250);
		V.add('A');
		V.add("Gangapur");
		V.add(null);
		V.add(null);
		
		System.out.println(V);
		
		System.out.println(V.size());
		
		System.out.println(V.get(2));
		
		System.out.println(V.contains("Gangapur"));
		
		V.add(2,151);
		System.out.println(V);
		System.out.println(V.size());
		
		V.remove(3);
		System.out.println(V);
		
		V.set(4, "Aurangabad");
		System.out.println(V);
		
		System.out.println("-----print all data using iterator cursor-----");
		
		Iterator itr=V.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-----print all data using listiterator cursor-----");
		ListIterator li = V.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		System.out.println("-----print all data using for loop-----");
		for(int i=0; i<=V.size()-1; i++)
		{
			System.out.println(V.get(i));
		}
		
		System.out.println("-----print all data using foreach loop-----");
		for(Object S1:V)
		{
			System.out.println(S1);
		}
		
		System.out.println("------print all data using Enumeration cursor-----");
		Enumeration enu=V.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
	}
}
