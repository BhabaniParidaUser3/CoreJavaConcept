package MethodOverriding;

public class ChildClassDemo extends ParentClassDemo {
	
	/*
	 * Definantion- Both the method have same name .same signature,same
	 * parameter,return type same,arguments are same
	 */
	
	public void audiosystem()
	{
		System.out.println("ChildClass audiosystem code is implemeneted");
	}

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
