package OOPSConceptPart1;

import java.util.Arrays;
import java.util.Scanner;

public class Example22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int n=sc.nextInt();
		int[] numbers=new int[n];
		System.out.println("Enter the Array Elements: ");
		for(int i=0;i<=numbers.length-1;i++)
		{
			numbers[i]=sc.nextInt();
			
		}
		System.out.println(Arrays.toString(numbers));
		int largest=0;
		for(int k=0;k<=largest;k++)
		{
			if(numbers[k]>largest)
			{
				largest=numbers[k];
			}
			
		}
		//System.out.println(Arra);

	}

}
