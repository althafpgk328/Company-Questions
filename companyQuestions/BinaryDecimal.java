package companyQuestions;
import java.util.Scanner;
public class BinaryDecimal {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the binary number");
		String b=s.next();
		System.out.println(Integer.parseInt(b,2));
	
	}
}
