package com.w2a.listeners;


import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;
import com.w2a.base.Page;
import com.w2a.utilities.Utilities;


public class Listeners extends Page implements ITestListener{

	public void onTestStart(ITestResult arg0) {
		test = report.startTest(arg0.getName().toUpperCase());
		
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Passed test- "+arg0.getName());
		test.log(LogStatus.PASS,arg0.getName().toUpperCase()+"PASS");
		report.endTest(test);
		report.flush();
		
	}

	public void onTestFailure(ITestResult arg0) {
		//Below code to get the screenshot in the index.html file
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		System.out.println("Capturing screenshot for the failed test- "+arg0.getName()); 
		try {
			Utilities.captureScreenshot();
		} catch (IOException e) {
			e.printStackTrace(); 
		}
		test.log(LogStatus.FAIL, arg0.getName().toUpperCase()+" Failed with exception : "+arg0.getThrowable());
		test.log(LogStatus.FAIL, test.addScreenCapture(Utilities.screenshotName));
		
		
		Reporter.log("Click to see Screenshot");
		Reporter.log("<a target=\"_blank\" href="+Utilities.screenshotName+">Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<br>");
		Reporter.log("<a target=\"_blank\" href="+Utilities.screenshotName+"><img src="+Utilities.screenshotName+" height=200 width=200></img></a>");
		report.endTest(test);
		report.flush();
		
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

}
