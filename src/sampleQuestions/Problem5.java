package sampleQuestions;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Take 10 integers from keyboard using loop and print their average value on
		 * the screen.
		 */
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Enter integer value: ");
			int value = sc.nextInt();
			sum = value + sum;
		}
		System.out.println("average value: " + (sum / 10));
	}
}
