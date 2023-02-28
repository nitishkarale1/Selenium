package practice;

public class sample26_method_with_return_type
{
	public static void main(String[] args) 
	{
		int num1=20;
		int num2=30;
		int num3=5;
		
		int num4=addition(num1, num2);
		int num5=multiplication(num3, num4);
		System.out.println("num5: "+num5);
		
		sample26_method_with_return_type s1=new sample26_method_with_return_type();
		int num6=s1.subtraction(num5, num4);
		System.out.println("num6: "+num6);
	}
	public static int addition(int a, int b) 
	{
		int sum=a+b;
		return sum;
	}
	
	public static int multiplication(int c, int d)
	{
		int mult=c*d;
		return mult;
	}
	
	public int subtraction(int e, int f)
	{
		int sub=e-f;
		return sub;
	}

}
