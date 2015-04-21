package generator;

import java.util.LinkedHashMap;
import java.util.Map;

import format.LogFormat;

public class DelimLogGenerator extends LogGeneratorImpl{
	private String keyDelim;
	private String fieldDelim;
	private boolean includeKey;
	private boolean includeLastDelim;

	public DelimLogGenerator(LogFormat format, String fieldDelim, boolean includeLastDelim){
		this(format, fieldDelim, false, "", false);
	}
	
	public DelimLogGenerator(LogFormat format, String fieldDelim, boolean includeLastDelim, String keyDelim, boolean includeKey ){
		super(format);
		this.keyDelim = keyDelim;
		this.fieldDelim = fieldDelim;
		this.includeKey = includeKey; //key를 포함 여부
		this.includeLastDelim = includeLastDelim; //마지막에 필드 구분자를 포함 여부
	}

	@Override
	protected String concatLog(LinkedHashMap<String, String> chunks) {
		StringBuilder sb = new StringBuilder();
		boolean flag = true;
		
		for( Map.Entry<String, String> entry: chunks.entrySet()){
			if(flag) 
				flag = false;
			else
				sb.append(fieldDelim);
			
			if(includeKey){
				sb.append(entry.getKey());
				sb.append(keyDelim);
			}
			sb.append(entry.getValue());
		}
	
		if(includeLastDelim)
			sb.append(fieldDelim);
		
		return sb.toString();
	}
}
