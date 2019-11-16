
package Polymorphysm;
import java.util.Scanner;
public class Poly1 {
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	Add a=new Add();
	int n1=s.nextInt();
	int n2=s.nextInt();
	int n3=s.nextInt();
	a.add(n1);
	a.add(n1,n2,n3);
	a.add(n1,n2);
}
}
class Add
{

	public void add(int n1) {
		System.out.println("First number"+n1);
		
	}

	public void add(int n1, int n2) {
		// TODO Auto-generated method stub
		System.out.println("sum of two no"+(n1+n2));
	}

	public void add(int n1, int n2, int n3) {
		System.out.println("sUm of three"+(n1+n2+n3));
		// TODO Auto-generated method stub
		
	}
	
	
}

