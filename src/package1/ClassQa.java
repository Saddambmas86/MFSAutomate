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
	
@Test	
public void show(){
	System.out.println("QA Test");
}
	
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
