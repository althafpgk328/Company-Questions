package Inheritance;
import java.util.Scanner;

public class Hierarchycal {

public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the amount");
			String a=s.nextLine();
			Tution m=new Tution();
			m.name();
			m.silk();
			m.price();
			
		}

	}
	class Monday1{
		void name() {
		       System.out.println("Dairy milk");
		       }
	}
	class Morning1 extends Monday1{
		void silk() {
		       System.out.println("Silk");
		       }
		
	}
	class Tution1 extends Monday{
		void price() {
		       System.out.println("80 rs");
		       }

		}


