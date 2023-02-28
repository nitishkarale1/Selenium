
package Collection;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2_Arraylist 
{
	public static void main(String[] args) 
	{	
		ArrayList A=new ArrayList(11);
		
		A.add("Nitish");
		A.add("27");
		A.add(16);
		A.add('A');
		A.add("velocity");
		A.add("katraj");
		A.add("automation");
		A.add("manual");
		A.add("sanjay sir");
		A.add("vinay sir");
		A.add(null);
		A.add(null);
		
		System.out.println(A);
		
		System.out.println(A.size());
		
		System.out.println(A.isEmpty());
		
		System.out.println(A.contains('A'));
		
		System.out.println(A.get(5));
		
		System.out.println(A);
		
		A.add(5, "mumbai");          // data right shift operation
		System.out.println(A);
		
		A.remove(5);          // data left shift operation
		System.out.println(A);
		
		A.set(10, "Hello");
		System.out.println(A);
		
	}
}
