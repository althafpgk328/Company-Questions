package companyQuestions;

import java.util.Scanner;

public class ReverseSting {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
			System.out.println("Enter a word");
			String a=s.next();
			String reversed =reverseString(a);
			System.out.println("Reversed is :"+reversed);
		}
		
			


	public static String reverseString(String str) {
		if(str.isEmpty()){
		return str;
	}
	return reverseString(str.substring(1))+str.charAt(0);

	}
}			
			
		

	


