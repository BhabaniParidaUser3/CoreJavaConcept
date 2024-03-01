package sampleQuestions;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of classes held :");
		double held=sc.nextInt();
		System.out.println("Number of classes attended :");
		double attended=sc.nextInt();
		
		
		double percenageOfAttented=((attended/held)*100);
		if(percenageOfAttented>=75)
		{
			System.out.println("% of attendance: "+percenageOfAttented);
			System.out.println("student is allowed to sit in exam");
		}
		else
		{
			System.out.println("Do You have Medical cause?(Yes/No): ");
			String medicalCause=sc.nextLine();
			if(medicalCause.equalsIgnoreCase("Nos"))
			{
				System.out.println("% of attendance: "+percenageOfAttented);
				System.out.println("student is allowed to sit in exam");
				
			}
			else
			{
				System.out.println("% of attendance: "+percenageOfAttented);
				System.out.println("student is not allowed to sit in exam");
			}
			
			
		}
		
		

	}

}
