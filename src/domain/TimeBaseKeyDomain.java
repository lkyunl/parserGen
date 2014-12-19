package domain;

import java.text.SimpleDateFormat;
import java.util.Date;

//시간 기반으로 유일한 값을 반환
public class TimeBaseKeyDomain implements Domain {
	private SimpleDateFormat dateformat;
	private int size;
	private  int lastKey; 
	private  String lastDate;

	
	public TimeBaseKeyDomain(SimpleDateFormat dateformat, int size){
		this.dateformat = dateformat;
		this.size = size;
		lastKey = 1;
	}
	
	@Override
	public String makeValue() {
		String nowDate =  dateformat.format(new Date());
		
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
