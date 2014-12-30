package domain;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class DateDomain implements Domain {

	private SimpleDateFormat dateformat;
	private Date baseDate;
	
	//yyyy-MM-dd HH:mm:ss.SSS
	@Deprecated
	public DateDomain(SimpleDateFormat dateformat){
		this(dateformat, new Date());
	}

	public DateDomain(SimpleDateFormat dateformat, Date baseDate){
		this.dateformat = dateformat;
		this.baseDate = baseDate;
	}
	
	@Override
	public String makeValue(Map<String, String> map) {
		return dateformat.format(baseDate);
	}
}
