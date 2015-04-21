package main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import file.GeneratorFileOutput;
import format.MmsLogFormat;
import generator.DelimLogGenerator;
import generator.LogGenerator;

public class _GeneratorsMMS {
	public static int count = 1;
	
	public static void main(String[] args) {
		
		final int speed;
		if(args.length >= 1)
			speed = Integer.parseInt(args[0]);
		else 
			speed = 100;

		final String path;
		if(args.length >= 2)
			path = args[1];
		else 
			path = "d:/MMSLOG/";
		
		if(args.length >=3)
			try {
				count = Integer.parseInt( args[2] );
			} catch (NumberFormatException e) {
			}
		
		Random rand = new Random();
		rand.nextGaussian();

		System.out.println("초당 로그 생성 속도 : " + speed + "건/sec");
		
		Timer timer = new Timer();
		
		timer.scheduleAtFixedRate(new TimerTask(){
			
			@Override
			public void run(){
				for(int i = 0; i < count; i++){
					LogGenerator gen = new DelimLogGenerator(new MmsLogFormat(new Date()), "|", false,  "=", true);
					
					GeneratorFileOutput helper = new GeneratorFileOutput(gen, path + getGW(i) + getParentPath() + getFileName());
			
					helper.write(speed, path + getGW(i) + getParentPath() + getFileName());
				}
			
			}
		}, 0, 1000);
	}

	public static String getGW(int i){
		return "MMSGW" + i + "/";
		
	}
	public static String getParentPath(){
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		return format.format(new Date());	
	}

	//1시간단위로 
	public static String getFileName(){
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd.HHmm");
		return "/MMSGW." + format.format(new Date()) + ".log"; 
	}
	
	public static Date getDate(int year, int month, int date, int hour, int minute, int second) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, date, hour, minute, second);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}
}

