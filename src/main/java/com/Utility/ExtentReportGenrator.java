package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {

	//ExtentSparkReporter -
	//ExtentReports
	public static ExtentReports extent;
	public static ExtentReports getReports() {
		
		String reportpath="C:\\Users\\Dell\\eclipse-workspace\\Batch_10_Framework\\Reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(reportpath);
		reporter.config().setDocumentTitle("Batch_10_Reports");
		reporter.config().setReportName("Automation Test Reports");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project Name", "ABC project");
		extent.setSystemInfo("QA", "xyz");
		return extent;
		
		
	}
	
	
}
