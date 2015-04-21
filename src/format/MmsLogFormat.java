package format;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import domain.ConstantDomain;
import domain.CtnDomain;
import domain.DateDomain;
import domain.MmsCidDomain;
import domain.RandomWeightDomain;
import domain.ReceiveTimeDomain;
import domain.ReferenceSubStringDomain;
import domain.TimeBaseKeyDomain;
import domain.VasidDomain;

public class MmsLogFormat extends LogFormatImpl{
	private List<LogField> fields;
	private Date baseDate;

	@Deprecated
	public MmsLogFormat(){
		this(new Date());
	}
	
	
	public MmsLogFormat(Date baseDate){
		this.baseDate = baseDate;
		fields = new ArrayList<>();
		setFields();
	}
	private void setFields(){
		fields.add(new LogField("SEQ_ID",   new TimeBaseKeyDomain(new SimpleDateFormat("yyyyMMddHHmmssSSS"), 8, baseDate)));	
		fields.add(new LogField("LOG_TIME",  new DateDomain(new SimpleDateFormat("yyyyMMddHHmmss"), baseDate)));	
		fields.add(new LogField("LOG_TYPE",  new ConstantDomain("SVC")));	
	
		fields.add(new LogField("SID",  new CtnDomain()));	
		fields.add(new LogField("RESULT_CODE",  new ConstantDomain("200000000")));	
		fields.add(new LogField("REQ_TIME",  new DateDomain(new SimpleDateFormat("yyyyMMddHHmmssSSS"), baseDate)));	
		fields.add(new LogField("RSP_TIME",  new DateDomain(new SimpleDateFormat("yyyyMMddHHmmssSSS"), baseDate)));	
		fields.add(new LogField("CLIENT_IP",  new ConstantDomain("")));	
		fields.add(new LogField("DEV_INFO",  new ConstantDomain("CP")));	
		fields.add(new LogField("OS_INFO",  new ConstantDomain("")));	
		fields.add(new LogField("NW_INFO",  new ConstantDomain("")));	
		fields.add(new LogField("SVC_NAME",  new ConstantDomain("SMSGW")));	
		fields.add(new LogField("DEV_MODEL",  new ConstantDomain("")));	
		
		Map<String, Integer> params = new HashMap<String, Integer> ();
		params.put("s", 5);
		params.put("k", 3);
		params.put("l", 2);
		fields.add(new LogField("CARRIER_TYPE",  new RandomWeightDomain(params)));	

		fields.add(new LogField("SVR_ID",  new ConstantDomain("21")));	
		
		fields.add(new LogField("VASID", new  VasidDomain()));	
		fields.add(new LogField("VASID_TYPE",  new ConstantDomain("Y")));	
		
		Map<String, Integer> msgType = new HashMap<String, Integer> ();
		msgType.put("SUBMIT", 7);
		msgType.put("REPORT", 3);
		fields.add(new LogField("MSG_TYPE",  new RandomWeightDomain(msgType)));	
		
		fields.add(new LogField("MSG_ID",  new ReferenceSubStringDomain("SEQ_ID", 17, 25)));	
		fields.add(new LogField("CALLER_CTN",  new MmsCidDomain()));	 
		fields.add(new LogField("CALLED_CTN",  new ReferenceSubStringDomain("SID")));	
		fields.add(new LogField("CALLBACK_CTN",  new ReferenceSubStringDomain("CALLER_CTN")));	
		fields.add(new LogField("RECEIVE_TIME",  new ReceiveTimeDomain(baseDate)));	
		fields.add(new LogField("SEND_TIME",   new DateDomain(new SimpleDateFormat("yyyyMMddHHmmssSSS"), baseDate)));	
		fields.add(new LogField("DONE_TIME",  new DateDomain(new SimpleDateFormat("yyyyMMddHHmmssSSS"), baseDate)));	

		
		Map<String, Integer> errCode = new HashMap<String, Integer> ();
		errCode.put("1000", 97);
		errCode.put("6000", 3);
		fields.add(new LogField("ERROR_CODE",  new RandomWeightDomain(errCode)));	
		
		fields.add(new LogField("RESULT_MSG",  new ConstantDomain("E_SEND : sending message is succeed.")));	
		
	
		Map<String, Integer> txtcnt = new HashMap<String, Integer> ();
		txtcnt.put("0", 1);
		txtcnt.put("1", 999);
		//txtcnt.put("2", 5);
		//txtcnt.put("3", 2);
		//txtcnt.put("4", 1);
		fields.add(new LogField("TXTcnt",  new RandomWeightDomain(txtcnt)));	
		
		Map<String, Integer> imgcnt = new HashMap<String, Integer> ();
		imgcnt.put("0", 40);
		imgcnt.put("1", 20);
		imgcnt.put("2", 10);
		imgcnt.put("3", 5);
		imgcnt.put("4", 1);
		fields.add(new LogField("IMGcnt",  new RandomWeightDomain(imgcnt)));	
		
		Map<String, Integer> audiocnt = new HashMap<String, Integer> ();
		audiocnt.put("0", 98);
		audiocnt.put("1", 1);
		audiocnt.put("2", 1);
		fields.add(new LogField("AUDIOcnt",  new RandomWeightDomain(audiocnt)));	
		
		Map<String, Integer> videocnt = new HashMap<String, Integer> ();
		videocnt.put("0", 90);
		videocnt.put("1", 8);
		videocnt.put("2", 2);
		fields.add(new LogField("VIDEOcnt",  new RandomWeightDomain(videocnt)));	
		
		fields.add(new LogField("TOT_MSG_SIZE",  new ConstantDomain("1660")));	
		fields.add(new LogField("BILL_ACNT_NO",  new ConstantDomain("")));	
		fields.add(new LogField("ACE_NO",  new ConstantDomain("")));	
		
		Map<String, Integer> spamParams = new HashMap<String, Integer> ();
		spamParams.put("Y", 99);
		spamParams.put("N", 1);
		fields.add(new LogField("SPAM_FLAG",  new RandomWeightDomain(spamParams)));	
	}
	
	@Override
	protected  List<LogField> getFields(){
		
		return fields;
	}
	
	
}





