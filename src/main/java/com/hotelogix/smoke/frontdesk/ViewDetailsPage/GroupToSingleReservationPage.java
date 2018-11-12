package com.hotelogix.smoke.frontdesk.ViewDetailsPage;

import java.util.ArrayList;
import java.util.List;


import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.hotelogix.smoke.frontdesk.FrontdeskHome.CheckinCard;
import com.hotelogix.smoke.frontdesk.FrontdeskHome.CheckoutCard;
import com.hotelogix.smoke.frontdesk.Payment.AccountStatementLandingPage;
import com.hotelogix.smoke.genericandbase.GenericMethods;

public class GroupToSingleReservationPage {


@FindBy(xpath="//table[@class='pnl_rates']//input[@type='checkbox']")
public  List<WebElement> AllTaxesToExempt;

@FindBy(xpath="//td[@class='lineheight size13']//span[2]")
public  WebElement Name;

@FindBy(xpath="//a[@id='link-roomSharers']")
public  WebElement manageSharer;

@FindBy(xpath="//div[@id='PanelRoomSharers_h']")
public  WebElement managerSharerWindow;

@FindBy(xpath="//table[@class='table-cellspacing-patch']//tr")
public  List<WebElement> rowcount;

@FindBy(xpath="//button[@id='rsBtnSave-button']")
public  WebElement managesharerSave;

@FindBy(xpath="//table[@id='tblRoomSharers']//tr")
public  List<WebElement> sharerTable;

@FindBy(xpath="//input[@value='Cancel Check-in']")
public  WebElement cancelCheckin;

@FindBy(xpath="//input[@id='btnUnCheckIn']")
public  WebElement CancelCheckIn_BT;

@FindBy(xpath="//input[@name='btnSngResPayment']")
public  WebElement paymentBtn;

@FindBy(xpath="(//a[@id='linkRoomSharerDate1'])[2]")
public  WebElement CheckInDateOfSecondGuest_Link;

@FindBy(xpath="//div[@id='sr-calContainerPopup']//table//tbody//a")
public  List<WebElement> CheckInDateOfSGCalender_TB;

@FindBy(xpath="//a[@id='linkRoomSharerDate2']")
public  WebElement CheckOutDateOfSGDate;

@FindBy(xpath="//input[@id='brnGroupSv']")
public  WebElement BackToGroup_BT;

@FindBy(xpath="//select[@id='extraBeds']")
public  WebElement ExtraBed_DD;

@FindBy(xpath="//input[@id='srTxtFirstName']")
public  WebElement GuestFirstName_ED;

@FindBy(xpath="//input[@id='srTxtLastName']")
public  WebElement GuestLastName_ED;

@FindBy(xpath="//input[@id='phoneNo']")
public  WebElement Phone_ED;

@FindBy(xpath="//input[@id='srTxtEmail']")
public  WebElement Email_ED;

@FindBy(xpath="//a[text()='Save & Add More']")
public  WebElement SaveAndMore_BT;

@FindBy(xpath="//button[@id='btnSave-button']")
public  WebElement GuestInformationSave_BT;

@FindBy(xpath="//input[@id='chkbxVipNo']")
public  WebElement VIP_CB;

@FindBy(xpath="//div[@class='edit-pencil-img']")
public  WebElement Pencil_IMG;

@FindBy(xpath="//fieldset[@id='fldstRoomExmptdTx']")
public  WebElement RoomTaxes_Link;

@FindBy(xpath="//input[@id='chkExmpt_0']")
public  WebElement RoomTaxCheckBox_InPopUp;

@FindBy(xpath="//button[@id='txBtnSave-button']")
public  WebElement RoomTaxOKButton_InPopUp;

@FindBy(xpath="(//a[@id='linkRoomSharerDate1'])")
public  WebElement CheckInDateOffirstGuest_Link;

@FindBy(xpath="//div[@id='sr-calContainerPopup']//table//tbody//a")
public  WebElement CheckInDateOfSGDate;

@FindBy(xpath="(//a[@id='linkRoomSharerDate2'])[2]")
public  WebElement CheckOutDateOfSGuestDate;

@FindBy(xpath="//select[@id='taxExmptReson']")
public  WebElement TaxExempt_DD;

@FindBy(xpath="//fieldset[@id='resLblRoomTariff']")
public  WebElement RoomRate;

@FindBy(xpath="//fieldset[@id='resLblBalance']")
public  WebElement TotalBalance;

@FindBy(xpath="//fieldset[@id='resLblRoomTaxes']")
public   WebElement txt_RoomTax;

@FindBy(xpath="//input[@name='btnCheckIn']")
public WebElement btn_Checkin;

@FindBy(xpath="//input[@name='btnErlyCheckIn']")
public WebElement btn_EarlyCheckin;

@FindBy(xpath="//input[@id='selCnclReason']")
public WebElement txtbox_reasonForEC;

@FindBy(xpath="//input[@id='txtCnclCharge']")
public WebElement txtbox_chargeEC;

@FindBy(xpath="//span[@id='btnResCanSave']")
public WebElement btn_ECheckin;

@FindBy(xpath="//fieldset[@name='guestCheckIn']")
public WebElement link_guestCheckin;

@FindBy(xpath="//input[@class='guestChkbox']")
public WebElement chkbox_guestChkBox;

@FindBy(xpath="//fieldset[@name='guestEarlyCheckIn']")
public WebElement link_guestEarlyCheckin;

@FindBy(xpath="//input[@id='selCnclReason']")
public WebElement txtbox_GuestEarlyCheckinReason;

@FindBy(xpath="//input[@id='txtCnclCharge']")
public WebElement txtbox_GuestEarlyCheckinCharge;

@FindBy(xpath="//button[@id='btnResCanSave-button']")
public WebElement btn_GuestEarlyCheckin;

@FindBy(xpath="//select[@name='payTypesMode']")
public  WebElement paymentMode;

@FindBy(xpath="//select[@name='payTypes']")
public  WebElement payTypes;

@FindBy(xpath="//input[@name='btnPaymentPayNow']")
public  WebElement payNowBtn;

@FindBy(xpath="//input[@name='btnGenarateFolio']")
public  WebElement generateFolioBtn;

@FindBy(xpath="//input[@name='btnSettleFolio']")
public  WebElement settleFolio;

@FindBy(xpath="//table[@class='payment_total']//tr[8]//td[2]")
public  WebElement totalBal;

@FindBy(xpath="//input[@name='btnCheckOut']")
public WebElement btn_chkOut;

@FindBy(xpath="//input[@value='Late Check-out']")
public WebElement btn_LateChkout;

public  String EditName="Deepak";



public static String gname;
public static String text;



public void CheckTaxExemptForRoom() throws Exception
{
	ArrayList<String> al=new ArrayList<String>();

	GenericMethods.clickElement(GenericMethods.driver.findElement(By.xpath("//fieldset[@id='fldstRoomExmptdTx']")));
	int count=GenericMethods.tr_count(AllTaxesToExempt)+1;
	for(int i=2;i<=count;i++)
	{
	String str=GenericMethods.driver.findElement(By.xpath("//table[@class='pnl_rates']//tr["+i+"]//td[3]//table//tr//td")).getText();
	String s2=str.substring(0, str.lastIndexOf("%"));
			al.add(s2);
	}
    GenericMethods.driver.findElement(By.xpath("//a[@class='container-close']")).click();
    GenericMethods.driver.findElement(By.xpath("//input[@value='Back To Group']")).click();

}

public void fn_verifyGuestName() throws Exception
{
	try
	{
	 String actualName=GenericMethods.getText(Name);
	 Assert.assertEquals(actualName, EnableEditingPage.gname);
	}
	catch(AssertionError e)
	{
		throw e;
	}
	catch(Exception e)
	{
		throw e;
	}
}


public void fn_clkManageSharerLnk() throws Exception
{
	try
	{
	// text=GenericMethods.getText(manageSharer);
	 GenericMethods.js_Click(manageSharer);
	}
	catch(Exception e)
	{
		throw e;
	}
}


public void fn_verifyManageSharerTitle() throws Exception
{
	
	try
	{
	 String text1=GenericMethods.getText(managerSharerWindow);
	 Assert.assertEquals(text1.equals("Manage Sharer(s)"), true);
	}
	catch(AssertionError e)
	{
		throw e;
	}
	catch(Exception e)
	{
		throw e;
	}
}


public static String data;


public void fn_checkSharerGuest() throws Exception
{
	try
	{
	 int tr_count=GenericMethods.tr_count(rowcount);
	 for(int i=2;i<=tr_count;i++)
	 {
		 WebElement ele=GenericMethods.driver.findElement(By.xpath("//table[@class='table-cellspacing-patch']//tr["+i+"]//td[7]//input"));
		 data=GenericMethods.driver.findElement(By.xpath("//table[@class='table-cellspacing-patch']//tr["+i+"]//td[2]")).getText();
		 Boolean b=ele.isSelected();
		 if(b!=true)
		 {
			 Assert.assertEquals(ele.isSelected(), false);
			 ele.click();
			 break;
		 }

	 }
	 GenericMethods.clickElement(managesharerSave);
	}
	catch(AssertionError e)
	{
		throw e;
	}
	catch(Exception e)
	{
		throw e;
	}
}

public void fn_verifyManagerSharerYes() throws Exception
{
	try
	{
	ArrayList<String> arr=new ArrayList<String>();
   int count=GenericMethods.tr_count(sharerTable);
   for(int i=3;i<=count;i++)
   {
   	String data1=GenericMethods.driver.findElement(By.xpath("//table[@id='tblRoomSharers']//tr["+i+"]//td[2]")).getText();
   	arr.add(data1);
   	if(data1.equals(data))
   	{
   		Assert.assertEquals(data1.equals(data), true);
   		String value=GenericMethods.driver.findElement(By.xpath("//table[@id='tblRoomSharers']//tr["+i+"]//td[6]")).getText();
   		Assert.assertEquals(value, "Yes");
   		break;
   	}
   }
   Assert.assertEquals(arr.contains(data), true);
	}
	catch(AssertionError e)
	{
		throw e;
	}
	catch(Exception e)
	{
		throw e;
	}
}


public EnableEditingPage fn_clkCancelCheckinGrp() throws Exception
{
	try
	{
	GenericMethods.js_Click(cancelCheckin);
	GenericMethods.ActionOnAlert("Accept");
	Thread.sleep(3000);
	EnableEditingPage VDP=PageFactory.initElements(GenericMethods.driver, EnableEditingPage.class);
    return VDP;
	}
	catch(Exception e)
	{
		throw e;
	}
}


public AccountStatementLandingPage fn_clkPaymentSingleguest() throws Exception
{
	try
	{
	GenericMethods.clickElement(paymentBtn);
	AccountStatementLandingPage ASP=PageFactory.initElements(GenericMethods.driver, AccountStatementLandingPage.class);
	return ASP;
	}
	catch(Exception e)
	{
		throw e;
	}
}


public void fn_ClickAfterCheckIn_Link() throws Exception
{

  	 try
  	 {
  		GenericMethods.clickElement(CheckInDateOfSecondGuest_Link);
  		for(WebElement We: CheckInDateOfSGCalender_TB)
  		{
  			String str=We.getText();
  			if(str.equalsIgnoreCase("30"))
  			{
  				We.click();
  				break;
  	        }
  		}

  		Thread.sleep(2000);
  		String sobj=GenericMethods.getText(CheckInDateOfSecondGuest_Link);
			Assert.assertTrue(sobj.contains("30"));
  	 }
  	 catch(Exception e)
  	 {
  		 throw e;
  	 }

}


public void fn_ClickBeforeCheckOut_Link() throws Exception
{

  	 try
  	 {
  		GenericMethods.clickElement(CheckOutDateOfSGDate);
  		for(WebElement We: CheckInDateOfSGCalender_TB)
  		{
  			String str=We.getText();
  			if(str.equalsIgnoreCase("1"))
  			{
  				We.click();
  				break;
  			}

  		}
  		Thread.sleep(2000);
  		String sobj=GenericMethods.getText(CheckOutDateOfSGDate);
		Assert.assertTrue(sobj.contains("1"));
		GenericMethods.clickElement(BackToGroup_BT);
  	 }
  	 catch(AssertionError e)
  	 {
  		 throw e;
  	 }
  	 catch(Exception e)
  	 {
  		 throw e;
  	 }

    }


public void fn_ValidateExtraBed() throws Exception
{

  	 try
  	 {
  	 text=GenericMethods.getText(TotalBalance);
  	 GenericMethods.selectElement(ExtraBed_DD, "1 Bed");
  	 Thread.sleep(2000);
  	 Select sobj=new Select(ExtraBed_DD);
  	 WebElement we=sobj.getFirstSelectedOption();
  	 String str=we.getText();
  	 Assert.assertEquals("1 Bed",str);
  	 Thread.sleep(2000);
  	 String str1=GenericMethods.getText(TotalBalance);
  	 Assert.assertFalse(str1.equals(text));

  	 }
  	 catch(Exception e)
  	 {
  		 throw e;
  	 }
  	 catch(AssertionError e)
  	 {
  		 throw e;
  	 }

}


public void fn_ClickBackToGroup() throws Exception
{

  	 try
  	 {

  	 GenericMethods.clickElement(BackToGroup_BT);

  	 }
  	 catch(Exception e)
  	 {
  		 throw e;
  	 }

}


public static String GuestName=GenericMethods.generateRandomString();

public void fn_FillGuestDetails() throws Exception
{

  	 try
  	 {
  		 GuestFirstName_ED.clear();
  		GenericMethods.js_Sendkey(GuestFirstName_ED,GuestName );
  		GuestLastName_ED.clear();
  		GenericMethods.js_Sendkey(GuestLastName_ED, GenericMethods.generateRandomString());
  		GenericMethods.js_Sendkey(Phone_ED, "858564855");
  		GenericMethods.sendKeys(Email_ED, "xyz@gmail.com");
//  		GenericMethods.js_Sendkey(Address_ED, "Noida");
//  		GenericMethods.sendKeys(Organization_ED, "HMS");
  		GenericMethods.clickElement(SaveAndMore_BT);

  		GenericMethods.clickElement(GuestInformationSave_BT);
  	 }
  	 catch(Exception e)
  	 {
  		 throw e;
  	 }

}

public void fn_ValidateVIPcheckBox() throws Exception
{

  	 try
  	 {
  		 if(VIP_CB.isSelected()==true)
  		 {
  			 System.out.println("Its Checked");
  		 }
  		 else
  		 {
  			GenericMethods.clickElement(VIP_CB);
  		 }

  		boolean result=VIP_CB.isSelected();
  		Assert.assertEquals(result, true);


  	 }
  	 catch(Exception e)
  	 {
  		 throw e;
  	 }

}


public void fn_ClickAddEditDetails() throws Exception
{

   	 try

   	 {
   		GenericMethods.js_Click(Pencil_IMG);
   		Thread.sleep(2000);
   		//GenericMethods.clickElement(GuestFirstName_ED);
   		GenericMethods.sendKeys(GuestFirstName_ED, EditName);
   		GenericMethods.clickElement(GuestInformationSave_BT);
   	 }

   	 catch(Exception e)
   	 {
   		 throw e;
   	 }

}



public void fn_ClickCancelCheckIn_BT() throws Exception
{

	 try
	 {
	 GenericMethods.clickElement(CancelCheckIn_BT);
	 GenericMethods.ActionOnAlert("Accept");

	 }
	 catch(Exception e)
	 {
		 throw e;
	 }

}

public void fn_ValidateTaxExemptInPopUp() throws Exception
{

	try{

        GenericMethods.clickElement(RoomTaxes_Link);
        GenericMethods.selectbyNo(TaxExempt_DD, 1);
        if(RoomTaxCheckBox_InPopUp.isSelected()==true){
            System.out.println("It's Checked");
        }else{
           RoomTaxCheckBox_InPopUp.click();
        }
        GenericMethods.clickElement(RoomTaxOKButton_InPopUp);
    }catch(Exception e){
        throw e;
    }
}



public void fn_ClickAfterCheckInFirstGuest_Link() throws Exception{

    try{
       GenericMethods.clickElement(CheckInDateOffirstGuest_Link);
       for(WebElement We: CheckInDateOfSGCalender_TB){
           String str=We.getText();
           if(str.equalsIgnoreCase("30")){
               We.click();
               break;
       }
       }
       Thread.sleep(5000);
       String sobj=GenericMethods.getText(CheckInDateOffirstGuest_Link);
        Assert.assertTrue(sobj.contains("30"));
    }catch(Exception e){
        throw e;
    }
 }





public CheckinCard fn_clkCheckinBtn(String msg) throws Exception{
	try{
	GenericMethods.clickElement(btn_Checkin);
	String str=GenericMethods.Alert_Accept();
	Assert.assertEquals(str.equals(msg), true);
	CheckinCard CC=PageFactory.initElements(GenericMethods.driver, CheckinCard.class);
	return CC;
	}catch(AssertionError e){
		throw e;
	}catch(UnhandledAlertException e){
		throw e;
	}catch(Exception e){
		throw e;
	}
}


public CheckinCard fn_clkEarlyCheckinBtn(String reason,String msg) throws Exception{
	try{
	GenericMethods.clickElement(btn_EarlyCheckin);
    GenericMethods.sendKeys(txtbox_reasonForEC, reason);
	GenericMethods.sendKeys(txtbox_chargeEC, "100");
	GenericMethods.clickElement(btn_ECheckin);
	String str=GenericMethods.Alert_Accept();
    Assert.assertEquals(str.equals(msg), true);
	}catch(AssertionError e){
		throw e;
	}catch(UnhandledAlertException e){
		throw e;
	}catch(Exception e){
		throw e;
	}
	CheckinCard CC=PageFactory.initElements(GenericMethods.driver, CheckinCard.class);
	return CC;
}


public CheckinCard fn_clkGuestCheckInLnk(String msg) throws Exception{
	try{
		GenericMethods.clickElement(chkbox_guestChkBox);
	 GenericMethods.clickElement(link_guestCheckin);
	 String str=GenericMethods.Alert_Accept();

     Assert.assertEquals(str.equals(msg), true);
	}catch(UnhandledAlertException e){
		GenericMethods.Alert_Accept();
	}catch(Exception e){
		throw e;
	}
	CheckinCard CC=PageFactory.initElements(GenericMethods.driver, CheckinCard.class);
	return CC;
 }


public CheckinCard fn_clkGuestEarlyCheckInLnk(String reason,String msg) throws Exception{
	try{
		 GenericMethods.clickElement(chkbox_guestChkBox);
		 GenericMethods.clickElement(link_guestEarlyCheckin);
		 GenericMethods.sendKeys(txtbox_GuestEarlyCheckinReason, reason);
		 GenericMethods.sendKeys(txtbox_GuestEarlyCheckinCharge, "100");
		 GenericMethods.clickElement(btn_GuestEarlyCheckin);
	     String str=GenericMethods.Alert_Accept();
	     Assert.assertEquals(str.equals(msg), true);
		}catch(UnhandledAlertException e){
			GenericMethods.Alert_Accept();
		}catch(Exception e){
			throw e;
		}
	     CheckinCard CC=PageFactory.initElements(GenericMethods.driver, CheckinCard.class);
			return CC;
}




public void fn_clkPayNow() throws Exception
{try{
    Select sel=new Select(paymentMode);
    sel.selectByValue("cash");
    Thread.sleep(1000);
    //Select sel1=new Select(paymentTypes);
    //sel1.selectByValue("");
    //Actions acobj= new Actions(GenericMethods.driver);
	//acobj.sendKeys(amount, Keys.chord(Keys.CONTROL, "a"), amt).build().perform() ;
	//amt=GenericMethods.getText(amount);
	GenericMethods.js_Click(payNowBtn);
	Thread.sleep(6000);
}catch(Exception e){
	throw e;
}
}

public void fn_clkGenerateFolio() throws Exception
{
	try
	{
	GenericMethods.clickElement(generateFolioBtn);
	}
	catch(NoSuchElementException e)
	{
		Thread.sleep(2000);
		GenericMethods.js_Click(generateFolioBtn);
	}
	catch(Exception e)
	{
		throw e;
	}
}

public void fn_clkSettleFolioAccept(String expmsg) throws Exception
{
	try
	{
		Thread.sleep(4000);
	String balance=GenericMethods.getText(totalBal);
	   if(balance!="Rs 0.00")
	   {
		   fn_clkPayNow();
		   Thread.sleep(4000);
		   fn_clkGenerateFolio();
		   Thread.sleep(8000);
		   GenericMethods.clickElement(settleFolio);
		   String str=GenericMethods.ActionOnAlert("Accept");
		   Assert.assertEquals(str, expmsg);
	   }

	   else
	   {

		   GenericMethods.clickElement(settleFolio);
		   String str=GenericMethods.ActionOnAlert("Accept");
		   Assert.assertEquals(str, expmsg);

	   }
	}
	catch(Exception e)
	{
		throw e;
	}
	catch(AssertionError e)
	{
		throw e;
	}
}


public AccountStatementLandingPage  fn_clkChkoutBtn() throws Exception{
	try{
	GenericMethods.clickElement(btn_chkOut);
	}catch(Exception e){
		throw e;
	}
	
	AccountStatementLandingPage ASLP=PageFactory.initElements(GenericMethods.driver, AccountStatementLandingPage.class);
	return ASLP;
}


public AccountStatementLandingPage fn_clkLateChkout(String reason,String msg) throws Exception{
	try{
	GenericMethods.clickElement(btn_LateChkout);
	 GenericMethods.sendKeys(txtbox_GuestEarlyCheckinReason, reason);
	GenericMethods.clickElement(btn_GuestEarlyCheckin);
	String str=GenericMethods.Alert_Accept();
	Assert.assertEquals(str.equals(msg), true);
	}catch(AssertionError e){
		throw e;
	}catch(Exception e){
		throw e;
	}
	AccountStatementLandingPage ASLP=PageFactory.initElements(GenericMethods.driver, AccountStatementLandingPage.class);
	return ASLP;
	
}

}
