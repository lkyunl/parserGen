package format;

import java.util.LinkedHashMap;
import java.util.List;

public interface LogFormat{
	public LinkedHashMap<String, String> log();
	public List<LinkedHashMap<String, String>> logs(int count);
	
}
