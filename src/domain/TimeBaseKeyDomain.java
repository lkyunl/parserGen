package domain;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

//시간 기반으로 유일한 값을 반환
public class TimeBaseKeyDomain implements Domain {
	private SimpleDateFormat dateformat;
	private int size;
	private  int lastKey; 
	private  String lastDate;
	private Date baseDate;

	
	public TimeBaseKeyDomain(SimpleDateFormat dateformat, int size, Date baseDate){
		this.dateformat = dateformat;
		this.size = size;
		this.baseDate = baseDate;
		lastKey = 1;
	}
	
	@Deprecated
	public TimeBaseKeyDomain(SimpleDateFormat dateformat, int size){
		this(dateformat, size, new Date());
	}

	@Override
	public String makeValue(Map<String, String> map) {
		String nowDate =  dateformat.format(baseDate);
		
		if(nowDate.equals(lastDate)){
			lastKey++;
		} else{
			lastDate = nowDate;
			lastKey = 1;
		}
		
		String key =  String.format("%0" + size + "d", lastKey);
		return nowDate + key;
	}

}
