package companyQuestions;

import java.util.Scanner;

public class SingleDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    long num,dig,sum;
	    Scanner in =new Scanner(System.in);
	 System.out.print("Enter a number :");
	    num=in.nextLong();
	    System.out.println("");
	 System.out.print(num);
	 do{
	        sum = 0;
	        while(num!=0)
	 {
	 dig=num%10;
	            sum+=dig;
	            num/=10;
	 }
	        System.out.print("->"+sum);
	        num=sum;
	 }while(num/10!=0);
	   }
	}


