package auto;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import practicetwo.launch.Browsers;
import practicetwo.launch.BrowsersType;

public class TestXXX {

   private WebDriver driver = null;	
	@Test
	public void testBs(){
		Browsers browser = new Browsers(BrowsersType.ie);
		driver = browser.driver;
		
		driver.get("http://www.126.com");
	}
}
