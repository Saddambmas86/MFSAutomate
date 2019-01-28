package package1;

import org.testng.annotations.Test;

public class MFSAutomate extends ExtentReportQA{
	
	
@Test	
public void Manager(){
ManagerLink T1=new ManagerLink();
T1.run5();	
System.out.println("Link Completed Successfully");
}

@Test
public void Colleague1(){
Colleague1Link T2=new Colleague1Link();
T2.run1();
System.out.println("Link Completed Successfully");
}

@Test
public void Colleague2(){
Colleague2Link T3=new Colleague2Link();
T3.run2();
System.out.println("Link Completed Successfully");
}

@Test
public void Other1(){
Other1Link T4=new Other1Link();
T4.run6();
System.out.println("Link Completed Successfully");
}

@Test
public void Other2(){
Other2Link T5=new Other2Link();
T5.run7();
System.out.println("Link Completed Successfully");
}

@Test
public void Direct1(){
Direct1Link T6=new Direct1Link();
T6.run3();
System.out.println("Link Completed Successfully");
}

@Test
public void Direct2(){
Direct2Link T7=new Direct2Link();
T7.run4();
System.out.println("Link Completed Successfully");
}






	
}
