package Operator;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Write a program to reverse a 3-digit number. E.g.-Number : 132        Output : 231
 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 3 digit's Number: ");
		int number=sc.nextInt();
		
		int first=number%10;
		 number =number/10;
		int second=number%10;
		int third=number/10;
		
		System.out.println("reverse of 3-digit number:"+((first*100)+(second*10)+third));
		System.out.println(""=="");
		
	}
	

}
