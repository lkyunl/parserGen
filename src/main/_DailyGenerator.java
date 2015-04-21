package main;

import file.GeneratorFileOutput;
import format.SmsLogFormat;
import generator.DelimLogGenerator;
import generator.LogGenerator;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

//�Ϸ�ġ �α� ����
public class _DailyGenerator {

	public static void main(String[] args) {

		//�α� ���� ��¥ ����
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
					
					/*�α� ���ʷ����� ���� - ���δ����� �α� ����
					 * �α� ���� : SmsLogFormat
					 * �ʵ���� ������ : |
					 * �ʵ��� �ʵ尪 ������ : =
					 * ������ �ʵ� �� �ʵ� ������ ���� : false
					 * �ʵ�� ��� ���� : true
					 */
					LogGenerator gen = new DelimLogGenerator(new SmsLogFormat(getDate(year, month, date, hour, minute, second)), "|", false,  "=", true);
					
					/* ������ �α� ������ ���Ͽ� ����ϱ� ���� Ŭ����
					 * �α� ���ʷ����� - ������ ���� ���ʷ�����
					 * ���� ��� -d:/SMSLOG/20150101/sms.log
					 */
					final GeneratorFileOutput helper = new GeneratorFileOutput(gen, "d:\\test_gen" +month + date +".txt");
					
					/* ������ �α� ������ ���Ͽ� ���� */
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

	//�ð��� �����Ǵ� �ִ� �ʴ� �α� �Ǽ�
	public static int getMax(int hour, int minute){
		int[] hourBalances = {
				6, 5, 5, 7, 9, 10,         //0�� ~ 6��
				14, 16, 17, 17, 18, 19, //6�� ~12��
				20, 20, 24, 27, 30, 34, //12��~18��
				32, 25, 21, 18, 15, 6,  //18��~24��
		};
		return  hourBalances[hour] ;
	}

	//�ð��� �����Ǵ� �ּ� �ʴ� �α� �Ǽ�
	public static int getMin(int hour, int minute){

		int[] hourBalances = {
				1, 0, 0, 1, 1, 1,            //0�� ~ 6��
				5, 5, 5, 5, 10, 10,         //6�� ~12��
				10, 15, 15, 15, 20, 25,   //12��~18��
				10, 10, 5, 5, 2, 2,         //18��~24��

		};
		return  hourBalances[hour];
	}
}
