package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class sample4_Vector 
{
	public static void main(String[] args)
	{
		Vector V=new Vector();   //by default capacity is 10
		
		V.add("Apple");
		V.add("Mango");
		V.add("Orange");
		V.add("banana");
		V.add(20);
		V.add(25);
		V.add(15);
		V.add(null);
		
		System.out.println(V);
		
		System.out.println(V.capacity());
		
		System.out.println(V.size());
		
		System.out.println(V.get(5));
		
		System.out.println(V.isEmpty());
		
		System.out.println(V.contains(15));
		
		System.out.println("-------------------------------");
		
		V.add(4,"Guava");
		
		System.out.println(V);
		
		System.out.println(V.size());
		
		V.remove(4);  //data left shift opration
		
		System.out.println(V.size());
		
		V.set(6, 30);  //data right shift operation
		
		System.out.println(V);
		
		System.out.println("-----print Vector data using Itertator cursor-----");
		
		Iterator itr=V.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-----print Vector data using Listiterator cursor-----");
		
		ListIterator litr=V.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("-----print Vector data using for loop-----");
		
		for(int i=0; i<=V.size()-1; i++)
		{
			System.out.println(V.get(i));
		}
		
		System.out.println("-----print Vector data using foreach loop-----");
		
		for(Object A1:V)
		{
			System.out.println(A1);
		}
		
		System.out.println("-----print Vector data using Enumeration cursor-----");
		
		Enumeration enu=V.elements();
		
		while(enu.hasMoreElements()) 
		{
			System.out.println(enu.nextElement());
		}
		
	}
}
