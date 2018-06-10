package TestCases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class sendingEmail {
	@BeforeClass
	public static void begining(){
		
		System.out.println("**********beginning*******");
		//Assume.assumeTrue(false);
	}
	
	
	@Before
	public void openBrowser(){
		
		System.out.println("opening the browser");
	}
	@Test
	public void sendEmailTest(){
		
		System.out.println("sending email test");
	}
	
	@Test
	public void sendMessageTest(){
		
		System.out.println("sending message test");
	}
	
	@After
	public void closeBrowser(){
		System.out.println("closing the browser");
		
	}
	@AfterClass
	public static void ending(){
		
		System.out.println("********ending*********");
	}

}
