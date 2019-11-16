package companyQuestions;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    {
		        Scanner sc = new Scanner(System.in);
		         
		        System.out.println("Enter the string...");
		         
		        String inputString = sc.nextLine();
		         
		        String newInputString = inputString.replaceAll("[AEIOUaeiou]", "");
		         
		        System.out.println("The string without vowels...");
		         
		        System.out.println(newInputString);
		         
		        sc.close();
		    }
		}
	}


