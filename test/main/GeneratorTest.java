package main;

import format.MmsLogFormat;
import format.SmsLogFormat;
import generator.DelimLogGenerator;
import generator.LogGenerator;

import java.util.Date;

public class GeneratorTest {
	
	public static void main(String[] args) {
		
		LogGenerator gen = new DelimLogGenerator(new SmsLogFormat(new Date()), "|", false,  "=", true);
		System.out.println("SMS sample log");
		System.out.println(gen.getLogLine());
		System.out.println(gen.getLogLine());
		System.out.println(gen.getLogLine());
		System.out.println(gen.getLogLine());
		System.out.println(gen.getLogLine());
		System.out.println(gen.getLogLine());
		
		LogGenerator gen2 = new DelimLogGenerator(new MmsLogFormat(new Date()), "|", false,  "=", true);
		System.out.println("MMS sample log");
		System.out.println(gen2.getLogLine());
	
	}

}
