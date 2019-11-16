package Inheritance;
import java.util.Scanner;

public class Chocolate {
	
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the flavour");
			String a=s.nextLine();
			Tution m=new Tution();
			m.name();
			m.silk();
			m.price();
			
		}

	}
	class Monday{
		void name() {
		       System.out.println("Dairy milk");
		       }
	}
	class Morning extends Monday{
		void silk() {
		       System.out.println("Silk");
		       }
		
	}
	class Tution extends Morning{
		void price() {
		       System.out.println("80 rs");
		       }
	}


