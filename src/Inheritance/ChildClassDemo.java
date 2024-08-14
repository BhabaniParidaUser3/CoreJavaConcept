package Inheritance;

public class ChildClassDemo extends ParentClassDemo {

	public void engine()
	{
		System.out.println("Enginee code implemeneted");
	}
	
	public void color()
	{
		System.out.println(color);
	}
	public static void main(String[] args) {
		
		ChildClassDemo ccd=new ChildClassDemo();
		ccd.color();
		ccd.brakes();
		ccd.audiosystem();
		ccd.engine();
		ccd.gear();

	}

}
