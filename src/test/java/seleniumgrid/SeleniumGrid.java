package seleniumgrid;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SeleniumGrid {

	//@Test
	public void testTest() throws URISyntaxException, MalformedURLException, InterruptedException
	{
		URL url=new URL("http://192.168.226.1:5555/wd/hub");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		Thread.sleep(2000);
		Reporter.log("chrome");
		RemoteWebDriver  driver=new RemoteWebDriver(url,cap);
		driver.get("https://googlechromelabs.github.io/chrome-for-testing/#stable");
		
	}
}
