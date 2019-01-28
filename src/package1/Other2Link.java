package package1;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Other2Link {

@Test	
public void run7(){
		
		//Excel Sheet:	

		ReadExcelData T1=new ReadExcelData(".//ProjectLinkSheet//ProjectLinks.xlsx");
		String LinkB2=T1.getData(0, 8, 1);
		String UsernameC2=T1.getData(0, 8, 2);
		String PasswordD2=T1.getData(0, 8, 3);

		int SCR=01;
		int SCR2=01;
		

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(LinkB2);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='ContentFrame']")));
		ScreenShot.screenshotQA(driver, "1. Login","Other2");
		driver.findElement(By.id("UserID")).sendKeys(UsernameC2);
		driver.findElement(By.id("userpw")).sendKeys(PasswordD2);
		ScreenShot.screenshotQA(driver, "1. Login","Other2");
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
			ScreenShot.screenshotQA(driver, "2. DataProtection","Other2");
			driver.findElement(By.id("chkAgreement")).click();	
		}
		}
		catch(Exception N2){
			ScreenShot.screenshotQA(driver, "2. DataProtection","Other2");
			driver.findElement(By.id("chkAgreement")).click();
		}

		driver.findElement(By.id("cmdsave")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		ScreenShot.screenshotQA(driver, "3. Assessment Begin","Other2");
		driver.findElement(By.xpath("html/body/div[2]/div/div[3]/table/tbody/tr[1]/td[1]/a")).click();
		ScreenShot.screenshotQA(driver, "4. Intro_Page","Other2");
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
			Thread.sleep(2000);		
		ScreenShot.screenshotQA(driver, "5. Question_"+SCR,"Other2");
		SCR=SCR+1;
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
	driver.close();
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
			if(SCR2==1 || SCR2%4==0){	
				ScreenShot.screenshotQA(driver, "6. Competency description_"+SCR2,"Other2");	
				}
				SCR2=SCR2+1;		
		driver.findElement(By.xpath(A)).click();
		Thread.sleep(2000);
		}
		}
		catch(Exception E){
		ScreenShot.screenshotQA(driver, "6. Last Competency description_","Other2");	
		driver.findElement(By.id("cmdNext")).click();	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("cmdSend")).click();
		
		
		}
		finally{
		driver.findElement(By.xpath(A)).click();
		}
		}
		}
		driver.switchTo().defaultContent();
		driver.close();
		System.out.println("Colleague 1 Link successfully completely");

		}
	
	
	
}
