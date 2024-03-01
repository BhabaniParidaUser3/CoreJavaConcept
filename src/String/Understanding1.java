package String;

public class Understanding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1=" Geeks For Geeks ";
		String s2=new String("Bhabani");
		String internString=s2.intern();
		StringBuffer sbf=new StringBuffer("StringBuffer");
		StringBuilder sbl=new StringBuilder("StringBuilder");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(internString);
		System.out.println(sbf);
		System.out.println(sbl);
		
		/*
		 * Strings Methods
		 */

		System.out.println("bhabani".length());
		System.out.println("Length of the String: "+s1.length());
		System.out.println("Charchter at 4th index of GeeksForGeeks : "+s1.charAt(4));
		System.out.println("Substring from 4th index of charchter to end of GeeksForGeeks :"+s1.substring(4));
		System.out.println("Returns the substring from i to j-1 index :"+s1.substring(4, 8));
		System.out.println("concatination of two string : "+s1+s2);
		System.out.println("Index fof For in this string is :"+s1.indexOf("For"));
		System.out.println(""+s1.indexOf("ek", 2));
		System.out.println(""+s1.lastIndexOf("s"));
		
		System.out.println(s2.equals("Bhabani"));
		System.out.println(s2.equals("bhabani"));
		System.out.println(s2.equalsIgnoreCase("Bhabani"));
		System.out.println(s2.equalsIgnoreCase("bhabani"));
		//compareTo
		//compareToIgnoranceCase
		System.out.println("convert into lower case: "+s1.toLowerCase());
		System.out.println("convert to upper case: "+s1.toUpperCase());
		System.out.println("trim the strings:"+s1.trim());
		System.out.println("replace the ch in G inplace of e"+s1.replace('G', 'e'));
		System.out.println(" "+s1.contains("For"));
		System.out.println(" "+s1.contentEquals("For"));
		System.out.println(" "+s1.contentEquals(" Geeks For Geeks "));
		System.out.println(" "+s1.endsWith(" "));
		System.out.println(" "+s1.startsWith(" "));
		System.out.println(" "+s1.hashCode());
		System.out.println(" "+s1.isEmpty());
		
	}

}
