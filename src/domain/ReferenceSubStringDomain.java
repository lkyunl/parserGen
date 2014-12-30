package domain;

import java.util.Map;

public class ReferenceSubStringDomain implements Domain {

	private String reference;
	private int start;
	private int end;
	
	public ReferenceSubStringDomain(String name){
		reference = name;
		start = -1;
		end = -1;
	}
	
	public ReferenceSubStringDomain(String name, int s, int e){
		reference = name;
		start = s;
		end = e;
	}
	
	@Override
	public String makeValue(Map<String, String> map) {
		if(!map.containsKey(reference))
			return null;
		
		String name = map.get(reference);
		if(start > 0 && end >0 && end > start)
			return name.substring(start, end);
		else 
			return name;
	}

}
