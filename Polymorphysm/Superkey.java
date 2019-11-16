package Polymorphysm;

public class Superkey {
public static void main( String args[]) {
	Demo obj =new Demo();
	obj.disp();
}
class ABC{
	public void disp()
	{
		System.out.println("parent class");
	}
}
class Demo extends ABC
{
	public void disp() {
	super.disp();
	System.out.println("Child class");
	super.disp();
	}
}
}


