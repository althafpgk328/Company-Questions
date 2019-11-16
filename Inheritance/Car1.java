package Inheritance;

import java.util.Scanner;

public class Car1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the car speed");
		int a=s.nextInt();
		Toyota b=new Toyota();
		b.name();
		b.about();
		b.speed(a);
		
		
	}

}
