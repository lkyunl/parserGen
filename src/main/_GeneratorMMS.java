package main;

import file.GeneratorFileOutput;
import format.SmsLogFormat;
import generator.DelimLogGenerator;
import generator.LogGenerator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class _GeneratorMMS {
	
	public static void main(String[] args) {
		
		final int speed ;//= 1000;
		if(args.length >= 1)
			speed = Integer.parseInt(args[0]);
		else 
			speed = 100;

		final String path;
		if(args.length >= 2)
			path = args[1];
		else 
			path = "d:/MMSLOG/";

		Random rand = new Random();
		rand.nextGaussian();

		System.out.println("초당 로그 생성 속도 : " + speed + "건/sec");
	
		LogGenerator gen = new DelimLogGenerator(new SmsLogFormat(), "|", false,  "=", true);
		
		final GeneratorFileOutput helper = new GeneratorFileOutput(gen, path + getfilename() + "/sms.log");
		
		Timer timer = new Timer();
		
		timer.scheduleAtFixedRate(new TimerTask(){
			
			@Override
			public void run(){
				helper.write(speed);
			}
		}, 0, 1000);
	}

	public static String getfilename(){
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		return format.format(new Date());	
	}

}
