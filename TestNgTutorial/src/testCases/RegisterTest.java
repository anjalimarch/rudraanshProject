package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest {

	@Test
	public void registerTest(){
		
		String expectedTitle="xxxxxxx";
		String actualTitle="yyyyyyy";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	
	
	
	
	
	
	
	
}
