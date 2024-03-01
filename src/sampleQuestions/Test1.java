package sampleQuestions;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Take values of length and breadth of a rectangle from user and check if it is square or not.
		 */
 Scanner sc=new Scanner(System.in);

 System.out.println("Enter Length value: ");
 int length=sc.nextInt();
 System.out.println("Enter Breath Value: ");
 int breadth=sc.nextInt();
 
 if(length == breadth)
 {
	 System.out.println("It is a Square");
 }
 else
 {
	 System.out.println("It is a Rectangle ");
 }
 
 
	}

}
