package Encapsulation;
import java.util.Scanner;

public class Customer {
	public static void main(String[] arg) {
		Scanner s=new Scanner(System.in);
		
		Customer1 cu=new Customer1();
		do {
			
		
		System.out.println(" Registration");
		System.out.println("Enter a number");
		cu.setNumber(s.nextInt());
		System.out.println("Enter the name");
		cu.setName(s.next());
		System.out.println("Enter the address");
		cu.setAddress(s.next());
		System.out.println("Enter the Contact number");
		cu.setContactNumber(s.next());
		System.out.println("Enter the email ID");
		cu.setEmail(s.next());
		System.out.println("Enter the Proof Type");
		cu.setProofType(s.next());
		System.out.println("Enter the Proof ID");
		cu.setProofID(s.next());
		}
		while(cu.getName()==null||cu.getNumber()==null||cu.getAddress()==null||cu.getContactNumber()==null||cu.getEmail()==null||cu.getProofType()==null||cu.getProofID()==null)
		cu.display();
	}
}
