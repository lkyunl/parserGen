package main;

import file.GeneratorFileOutput;
import format.SmsLogFormat;
import generator.DelimLogGenerator;
import generator.LogGenerator;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

//하루치 로그 생성
public class _DailyGenerator {

	public static void main(String[] args) {

		//로그 생성 날짜 지정
		int year = 2014;
		int month = 12;
		int date = 23;
		int hour = 0;
		int minute = 0;
		int second = 0;

		Random rand = new Random();
		System.out.println("start");

		for(hour = 0; hour < 24; hour++) 
			for(minute = 0; minute < 60; minute++)
				for(second = 0; second < 60; second++){
					
					/*로그 제너레이터 생성 - 라인단위로 로그 생성
					 * 로그 포맷 : SmsLogFormat
					 * 필드들의 구분자 : |
					 * 필드명과 필드값 구분자 : =
					 * 마지막 필드 뒤 필드 구분자 유무 : false
					 * 필드명 출력 여부 : true
					 */
					LogGenerator gen = new DelimLogGenerator(new SmsLogFormat(getDate(year, month, date, hour, minute, second)), "|", false,  "=", true);
					
					/* 생성된 로그 라인을 파일에 출력하기 위한 클래스
					 * 로그 제너레이터 - 위에서 만든 제너레이터
					 * 파일 경로 -d:/SMSLOG/20150101/sms.log
					 */
					final GeneratorFileOutput helper = new GeneratorFileOutput(gen, "d:\\test_gen" +month + date +".txt");
					
					/* 생성된 로그 라인을 파일에 쓰기 */
					helper.write(rand.nextInt( getMax(hour, minute) - getMin(hour,minute)) + getMin(hour,minute));
				}
		System.out.println("end");
	}

	public static Date getDate(int year, int month, int date, int hour, int minute, int second) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, date, hour, minute, second);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	//시간별 생성되는 최대 초당 로그 건수
	public static int getMax(int hour, int minute){
		int[] hourBalances = {
				6, 5, 5, 7, 9, 10,         //0시 ~ 6시
				14, 16, 17, 17, 18, 19, //6시 ~12시
				20, 20, 24, 27, 30, 34, //12시~18시
				32, 25, 21, 18, 15, 6,  //18시~24시
		};
		return  hourBalances[hour] ;
	}

	//시간별 생성되는 최소 초당 로그 건수
	public static int getMin(int hour, int minute){

		int[] hourBalances = {
				1, 0, 0, 1, 1, 1,            //0시 ~ 6시
				5, 5, 5, 5, 10, 10,         //6시 ~12시
				10, 15, 15, 15, 20, 25,   //12시~18시
				10, 10, 5, 5, 2, 2,         //18시~24시

		};
		return  hourBalances[hour];
	}
}
