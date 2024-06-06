package extendreport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReport 
{
	@Test
	public void report()
	{
		ExtentSparkReporter  spark=new ExtentSparkReporter("./HTML_reports/extentReport.html");
		
		ExtentReports extReport=new ExtentReports();
		extReport.attachReporter(spark);
		ExtentTest test=extReport.createTest("report");
		test.log(Status.PASS,"log message added into extent reports");
		extReport.flush();
	}

}
