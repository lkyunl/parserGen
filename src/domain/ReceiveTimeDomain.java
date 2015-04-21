package domain;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Random;

//TºÐÆ÷
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
	
		double a = rand.nextGaussian();
		double b = rand.nextGaussian();
		double c = rand.nextGaussian();

		String date = sdf.format(new Date(baseDate.getTime() - Math.round((a*a + b*b + c*c)*2000)));
	
		return date;
	}
}
