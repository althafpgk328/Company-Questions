package companyQuestions;

import java.util.Scanner;

public class LCMARRAY {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		
	      int[] myArray = s.nextInt();
	      int min, max, x, lcm = 0;
	      
	      for(int i = 0; i<myArray.length; i++) {
	         for(int j = i+1; j<myArray.length-1; j++) {
	            if(myArray[i] > myArray[j]) {
	               min = myArray[j];
	               max = myArray[i];
	            } else {
	               min = myArray[i];
	               max = myArray[j];
	            }
	            for(int k =0; k<myArray.length; k++) {
	               x = k * max;
	               if(x % min == 0) {
	                  lcm = x ;
	               }
	            }
	         }
	      }
	      System.out.println("LCM of the given array of numbers : " + lcm);
	   }
	}