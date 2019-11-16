package companyQuestions;

import java.util.Scanner;

public class Caseconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a letter");
		char c=s.next().charAt(0);
		if(c>='a'&&c<='z')
		{
			c=(char) ((int)c-32);
		}
		else
		{
			c=(char) ((int)c+32);
		}
       System.out.println(c);
       s.close();
	}

}
