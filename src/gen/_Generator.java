package gen;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Random;

public class _Generator {
	private final static String createTable = "select * from example2";
	
	public static void main(String[] args) {
		int speed = 10000;
		
		for(int i = 0; i < 100; i++)
			System.out.println(getBinomial(10, 0.5));
		
		if(args.length  == 1)
			speed = Integer.parseInt(args[0]);
		
		System.out.println("초당 로그 생성 속도 : " + speed + "건/sec");
		
		   try {
	            Statement statement = createConnection().createStatement();
	            ResultSet rs = statement.executeQuery(createTable);
	                
	          //  ResultSet rs = st.executeQuery(query);
	            
	            // iterate through the java resultset
	            while (rs.next())
	            {
	              int id = rs.getInt("id");
	              String firstName = rs.getString("first_name");
	              String lastName = rs.getString("last_name");
	              Date dateCreated = rs.getDate("date_created");
	              boolean isAdmin = rs.getBoolean("is_admin");
	              int numPoints = rs.getInt("num_points");
	               
	              // print the results
	              System.out.format("%s, %s, %s, %s, %s, %s\n", id, firstName, lastName, dateCreated, isAdmin, numPoints);
	            }
	            
	            statement.close();
	            
		   }  catch (Exception ex) {
	            ex.printStackTrace();
	        }
		   
		   System.out.println("end");
	
	}
	
	private static int getPoissonRandom(double mean) {
	    Random r = new Random();
	    double L = Math.exp(-mean);
	    int k = 0;
	    double p = 1.0;
	    do {
	        p = p * r.nextDouble();
	        k++;
	    } while (p > L);
	    return k - 1;
	}
	
	public static int getBinomial(int n, double p) {
		  int x = 0;
		  for(int i = 0; i < n; i++) {
		    if(Math.random() < p)
		      x++;
		  }
		  return x;
	}
	
	 
    public static Connection createConnection() throws IOException, ClassNotFoundException, SQLException {
    	 Class.forName("org.mariadb.jdbc.Driver");  
         Connection connection = DriverManager.getConnection(  
                 "jdbc:mariadb://localhost:3307/bizmsg", "root", "araqne");  
        return connection;
    }
}
