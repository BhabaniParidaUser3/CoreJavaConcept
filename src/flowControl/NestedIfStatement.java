package flowControl;

public class NestedIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10;
		if(i==10 || i>5)
		{
			if(i>5)
				System.out.println("i is greater than 5");
			
			if(i<20)
			{
				System.out.println("i is lesser than 20");
				
			}
			else
			{
				System.out.println("i is greater than 20");
			}
		}

	}

}
