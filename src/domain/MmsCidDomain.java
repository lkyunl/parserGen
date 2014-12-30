package domain;

import java.util.Map;
import java.util.Random;


public class MmsCidDomain implements Domain {

	private static String[] KT = { "01025551001", "01025551002", "01025551003", "01025551004", "01025551005", 
		"01025552001", "01025552002", "01025552003", "01025552004", "01025552005"};
	private static String[] DOW = {"01125553001", "01125553002", "01125553003", "01125553004", "01125553005",
		"01125554001", "01125554002", "01125554003", "01125554004", "01125554005" };
	private static String[] Standard= {"01025445001", "01025445002", "01025445003", "01025445004", "01025445005",
		"01025446001","01025446002","01025446003","01025446004","01025446005"};
	private static String[] SKNet = {"01625417001", "01625417002", "01625417003", "01625417004", "01625417005",
		"01625418001", "01625418002" , "01625418003" , "01625418004" , "01625418005"};
	private static String[] SKBroad = {"01725889001", "01725889002","01725889003", "01725889004", "01725889005", 
		"01725889006", "01725889007", "01725889008", "01725889009", "01725889000"};
	private static String[] InfoBank = {"01823330000", "01823330001", "01823330002" ,"01823330003" , "01823330004",
		"01823330005", "01823330006", "01823330007", "01823330008", "01823330009"};
	private static String[] SKTel = {"01926413000", "01926413001", "01926413002", "01926413003", "01926413004",
		"01926413005", "01926413006", "01926413007", "01926413008", "01926413009"};

	private Random random = new Random();
	
	public MmsCidDomain(){
		//TODO 업체별로 선택가능하게
	}

	@Override
	public String makeValue(Map<String, String> map) {
		int company = random.nextInt(7);
		int phone = random.nextInt(10);
		
		switch(company){
		case 0:
			return KT[phone];
		case 1:
			return DOW[phone];
		case 2:
			return Standard[phone];
		case 3:
			return SKNet[phone];
		case 4:
			return SKBroad[phone];
		case 5:
			return InfoBank[phone];
		case 6:
			return SKTel[phone];
		default:
			return "";
		}
	}

}
