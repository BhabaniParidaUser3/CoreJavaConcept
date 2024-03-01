package Array;

import java.util.ArrayList;

public class arrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> a=new ArrayList<String>();
a.add("rahul");
a.add("Sheety");
a.add("academy");
a.add("selenium");
System.out.println(a.get(3));

System.out.println("**************");

for(int i=0;i<a.size();i++)
{
	System.out.println(a.get(i));
}

System.out.println("**************");

for(String name:a)
{
	System.out.println(name);
}

System.out.println(a.contains("selenium"));
		
	}

}
