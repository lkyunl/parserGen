package main;

import file.GeneratorFileOutput;
import format.SmsLogFormat;
import generator.DelimLogGenerator;
import generator.LogGenerator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class _Generator {
	
	public static void main(String[] args) {
		
		//초당 생성 로그 수
		final int speed;
		if(args.length >= 1)
			speed = Integer.parseInt(args[0]);
		else 
			speed = 100;

		//로그 생성 경로
		final String path;
		if(args.length >= 2)
			path = args[1];
		else 
			path = "d:/SMSLOG/";

		System.out.println("초당 로그 생성 속도 : " + speed + "건/sec");
	
		/*로그 제너레이터 생성 - 라인단위로 로그 생성
		 * 로그 포맷 : SmsLogFormat
		 * 필드들의 구분자 : |
		 * 필드명과 필드값 구분자 : =
		 * 마지막 필드 뒤 필드 구분자 유무 : false
		 * 필드명 출력 여부 : true
		 */
		LogGenerator gen = new DelimLogGenerator(new SmsLogFormat(), "|", false,  "=", true);
		
		/* 생성된 로그 라인을 파일에 출력하기 위한 클래스
		 * 로그 제너레이터 - 위에서 만든 제너레이터
		 * 파일 경로 -d:/SMSLOG/20150101/sms.log
		 */
		final GeneratorFileOutput helper = new GeneratorFileOutput(gen, path + getfilename() + "/sms.log");
		
		Timer timer = new Timer();
		
		//1초에 한번식 동작하는 타이머 
		timer.scheduleAtFixedRate(new TimerTask(){
			
			@Override
			public void run(){
				//매초마다 미리 입력된 '초당 로그 생성 건수' 만큼 로그 생성
				helper.write(speed);
			}
		}, 0, 1000);
	}

	//로그가 생성되는 폴더명 
	public static String getfilename(){
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		return format.format(new Date());	
	}
}



