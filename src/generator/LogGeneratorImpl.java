package generator;

import java.util.LinkedHashMap;

import format.LogFormat;

public  abstract class LogGeneratorImpl implements LogGenerator{

	private LogFormat format;

	protected LogGeneratorImpl(LogFormat format){
		this.format = format;
	}
	
	protected abstract String concatLog(LinkedHashMap<String, String> chunks);

	@Override
	public String getLogLine() {
		LinkedHashMap<String, String> chunks = format.log();
		if(chunks == null)
			return "";
		
		return concatLog(chunks);
	}

}
