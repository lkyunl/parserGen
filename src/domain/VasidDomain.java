package domain;

import java.util.Map;
import java.util.Random;


public class VasidDomain implements Domain {

	private String[]  companys = {"kt", "skn", "dow", "std", "msg" };
	
	private Random random = new Random();
	
	public VasidDomain(){
		//TODO ��ü���� ���ð����ϰ�
	}

	@Override
	public String makeValue(Map<String, String> map) {
		String company = companys[random.nextInt(companys.length)];
		int number = random.nextInt(5) + 1;
		
		return company + number + "VASID";
	}

}
