package companyQuestions;

import java.util.Scanner;

public class Circumference {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int radius;
		double circumference;
		System.out.println("Enter the radius of the circle");
		radius =s.nextInt();
		circumference=Math.PI*2*radius;
		System.out.println("the circumference of the circle is :"+circumference);
		

	}

}
