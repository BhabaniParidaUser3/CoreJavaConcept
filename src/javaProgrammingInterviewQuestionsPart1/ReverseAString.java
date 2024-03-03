package javaProgrammingInterviewQuestionsPart1;

public class ReverseAString {

	public static void main(String[] args) {

		//Question 1: Write a Java Program to reverse a String.
		
		String inputStringName = new String("Bhabani Shankar Parida");
		String outputStringName = "";
		for (int i = inputStringName.length() - 1; i >= 0; i--) {
			outputStringName = outputStringName + inputStringName.charAt(i);

		}
		System.out.println(outputStringName);

	}

}
