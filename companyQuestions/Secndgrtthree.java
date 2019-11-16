package companyQuestions;

import java.util.Scanner;

public class Secndgrtthree {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Three Numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		if(a<b&&a>c)
		{
			System.out.println(a+" is the second greatest number  ");
		}
		else if(b>a&&b<c)
		{
			System.out.println(b+" is the second greatest number  ");	
		}
		else
		{
			System.out.println(c+" is the second greatest number  ");
		}

	}

}
