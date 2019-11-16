package Encapsulation;
import java.util.Scanner;

public class Simple {
	public static void main(String[] arg) {
		Scanner s=new Scanner(System.in);
		User us=new User();
		Display d=new Display();
		System.out.println("Enter the name");
		us.setName(s.next());
		System.out.println("Enter the address");
		us.setAddress(s.next());
		System.out.println("Enter the Contact number");
		us.setContactNumber(s.next());
		System.out.println("Enter the email ID");
		us.setEmail(s.next());
		System.out.println("Enter the Proof Type");
		us.setProofType(s.next());
		System.out.println("Enter the Proof ID");
		us.setProofID(s.next());
		d.display(us.getName(),us.getAddress(),us.getContactNumber(),us.getEmail(),us.getProofType(),us.getProofID());
		
	}

}
