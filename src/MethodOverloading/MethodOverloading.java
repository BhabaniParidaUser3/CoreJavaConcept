package MethodOverloading;

public class MethodOverloading {

	//Method name same
	//argument data type should be different
	//argument count should be different
	
	/*
	 * Real time example while doing any payment during product purchase we may do
	 * payment through these gateway-debitcard/creditcard/giftcard/upi So whatever
	 * way user perform this payment,it will internally call that method & perform
	 * payment activities
	 */
	
	public void getData(int a)
	{
		System.out.println(a);
	}
	
	public void getData(String a)
	{
		System.out.println(a);
	}
	
	public void getData(int a,int b)
	{
		System.out.println(a+" "+b);
	}
	
	public static void main(String[] args) {
		MethodOverloading mv=new MethodOverloading();
		mv.getData(100);
		mv.getData("learn");
		mv.getData(200, 300);

	}

}
