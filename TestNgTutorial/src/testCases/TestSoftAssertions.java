package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSoftAssertions {


String expectedTitle="xxxxxxx";
String actualTitle="yyyyyyy";

SoftAssert softAssert=new SoftAssert();

@Test
public void doRegisterTest(){
	System.out.println("A");
	//Assert.assertEquals(actualTitle, expectedTitle);
	softAssert.assertEquals(actualTitle, expectedTitle);
	softAssert.assertEquals("a", "c");
	System.out.println("B");
	
	softAssert.assertAll();
}


}
