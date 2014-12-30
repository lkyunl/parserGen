package gen;

import format.SmsLogFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

//하루치 로그 생성
public class _DailyGenerator {


	public static void main(String[] args) {

		int year = 2014;
		int month = 12;
		int date = 23;
		int hour = 0;
		int minute = 0;
		int second = 0;

		Random rand = new Random();

		//		helper.write(speed);

		System.out.println("start");


		for(hour = 0; hour < 24; hour++)
			for(minute = 0; minute < 60; minute++)
				for(second = 0; second < 60; second++){

					LogGenerator gen = new DelimLogGenerator(new SmsLogFormat(getDate(year, month, date, hour, minute, second)), "|", false,  "=", true);
					final GeneratorFileOutput helper = new GeneratorFileOutput(gen, "d:\\test_gen" +month + date +".txt");
					helper.write(rand.nextInt( getMax(hour, minute) - getMin(hour,minute)) + getMin(hour,minute));

//					System.out.println();
//					sum +=  rand.nextInt( getMax(hour, minute) - getMin(hour,minute)) + getMin(hour,minute);

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
				6, 5, 5, 7, 9, 10,
				14, 16, 17, 17, 18, 19,
				20, 20, 24, 27, 30, 34,
				32, 25, 21, 18, 15, 6,
		};

		return  hourValances[hour] ;

	}


	public static int getMin(int hour, int minute){

		int[] hourValances = {
				1, 0, 0, 1, 1, 1,
				5, 5, 5, 5, 10, 10,
				10, 15, 15, 15, 20, 25,
				10, 10, 5, 5, 2, 2,

		};
		return  hourValances[hour];
	}
}
