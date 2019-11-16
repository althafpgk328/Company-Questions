package Polymorphysm;
import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Stud st=new Stud();
		System.out.println("Enter the name");
		String na=s.next();
		System.out.println("Enter the Roll no");
		int r=s.nextInt();
		System.out.println("Enter the department");
		String dept=s.next();
		System.out.println("Enter the mark 1");
		int m1=s.nextInt();
		System.out.println("Enter the mark 2");
		int m2=s.nextInt();
		System.out.println("Enter the mark 3");
		int m3=s.nextInt();
		System.out.println("Enter the mark 4");
		int m4=s.nextInt();
		System.out.println("Enter the mark 5");
		int m5=s.nextInt();
		int total=0;
		int avg=0;
		int rank;
		st.student(na);
		st.student(r);
		st.student(m1,m2,m3,m4,m5,total,avg);
		
		
	}
}
class Stud
{

	public void student(String na) {
		System.out.println("Name"+na);
		// TODO Auto-generated method stub
		
	}
	public void student(int m1, int m2, int m3, int m4, int m5, int total, int avg) {
		total=m1+m2+m3+m4+m5;
		avg=total/5;
		System.out.println("Total"+total);
		System.out.println("Average"+avg);
		if(total>450)
		{
			System.out.println("Rank 1");
		}
		else if(total<400&&total>=300)
		{
			System.out.println("Rank 2");
		}
			else if(total<300&&total>=200)
			{
				System.out.println("Rank 3");
			}
				else if(total<200&&total>=75)
				{
					System.out.println("Rank 4");
		}
				else 
				{
					System.out.println("Failed");
				}
		
		
	}


	public void student(int r) {
		System.out.println("Roll no"+r);
		// TODO Auto-generated method stub
		
	}

}
