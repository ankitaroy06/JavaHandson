package FirstProject;

import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * The class Date represents a specific instant in time
 * List of date and time format: "https://www.tutorialspoint.com/java/java_date_time.htm"
 */

public class DateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date objDate= new Date();
		SimpleDateFormat objsdf= new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat objsdf2= new SimpleDateFormat("hh:mm:ss");
		System.out.println(objDate);
		System.out.println(objsdf.format(objDate)); // printing date
		System.out.println(objsdf2.format(objDate));// printing time
	}

}

