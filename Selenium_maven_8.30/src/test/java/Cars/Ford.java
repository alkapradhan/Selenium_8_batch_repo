package Cars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ford 
{
	@Test(groups = "smoke")
	public static void main(String[] args) 
	{
         WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.ford.com/");
		Reporter.log("ford launched successfully",true);
	}

}
