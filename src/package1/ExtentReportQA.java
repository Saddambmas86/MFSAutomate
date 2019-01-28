package package1;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportQA {
	
public static ExtentHtmlReporter htmlReport;
public static ExtentReports Extent;
public static ExtentTest test;
public static WebDriver driver;

@BeforeSuite
public void setUp(){
htmlReport=new ExtentHtmlReporter("./ExtentReport/Report.html");
Extent=new ExtentReports();
Extent.attachReporter(htmlReport);
}

@AfterMethod
public void result(ITestResult Result)throws Exception{
if(Result.getStatus()==ITestResult.SUCCESS){
test.pass(MarkupHelper.createLabel("This Test case is passed", ExtentColor.GREEN));	
test.pass(Result.getThrowable());
}
else if(Result.getStatus()==ITestResult.FAILURE){
test.fail(MarkupHelper.createLabel("This testcase is failed",ExtentColor.RED));
test.fail(Result.getThrowable());
}
else{
test.skip(MarkupHelper.createLabel("This testcase is Skipped",ExtentColor.ORANGE));
test.skip(Result.getThrowable());	
}
}

@AfterSuite
public void teardown(){
Extent.flush();
driver.close();
	
}


}
