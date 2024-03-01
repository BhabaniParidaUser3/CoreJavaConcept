package sampleQuestions;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Multipication table : ");
		int table=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(table+"*"+i+"= "+table*i);
		}

	}

}
