package Inheritance;
import java.util.Scanner;
public class Booking {
	
      public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int persons;
      int total_days;
      double tariff;
      String roomType;
      System.out.println("Booking");
      System.out.println("Enter number of persons");
      int p=s.nextInt();
      System.out.println("Enter number of days");
      int d=s.nextInt();
      System.out.println("Enter the room type(AC/nonAC");
      String t=s.next();
      System.out.println("Enter the tarriff for single person");
      int f=s.nextInt();
      
      SeasonBooking sb=new SeasonBooking();
      sb.roombooking(p, d, f);
      
      }
}
class SeasonBooking extends Booking{
	int p;
	int d;
	String t;
	int f;
	void roombooking(int p,int d,int f)
	{
		int set=d*p*f;
		System.out.println("Total tarriff" +set);
	     
		
	}

}
