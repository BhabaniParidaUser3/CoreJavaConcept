package OOPSConceptPart1;

import java.util.Arrays;
import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create & initialize the Scanner Class Object
		Scanner sc=new Scanner(System.in);
		//Read the size of an array
		System.out.println("Enter the length of an Array");
		int n=sc.nextInt();
		
		int[] numbers=new int[n];
		System.out.println("Enter array element");
		for(int i=0;i<n;i++)
		{
			
			numbers[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(numbers));
		int positivecount=0;
		int negativecount=0;
		int zerocount=0;
		
		
		for(int j=0;j<=numbers.length-1;j++)
		{
			if(numbers[j]>0)
			{
				positivecount++;
				
				
			}
			else if(numbers[j]<0)
			{
				negativecount++;
				
			}
			else if(numbers[j]==0)
			{
				zerocount++;
			}
		
			
		}
		System.out.println("Numbers of Positive Number in the array: "+positivecount);
		System.out.println("Numbers of Negative Number in the array: "+negativecount);
		System.out.println("Numbers of zero in the array: "+zerocount);
		

	}

}
