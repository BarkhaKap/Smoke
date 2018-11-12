package com.hotelogix.smoke.frontdesk.Accounts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hotelogix.smoke.genericandbase.GenericMethods;

import junit.framework.Assert;

public class AccountsLandingPage {

	@FindBy(xpath="//a[text()='Hotel']")
	public static WebElement Hotel_Tab;

	@FindBy(xpath="//td[@class='page-heading']")
	public WebElement txt_pageHeading; 

	public void fn_ClickHotel() throws Exception
	{

   	 try
   	 {
   	    GenericMethods.clickElement(Hotel_Tab);
   	 }

   	 catch(Exception e)
   	 {
   		 throw e;
   	 }

	}
	
	
	public String fn_validateHotelPage() throws Exception
	{
		try
		{
		String txt=GenericMethods.getText(txt_pageHeading);
		return txt;
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String fn_ValidateAccountsPage(int iTestCaseRow) throws Exception
	{

   	 try
   	 {
   	     String title= GenericMethods.driver.getTitle();
   	     return title;
   	 }
   	 catch(Exception e)
   	 {
   		 throw e;
   	 }
     }

}
