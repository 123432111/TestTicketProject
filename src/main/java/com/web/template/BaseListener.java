package com.web.template;

import org.testng.*;

/*
 * This Class provide Actions if something happened in Test Classes
 * (PASS-FAIL-Broken)
 */
public class BaseListener implements ITestListener, IInvokedMethodListener {

	/* Methods of Interface 'ITestListener' */
	@Override
	public void onTestStart(ITestResult result) {
	}

	@Override
	public void onTestSuccess(ITestResult result) {

	}

	@Override
	public void onTestFailure(ITestResult result) {

	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
	}

	@Override
	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
	}

	@Override
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
	}
}
