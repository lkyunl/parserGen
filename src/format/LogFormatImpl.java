package format;

import java.util.LinkedHashMap;
import java.util.List;

public abstract class LogFormatImpl implements LogFormat {

	protected  abstract List<LogField> getFields();
	
	@Override
	public LinkedHashMap<String, String> log() {
		LinkedHashMap<String, String> log = new LinkedHashMap<>();
		for(LogField field :  getFields())
			log.put(field.getName(), field.getValue(log));

		return log;
	}

	@Override
	public List<LinkedHashMap<String, String>> logs(int count) {
		return null;
//		List<LinkedHashMap<String, String>> logs = new ArrayList<>();
//		//getValue("name", 1000);
//		//getValue("name", 1000);
//		
////		for(int i=0; i <count; i++){
////			LinkedHashMap<String, String> log = new LinkedHashMap<>();
////			for(String name :  fieldNames)
////				log.put(name, getValue(name));
////		}
//		return logs;
	}
		
}
