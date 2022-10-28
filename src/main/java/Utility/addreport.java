package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class addreport {
	public static ExtentReports Reports() {
		ExtentReports Extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("ExtendReports.html");
		Extent.attachReporter(spark);
		Extent.setSystemInfo("Reported by", "Swati");
		return Extent;

}}

