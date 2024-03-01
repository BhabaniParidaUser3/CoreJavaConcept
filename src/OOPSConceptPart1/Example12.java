package OOPSConceptPart1;

import java.util.Arrays;
import java.util.Scanner;

public class Example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create Scanner Class Object & initialization
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Length");
		int n=sc.nextInt();
		
		//Assign the array size
		int[] numbers=new int[n];
		
		System.out.println("Enter the elements:");
		for(int  i=0;i<=numbers.length-1;i++)
		{
			numbers[i]=sc.nextInt();
		}
		System.out.println("Array ="+Arrays.toString(numbers));
		
		int poscount=0;
		int negcount=0;
	
		
		for(int j=0;j<=numbers.length-1;j++)
		{
			if(numbers[j]>=0)
			{
				poscount++;
			}
			else
			{
				negcount++;
			}
		}
		int[] positive=new int[poscount];
		int[] negative=new int[negcount];
		
		for(int k=0;k<=numbers.length-1;k++)
		{
			if(numbers[k]>=0)
			{
				System.out.print(positive[k]+" ");
			}
			else
			{
				System.out.print(negative[k]+" ");
			}
		}
		
		
		
		
		

	}

}
