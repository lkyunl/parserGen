package domain;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Random;

// sendtime과 receivetime은 1초이내, 1%안에 3~4초
public class ReceiveTimeDomain implements Domain {
	private Date baseDate;
	
	public ReceiveTimeDomain(Date baseDate){
		this.baseDate = baseDate;
	}
	
	@Deprecated
	public ReceiveTimeDomain(){
		this(new Date());
	}
	
	@Override
	public String makeValue(Map<String, String> map) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		Random rand = new Random();
	
		int delay = 0;
		if(rand.nextInt(100) == 99)
			delay = 3;
		
	
		long time = rand.nextInt(1000) + delay * 1000;
		
		String date = sdf.format(new Date(baseDate.getTime() - time));
		
		//long rec_time = Long.parseLong(date);
		
		//time = rec_time - time;

	
		return date;//String.valueOf(time);
		
	}
	

	

}
