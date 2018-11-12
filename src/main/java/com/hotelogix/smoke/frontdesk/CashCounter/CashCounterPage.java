package com.hotelogix.smoke.frontdesk.CashCounter;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.hotelogix.smoke.admin.BaseClass.AdmineHome;
import com.hotelogix.smoke.frontdesk.FrontdeskHome.FrontdeskLandingPage;

import com.hotelogix.smoke.genericandbase.GenericMethods;
import com.itextpdf.text.log.SysoCounter;

public class CashCounterPage {



@FindBy(xpath="//table[@class='formtable']//tr[2]/td//h2")
public  WebElement header_Page;

@FindBy(xpath="//input[@id='newCounterYes']")
public  WebElement YesOptionInCounter;

@FindBy(xpath="//select[@id='counter']")
public  WebElement SelectCounterDropdown;

@FindBy(xpath="//input[@name='submit']")
public  WebElement ContinueButton;

@FindBy(xpath="//input[@id='newCounterNo']")
public  WebElement NoOptionInCounter;

@FindBy(xpath="//a[text()='How to Perform Night Audit Video!']")
public  WebElement NightAuditVideo;


@FindBy(xpath="//a[text()='How to use?']")
public  WebElement HowToUseLink;

@FindBy(id="counter")
public  WebElement Counter_DD;


@FindBy(xpath="//a[text()='Admin Console']")
public WebElement Link_AdmineConsole;

@FindBy(xpath="//a[text()='Continue with Trial']")
public  WebElement CountinueWithTrail_BT;





public AdmineHome ClickOnAdmineLink() throws Exception{
GenericMethods.clickElement(Link_AdmineConsole);
AdmineHome AH=PageFactory.initElements(GenericMethods.driver, AdmineHome.class);
return AH;
	
	
}

     


public String verify_pageHeader()
{
    String str=GenericMethods.getText(header_Page);
  
   // Assert.assertEquals(str, "Open New Cash Counter?");
    return str;
}


public FrontdeskLandingPage fn_ClickContinueButton() throws Exception
{

	try
	{
		
	String str=	GenericMethods.driver.getCurrentUrl();
		if(str.contains("home"))
		{
			GenericMethods.clickElement(CountinueWithTrail_BT);
		}
		
	GenericMethods.selectElement(Counter_DD, "Default Counter (Open)");
	GenericMethods.clickElement(ContinueButton);

	FrontdeskLandingPage AHO = PageFactory.initElements(GenericMethods.driver, FrontdeskLandingPage.class);
	return AHO;
	}
	catch(Exception e)
	{
		throw e;
	}
}


public String YesOpenNewCounter() throws Exception
{
	try
	{
	GenericMethods.clickElement(YesOptionInCounter);
	Select s=new Select(SelectCounterDropdown);
	s.selectByIndex(0);
	Thread.sleep(3000);
	GenericMethods.clickElement(ContinueButton);
	Thread.sleep(2000);
    GenericMethods.ActionOnAlert("Accept");
   Thread.sleep(3000);
 
   System.out.println(GenericMethods.value);
	}
	
	catch(Exception e)
	{
		throw e;
	}
	
	return GenericMethods.value;
}


public FrontdeskLandingPage NoOpenNewcounter() throws Exception{
	GenericMethods.clickElement(NoOptionInCounter);
	Select s=new Select(SelectCounterDropdown);
	Thread.sleep(2000);
	s.selectByVisibleText("Default Counter (Open)");
	GenericMethods.clickElement(ContinueButton);
	
	FrontdeskLandingPage FLP=PageFactory.initElements(GenericMethods.driver,FrontdeskLandingPage.class);
	return FLP;

}


public NightAuditVideoPage ClickOnNightAuditVideoLink() throws Exception{
GenericMethods.clickElement(NightAuditVideo);
Thread.sleep(10000);
NightAuditVideoPage NAV=PageFactory.initElements(GenericMethods.driver, NightAuditVideoPage.class);
			return NAV;
}


public NightAuditPdfPage ClickOnHowToUseLink() throws Exception
{
	try
	{
		Thread.sleep(2000);
GenericMethods.clickElement(HowToUseLink);

	}
	catch(NoSuchElementException e)
	{
	
	System.err.println("This link is only visible to Livestable server.");
	}
	NightAuditPdfPage NAV=PageFactory.initElements(GenericMethods.driver, NightAuditPdfPage.class);
	return NAV;
}



}
