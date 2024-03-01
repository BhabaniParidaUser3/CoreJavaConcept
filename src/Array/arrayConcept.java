package Array;

import java.util.Arrays;
import java.util.List;

public class arrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		System.out.println(arr);
		System.out.println("**************************");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("array values are "+arr[i]);
		}
		
		System.out.println("**************************");
		
		for(int a: arr)
		{
			System.out.println(a);
		}

		System.out.println("**************************");
		
		int[] arr1= {1,2,3,4,5};
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("array values are "+arr1[i]);
		}
		System.out.println("**************************");
		
		for (int b:arr1)
		{
			System.out.println(arr1);
		}
		System.out.println("**************************");
		
		int[] arr2= {0,1,2,3,4,5,6,7,8,9};
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i] % 2 == 0) {
				System.out.println(arr2[i]+" is multiple of 2");
			
			}
			else
			{
				System.out.println(arr2[i]+" is not multiple of 2");
			}
		}
		
		System.out.println("****************");
		//How to convert array to arraylist
		
		String [] aa= {"bhabani","shivani","prangya"};
		List<String> convertedarraylist=Arrays.asList(aa);
		System.out.println(convertedarraylist.get(1));
		

	}

}
