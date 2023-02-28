package practice;

import java.util.Scanner;

public class sample1_Even_Odd 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Num :");
		int num=scan.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("Given Number is Even");
		}
		else
		{
			System.out.println("Given Number is Odd");
		}
		
	}
}
