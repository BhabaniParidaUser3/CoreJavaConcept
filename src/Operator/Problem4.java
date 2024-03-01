package Operator;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *Write a program to calculate the sum of the digits of a 3-digit number.
Number : 132        Output : 6
 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 3 digit number: ");
		int number =sc.nextInt();
		
		int firstdigit;
		int secondigit;
		int thirddigit;
		
		
		firstdigit=number/100;
		number=number%100;
		
		secondigit=number/10;
		thirddigit=number%10;
		
		System.out.println("Sum of Numbers: "+(firstdigit+secondigit+thirddigit));
		
	}

}
