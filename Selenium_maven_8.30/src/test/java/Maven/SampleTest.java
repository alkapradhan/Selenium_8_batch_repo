package Maven;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest
{
	@Test
public void test()
{
		Reporter.log("SampleTest class executated",true);
	        Reporter.log("SampleTest class delete",true);
	        Reporter.log("SampleTest class added",true); 
	        Reporter.log("SampleTest class modified",true);  
}
}
