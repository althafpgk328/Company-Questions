package Palindrome;

import java.util.Scanner;

public class Perfect{
	public static void main(String [] args) {
	Scanner s=new Scanner(System.in);
	int a,r,sum=0;
	System.out.println("Enter an integer");
	int n=s.nextInt();
	int t=n;
	for(int i=1;i<n;i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
	}
	if(sum==t)
	{
		System.out.println("Perfect Number");
	}
	else {
		System.out.println("Not Perfect Number");
	}
}
}