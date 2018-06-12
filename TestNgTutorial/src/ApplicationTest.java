import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ApplicationTest {
	@BeforeTest
	public void beforeTest() {

		System.out.println("before executing testcases");
	}

	@AfterTest
	public void afterTest() {

		System.out.println("After executing testcases");
	}

	@Test(priority = 1)
	public void dologinTest() {

		System.out.println("Login Test Execution");

	}

	@Test(priority = 2)
	public void doPasswordChangeTest() {

		System.out.println("do Password Change");
	}

	@Test(priority = 3)
	public void logOutTest() {

		System.out.println("Log out ");
	}
	@BeforeMethod
	public void beforemethod(){
		
		System.out.println("--BeforMethod--");
	}
	@AfterMethod
	public void afterMethod(){
		
		
		System.out.println("--after method--");
	}
}
