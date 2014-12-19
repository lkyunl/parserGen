package domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDomain implements Domain {

	private SimpleDateFormat dateformat;
	
	//yyyy-MM-dd HH:mm:ss.SSS
	public DateDomain(SimpleDateFormat dateformat){
		this.dateformat = dateformat;
	}

	@Override
	public String makeValue() {
		return dateformat.format(new Date());
	}
}
