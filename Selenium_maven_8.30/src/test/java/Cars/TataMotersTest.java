package Cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TataMotersTest 
{
	@Test(groups = "smoke")
	public void launch()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tatamotors.com/");
		Reporter.log("tata motors launched",true);
	}
	
}
