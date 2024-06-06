package Cars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Lamberghini
{
@Test(groups="system")
	public void launch()
{
     WebDriver driver= new ChromeDriver();
     
     driver.get("https://www.lamborghini.com/en-en");
     Reporter.log("lamberghini launched successfully",true);
		
	}

}
