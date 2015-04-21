package domain;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;


public class CidDomain implements Domain {
	private static Random random = new Random();

	private static String[] KT = { "0190003200", "0190003201", "0190003209", "0190003210", "0190003211", 
		"0190003212", "0190003152", "0190003153", "0190003154", "0190003155",
		"0190003156", "0190003157", "0190003158", "0190003159", "0190003160",
		"0190003161", "0190003102"};
	private static String[] DOW = {"0190003162", "0190003163", "0190003164", "0190003165", "0190003166", 
		"0190003167", "0190003168", "0190003169", "0190003170", "0190003171",
		"0190003172", "0190003173", "0190003174", "0190003224", "0190003225" };
	private static String[] Standard= {"0190005122", "0190005123", "0190005124", "0190005125", "0190005126",
		"0190005127", "0190005128", "0190005129", "0190005130", "0190005131", 
		"0190005132" };
	private static String[] SKNet = {"0190003137", "0190003138", "0190003139", "0190003140", "0190003141",
		"0190003142", "0190003143", "0190003202", "0190003203", "0190003204", "0190003205"};
	private static String[] SKBroad = {"0190003175", "0190003176", "0190003177", "0190003178", "0190003179", 
		"0190003180", "0190003181", "0190003182", "0190003183", "0190003184"};
	private static String[] InfoBank = {"0190001006", "0190001195", "0190001339", "0190001706", "0190001707", 
		"0190001716", "0190001832", "0190001833", "0190001735", "0190001793", 
		"0190001794", "0190001860"};
	private static String[] SKTel = {"0190001388", "0190001681", "0190001682", "0190001687", "0190001688", 
		"0190001811", "0190001812", "0190001827", "0190001828", "0190001829", "0190001830"};

	private static List<Integer>  weights = new LinkedList<Integer> ();
	
	static {
		for(int i = 0; i < 50; i++){
		weights.add(random.nextInt(100));
		}
	}
	
	public CidDomain(){
		//TODO 업체별로 선택가능하게
	}

	@Override
	public String makeValue(Map<String, String> map) {
		int company = random.nextInt(100);

		if(company < 30)
			return pick(KT);
		else if(company < 50)
			return pick(DOW);
		else if(company < 65)
			return pick(Standard);
		else if(company < 80)
			return pick(SKNet);
		else if(company < 88)
			return pick(SKBroad);
		else if(company < 95)
			return pick(InfoBank);
		else 
			return pick(SKTel);
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
