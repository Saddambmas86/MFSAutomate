package package1;

import java.io.IOException;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ClassQa extends ExtentReportQA{

	
/*public static void show() throws IOException{
System.out.println("Amamzon and Flash");
/*ExtentHtmlReporter htmlReport=new ExtentHtmlReporter("./ExtentReport/Report.html");
ExtentReports Extent=new ExtentReports();
Extent.attachReporter(htmlReport);
test=Extent.createTest("Show Failed");
test.log(Status.INFO, "Login to Google");
test.log(Status.FAIL, "Failed Test");
test.log(Status.FAIL, "Failed Test3434343");
test.log(Status.PASS, "Passed Test");
test.log(Status.SKIP, "Skipped Test");
Extent.flush();
System.out.println("Verified");
ExtentTest test1=Extent.createTest("Show Failed1");
test1.log(Status.INFO, "Login to amazon");
test1.log(Status.FAIL, "2nd Status");
test1.fail("Failed due to", MediaEntityBuilder.createScreenCaptureFromPath("./screenshots/A.png").build());
Extent.flush();
ExtentTest test2=Extent.createTest("Show Failed1");
test2.log(Status.INFO, "Login to amazon2");
test2.log(Status.FAIL, "3rd Status");
Extent.flush();
}
*/
	
@Test
public void Initiate(){
test=Extent.createTest("Initiate Browser");	
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shusain\\Desktop\\JS\\Selenium\\Selenium Setup\\geckodriver-v0.18.0-win32\\geckodriver.exe");
driver=new FirefoxDriver();
test.log(Status.INFO, "Testcase Passed By Me");
driver.get("https://www.google.com/");
test.log(Status.INFO, "Login to Google");
test.log(Status.FAIL, "Failed Test");
test.log(Status.FAIL, "Failed Test3434343");
test.log(Status.PASS, "Passed Test");
test.log(Status.SKIP, "Skipped Test");
}



}
