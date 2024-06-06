package Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoApp
{
	@Test
	public void receiveData()
	{
		String URL=System.getProperty("url");
		String EMAIL= System.getProperty("email");
		String PASSWORD=System.getProperty("password");
		System.out.println(URL);
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.id("email")).sendKeys(EMAIL);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.xpath(" //button[@class='login_Btn']")).click();
	}

}
