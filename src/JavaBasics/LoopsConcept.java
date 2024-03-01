package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.while loop
		//disadvantage of while loop-it will genearte infinite loop if you dont give incremental/decrementa part
		//print 1 to 10 
		int i=1;//iniialization
		while(i<=10)//conditional
		{
			System.out.println(i);
			i++;//incemental/decremental
		}
		
		System.out.println("*******************************************************");
		
		//2.For Loop
		//print 1 to 10
		//Here everything in a single line like initialization,condition,implementation
		//j++ means j=j+1
		for(int j=0;j<=10;j++)
		{
			System.out.println(j);
		}
		System.out.println("*******************************************************");
		
		//print 10 to 1
		for(int k=10;k>=1;k--)
		{
			System.out.println(k);
		}

	}

}
