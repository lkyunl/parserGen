package domain;

import java.util.Random;

public class Test {
	
	private static Random rand = new Random();
	
	
	public static void main(String[] args) {
		
		
		for(int i = 0; i < 1000; i++){
			System.out.print("\"010");
			int r = rand.nextInt(100000000);
			
			String no = String.format("%08d", r,0);
			System.out.println(no + "\",");
		}
	
	}
	

}
