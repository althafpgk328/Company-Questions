package companyQuestions;

import java.util.Scanner;

public class Fibonacci {



	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int a=0;
		int b=1;
		int c=0;
		while(c<n)
		{
			c=a+b;
			a=b;
			b=c;
		}
		if (c==n)
		{
			System.out.println("The number belongs to fibonacci series");
			
		}
		else
		{
			System.out.println("The number is not belongs to fibonacci series");
		}

	}

}
