package sampleQuestions;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program to print absolute vlaue of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  Value: ");
		int value=sc.nextInt();
		
		if(value >0)
		{
			System.out.println("The absolute value is :"+ value);
		}
		else
		{
			System.out.println("The basolute value is: "+ (-1*value));
		}
		
		
		

	}

}
