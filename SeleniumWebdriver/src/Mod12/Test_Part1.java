package Mod12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_Part1 {
	public static String browserNamemozilla = "Mozilla";
	public static String browserNameChrome = "Chrome";

	public static String Url = "https://mail.rediff.com/cgi-bin/login.cgi";

	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		openBrowser(browserNameChrome);
	}

	public static void openBrowser(String browsertorun) {

		if (browsertorun.equals(browserNamemozilla)) {
			System.setProperty("webdriver.gecko.driver", "D:\\SeleniumThreeJars\\GeckoDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browsertorun.equals(browserNameChrome)) {

			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumThreeJars\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();

		} /*
			 * else if(browsertorun.equals(browserName)){
			 * 
			 * System.setProperty("webdriver.gecko.driver",
			 * "D:\\SeleniumThreeJars\\GeckoDriver\\geckodriver.exe");
			 * driver=new InternetExplorerDriver();
			 * 
			 * }
			 */
		driver.get(Url);
		System.out.println("Title of the page ---" + driver.getTitle());
	 driver.findElement(By.id("login1")).sendKeys("nameanjali");;
	//	int xLocation = userName.getLocation().x;
		//int yLocation = userName.getLocation().y;

	//	System.out.println("XCoordinate--" + xLocation + "YCoordinate--" + yLocation);
		driver.quit();

	}

}
