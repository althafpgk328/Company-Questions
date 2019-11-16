package casestudies;

import java.util.Scanner;

public class casee {
public static void main(String[] arg) throws InterruptedException 
{
Scanner s=new Scanner(System.in);
Booking b=new Booking();

int n = 0;
switch(n)
{
	case 1:
	  Booking.book();
	  break;
	case 2:
		 Booking.list(0);
	  break;
	case 3:
	  System.exit(0);
	  break;
	default:
	     System.out.println("invalid");
}
}


}
