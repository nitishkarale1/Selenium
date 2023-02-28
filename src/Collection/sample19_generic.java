package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class sample19_generic
{
	public static void main(String[] args) 
	{
		TreeSet<String> A=new TreeSet<String>();
		A.add("rahul");
		A.add("nitin");
		A.add("samir");
		A.add("ankit");
		A.add("suyog");
		
		System.out.println(A);
		
		System.out.println(A.contains("ankit"));
		System.out.println(A.size());
		
		System.out.println(A.first());
		System.out.println(A.last());
		
		A.pollFirst();
		A.pollLast();
		System.out.println(A);
		
		System.out.println("---print all data using iterator---");
		Iterator itr=A.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---print all data usnig foreach loop---");
		for(String s1:A)
		{
			System.out.println(s1);
		}
			
	}
}
