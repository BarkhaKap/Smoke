package com.hotelogix.smoke.frontdesk.WebReservation;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hotelogix.smoke.genericandbase.GenericMethods;


public class WebConfirmReservationPrintPage {


	public static ArrayList<String> al1=new ArrayList<String> ();



//@FindBy(xpath="//div[@id='printDiv']/table/tbody/tr[7]/td/table/tbody/tr[3]/td/table/tbody/tr[2]/td[2]/strong")
@FindBy(xpath="//div[@id='printDiv']//tr[7]/td//tr/td/table/tbody/tr[2]/td[2]/strong")
public static WebElement TotalAmt;

//@FindBy(xpath="//div[@id='printDiv']/table/tbody/tr[7]/td/table/tbody/tr[3]/td/table/tbody/tr[3]/td[2]/strong")
@FindBy(xpath="//div[@id='printDiv']//tr[7]/td//tr/td/table/tbody/tr[3]/td[2]/strong")
public static WebElement TotalTax;

//@FindBy(xpath="//div[@id='printDiv']/table/tbody/tr[7]/td/table/tbody/tr[3]/td/table/tbody/tr[4]/td[2]/strong")
@FindBy(xpath="//div[@id='printDiv']//tr[7]/td//tr/td/table/tbody/tr[4]/td[2]/strong")
//@FindBy(xpath="//strong[text()='Total Amount (with Tax):']")

public static WebElement TotalAmtWithTAx;

@FindBy(xpath="//strong[contains(text(),'Reservation Id#')]")
public static WebElement ReservationId;

@FindBy(xpath="//strong[contains(text(),'Reservation Group Id#')]")
public  WebElement ReservationGrpId;

@FindBy(xpath="//div[@id='printDiv']/table/tbody/tr[15]/td/table/tbody/tr[2]//tr[2]//td[2]")
public static WebElement cancellationPolicy;

@FindBy(xpath="//div[@id='printDiv']//tr[2]//table//td//strong")
public static WebElement txt_pageHeader;

@FindBy(xpath="//td[@class='dont-print-me']//tr")
public List<WebElement> count_balance;

public void CloseWindow() throws InterruptedException{
		Thread.sleep(2000);
		GenericMethods.driver.close();
}



public String verify_pageHeader() throws Exception
{
	try
	{
   String text=GenericMethods.getText(txt_pageHeader);
   return text;
	}
	catch(Exception e)
	{
		throw e;
	}
}


public ArrayList<String> GetAmtDetails(String text) throws Exception
{
	try
	{
		
		String TamtTax=null;
		String tamt1=GenericMethods.getText(TotalAmt);
		String ttax=null;

		int count=GenericMethods.tr_count(count_balance);
		for(int i=2;i<=count;i++){
		String str=GenericMethods.driver.findElement(By.xpath("//td[@class='dont-print-me']//tr["+i+"]/td/strong")).getText();
		if(str.equals(text)){
			int j=i-1;
			ttax=GenericMethods.driver.findElement(By.xpath("//td[@class='dont-print-me']//tr["+j+"]/td[2]/strong")).getText();
			TamtTax=GenericMethods.driver.findElement(By.xpath("//td[@class='dont-print-me']//tr["+i+"]/td[2]/strong")).getText();
			break;
		}
		
		}
		
		

al1.add(tamt1);
al1.add(ttax);
al1.add(TamtTax);
return al1;
	}
	catch(Exception e)
	{
		throw e;
	}

}


public ArrayList<String> GetResrvDetails() throws Exception
{
	try
	{
String tamt=GenericMethods.getText(TotalAmt);
String ttax=GenericMethods.getText(TotalTax);
String cancelPolicy=GenericMethods.getText(cancellationPolicy);
al1.add(tamt);
al1.add(ttax);
al1.add(cancelPolicy);
return al1;
	}
	catch(Exception e)
	{
		throw e;
	}

}


public String GetReservationId() throws Exception
{
	try
	{
String text=GenericMethods.getText(ReservationId);
String rid=text.split(" ")[2];
//String rid=text.substring(text.length()-8, text.length());
return rid;
	}
	catch(Exception e)
	{
		throw e;
	}
}


public static String rid;
public String GetGrpReservationId() throws Exception
{
	try
	{
String text=GenericMethods.getText(ReservationGrpId);
rid=text.split(" ")[4];
//String rid=text.substring(text.length()-8, text.length());
return rid;
	}
	catch(Exception e)
	{
		throw e;
	}
}

}
