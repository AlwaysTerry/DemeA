package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestGoogleOps {

	@Test
	public void visintGoogle(){
		WebDriver ff = new FirefoxDriver();
		ff.get("http://www.google.com");
	}
}
