package companyQuestions;

import java.util.Scanner;

public class Squareroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a Number");
    	int sq=s.nextInt();
    	int n=(int)Math.sqrt(sq);
    	int num=n*n;
    	if ( num==sq)
    	{
    		System.out.println("Perfect Square");
    		
    	} 
    	else
    	{
    		System.out.println("Not Perfect Square");
    	}
    	
    	
    }

	}


