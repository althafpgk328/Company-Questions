package companyQuestions;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		 int n=s.nextInt();
		 int sum=0;
		 int r;
		 int temp=n;
		 while(n!=0)
		 {
			 r=n%10;
			 sum=(sum*10)+r;
			 n=n/10;
		 }
	
		
     System.out.println("reverse is"+sum);
	}

}
