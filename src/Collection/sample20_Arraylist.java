package Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class sample20_Arraylist 
{
	public static void main(String [] args)
	{
		ArrayList al=new ArrayList(6);
		al.add(101);
		al.add("nitish");
		al.add(101.55f);
		al.add('A');
		al.add(101);
		al.add(null);
		al.add(null);
		al.add("ankit");
		al.add('B');
		al.add("india");
		al.add(111);
		
		System.out.println(al);
		
		System.out.println(al.size());
		
		System.out.println(al.contains("nitish"));
		
		System.out.println(al.get(4));
		
		System.out.println(al.size());
		
		System.out.println(al.isEmpty());
		
		al.add(3, 105);
		
		al.add(null);
		
		al.set(1, "nitish k");
		
		al.remove(4);
		
		System.out.println(al);
		
		System.out.println(al.size());
		
		System.out.println("---print all data using Iterator cursor---");
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---print all data using List Iterator cursor---");
		
		ListIterator Litr=al.listIterator();
		
		while(Litr.hasNext())
		{
			System.out.println(Litr.next());
		}
		
		System.out.println("---print all data using for loop---");
		
		for(int i=0; i<=al.size()-1; i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("---print all data using for each loop---");
		
		for(Object s1:al)
		{
			System.out.println(s1);
		}
		
		
		
		
		
		
		
	}
	
}
