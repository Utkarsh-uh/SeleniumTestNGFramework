package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {

	private static ExtentReports extent;

	public static ExtentReports extentReportGenerator() {
		String path = System.getProperty("user.dir") + "\\reports\\StockScriptinglogicreport.html";
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);

		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("Stock Scriptinglogic report");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project name", "Stock Scriptinglogic");
		extent.setSystemInfo("Executed by", "Utkarsh Haste");
		extent.setSystemInfo("Enviornment used", "Staging");
		return extent;

	}

}
