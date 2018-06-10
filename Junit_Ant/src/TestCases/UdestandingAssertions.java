package TestCases;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import junit.framework.Assert;

public class UdestandingAssertions {
	@Rule
	public ErrorCollector errorCollector = new ErrorCollector();

	@SuppressWarnings("deprecation")
	@Test
	public void testFrienslistInFacebookAccount() {

		int actual_totalFriends = 100;
		int expected_totalFriends = 101;
		/*
		 * if(actual_totalFriends==expected_totalFriends){
		 * System.out.println("Pass"); }else{ System.out.println("Fail");
		 * 
		 * }
		 */

		try {
			Assert.assertEquals(expected_totalFriends, actual_totalFriends);
		} catch (Throwable t) {
			// TODO: handle exception
			errorCollector.addError(t);
			
		}
System.out.println("B");
	}

}
