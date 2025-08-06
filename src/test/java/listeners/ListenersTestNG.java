package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import java.io.IOException;
import testcases.BaseTest;
import utility.Screenshot;

public class ListenersTestNG extends BaseTest implements ITestListener {

	ExtentReports extent = ExtentReport.extentReportGenerator();

	public static ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {

		System.out.println("Test case :" + result.getMethod().getMethodName() + " has been  started");
		test = extent.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	    String methodName = result.getMethod().getMethodName();
	    System.out.println("Test case: " + methodName + " has passed");
	    test.pass("Test case passed");

	    
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println("Test case: " + methodName + " has failed");
		test.fail(result.getThrowable());

		try {
			String screenshotPath = Screenshot.captureScreenShotWithPath(driver, methodName);
			test.addScreenCaptureFromPath(screenshotPath);
		} catch (IOException e) {
			System.out.println("Screenshot capture failed for " + methodName + ": " + e.getMessage());
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case :" + result.getMethod().getMethodName() + " has been  skipped");
		test.log(Status.SKIP, "Test case got Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test tag " + context.getName() + " has been started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test tag " + context.getName() + " has been finished");
		extent.flush();
	}

}
