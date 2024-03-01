package OOPSConceptPart1;

import java.util.Arrays;
import java.util.Scanner;

public class Example14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create Scanner class Object
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Length Of array");
		int n=sc.nextInt();
		
		int[] number =new int[n];
		System.out.println("Give the array element");
		for(int i=0;i<=number.length-1;i++)
		{
			number[i]=sc.nextInt();
		}
		System.out.println("Array ="+Arrays.toString(number));
		int sum=0;
		
		for(int k=0;k<=number.length-1;k++)
		{
			sum=sum+number[k];
			number[k]=sum;
			
		}
		System.out.println("Cumulative Sum ="+Arrays.toString(number));

	}

}
