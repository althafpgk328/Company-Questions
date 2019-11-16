package Inheritance;
import java.util.Scanner;

public class Hotel {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the hotel");
		String a=s.nextLine();
		Hotelx1 w=new Hotelx1();
		w.biriyani();
		w.salad();
		
	}

}
class Hotelx extends Hotel {
	public void biriyani()
	{
		System.out.println("Chicken");	
	}
}
	class Hotelx1 extends Hotelx{
	public void salad()
	{
		System.out.println("with salad");	
	}
	}

