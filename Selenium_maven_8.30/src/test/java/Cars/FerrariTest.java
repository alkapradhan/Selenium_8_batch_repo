package Cars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class FerrariTest 
{
	
		@Test(groups="system")
public  void launch() 
		{
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.ferrari.com/en-IN");
		Reporter.log("Ferrari launched successfully",true);
	}

}
