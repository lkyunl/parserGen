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
		
		//�ʴ� ���� �α� ��
		final int speed;
		if(args.length >= 1)
			speed = Integer.parseInt(args[0]);
		else 
			speed = 100;

		//�α� ���� ���
		final String path;
		if(args.length >= 2)
			path = args[1];
		else 
			path = "d:/SMSLOG/";

		System.out.println("�ʴ� �α� ���� �ӵ� : " + speed + "��/sec");
	
		/*�α� ���ʷ����� ���� - ���δ����� �α� ����
		 * �α� ���� : SmsLogFormat
		 * �ʵ���� ������ : |
		 * �ʵ��� �ʵ尪 ������ : =
		 * ������ �ʵ� �� �ʵ� ������ ���� : false
		 * �ʵ�� ��� ���� : true
		 */
		LogGenerator gen = new DelimLogGenerator(new SmsLogFormat(), "|", false,  "=", true);
		
		/* ������ �α� ������ ���Ͽ� ����ϱ� ���� Ŭ����
		 * �α� ���ʷ����� - ������ ���� ���ʷ�����
		 * ���� ��� -d:/SMSLOG/20150101/sms.log
		 */
		final GeneratorFileOutput helper = new GeneratorFileOutput(gen, path + getfilename() + "/sms.log");
		
		Timer timer = new Timer();
		
		//1�ʿ� �ѹ��� �����ϴ� Ÿ�̸� 
		timer.scheduleAtFixedRate(new TimerTask(){
			
			@Override
			public void run(){
				//���ʸ��� �̸� �Էµ� '�ʴ� �α� ���� �Ǽ�' ��ŭ �α� ����
				helper.write(speed);
			}
		}, 0, 1000);
	}

	//�αװ� �����Ǵ� ������ 
	public static String getfilename(){
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		return format.format(new Date());	
	}
}



