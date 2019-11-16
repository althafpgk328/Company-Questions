package Abstraction;

import java.util.Scanner;

public class Student {
	public static void main(String[] arge)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the ID");
		int id=sc.nextInt();
		Student1 s =new Student1();
		s.totalmark(name, id);
	}

	public void totalmark(String n, int id, int m1, int m2, int m3, int m4, int m5) {
		
		
	}

}
abstract class rank{
	abstract void totalmark(String name,int id);
	
	public void rank1() {
		System.out.println("rank 2");
	}
}
class Student1 extends rank{
	void totalmark(String name,int id) {
		System.out.println("Name ->"+name);
		System.out.println("Student ID->"+id);	
		super.rank1();
}
}

