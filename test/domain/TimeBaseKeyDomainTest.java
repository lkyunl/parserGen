package domain;

import java.text.SimpleDateFormat;

import org.junit.Test;

public class TimeBaseKeyDomainTest {
	
	@Test
	public void basicTest(){
		
		TimeBaseKeyDomain domain = new TimeBaseKeyDomain(new SimpleDateFormat("yyyyMMddHHmmssSSS"), 8);
		
		//for(int i=100; i  < 10000; i++)
		System.out.println(domain.makeValue());
		//System.out.println(domain.makeValue());
	///	System.out.println(domain.makeValue());
	}

}
