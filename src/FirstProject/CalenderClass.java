package FirstProject;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar Cal= Calendar.getInstance();
		SimpleDateFormat obj1= new SimpleDateFormat();
		
		System.out.println(obj1.format(Cal.getTime()));
		System.out.println("Day of month: "+ Cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("Day of week: "+ Cal.get(Calendar.DAY_OF_WEEK));
	}

}
