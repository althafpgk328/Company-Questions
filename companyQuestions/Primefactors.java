package companyQuestions;

import java.util.Scanner;

public class Primefactors {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter a number");
		n=s.nextInt();
		
		for (int i=2;i<=n;i++)
		{
			while (n%i==0) {
				System.out.println(i+"");
				n=n/i;
			}
		}
				if(n>2) {
					System.out.println(n);
				}

	}

}
