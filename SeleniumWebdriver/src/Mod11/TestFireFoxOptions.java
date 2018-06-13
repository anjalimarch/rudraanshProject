package Mod11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class TestFireFoxOptions {

	public static void main(String[] args) {
		// to remove the logs
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "D:\\firefox.log");
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SeleniumThreeJars\\GeckoDriver\\geckodriver.exe");

		// To load the page immediately
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox");
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		ProfilesIni allProfile = new ProfilesIni();
		FirefoxProfile prof = allProfile.getProfile("default");
		//turn off notifications
		
		prof.setPreference("dom.webnotifications.enabled", false);
		
		//Remove certificates error 
		prof.setAcceptUntrustedCertificates(true);
		prof.setAssumeUntrustedCertificateIssuer(false);
		
		//Proxy settings:
		prof.setPreference("network.proxy.type", 1);
		prof.setPreference("network.proxy.http", "localhost");
		prof.setPreference("network.proxy.http_port", 3128);
		
		
		
		
		options.setProfile(prof);
		
		//avoid certificate errors from firefox
		WebDriver driver = new FirefoxDriver(options);
		System.out.println("A");
		driver.get("https://www.flipkart.com/");
		System.out.println("B");
		driver.manage().window().maximize();
		
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// C:\Program Files (x86)\Mozilla Firefox

		// Firefoxprofiling:customized firefox
		// firefox.exe -p profile manager

	}

}
