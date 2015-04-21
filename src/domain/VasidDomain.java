package domain;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;


public class VasidDomain implements Domain {
	private static Random random = new Random();
	
	private static String[] KT = { "KTS2P1", "KTS2P2", "KTS2P3", "KTS2P4", "KTS2P5",
		"KTS2P6", "KTNEW1", "KTNEW2", "KTNEW3"};
	private static String[] SKNet = {"SKNETWORKS1", "SKNETWORKS2", "SKNETWORKS3", "SKNETWORKS4", "SKNETWORKS5",
		"SKNETWORKS6", "SKNETWORKS7", "SKNETWORKS8", "SKNETWORKS9", "SKNETWORKS10", 
		"SKNETWORKS11" };
	private static String[] Standard= {"ARREOS2P1 ARREO2" };
	private static String[] DOW = {"DAOU1", "DAOU2", "DAOU3", "DAOU4", "DAOU5",
		"DAOU6", "DAOU11", "DAOU12"};
	private static String[] Uplus = {"LGDACOM4", "LGDACOM5", "LGDACOM6", "LGDACOM7", "LGDACOM8",
		"LGDACOM9", "CSBSMSGS2P", "GIFTU", "GIFTUC2P", "LAONMCC2P1",
		"LGTMOBILE" };
	
	private static List<Integer>  weights = new LinkedList<Integer> ();
	
	static {
		for(int i = 0; i < 50; i++){
		weights.add(random.nextInt(100));
		}
	}
	
	public VasidDomain(){
		//TODO 업체별로 선택가능하게
	}

	@Override
	public String makeValue(Map<String, String> map) {
		int company = random.nextInt(100);

		if(company < 40)
			return pick(KT);
		else if(company < 60)
			return pick(SKNet);
		else if(company < 75)
			return pick(Standard);
		else if(company < 90)
			return pick(DOW);
		else 
			return pick(Uplus);
	}
	
	private String pick(String[] company){
		if(company == null || company.length == 0)
			return "";

		int sumWeight = 0;
		for(int i = 0; i < company.length; i ++){
			sumWeight += weights.get(i);
		}

		int rand = random.nextInt(sumWeight);
		for(int i = 0; i < company.length; i ++){
			if((rand -=  weights.get(i))  <= 0)
				return company[i];
		}
		return "";
	}

}
