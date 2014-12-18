package domain;

/* »ó¼ö°ª*/
public class ConstantDomain implements Domain {
	private String value;
	
	public ConstantDomain(String s){
		this.value = s;
	}
	
	public String makeValue(){
		return value;
	}
}
