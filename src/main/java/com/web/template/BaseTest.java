package com.web.template;

import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

	public String testNgSuiteName;
	public String testNgTestName;

	@BeforeMethod(alwaysRun = true)
	public void tearUp() {
		
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
	}

	@BeforeSuite
	public void startTest(final ITestContext testContext) throws Exception {

		testNgSuiteName = testContext.getCurrentXmlTest().getSuite().getName();
		testNgTestName = testContext.getName();
	}

	@AfterSuite(alwaysRun = true)
	public void afterSuite() {

	}
}
