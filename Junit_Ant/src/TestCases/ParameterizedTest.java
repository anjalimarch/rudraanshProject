package TestCases;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTest {

	public String userName;
	public String passWord;
	public int pin;

	public ParameterizedTest(String username, String password, int pin) {
		this.userName = username;
		this.passWord = password;
		this.pin = pin;

	}
@Parameters
public static  Collection<Object[]> data(){
	Object[][] data =new Object[3][3];
	
	data[0][0]="anjali";
	data[0][1]="mishra";
	data[0][2]=2028011;
	
	data[1][0]="rudra";
	data[1][1]="Tri";
	data[1][2]=201014;
	
	
	data[2][0]="pochu";
	data[2][1]="Mish";
	data[2][2]=500076;
	
	return Arrays.asList(data);
	
	
}
	@Test
	public void testRegister() {

		System.out.println("-----"+"username-->"+userName+"passWord--->"+passWord+"pin--->"+pin);
		
	}
}
