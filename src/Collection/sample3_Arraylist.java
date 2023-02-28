package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.google.common.io.LittleEndianDataInputStream;

public class sample3_Arraylist
{
	public static void main(String[] args) 
	{
		ArrayList A=new ArrayList();
		A.add("India");
		A.add("Maharashtra");
		A.add("Aurangabad");
		A.add("Gangapur");
		A.add(431109);
		A.add(null);
		A.add(null);
		
		
		System.out.println(A);
		
		System.out.println(A.size());
		
		System.out.println(A.get(4));
		
		System.out.println(A.isEmpty());
		
		System.out.println(A.contains("India"));
		
		A.add(3, "Vaijapur");
		System.out.println(A);
		
		System.out.println(A.size());
		
		A.set(5, 431111);
		System.out.println(A);
		
		
		System.out.println("-----print all data using iterator cursor----");
		Iterator itr = A.iterator();
		
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());	
		}
		
		System.out.println("-----print all data using Listiterator cursor-----");
		
		 ListIterator litr = A.listIterator();
		 
		 while (litr.hasNext())
		 {
			 System.out.println(litr.next());
		 }
		 
		 System.out.println("-----print all data using for loop-----");
		
		for(int i=0; i<=A.size()-1; i++)
		 {
			System.out.println(A.get(i));
		 }
			
		 System.out.println("-----print all data using foreach loop-----");
		
		 for(Object S1:A) 
		 {
			System.out.println(S1);
		 }
		
	}
}
