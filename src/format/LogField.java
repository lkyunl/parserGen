package format;

import java.util.Map;

import domain.Domain;


public class LogField {

	private String name;
	private Domain domain;

	public LogField(String name, Domain domain){
		this.name = name;
		this.domain = domain;
	}

	public String getName(){
		return name;
	}
	
	public String getValue(Map<String, String> map){
		return domain.makeValue(map);
	}
}
