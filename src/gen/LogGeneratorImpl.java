package gen;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

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
//
//	@Override
//	public List<String> getLogLines(int count) {
//		List<LinkedHashMap<String, String>> chunksList = format.logs(count);
//		if(chunksList == null)
//			return null;
//		
//		List<String> logLines = new ArrayList<>();
//		for(LinkedHashMap<String, String> chunks : chunksList)
//			logLines.add(concatLog(chunks));
//		
//		return logLines;
//	}

}
