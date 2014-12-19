package format;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import domain.ConstantDomain;
import domain.DateDomain;
import domain.RandomWeightDomain;
import domain.TimeBaseKeyDomain;

public class SmsLogFormat extends LogFormatImpl{
	private List<LogField> fields;

	public SmsLogFormat(){
		fields = new ArrayList<>();
		setFields();
	}
	//http://rogerdudler.github.io/git-guide/index.ko.html
	
	private void setFields(){
		fields.add(new LogField("SEQ_ID",   new TimeBaseKeyDomain(new SimpleDateFormat("yyyyMMddHHmmssSSS"), 8)));	
		fields.add(new LogField("LOG_TIME",  new DateDomain(new SimpleDateFormat("yyyyMMddHHmmssSSS"))));	
		fields.add(new LogField("LOG_TYPE",  new ConstantDomain("SVC")));	
		fields.add(new LogField("SID",  new ConstantDomain("")));	
		fields.add(new LogField("RESULT_CODE",  new ConstantDomain("200000000")));	
		fields.add(new LogField("REQ_TIME",  new ConstantDomain("a")));	
		fields.add(new LogField("RSP_TIME",  new ConstantDomain("a")));	
		fields.add(new LogField("CLIENT_IP",  new ConstantDomain("a")));	
		fields.add(new LogField("DEV_INFO",  new ConstantDomain("a")));	
		fields.add(new LogField("OS_INFO",  new ConstantDomain("a")));	
		fields.add(new LogField("NW_INFO",  new ConstantDomain("a")));	
		fields.add(new LogField("SVC_NAME",  new ConstantDomain("SMSGW")));	
		fields.add(new LogField("DEV_MODEL",  new ConstantDomain("")));	
		
		Map<String, Integer> params = new HashMap<String, Integer> ();
		params.put("s", 5);
		params.put("k", 3);
		params.put("l", 2);
		fields.add(new LogField("CARRIER_TYPE",  new RandomWeightDomain(params)));	
		fields.add(new LogField("CID",  new ConstantDomain("a")));	
		fields.add(new LogField("CID_TYPE",  new ConstantDomain("a")));	
		fields.add(new LogField("MSG_TYPE",  new ConstantDomain("a")));	
		fields.add(new LogField("CALLER_CTN",  new ConstantDomain("a")));	
		fields.add(new LogField("CALLED_CTN",  new ConstantDomain("a")));	
		fields.add(new LogField("CALLBACK_CTN",  new ConstantDomain("a")));	
		fields.add(new LogField("RECEIVE_TIME",  new ConstantDomain("a")));	
		fields.add(new LogField("SEND_TIME",  new ConstantDomain("a")));	
		fields.add(new LogField("DONE_TIME",  new ConstantDomain("a")));	
		fields.add(new LogField("ERROR_CODE",  new ConstantDomain("a")));	
		fields.add(new LogField("RESULT_MSG",  new ConstantDomain("a")));	
		fields.add(new LogField("BILL_ACNT_NO",  new ConstantDomain("a")));	
		fields.add(new LogField("ACE_NO",  new ConstantDomain("a")));	
		fields.add(new LogField("SPAM_FLAG",  new ConstantDomain("a")));	
	}
	
	@Override
	protected  List<LogField> getFields(){
		
		return fields;
	}
}





