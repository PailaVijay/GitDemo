package resource;



import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterVJ {
	static ExtentReports extent;

	public static ExtentReports getReport()
	{
		String path=System.getProperty("user.dir")+ "\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Result");
		reporter.config().setDocumentTitle("Test Result");
		
	    extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("tester", "vijay");
		return extent;
				
	}
}
