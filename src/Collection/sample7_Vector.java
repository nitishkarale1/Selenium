package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

import io.opentelemetry.sdk.metrics.data.Data;
import net.bytebuddy.asm.Advice.AllArguments;

public class sample7_Vector 
{
	public static void main(String[] args) 
	{
		Vector D=new Vector();
		
		D.add("Pune");
		D.add("Mumbai");
		D.add("Nashik");
		D.add(555);
		D.add('D');
		D.add('C');
		D.add(null);
		D.add(null);
		D.add("Nashik");
		
		System.out.println(D);
		System.out.println(D.size());
		System.out.println(D.contains('C'));
		System.out.println(D.get(5));
		System.out.println(D.isEmpty());
		System.out.println(D.capacity());
		System.out.println("-----------------");
		
		D.add(995);
		System.out.println(D);
		
		D.set(4, 'A');
		
		D.remove(5);
		
		System.out.println(D);
		System.out.println(D.size());
		
		System.out.println("----print all data using iterator cursor----");
		Iterator itr = D.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("----Printable AllArguments Data usingData ListIterator cursor----");
		ListIterator litr = D.listIterator();	
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("----print all data using for loop----");
		for(int i=0; i<=D.size()-1; i++)
		{
			System.out.println(D.get(i));
		}
		
		System.out.println("----print all data using foreach loop----");
		for(Object S1:D)
		{
			System.out.println(S1);
		}
		
		System.out.println("----print all data using Enumeration cursor----");
		Enumeration enu = D.elements();	
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
	}
}
