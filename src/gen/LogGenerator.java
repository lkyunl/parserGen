package gen;

import java.util.List;

public interface LogGenerator {
	String getLogLine();
	List<String> getLogLines(int count);
}
