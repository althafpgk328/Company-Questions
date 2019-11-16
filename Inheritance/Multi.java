package Inheritance;
import java.util.Scanner;
public class Multi {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the model");
		String a=s.nextLine();
		Model m=new Model();
		m.name();
		m.year();
		m.price();
		
	}

}
class Car2{
	void name() {
	       System.out.println("audi");
	       }
}
class Audi extends Car2{
	void year() {
	       System.out.println("2018");
	       }
	
}
class Model extends Audi{
	void price() {
	       System.out.println("45 lakh");
	       }

	public void silk() {
		// TODO Auto-generated method stub
		
	}
}