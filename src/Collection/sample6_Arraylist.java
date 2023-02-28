package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class sample6_Arraylist 
{
	public static void main(String[] args) 
	{
		ArrayList A1=new ArrayList();
		
		A1.add("Prasad");
		A1.add("Patil");
		A1.add(325);
		A1.add('B');
		A1.add(null);
		A1.add(null);
		A1.add(null);

		System.out.println(A1);
		System.out.println(A1.size());
		System.out.println(A1.contains("Patil"));
		System.out.println(A1.get(0));
		System.out.println(A1.isEmpty());
		
		System.out.println("---------------------------------");
		
		A1.add(4,800);
		System.out.println(A1);
		System.out.println(A1.size());
		
		A1.set(6, 'A');
		System.out.println(A1);
		System.out.println(A1.size());

		A1.remove(4);
		System.out.println(A1);
		System.out.println(A1.size());
		
		
		System.out.println("----print all data using iterator cursor----");
		Iterator itr=A1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("----print all data using listiterator cursor----");
		ListIterator litr = A1.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("----print all data using for loop----");
		for(int i=0; i<=A1.size()-1; i++)
		{
			System.out.println(A1.get(i));
		}
		
		System.out.println("----print all data using foreach loop----");
		for(Object B1:A1)
		{
			System.out.println(B1);
		}
	
	}
}
