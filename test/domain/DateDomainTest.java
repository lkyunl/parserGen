package domain;

import java.text.SimpleDateFormat;

import org.junit.Test;

public class DateDomainTest {
	
	@Test
	public void basicTest(){
		
		DateDomain domain = new DateDomain(new SimpleDateFormat("yyyyMMddHHmmssSSS"));
		
		System.out.println(domain.makeValue());
		
	}

}
