package companyQuestions;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		      Scanner s=new Scanner(System.in);
		      int a, b;
		      System.out.println("Enter the numbers");
		      int c[]=(int) s.nextInt();		      
		      int size = c.length;
		      int result = c[0];
		      int i = 1;
		      while(i<size)
		      {
		         if(c[i]%result==0)
		         
		            i++;
		         
		      else 
		      {
		            result = c[i]%result;
		            i++;
		         }
		      }
		      System.out.println("GCD is "+result);
		   }


	}


