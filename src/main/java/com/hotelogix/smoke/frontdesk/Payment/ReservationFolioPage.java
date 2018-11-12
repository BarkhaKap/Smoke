package com.hotelogix.smoke.frontdesk.Payment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hotelogix.smoke.genericandbase.GenericMethods;

public class ReservationFolioPage
{

	@FindBy(xpath="//td[@class='front_tbl_lft']//table[@class='bat_frn_paytbl']//tr//td[2]//input")
	public static List<WebElement> chkboxCount;


	@FindBy(xpath="//div[@class='bat_account_statement']")
	public static WebElement backToAccStmt;


	public AccountStatementLandingPage fn_verifyPaidAmt() throws Exception
	{
		try
		{
		int count=GenericMethods.tr_count(chkboxCount);
	    for(int i=2;i<=count;i+=2)
	    {
	    	String str1=GenericMethods.driver.findElement(By.xpath("//td[@class='front_tbl_lft']//table[@class='bat_frn_paytbl']//tr["+i+"]//td[4]")).getText();
	    	//li.add(str1);
	    	if(str1.contains("Paid by "+AccountStatementLandingPage.str1Value+" with Cash"))
	    	{
	    		String str=GenericMethods.driver.findElement(By.xpath("//td[@class='front_tbl_lft']//table[@class='bat_frn_paytbl']//tr["+i+"]//td[8]")).getText();
	    		if(str.contains(AccountStatementLandingPage.amt1))
	    		{
	    		//Assert.assertTrue(str.contains(amt));
//	    		WebElement ele1=GenericMethods.driver.findElement(By.xpath("//table[@class='frn_paytbl']//tbody//tr["+i+"]//td[2]"));
//	    		ele1.click();
	            System.out.println("Paid amount has been successfully routed to selected guest ID folio.");
	            break;
	    		}

	    	}
	    }
	    GenericMethods.clickElement(backToAccStmt);
	    AccountStatementLandingPage ASP=PageFactory.initElements(GenericMethods.driver, AccountStatementLandingPage.class);
		return ASP;
		}
		catch(Exception e)
		{
			throw e;
		}
	}



}
