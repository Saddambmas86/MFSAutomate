package package1;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfLink extends Thread{
	
public void run(){
	
	//Excel Sheet:	

	ReadExcelData T1=new ReadExcelData("./ProjectLinkSheet/ProjectLinks.xlsx");
	String LinkB2=T1.getData(0, 1, 1);
	String UsernameC2=T1.getData(0, 1, 2);
	String PasswordD2=T1.getData(0, 1, 3);

	System.setProperty("webdriver.chrome.driver","C://Users//Shusain//Desktop//JS//Selenium//Selenium Setup//chromedriver_win32//chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get(LinkB2);
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e4) {
		// TODO Auto-generated catch block
		e4.printStackTrace();
	}
	driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='ContentFrame']")));
	driver.findElement(By.id("UserID")).sendKeys(UsernameC2);
	driver.findElement(By.id("userpw")).sendKeys(PasswordD2);
	driver.findElement(By.id("cmdLogin")).click();
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e3) {
		// TODO Auto-generated catch block
		e3.printStackTrace();
	}
	try{
	if(driver.findElement(By.id("cmdOK")).isDisplayed()){
		driver.findElement(By.id("cmdOK")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("chkAgreement")).click();	
	}
	}
	catch(Exception N2){
		driver.findElement(By.id("chkAgreement")).click();
	}

	driver.findElement(By.id("cmdsave")).click();
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	driver.findElement(By.xpath("html/body/div[2]/div/div[3]/table/tbody/tr[1]/td[1]/a")).click();
	driver.findElement(By.id("cmdNext")).click();

	Random RanNumber=new Random();

	//Importance Rating Next button
	try{
	//Questionnaire:	
	for(int j=1;j<=200;j++){
	int min=1;
	int max=5;
	int Z=min+ RanNumber.nextInt(max);
	String B="i"+j;	
	String A="//input[@name='"+B+"'][@value='"+Z+"']";

	try{
	boolean C=driver.findElement(By.xpath(A)).isDisplayed();
	if(C==true){
	driver.findElement(By.xpath(A)).click();
	Thread.sleep(1000);
	}
	}
	catch(Exception E){
	driver.findElement(By.id("cmdNext")).click();	
	Thread.sleep(4000);
	}
	finally{
	driver.findElement(By.xpath(A)).click();
	}
	}
	}


	//After Importance Rating Page:
	catch(Exception X1){
		try{
			WebElement A1=driver.findElement(By.id("cmdNext"));
			if(A1.isDisplayed()){
				A1.click();
			}
			}catch(Exception N2){
				driver.findElement(By.id("cmdSend")).click();
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.quit();
			}

	try {
		Thread.sleep(4000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	//Importance Rating Page Questions	

	for(int j=1;j<=200;j++){
	int min=1;
	int max=5;
	int Z=min+ RanNumber.nextInt(max);
	String B="i"+j;	
	String A="//input[@name='"+B+"'][@value='"+Z+"']";
	try{
	boolean C=driver.findElement(By.xpath(A)).isDisplayed();
	if(C==true){
	driver.findElement(By.xpath(A)).click();
	Thread.sleep(2000);
	}
	}
	catch(Exception E){
	driver.findElement(By.id("cmdNext")).click();	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.id("cmdSend")).click();
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.quit();
	
	}
	finally{
	driver.findElement(By.xpath(A)).click();
	}
	}
	}
	driver.switchTo().defaultContent();
	driver.close();

	}
	
	
	
}
	
