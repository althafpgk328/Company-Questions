package Palindrome;
import java.util.Scanner;
public class stringpalin {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		int n=st.length();
		String rev="";
		for (int i=n-1;i>=0;i--)
		{
			rev=rev+st.charAt(i);
		}
		if(rev.contentEquals(st))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}

}