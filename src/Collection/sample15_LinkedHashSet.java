package Collection;

import java.util.LinkedHashSet;

public class sample15_LinkedHashSet
{
	public static void main(String[] args) 
	{
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(222);
		lhs.add(444);
		lhs.add(333);
		lhs.add(444);
		lhs.add("nitish");
		lhs.add("sagar");
		lhs.add("nitish");
		lhs.add(222);
		lhs.add("akash");
		
		System.out.println(lhs.size());
		
		System.out.println(lhs.isEmpty());
		
		System.out.println(lhs.contains(222));
		System.out.println(lhs);
		
		lhs.remove(333);
		
		System.out.println(lhs);
	
		
		
		
		
		
	}
}
