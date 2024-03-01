package OOPSConceptPart1;

import java.util.Arrays;
import java.util.Scanner;

public class Example15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        //Create Scanner class Object to take input
				Scanner sc=new Scanner(System.in);
				
				//Read the size of Array
				System.out.println("Enter the size Of array:");
				int n=sc.nextInt();
				
				
				//Create an int array of size N
				int[] number =new int[n];
				
				//take input for the array
				System.out.println("Enter array elements:");
				for(int i=0;i<=number.length-1;i++)
				{
					number[i]=sc.nextInt();
				}
				
				System.out.println("Array ="+Arrays.toString(number));
				
				
				//take number
				System.out.println("Enter Number =");
				int value=sc.nextInt();
				
				//This is my method
				/*for(int j=0;j<=number.length-1;j++)
				{
					if(value<number[j])
					{
						System.out.print(number[j]+" ");
					}
					
				}
*/
				//display the number greater than the given number
				System.out.println("Numbers greater than the given number=");
				display(number,value);
				
				
	}

	public static void display(int[] number, int value) {
		// TODO Auto-generated method stub
		for(int k:number)
		{
			if(k>value)
			{
				System.out.print(k+" ");
			}
		}
		
	}

}
