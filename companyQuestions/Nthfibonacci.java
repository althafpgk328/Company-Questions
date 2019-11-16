package companyQuestions;

import java.util.Scanner;

public class Nthfibonacci {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a no");
		int n=s.nextInt();
		int a=0,b=1;int i=0;
		while(i<n)
		{
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
			i++;
		}
	}

}
