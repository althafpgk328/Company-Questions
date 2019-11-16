package Encapsulation;
import java.util.Scanner;
public class New {

		public static void main(String[] arg) {
			Scanner s=new Scanner(System.in);
			Student1 c=new Student1();
			System.out.println("Enter the name");
			c.setName(s.next());
			System.out.println("Enter the ID");
			c.setId(s.nextInt());
			System.out.println("name "+c.getName());
			System.out.println("ID "+c.getId());
			
			
		}
	}