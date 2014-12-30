package gen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import format.MmsLogFormat;

public class _yearGenerator2 {

	public static Date addDays(Date date, int days)
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, days); //minus number would decrement the days
		return cal.getTime();
	}


	public static void main(String[] args) throws ParseException {

		int year = 2014;
//		int month = 12;
//		int date = 23;
		int hour = 0;
		int minute = 0;
		int second = 0;
		
		Random rand = new Random();

		//		helper.write(speed);

		System.out.println("start");
		
		String sourceDate = "2014-06-30";
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat format2 = new SimpleDateFormat("MMdd");
		Date myDate = format.parse(sourceDate);
		
		
		while(true)
		{
			//System.out.println((myDate.getMonth() + 1) + " ¿ù " + (myDate.getDay()+ 1) + " ÀÏ");
			myDate = addDays(myDate, 1);
			String today = format2.format(myDate);
			
			int month = Integer.parseInt(today.substring(0, 2));
			int date =  Integer.parseInt(today.substring(2));
			
			
			System.out.println(today);
			for(hour = 0; hour < 24; hour++)
				for(minute = 0; minute < 60; minute++)
					for(second = 0; second < 60; second++){

						LogGenerator gen = new DelimLogGenerator(new MmsLogFormat(getDate(year, month, date, hour, minute, second)), "|", false,  "=", true);
						final GeneratorFileOutput helper = new GeneratorFileOutput(gen, "d:\\MMS\\MMS" + 2014 + today +".log");
						helper.write(rand.nextInt( getMax(hour, minute) - getMin(hour,minute)) + getMin(hour,minute));

//						System.out.println();
//						sum +=  rand.nextInt( getMax(hour, minute) - getMin(hour,minute)) + getMin(hour,minute);

					}
			
			if(today.equals("1031"))
				break;
			
			
		}
		
		System.out.println("end");
		
	}
	

	


	public static Date getDate(int year, int month, int date, int hour, int minute, int second) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, date, hour, minute, second);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	public static int getMax(int hour, int minute){
		int[] hourValances = {
				2, 1, 1, 2, 3, 3,
				5, 7, 8, 9, 10, 10,
				11, 12, 12, 12, 14, 16,
				15, 12, 9, 7, 5, 3,
		};
		return  hourValances[hour] ;
	}


	public static int getMin(int hour, int minute){

		int[] hourValances = {
				1, 0, 0, 0, 0, 1,
				2, 3, 3, 4, 4, 5,
				6, 6, 7, 8, 9, 11,
				10, 9, 5, 3, 2, 0,

		};

		return  hourValances[hour];
	}
	

}
