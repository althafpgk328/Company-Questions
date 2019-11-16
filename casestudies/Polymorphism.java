package casestudies;

import java.util.Scanner;

public class Polymorphism {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Bike bi=new Bike();
		Car cr=new Car();
		System.out.println("1)Bike  \n2)Car");
		int n=s.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("Enter the Details of Bike");
			System.out.println("Enter the color");
			String color=s.next();
			System.out.println("Enter the Maximum Speed");
			int sp=s.nextInt();
			System.out.println("Enter Seats");
			int st=s.nextInt();
			System.out.println("Enter the Number of Wheels");
			String wl=s.next();
			System.out.println("Enter the Status of disk break(t/f)");
			String db=s.next();
			cr.display(color,sp,st,wl,db);
			break;
		case 2:
			System.out.println("Enter the Details of Car");
			System.out.println("Enter the color");
			String color1=s.next();
			System.out.println("Enter the Maximum Speed");
			int sp1=s.nextInt();
			System.out.println("Enter Seats");
			int st1=s.nextInt();
			System.out.println("Enter the Number of Wheels");
			String wl1=s.next();
			System.out.println("Enter the Status of AC(t/f");
			String ac=s.next();
			cr.display(color1,sp1,st1,wl1,ac);
			break;
			default:
				System.out.println("invalid");
				
		}

	}	

}
class Car{
	public void display(String color1,int sp1,int st1,String wl1,String ac)	
	{
		System.out.println("Car Details");
		System.out.println("colour"+color1);
		System.out.println("Maximum Speed"+sp1);
		System.out.println("No of seats"+st1);
		System.out.println("No of Wheels"+wl1);
	System.out.println("AC: "+ac);
	}
}

class Bike extends Car{
	public void display(String color,int sp,int st,String wl,String db)	
	{
		System.out.println("Bike Details");
		System.out.println("colour"+color);
		System.out.println("Maximum Speed"+sp);
		System.out.println("No of seats"+st);
		System.out.println("No of Wheels"+wl);
	System.out.println("Disk break: "+db);
	}
}




