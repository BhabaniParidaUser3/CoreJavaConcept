package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
		//System.out.println(i[4]); ArrayIndexOutofBound Exception
		System.out.println(i.length);
		//print all the values by using for loop
		for(int k=0;k<i.length;k++)
		{
			System.out.println(i[k]);
		}
		
		//double type
		double a[]=new double[4];
		
		//boolean type
		boolean b[]=new boolean[5];
		
		//char type
		char c[]=new char[6];
		
		
		//String type
		String s[]=new String[6];
		
		//Object Array	(Object is a class)---- is used  to store different  data type values 
		
		Object  ob[]=new Object[6];
		ob[0]="bhabani";
		ob[1]=123;
		ob[2]=12.22;
		ob[3]='c';
		ob[4]=true;
		
		

	}
	
	//disadvantage of array
	//1.Static array -fixed size-to overcome this we use collection-use dynamic array
	//2.Store only similar data type-to overcome this problem we use Object Array

}
