package Palindrome;

import java.util.Scanner;

public class Arm{
	public static void main(String [] args) {
	Scanner s=new Scanner(System.in);
	int a,r,sum=0;
	System.out.println("Enter an integer");
	int n=s.nextInt();
	int temp=n;
	while(n!=0)
	{
		r=n%10;
		sum=sum+r*r*r;
		n=n/10;
	}
	if(sum==temp)
	{
		System.out.println("Armstrong");	
	}
	else
	{
		System.out.println(" not Armstrong");		
	}
}
}