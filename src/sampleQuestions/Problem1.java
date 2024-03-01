package sampleQuestions;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 
Take input of age of 3 people by user and determine oldest and youngest among them.
 */
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter age of First People: ");
		int people1Age=sc.nextInt();
		System.out.println("Enter age of Second People: ");
		int people2Age=sc.nextInt();
		System.out.println("Enter age of Third People: ");
		int people3Age=sc.nextInt();
		
		if(people1Age>people2Age && people1Age>people3Age)
		{
			System.out.println("oldestage is: "+people1Age);
		}
		else if (people2Age>people1Age && people2Age>people3Age) {
			System.out.println("oldestage is: "+people2Age);
		}
		else if (people3Age>people1Age && people3Age>people2Age) {
			System.out.println("oldestage is: "+people3Age);
		}
		if(people1Age<people2Age && people1Age<people3Age)
		{
			System.out.println("YoungestAge is: "+people1Age);
		}
		else if (people2Age<people1Age && people2Age<people3Age) {
			System.out.println("YoungestAge is: "+people2Age);
		}
		else if (people3Age<people1Age && people3Age<people2Age) {
			System.out.println("YoungestAge is: "+people3Age);
		}
		
	}

}
