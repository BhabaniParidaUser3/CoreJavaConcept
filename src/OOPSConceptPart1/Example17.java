package OOPSConceptPart1;

import java.util.Arrays;
import java.util.Scanner;

public class Example17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array1:");
		int array1size=sc.nextInt();
		
		System.out.println("Enter the size of Array2:");
		int array2size=sc.nextInt();
		
		int[] array1number=new int[array1size];
		int[] array2number=new int[array2size];
		int[] array3number=new int[array1size];
		
		
		System.out.println("Enter the array1 elements:");
		for(int i=0;i<=array1number.length-1;i++)
		{
			array1number[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(array1number));
		
		System.out.println("Enter the array2 elements:");
		for(int i=0;i<=array2number.length-1;i++)
		{
			array2number[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(array2number));
		
		for(int k=0;k<=array3number.length-1;k++)
		{
			array3number[k]=array1number[k]+array1number[k];
			
		}
		System.out.println("Sumof two array"+Arrays.toString(array3number));
		
		
	}

}
