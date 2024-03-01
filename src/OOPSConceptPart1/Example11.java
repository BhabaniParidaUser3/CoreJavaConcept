package OOPSConceptPart1;

import java.util.Arrays;
import java.util.Scanner;

public class Example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Create a scanner class object
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Length Of an Array");
		int n=sc.nextInt();
		int[] numbers=new int[n];
				
		System.out.println("Enter the array Elemt:");
		for(int i=0;i<n;i++)
		{
			numbers[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(numbers));
		
		int negativecount=0;
		
		for(int j=0;j<=numbers.length-1;j++)
		{
			if(numbers[j]<0)
			{
				System.out.print(numbers[j]+" ");
				negativecount++;
				
			}
			
		}
		
		if(negativecount>0)
		{
			System.out.println("Array contain negative number.");
		}
		else
		{
			System.out.println("Array doesn’t contain negative number.");
		}
	}

}
