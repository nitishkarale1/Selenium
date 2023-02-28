package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class sample13_ArrayList_remove_duplicate_values
{
	public static void main(String[] args)
	{
		ArrayList A=new ArrayList();
		A.add("India");
		A.add("pakistan");
		A.add("India");
		A.add('A');
		A.add("Srilanka");
		A.add(null);
		A.add(null);
		A.add(null);
		A.add('A');
		A.add(151);
		A.add(151);
		
		HashSet B=new HashSet(A);
		System.out.println(B);
		
		LinkedHashSet C=new LinkedHashSet(A);
		System.out.println(C);
	}
}
