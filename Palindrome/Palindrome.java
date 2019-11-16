package Palindrome;

import java.util.Scanner;

public class Palindrome {
	public static void main(String [] args) {
	Scanner s=new Scanner(System.in);
	int a,r,sum=0;
	System.out.println("Enter an integer");
	int n=s.nextInt();
	int temp=n;
	while(n!=0)
	{
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
	if(sum==temp)
	{
		System.out.println("Palindrome");	
	}
	else
	{
		System.out.println(" not Palindrome");		
	}
	
}
}