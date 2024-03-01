package BitwiseOpeartor;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*&,|,^ operator applicable for both Boolean & Integral operator*/
		
		/*boolean*/
		/*
		 * If both argument are same ,it will return true.OrElse it will return false
		 */
		System.out.println(true & false);
		/*
		 * if both arguments are different,it will return true.Orelse it will return false
		 */
		System.out.println(true | false);
		/*
		 * if both arguments are different,it will return true.Orelse it will return false
		 */
		System.out.println(true ^ false);
		
		
		/*Integral*/
		int a=4;
		int b=5;
		/*
		 * a=4=100
		 * b=5=101
		 * answer=100=4 (it will go bitwise)
		 */
		System.out.println("a & b ="+(a & b));
		/*
		 * a=4=100
		 * b=5=101
		 * answer=101=5(it will go bitwise)
		 */
		System.out.println("a | b ="+(a | b));
		/*
		 * a=4=100
		 * b=5=101
		 * answer=001=1(it will go bitwise)
		 */
		System.out.println("a ^ b ="+(a ^ b));
		
		
		/*Bitwise complement operator ~.This operator is not applicable for boolean,but only for int*/
		
		/*The operator ~ is undefined for the argument type(s) boolean*/
		System.out.println(true);
		System.out.println(~10);

	}

}
