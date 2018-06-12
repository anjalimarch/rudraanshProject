import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestPrarmeterized {

	@Test(dataProvider="passingData")
	public void doLoginTest(String userName,String Password,String Browser) {
System.out.println("userName---"+userName+"Password---"+Password+"Browser----"+Browser);
	}

	@DataProvider
	public Object[][] passingData() {
		Object[][] data = new Object[3][3];

		data[0][0] = "rudransh";
		data[0][1] = "T1";
		data[0][2] = "Mozilla";
		data[1][0] = "Pochu";
		data[1][1] = "T2";
		data[1][2] = "Chrome";
		data[2][0] = "Pochua";
		data[2][1] = "T3";
		data[2][2] = "IE";

		return data;

	}
}
