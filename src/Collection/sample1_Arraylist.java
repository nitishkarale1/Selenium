package Collection;

import java.util.ArrayList;

public class sample1_Arraylist 
{
	public static void main(String[] args) 
	{
		//ArrayList al=new ArrayList();  //by default initial capacity = 10
		ArrayList al=new ArrayList(8);   //initial capacity = 8
		
		al.add("Rahul");
		al.add("100");
		al.add('A');
		al.add(65.5f);
		al.add("Rahul");
		al.add(null);
		al.add(null);
		al.add('R');
		al.add("Abc");
		
		System.out.println(al);
		
		System.out.println(al.size());
		
		System.out.println(al.isEmpty());
		
		System.out.println(al.contains(65.5f));
		
		System.out.println(al.get(8));
		
		System.out.println(al);
		
		//add/insert data inbetween Arraylist ---> data right shift operation
		al.add(4, 500);
		System.out.println(al);
		
		//remove/delete data inbetween arraylist ---> data left shift operation
		al.remove(4);
		System.out.println(al);
		
		//modify/update data from Arraylist
		al.set(3, 75.5f);
		System.out.println(al);
		
	
		
	}
}
