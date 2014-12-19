package domain;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class RandomWeightDomainTest {

	@Test
	public void randomTest(){
		Map<String, Integer> params  = new HashMap<String, Integer>();
		params.put("s", 5);
		params.put("k", 3);
		params.put("l",  2);
		
		RandomWeightDomain domain = new RandomWeightDomain(params);
		
		int n = 0;
		int s = 0;
		int k = 0;
		int l = 0;
		int e = 0;
		
		for(int i=0; i< 1000000; i++){
			String r = domain.makeValue();

			if(r == null)
				n++;
			else if(r.equals("s"))
				s++;
			else if(r.equals("k"))
				k++;
			else if(r.equals("l"))
				l++;
			else
				e++;
		}
		System.out.println(s + " "  + k + " " + l + " " + e + " " + n + " ");
	}
}
