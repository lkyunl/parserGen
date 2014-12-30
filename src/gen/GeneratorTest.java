package gen;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import format.MmsLogFormat;
import format.SmsLogFormat;

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
	
	
	
//		Random rand = new Random();
//		
//
//		ArrayList<Integer> test = new ArrayList<>();
//		for(int i= 0;i < 100000; i++)
//			test.add( (int) (rand.nextGaussian() * 10));
//		
//		Map<String, Integer> map = new HashMap<String, Integer> ();
//		
//		for(Integer i : test){
//			String key = i + "";
//			if(map.containsKey(key))
//				map.put(key, map.get(key) + 1);
//			else
//				map.put(key,1);
//		}
//		
//		for(Map.Entry<String,Integer> entry : map.entrySet()){
//			System.out.println(entry.getKey() + "\t" + entry.getValue());
//			
//			
//		}
	
	}

}
