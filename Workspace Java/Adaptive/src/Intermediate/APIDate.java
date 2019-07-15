package Intermediate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class APIDate {
	public static void main(String[] args) {
		System.out.println("APIDate Constructor.....");
		
		// Convert Date to String
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		String sDate = sdf.format(new Date());
		System.out.println("Convert Date to string");
		
		System.out.println("");
		
		//Convert String to Date 
		sdf = new SimpleDateFormat("dd-mm-yyyy hh : mm : ss");
		String dateInString = "06-08-2018 10:20:56";
		Date date = new Date();
		
		try {
			date = sdf.parse(dateInString);
			System.out.println("convert String to Date = " + date );
		} catch (ParseException el) {
			el.printStackTrace();
		}
		System.out.println("");
		
		//Convert calender to date
		Calendar calendar = Calendar.getInstance();
		date = calendar.getTime();
		System.out.println("convert calender to Date = " + date);
		
		System.out.println("");
		
		//Get Current date time
		sdf= new SimpleDateFormat("yyyy MM dd HH:mm:ss");
		calendar= new GregorianCalendar(2013,0,31);
		System.out.println("Get Current Date time = " + sdf.format(calendar.getTime()));
		
		System.out.println("");

		
		
		
		//simple calender example
		//Calender=new GregorianCalendar(2013,1,28,13,24,56);
		calendar = new GregorianCalendar();
		
		int year  = calendar.get(Calendar.YEAR);
		int month  = calendar.get(Calendar.MONTH);
		int dayOfMonth  = calendar.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int weekOfYear  = calendar.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth  = calendar.get(Calendar.WEEK_OF_MONTH);
		
		int hour = calendar.get(Calendar.HOUR);
		int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY);
		int minute  = calendar.get(Calendar.MINUTE);
		int second  = calendar.get(Calendar.SECOND);
		int millisecond  = calendar.get(Calendar.MILLISECOND);
		
		System.out.println("Tahun \t\t:" + year);
		System.out.println("Bulan \t\t:" + (month+1));
		System.out.println("Hari \t\t:" + dayOfMonth);
		System.out.println("Hari ke berapa dalam semingu \t :" + dayOfWeek);
		System.out.println("Bulan kebarapa dalam tahun \t:" + weekOfYear);
		System.out.println("Minggu kebarapa dalam sebulan \t:" + weekOfMonth);
		
		System.out.println("Jam \t \t : " + hour);
		System.out.println("Jam dalam  1 hari \t : " + hourOfDay);
		System.out.println("Menit \t \t : " + minute);
		System.out.println("Detik \t \t : " + second);
		System.out.println("Mili Detik \t \t : " + millisecond);

		System.out.println("");

		//Set A Date Mannualy
		calendar = new GregorianCalendar(2013,1,28,13,24,56);
		System.out.println("#1. Set A date Mannualy : " + sdf.format(calendar.getTime()));

		//update a date
		calendar.set(Calendar.YEAR, 2014);
		calendar.set(Calendar.MONTH, 11);
		calendar.set(Calendar.MINUTE, 33);

		System.out.println("#2. Set A Date Mannualy = " + sdf.format(calendar.getTime()));
		System.out.println("");

		//Add or Subtract from a date
		sdf= new SimpleDateFormat("yyyy MM dd");

		calendar= new GregorianCalendar(2013,10,28);
		System.out.println("Date : " + sdf.format(calendar.getTime()));

		//Add one Month
		calendar.add(Calendar.MONTH, 1);
		System.out.println("Add one Month : " + sdf.format(calendar.getTime()));

		//subtract 10 days
		calendar.add(Calendar.DAY_OF_MONTH, -10);
		System.out.println("Subtract 10 days = " + sdf.format(calendar.getTime()));

		System.out.println("");

		//Convert Date to Calendar
		sdf= new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		dateInString="22-01-2015 10:20:56";
		try{
			date=sdf.parse(dateInString);
		}catch(ParseException e){
			e.printStackTrace();
		}
		System.out.println("Convert Date to Calendar : " + date);


	}
}
		
		
		
		