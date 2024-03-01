package OOPSConceptPart1;

import java.util.Arrays;
import java.util.Scanner;

public class Example13 {

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
				
				int postivesum=0;
				int negativesum=0;
				for(int j=0;j<=numbers.length-1;j++)
				{
					if(numbers[j]>=0)
					{
						postivesum=postivesum+numbers[j];
						
					}
					else if(numbers[j]<0)
					{
						negativesum=negativesum+numbers[j];
						
					}
					
				}
				
				System.out.println("Sum Of Positive Nummber = "+postivesum);
				System.out.println("Sum of Negative Number = "+negativesum);

	}

}
