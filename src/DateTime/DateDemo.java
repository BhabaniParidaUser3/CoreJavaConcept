package DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d=new Date();
		System.out.println(d);
		System.out.println(d.toString());
		
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		//refer this link for different format-https://www.digitalocean.com/community/tutorials/java-simpledateformat-java-date-format
		System.out.println(sdf.format(d));
		

	}

}
