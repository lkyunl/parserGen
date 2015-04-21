package main;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import file.GeneratorFileOutput;
import format.SmsLogFormat;
import generator.DelimLogGenerator;
import generator.LogGenerator;

public class _ThreadSMS {

	final static String parent = "d:\\SMST2";

	public static Date addDays(Date date, int days)
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, days); //minus number would decrement the days
		return cal.getTime();
	}

	public static class LogGen implements Runnable{
		int year;
		int month;
		int date;
		
		public LogGen(int year, int month, int date){
			this.year = year;
			this.month = month;
			this.date = date;
		}
		
		@Override
		public void run() {
			genDay(year, month, date);
		}
		
	}
	public static void main(String[] args) throws ParseException {
		List<Thread> threads = new ArrayList<Thread>();
		for(int i = 18; i <= 20; i++){
			Thread t = new Thread(new LogGen(2015,4,i));
			t.start();
			threads.add(t);
			
		}
		for(int i = 0; i < threads.size(); i++){
			Thread t = threads.get(i);
			
			try{
				t.join();
			}catch(Exception e){
			}
		}
		
		System.out.println("main end");
	}


	private static void genDay(int year, int month, int date){
		Random rand = new Random();
		String today = year + "_" + month + "_" + date;
		System.out.println(today);

		int hour = 0;
		int minute = 0;
		int second = 0;

		for(hour = 0; hour < 24; hour++)
			for(minute = 0; minute < 60; minute++)
				for(second = 0; second < 60; second++){
					LogGenerator gen = new DelimLogGenerator(new SmsLogFormat(getDate(year, month, date, hour, minute, second)), "|", false,  "=", true);
					final GeneratorFileOutput helper = new GeneratorFileOutput(gen, parent + "\\SMS" + today +".log");
					helper.write(rand.nextInt( getMax(hour, minute) - getMin(hour,minute)) + getMin(hour,minute));
				}
		
		System.out.println(today + " end");
	}


	public static Date getDate(int year, int month, int date, int hour, int minute, int second) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, date, hour, minute, second);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	public static int getMax(int hour, int minute){
		int[] hourValances = {
				2, 1, 1, 1, 1, 1,
				3, 4, 5, 5, 6, 6,
				7, 7, 7, 7, 8, 8,
				7, 5, 4, 3, 3, 3,
		};

		return hourValances[hour];
	}


	public static int getMin(int hour, int minute){

		int[] hourValances = {
				1, 0, 0, 0, 0, 0,
				2, 2, 2, 2, 3, 3,
				4, 5, 5, 5, 5, 6,
				4, 2, 1, 1, 1, 1,

		};

		return  hourValances[hour];
	}

}



