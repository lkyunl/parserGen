package main;

import file.GeneratorFileOutput;
import format.SmsLogFormat;
import generator.DelimLogGenerator;
import generator.LogGenerator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class _MonthSMS {


	public static Date addDays(Date date, int days)
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, days); //minus number would decrement the days
		return cal.getTime();
	}


	public static void main(String[] args) throws ParseException {

		int year = 2015;
		//			int month = 12;
		//			int date = 23;
		int hour = 0;
		int minute = 0;
		int second = 0;

		Random rand = new Random();
		System.out.println("start");

		String sourceDate = "2014-12-31";
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

						LogGenerator gen = new DelimLogGenerator(new SmsLogFormat(getDate(year, month, date, hour, minute, second)), "|", false,  "=", true);
						final GeneratorFileOutput helper = new GeneratorFileOutput(gen, "d:\\SMS" + 2015 + today +".log");
						helper.write(rand.nextInt( getMax(hour, minute) - getMin(hour,minute)) + getMin(hour,minute));

					}
			if(today.equals("0131"))
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
		int[] hourBalances = {
				6, 5, 5, 7, 9, 10,
				14, 16, 17, 17, 18, 19,
				20, 20, 24, 27, 30, 34,
				32, 25, 21, 18, 15, 6,
		};

		int test = hourBalances[hour] ;
		return test;
	}

	public static int getMin(int hour, int minute){

		int[] hourBalances = {
				1, 0, 0, 1, 1, 1,
				5, 5, 5, 5, 10, 10,
				10, 15, 15, 15, 20, 25,
				10, 10, 5, 5, 2, 2,
		};

		int test = hourBalances[hour];
		return test;
	}

}



