package domain;

import java.util.Map;
import java.util.Random;


public class CidDomain implements Domain {

	private static String[] KT = { "01015551001", "01015551002", "01015551003", "01015551004", "01015551005", 
		"01015552001", "01015552002", "01015552003", "01015552004", "01015552005"};
	private static String[] DOW = {"01115553001", "01115553002", "01115553003", "01115553004", "01115553005",
		"01115554001", "01115554002", "01115554003", "01115554004", "01115554005" };
	private static String[] Standard= {"01015445001", "01015445002", "01015445003", "01015445004", "01015445005",
		"01015446001","01015446002","01015446003","01015446004","01015446005"};
	private static String[] SKNet = {"01615417001", "01615417002", "01615417003", "01615417004", "01615417005",
		"01615418001", "01615418002" , "01615418003" , "01615418004" , "01615418005"};
	private static String[] SKBroad = {"01715889001", "01715889002","01715889003", "01715889004", "01715889005", 
		"01715889006", "01715889007", "01715889008", "01715889009", "01715889000"};
	private static String[] InfoBank = {"01813330000", "01813330001", "01813330002" ,"01813330003" , "01813330004",
		"01813330005", "01813330006", "01813330007", "01813330008", "01813330009"};
	private static String[] SKTel = {"01916413000", "01916413001", "01916413002", "01916413003", "01916413004",
		"01916413005", "01916413006", "01916413007", "01916413008", "01916413009"};

	private Random random = new Random();
	
	public CidDomain(){
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
