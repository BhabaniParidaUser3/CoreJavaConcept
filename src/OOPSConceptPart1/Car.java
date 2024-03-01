package OOPSConceptPart1;

import java.util.Arrays;
import java.util.Scanner;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 /*Scanner sc=new Scanner(System.in);
	 System.out.println("Enter UserName");
	 String name=sc.nextLine();
	 System.out.println("Enter UserGender");
	 char gender=sc.next().charAt(0);
	 System.out.println("Enter UserAge");
	 int age=sc.nextInt();
	 System.out.println("Enter UserMobileNummber");
	 long mobilenumber=sc.nextLong();
	 System.out.println("Enter UserCGPA");
	 double cgpa=sc.nextDouble();
	 System.out.println("All Entered Details");
	 System.out.println("Name:"+name);
	 System.out.println("Gender:"+gender);
	 System.out.println("Age:"+age);
	 System.out.println("MobileNumber:"+mobilenumber);
	 System.out.println("CGPA:"+cgpa);
*/
		
		/*WAP to sort a numeric array and string array*/
		int [] intarray= {1,9,4,3,5};
		String [] strarray= {"ab","bc","cd"};
		int intarraylength=intarray.length;
		int strarraylength=strarray.length;
		System.out.println(intarraylength);
		System.out.println(strarraylength);
		//System.out.println(Arrays.sort(intarray));
		System.out.println(intarray.getClass().getName());
		System.out.println(intarray.toString());
		int sum=0;
		
		for(int i=0;i<=intarray.length-1;i++)
		{
			sum=sum+intarray[i];
			
		}
		System.out.println("Sum Of Array Elememt: "+sum);
		/************************************************************************************/
		
		int avg=sum/2;
		System.out.println("avg Of Array Element: "+avg);
		/************************************************************************************/
		
		int[] oddarray=new int[10];
		int[] evenarray=new int[10];
		int count=0;
		int count1=0;
		
		for(int j=0;j<=intarray.length-1;j++)
		{
			if(intarray[j]%2==0)
			{
				count++;
				
				
			}
			else
			{
				count1++;
			}
		}
		
		System.out.println("Even Number Count: "+count);
		System.out.println("Odd Number Count: "+count1);
		/************************************************************************************/
		
		for (int k=0;k<=intarray.length-1;k++)
		{
			if(intarray[k]%2==0)
			{
				
				evenarray[k]=intarray[k];	
			}
			else
			{
				oddarray[k]=intarray[k];
				
			}
		}
		
		
		System.out.println(Arrays.toString(evenarray));
		System.out.println(Arrays.toString(oddarray));
		/************************************************************************************/
		
		int[] a1= {11,12,13,14,15};
	
		for(int a=0;a<=a1.length-1;a++)
		{
			if(a1[a]%2==0)
			{
			System.out.println(a1[a]+":Even ");	
			}
			else
			{
			System.out.println(a1[a]+":Odd ");
			}
				
		}
		/************************************************************************************/
		
		int sumOfEven=0;
		int sumOfOdd=0;
		
		int[] b1= {11,12,13,14,15};
		
		for(int b=0;b<=b1.length-1;b++)
		{
			if(b1[b]%2==0)
			{
			 sumOfEven=b1[b]+sumOfEven;
			}
			else
			{
			 sumOfOdd=b1[b]+sumOfOdd;
			
			}
				
		}
		System.out.println("Even Number Sum: "+sumOfEven);
		System.out.println("Odd Number Sum: "+sumOfOdd);
		
		/************************************************************************************/
		//Create a  scanner class Object to take the input
		Scanner sc=new Scanner(System.in);
		//Read the size of an array
		System.out.println("Enter the length of an Array");
		int n=sc.nextInt();
		//Create a Array with length n
		int[] numbers=new int[n];
		//take input for the array
		System.out.println("Enter Array element");
		for(int c=0;c<=n-1;c++)
		{
			numbers[c]=sc.nextInt();
		}
		System.out.println(Arrays.toString(numbers));
		
		
		/************************************************************************************/
	
		}
		

		

	}


