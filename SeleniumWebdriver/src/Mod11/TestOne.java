package Mod11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","D:\\SeleniumThreeJars\\GeckoDriver\\geckodriver.exe");

WebDriver driver =new FirefoxDriver();
driver.get("https://www.flipkart.com/");

}}
