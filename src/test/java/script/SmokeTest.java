package script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SmokeTest {
	
	WebDriver driver = null;
	
	@BeforeMethod
	public void b(){
		/*driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		driver.manage().window().maximize();*/
	}
	
	@Test
	public void main() {
		
		//driver.navigate().to("http://www.google.com");
System.out.println("Mijan");

	}
	@AfterMethod
	public void a(){
		//driver.close();
	}

}
