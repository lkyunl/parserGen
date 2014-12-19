package gen;

import format.SmsLogFormat;

public class GeneratorTest {
	
	public static void main(String[] args) {
		LogGenerator gen = new DelimLogGenerator(new SmsLogFormat(), "|", false,  "=", true);
		System.out.println("test");
		System.out.println(gen.getLogLine());
		System.out.println(gen.getLogLine());
		System.out.println(gen.getLogLine());
		System.out.println(gen.getLogLine());
		System.out.println(gen.getLogLine());
		System.out.println(gen.getLogLine());
		
		//LogGenerator gen2 = new DelimLogGenerator(new SmsLogFormat(), "|", false,  "=", false);
		//System.out.println("test");
		//System.out.println(gen2.getLogLine());
	}

}
