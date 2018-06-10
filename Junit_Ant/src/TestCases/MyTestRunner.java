package TestCases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	UdestandingAssertions.class,
	FirstTestCase.class,
	sendingEmail.class
	
	})
public class MyTestRunner {

}
