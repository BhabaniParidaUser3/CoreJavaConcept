package String;

public class stringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1=new String("Bhabani shankar parida");
		String[] splittedstring=s1.split(" ");
		for(int i=0;i<splittedstring.length;i++)
		{
			System.out.println(splittedstring[i]);
		}
		
		System.out.println("*****************");
		
		for(int x=0;x<s1.length();x++)
		{
			System.out.println(s1.charAt(x));
			
		}
		
		System.out.println("*****************");
		
		for(int y=s1.length()-1;y>=0;y--)
		{
			System.out.println(s1.charAt(y));
		}
		
	}

}
