package gen;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import format.SmsLogFormat;

public class _Generator {
	
	public static void main(String[] args) {
		
		final int speed ;//= 1000;
		if(args.length == 1)
			speed = Integer.parseInt(args[0]);
		else 
			speed = 1000;

		Random rand = new Random();
		rand.nextGaussian();

		System.out.println("초당 로그 생성 속도 : " + speed + "건/sec");
	
		LogGenerator gen = new DelimLogGenerator(new SmsLogFormat(), "|", false,  "=", true);
		
		final GeneratorFileOutput helper = new GeneratorFileOutput(gen, "d:\\test_gen.txt");
		
		Timer timer = new Timer();
		
		timer.scheduleAtFixedRate(new TimerTask(){
			@Override
			public void run(){
				helper.write(speed);
			}
		}, 0, 1000);
	}

	
	public static Date getDate(int year, int month, int date, int hour, int minute, int second) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, date, hour, minute, second);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}
	

}

	
		
	
	
	
	
	
	
//	private static int getPoissonRandom(double mean) {
//	    Random r = new Random();
//	    double L = Math.exp(-mean);
//	    int k = 0;
//	    double p = 1.0;
//	    do {
//	        p = p * r.nextDouble();
//	        k++;
//	    } while (p > L);
//	    return k - 1;
//	}
//	
//	public static int getBinomial(int n, double p) {
//		  int x = 0;
//		  for(int i = 0; i < n; i++) {
//		    if(Math.random() < p)
//		      x++;
//		  }
//		  return x;
//	}
//	
//	 
//    public static Connection createConnection() throws IOException, ClassNotFoundException, SQLException {
//    	 Class.forName("org.mariadb.jdbc.Driver");  
//         Connection connection = DriverManager.getConnection(  
//                 "jdbc:mariadb://localhost:3307/bizmsg", "root", "araqne");  
//        return connection;
//    }

