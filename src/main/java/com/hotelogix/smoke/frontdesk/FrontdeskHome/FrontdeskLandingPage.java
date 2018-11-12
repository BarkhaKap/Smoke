package com.hotelogix.smoke.frontdesk.FrontdeskHome;


import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.hotelogix.smoke.FrontdeskTest.FrontdeskTest;
import com.hotelogix.smoke.admin.BaseClass.AdmineHome;
import com.hotelogix.smoke.admin.PriceManager.AddMoreInclusions;
import com.hotelogix.smoke.admin.roommanager.AddRoomsPage;
import com.hotelogix.smoke.frontdesk.Accounts.AccountsLandingPage;
import com.hotelogix.smoke.frontdesk.Payment.AccountStatementLandingPage;
import com.hotelogix.smoke.frontdesk.Report.LiveSupportLandingWindow;
import com.hotelogix.smoke.frontdesk.Report.ReportLandingPage;
import com.hotelogix.smoke.frontdesk.ReservationSearchResult.ReservationSearchResultLandingPage;
import com.hotelogix.smoke.frontdesk.SampleRestaurantPage.SampleRestaurantPage;
import com.hotelogix.smoke.frontdesk.ViewDetailsPage.EnableEditingPage;
import com.hotelogix.smoke.frontdesk.ViewDetailsPage.ViewDetailsPage;
import com.hotelogix.smoke.frontdesk.WebReservation.WebReservationHomePage;
import com.hotelogix.smoke.genericandbase.BasePage;
import com.hotelogix.smoke.genericandbase.Constant;
import com.hotelogix.smoke.genericandbase.ExcelUtil;
import com.hotelogix.smoke.genericandbase.GenericMethods;
import com.hotelogix.smoke.login.AdminLoginPage;
import com.itextpdf.awt.geom.misc.RenderingHints.Key;




public class FrontdeskLandingPage {

@FindBy(xpath="//input[@value='Cancel']")
public  WebElement Cancel_BT;

@FindBy(xpath="//div[@title='209']")
public  WebElement RoomsNumber_BT;

@FindBy(xpath="//input[@id='txtResFrndLookup']")
public  WebElement Search_ED;

@FindBy(xpath="(//td[starts-with(@id,'rsvSearch')])[2]//input")
public  WebElement Search_ForAll;

@FindBy(xpath="//span[text()='Fg Fgfg']")
public  WebElement AutoSuggestion;

@FindBy(xpath="//input[@id='txtResFrndLookupAllChk']")
public  WebElement Search_CB;

@FindBy(xpath="//button[@id='txtResFrndLookupAllBtn-button']")
public  WebElement SearchAll_BT;

@FindBy(xpath="//a[text()='Current']")
public  WebElement Current_Link;

@FindBy(xpath="//a[@class='yuimenubaritemlabel']")
public  WebElement SampleRestaurant;

@FindBy(xpath="//button[text()='Ok']")
public  WebElement CancelDNR;

@FindBy(xpath="//h4")
public  WebElement checkinCard_title;

@FindBy(xpath="//div[@id='contextmenu']//ul//li[9]/a")
public  WebElement rightClk_viewDetails;

@FindBy(xpath="//div[@title='131']")
public  WebElement RoomForDNR;

@FindBy(xpath="//div[@class='bd']//li[6]/a")
public  WebElement DNROption;

@FindBy(xpath="//div[@id='PanelTasksHKNew_h']")
public  WebElement DNRPopUpTitle;

@FindBy(xpath="//textarea[@id='txtDnrComment']")
public  WebElement CommentsForDNR;

@FindBy(xpath="//button[@id='btnDNRSave-button']")
public  WebElement SubmitDNR;

@FindBy(xpath="//div[@resrvid='4222185']")
public  WebElement resrvId;

@FindBy(xpath="//div[@id='contextmenu']//ul//li[2]/a")
public  WebElement rightClk_checkIn;

@FindBy(xpath="//div[@id='contextmenu']//ul//li[1]/a")
public  WebElement rightClk_cnclcheckin;

@FindBy(xpath="//input[@value='Close']")
public  WebElement checkinCard_closeBtn;

@FindBy(xpath="//div[@id='contextmenu']//ul//li[7]/a")
public  WebElement link_Payment;

@FindBy(xpath="//div[@id='contextmenu']//ul//li[10]/a")
public  WebElement grpcheckin;

@FindBy(xpath="//a[text()='Web Reservation']")
public  WebElement WebReservation_Link;

@FindBy(xpath="//a[@class='link-top-unit' and text()='Admin Console']")
public  WebElement Admin_lnk;

@FindBy(xpath="//div[@id='pnl-nav-links']//img")
public  WebElement LiveSupport_BT;

@FindBy(xpath="//a[text()='Check In']")
public  WebElement rightClk_CheckIN;

@FindBy(xpath="//button[text()='Continue to Checkin']")
public  WebElement ContinueToCheckIn_BT;

@FindBy(xpath="//a[text()='Report']")
public  WebElement Report_BT;

@FindBy(xpath="//input[@value='Perform Auto Night Audit']")
public  WebElement AutoNightAuditBtn;

@FindBy(xpath="//a[text()='Frontdesk']")
public  WebElement Frontdesk_BT;

@FindBy(xpath="//a[text()='Perform Night Audit']")
public  WebElement PerformNightAudit_Link;

@FindBy(xpath="//img[@id='hkDNRImgCal1']")
public  WebElement FromCal_DNRPopUp;

@FindBy(xpath="//img[@id='hkDNRImgCal2']")
public  WebElement ToCal_DNRPopUp;

@FindBy(xpath="//table[@id='sr-calContainerPopup_t']//tbody//a")
public  WebElement DateInCal_DNRPopUp;

@FindBy(xpath="//button[text()='Ok']")
public  WebElement OKbutton_DNRPopUp;

@FindBy(xpath="//div[@rsvstatus='DNR']")
public  WebElement DNR_Reservation;

@FindBy(xpath="//td[@id='dnrListTdId']//img[2]")
public  WebElement DeleteIcon_DNRPopUp;

@FindBy(xpath="//textarea[@id='txtDnrComment']")
public  WebElement TextBox_DNRPopUp;

@FindBy(xpath="//button[@id='btnDNRSave-button']")
public  WebElement Submit_DNRPopUp;

@FindBy(xpath="//a[text()='DNR']")
public  WebElement DNR;

@FindBy(xpath="//div[@id='PanelTasksHKNew_h']")
public  WebElement DNR_PopUp;

@FindBy(xpath="//div[@id='hhead348284']//input")
public  WebElement Rooms_CB;

@FindBy(xpath="//div[@id='PanelQuickRes']//td")
public  WebElement addQuickResrv;

@FindBy(xpath="//div[@id='quickLinkDiv']")
public  WebElement tooltip;

@FindBy(xpath="//select[@id='noofRooms1']")
public  WebElement roomDD;

@FindBy(xpath="//a[@id='lnkQResFormSingleEnab']")
public  WebElement singleLnk;

@FindBy(xpath="//a[text()='Group']")
public  WebElement link_Group;

@FindBy(xpath="//a[contains(@onclick,'Tab_GroupRes(0)')]")
public  WebElement ag_corp_Lnk;

@FindBy(xpath="//select[@id='qrSelRateType']")
public  WebElement dd_rateType;

@FindBy(xpath="//select[@id='qrSelAdult']")
public  WebElement adultDD;

@FindBy(xpath="//span[@id='btnSrShowEditDetails']")
public  WebElement viewBtn;

@FindBy(xpath="//div[@id='PanelAutoNA_h']/span")
public  WebElement nightaudit;

@FindBy(xpath="//a[text()='Cancel Check In']")
public  WebElement rightClk_CancelCheckIN;

@FindBy(xpath="//a[text()='Accounts']")
public  WebElement Accounts_Link;

@FindBy(xpath="//a[text()='Admin Console']")
public WebElement Link_AdmineConsole;

@FindBy(xpath="//button[@id='btnSrShowEditDetails-button']")
public WebElement Btn_View;

@FindBy(xpath="//span[@class='closebtn']")
public WebElement btn_closeReserv; 

@FindBy(xpath="//button[text()='View']")
public WebElement Link_ViewOnResDetailForm;

@FindBy(xpath="//td[contains(@class,'today')]")
public WebElement link_CurrentCalenderDate;

@FindBy(xpath="//select[@id='salutation']")
public WebElement dd_salutation;

@FindBy(xpath="//input[@id='qrTxtFirstName']")
public WebElement txtbox_fName;

@FindBy(xpath="//input[@id='qrTxtLastName']")
public WebElement txtbox_lName;

@FindBy(xpath="//input[@id='qrTxtPhone']")
public WebElement txtbox_phone;

@FindBy(xpath="//input[@id='qrEmail']")
public WebElement txtbox_email;

@FindBy(xpath="//button[@id='qrBtnReserve-button']")
public WebElement btn_Reserve;

@FindBy(css="div.rs-new")
public WebElement link_newReserv;

@FindBy(xpath="//a[text()='Check Out']")
public WebElement link_Checkout;

@FindBy(xpath="//a[text()='Group Check Out']")
public WebElement link_GroupCheckout;

public String resvId;

public void fn_clkClose() throws Exception
{
	try{
	GenericMethods.clickElement(btn_closeReserv);
	}catch(Exception e){
		throw e;
	}
}

public ViewDetailsPage ClickOnViewlink() throws Exception{	
	try{
		GenericMethods.clickElement(Btn_View);
	}catch(NoSuchElementException e){
		throw e;
	}
	ViewDetailsPage VDP=PageFactory.initElements(GenericMethods.driver, ViewDetailsPage.class);
	return VDP;	
}

public BasePage fn_NavigateAdmineConsole() throws Exception
{
	try{
GenericMethods.clickElement(Link_AdmineConsole);
	}catch(Exception e){
		throw e;
	}
	BasePage BP=PageFactory.initElements(GenericMethods.driver, BasePage.class);
    return BP;
}


public void fn_clickCurrentLnk() throws Exception
{
	try
	{
		Thread.sleep(20000);
	GenericMethods.clickElement(Current_Link);
	Thread.sleep(4000);
	}catch(NoSuchElementException e){
		Thread.sleep(2000);
		GenericMethods.js_Click(Current_Link);
	}catch(Exception e){
		throw e;
	}
}


public AccountsLandingPage fn_ClickAccounts_Link() throws Exception
{
  	 try{
  		 Thread.sleep(4000);
  	     GenericMethods.clickElement(Accounts_Link);
  	     AccountsLandingPage ALP=PageFactory.initElements(GenericMethods.driver, AccountsLandingPage.class);
  	     return ALP;
  	 }catch(Exception e){
  		 throw e;
  	 }       
}



public void fn_ClickOnCancelButton() throws Exception
{
	try
	{
      GenericMethods.clickElement(Cancel_BT);
      GenericMethods.ActionOnAlert("Accept");
      Assert.assertEquals(GenericMethods.driver.getTitle().contains("Frontdesk"),true );
	}catch(Exception e){
		throw e;
	}
}

public void clk_CalenderCurrentDate() throws Exception
{	
	try{
	GenericMethods.js_Click(link_CurrentCalenderDate);
	}catch(Exception e)
	{
	throw e;	
	}
}

public ReservationSearchResultLandingPage fn_SearchByReservationID(String rid) throws Exception
{
	try
	{
	Actions acobj= new Actions(GenericMethods.driver);
	Thread.sleep(2000);
	
	acobj.sendKeys(Search_ED, rid).build().perform();
	//GenericClass.sendKeys(Search_ED, ReservationID);
	GenericMethods.clickElement(Search_CB);
	GenericMethods.clickElement(SearchAll_BT);
	ReservationSearchResultLandingPage RSLP=PageFactory.initElements(GenericMethods.driver, ReservationSearchResultLandingPage.class);
	return RSLP;
	}catch(Exception e){
		throw e;
	}
}



public ReservationSearchResultLandingPage fn_SearchByIDGuest(String rid) throws Exception
{
	try
	{
	Actions acobj1= new Actions(GenericMethods.driver);
	Thread.sleep(2000);
//	boolean b1=Search_CB.isSelected();
//	if(b1==true)
//	{
//		Search_CB.click();
//	}
	Search_ForAll.clear();
	Search_CB.click();
	//Search_ForAll.clear();
	//GenericMethods.js_Sendkey(Search_ForAll, rid);
	acobj1.sendKeys(Search_ForAll, Keys.chord(Keys.CONTROL, "a"), rid).build().perform() ;
	//acobj.sendKeys(Search_ED, rid).build().perform();
	//GenericClass.sendKeys(Search_ED, ReservationID);
	//GenericMethods.clickElement(Search_CB);
	GenericMethods.clickElement(SearchAll_BT);
	ReservationSearchResultLandingPage RSLP=PageFactory.initElements(GenericMethods.driver, ReservationSearchResultLandingPage.class);
	return RSLP;
	}
	catch(Exception e)
	{
		throw e;
	}
}




public void VerifyDNR() throws Exception
{
	try
	{
	Actions a=new Actions(GenericMethods.driver).contextClick(RoomForDNR);
	a.build().perform();
	String s=GenericMethods.getText(DNROption);
	a.click(DNROption).build().perform();
	String t=GenericMethods.getText(DNRPopUpTitle);
	Assert.assertEquals(t.contains("DNR Room#"), true);
	GenericMethods.sendKeys( CommentsForDNR, "Do Not Reserve");
	GenericMethods.clickElement(SubmitDNR);
    String s1=	GenericMethods.driver.findElement(By.xpath("//div[text()='DNR ']")).getText().trim();
    Assert.assertEquals(s1, s);
    Thread.sleep(3000);
    GenericMethods.driver.findElement(By.xpath("//div[text()='DNR ']")).click();
    GenericMethods.driver.findElement(By.xpath("//div[@class='edit_icon']/img[2]")).click();
    //GenericMethods.ActionOnAlert("Accept");
    //GenericMethods.js_Click(GenericMethods.driver.findElement(By.xpath("//div[@id='MsgBox']//button[@id='yui-gen17-button']")));
    a.click(CancelDNR).build().perform();
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

public ViewDetailsPage fn_rightclkViewDetailsSingle(WebElement resrvId ) throws Exception
{
    Actions action = new Actions(GenericMethods.driver);
    action.contextClick(resrvId).build().perform();
    GenericMethods.clickElement(rightClk_viewDetails);
    ViewDetailsPage VDP=PageFactory.initElements(GenericMethods.driver, ViewDetailsPage.class);
    return VDP;
}


public SampleRestaurantPage ClickToSampleRestaurant() throws Exception
{
	try
	{
WebElement ele=GenericMethods.driver.findElement(By.xpath("//ul[@class='first-of-type']//li[3]/a"));
String str=GenericMethods.getText(ele);
if(str.equals("Sample Restaurant")||str.equals("Hlx_Restaurant"))
{
	Assert.assertEquals(str.equals("Sample Restaurant")||str.equals("Hlx_Restaurant"), true);
	GenericMethods.clickElement(ele);
}
SampleRestaurantPage SRL=PageFactory.initElements(GenericMethods.driver,SampleRestaurantPage.class );
return SRL;
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


public String fn_ClickCancelButton() throws Exception
{

	try
	{
		Thread.sleep(7000);
GenericMethods.clickElement(Cancel_BT);
GenericMethods.Alert_Accept();
GenericMethods.clickElement(Current_Link);
//Assert.assertEquals(GenericMethods.driver.getTitle(), "Frontdesk");
	}
	catch(Exception e)
	{
		throw e;
	}
	catch(AssertionError e)
	{
		throw e;
	}
	return GenericMethods.driver.getTitle();
}


public void fn_ClickCancelButtonAlert() throws Exception
{

	try
	{
		//Thread.sleep(3000);
		GenericMethods.fn_hold(Cancel_BT);
GenericMethods.clickElement(Cancel_BT);
GenericMethods.Alert_Accept();
Assert.assertEquals(GenericMethods.driver.getTitle().contains("Frontdesk"), true);
	}
	catch(Exception e)
	{
		throw e;
	}
}


public void fn_verifyNightAuditAlert()
{
   String str=GenericMethods.getText(nightaudit);
   Assert.assertEquals(str, "Perform Night Audit");
}


public ReservationSearchResultLandingPage  fn_SearchReservationID(String rid) throws Exception
{
	
try
{
Thread.sleep(2000);
GenericMethods.js_Sendkey(Search_ED, rid);
GenericMethods.clickElement(Search_CB);
GenericMethods.js_Click(SearchAll_BT);
}
catch(Exception e){
throw e;
}
ReservationSearchResultLandingPage RSLP=PageFactory.initElements(GenericMethods.driver, ReservationSearchResultLandingPage.class);
return RSLP;
}

public CheckinCard fn_clkCheckin() throws Exception
{
	try
	{
	Actions action = new Actions(GenericMethods.driver);
	action.contextClick(resrvId).build().perform();

	GenericMethods.clickElement(rightClk_checkIn);
	GenericMethods.ActionOnAlert("Accept");
	Thread.sleep(6000);
	

	CheckinCard CC=PageFactory.initElements(GenericMethods.driver, CheckinCard.class);
	return CC;
	}
	catch(Exception e)
	{
		throw e;
	}
}


public void fn_cancelCheckin() throws Exception
{
	Actions action = new Actions(GenericMethods.driver);
	action.contextClick(resrvId).build().perform();
	Thread.sleep(1000);
	//String a=GenericMethods.GetCurrentWindowID();
	GenericMethods.clickElement(rightClk_cnclcheckin);
	GenericMethods.ActionOnAlert("Accept");
	Thread.sleep(4000);
}



public void fn_closeCheckinCard() throws Exception
{
	//String a=GenericMethods.GetCurrentWindowID();
	Actions action = new Actions(GenericMethods.driver);
	action.contextClick(resrvId).build().perform();
	GenericMethods.clickElement(rightClk_checkIn);
	GenericMethods.ActionOnAlert("Accept");
	Thread.sleep(4000);
	//GenericMethods.windowHandle(a);
	Thread.sleep(2000);
	//GenericMethods.js_Click(checkinCard_closeBtn);
	//GenericMethods.Switch_Parent_Window(a);
}

public void fn_verifyCnclCheckinPopup() throws Exception
{
	try
	{
	Actions action = new Actions(GenericMethods.driver);
	action.contextClick(resrvId).build().perform();
	GenericMethods.clickElement(rightClk_cnclcheckin);
	String str=GenericMethods.ActionOnAlert("Dismiss");
	Thread.sleep(4000);
	Assert.assertEquals(str, "Do you wish to Unassign the reservation?");
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


public void fn_acceptCnclCheckinPopup() throws Exception
{
	try
	{
	Actions action = new Actions(GenericMethods.driver);
	action.contextClick(resrvId).build().perform();
	GenericMethods.clickElement(rightClk_cnclcheckin);
	GenericMethods.ActionOnAlert("Accept");
	Thread.sleep(4000);
	action.contextClick(resrvId).build().perform();
	String str=GenericMethods.getText(rightClk_checkIn);
	Assert.assertEquals(str, "Check In");
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


public void fn_verifyCheckinPopup() throws Exception
{
	try
	{
	Actions action = new Actions(GenericMethods.driver);
	action.contextClick(resrvId).build().perform();
	GenericMethods.clickElement(rightClk_checkIn);
	String str1=GenericMethods.ActionOnAlert("Dismiss");

	//Assert.assertTrue(str1.contains(exp_msg));
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





public  WebReservationHomePage fn_WebReservationLink() throws Exception
{
	try
	{
    GenericMethods.clickElement(WebReservation_Link);
    WebReservationHomePage WRP = PageFactory.initElements(GenericMethods.driver, WebReservationHomePage.class);
    return WRP;
	}
	catch(Exception e)
	{
		throw e;
	}
}

public  AdminLoginPage fn_AdminLink() throws Exception
{try{
	GenericMethods.clickElement(Admin_lnk);
	AdminLoginPage ALO = PageFactory.initElements(GenericMethods.driver, AdminLoginPage.class);
	return ALO;
}catch(Exception e){
	throw e;
}
}


public BasePage fn_clkAdminLnk() throws Exception
{
	try
	{
		Thread.sleep(6000);
	
	GenericMethods.clickElement(Admin_lnk);
	BasePage BP = PageFactory.initElements(GenericMethods.driver, BasePage.class);
	return BP;
	}
	catch(Exception e)
	{
		throw e;
	}
}




public LiveSupportLandingWindow fn_ClickLiveSupportButton() throws Exception
{

	 try
	 {
	   GenericMethods.clickElement(LiveSupport_BT);
       LiveSupportLandingWindow SRP = PageFactory.initElements(GenericMethods.driver, LiveSupportLandingWindow.class);
       return SRP;
	 }

	 catch(Exception e)
	 {
		 throw e;
	 }

 }



public ViewDetailsPage fn_RightclkSingles(WebElement ID, WebElement Link) throws Exception
{
	try
	{
	 //GenericMethods.clickElement(Current_Link);
    Actions action = new Actions(GenericMethods.driver);
    action.contextClick(ID).build().perform();
    GenericMethods.clickElement(Link);
    GenericMethods.ActionOnAlert("Accept");

    ViewDetailsPage VDP=PageFactory.initElements(GenericMethods.driver, ViewDetailsPage.class);
    return VDP;
	}
	catch(Exception e)
	{
		throw e;
	}
}


public ViewDetailsPage fn_RightclkSingle(WebElement ID, WebElement Link) throws Exception
{
	try
	{
	 GenericMethods.clickElement(Current_Link);
    Actions action = new Actions(GenericMethods.driver);
    Thread.sleep(3000);
    action.contextClick(ID).build().perform();
    GenericMethods.clickElement(Link);
    GenericMethods.ActionOnAlert("Accept");

    ViewDetailsPage VDP=PageFactory.initElements(GenericMethods.driver, ViewDetailsPage.class);
    return VDP;
	}
	catch(Exception e)
	{
		throw e;
	}
}

public ViewDetailsPage fn_rightclkViewDetailsSingle(WebElement ID, WebElement Link) throws Exception
{
	try
	{
	 GenericMethods.clickElement(Current_Link);
    Actions action = new Actions(GenericMethods.driver);
    action.contextClick(ID).build().perform();
    GenericMethods.clickElement(Link);

    ViewDetailsPage VDP=PageFactory.initElements(GenericMethods.driver, ViewDetailsPage.class);
    return VDP;
	}
	catch(Exception e)
	{
		throw e;
	}
	
}

public void fn_GroupCheckIN() throws Exception
{

  	 try
  	 {
  		Thread.sleep(2000);
  		GenericMethods.clickElement(ContinueToCheckIn_BT);
  	 }
  	 catch(Exception e)
  	 {
  		 throw e;
  	 }

}


public ReportLandingPage fn_ReportButton() throws Exception
{
	try
	{
		Thread.sleep(9000);
	GenericMethods.clickElement(Report_BT);
    ReportLandingPage BP = PageFactory.initElements(GenericMethods.driver, ReportLandingPage.class);
	return BP;
	}
	catch(Exception e)
	{
		throw e;
	}
}


public WebReservationHomePage ClickOnWebReservation() throws Exception
{
	try
	{
GenericMethods.clickElement(WebReservation_Link);
WebReservationHomePage WRC=PageFactory.initElements(GenericMethods.driver,WebReservationHomePage.class);
return WRC;
	}
	catch(Exception e)
	{
		throw e;
	}

}


public NightAuditLandingPage fn_AutoNightAudit() throws Exception
{
	try
	{
	GenericMethods.js_Click(AutoNightAuditBtn);
	NightAuditLandingPage NAP=PageFactory.initElements(GenericMethods.driver, NightAuditLandingPage.class);
	return NAP;
	}
	catch(Exception e)
	{
		throw e;
	}
}


public void fn_AutoNightAudit1() throws Exception
{
	try
	{
	GenericMethods.js_Click(AutoNightAuditBtn);
	}catch(NoAlertPresentException e){
		Thread.sleep(3000);
		GenericMethods.js_Click(AutoNightAuditBtn);
	}
	catch(UnhandledAlertException e)
	{
		//GenericMethods.Alert_Accept();
		GenericMethods.driver.navigate().refresh();
		Thread.sleep(4000);
		GenericMethods.js_Click(AutoNightAuditBtn);
	}catch(Exception e){
		throw e;
	}
}


public void fn_RefreshFrontdesk() throws Exception
{


	GenericMethods.driver.navigate().refresh();
	if(Cancel_BT.isDisplayed()==true)
	{
		GenericMethods.clickElement(Cancel_BT);
		GenericMethods.ActionOnAlert("Accept");
	}
	else
	{
		System.out.println("Alert is not found");
	}

}



public NightAuditLandingPage fn_ClickPerformNightAudit_Link() throws Exception
{
  	 try
  	 {
  		GenericMethods.mouseOverElement(Frontdesk_BT);
  		GenericMethods.js_Click(PerformNightAudit_Link);


  	 }
  	 catch(Exception e)
  	 {
  		e.getMessage();
  	 }

  	 NightAuditLandingPage NAP=PageFactory.initElements(GenericMethods.driver, NightAuditLandingPage.class);
		return NAP;

}



public void fn_SetDNRDate() throws Exception
{

  	 try{
  		GenericMethods.clickElement(FromCal_DNRPopUp);
  		GenericMethods.clickElement(DateInCal_DNRPopUp);
  		GenericMethods.clickElement(ToCal_DNRPopUp);
  		GenericMethods.clickElement(DateInCal_DNRPopUp);
  		GenericMethods.sendKeys(TextBox_DNRPopUp, "Test");
  		GenericMethods.clickElement(Submit_DNRPopUp);
  	 }catch(Exception e){
  		 throw e;
  	 }
    }

    public void fn_DeleteDNR() throws Exception{

  	 try{
  		GenericMethods.clickElement(DNR_Reservation);
  		Thread.sleep(2000);
  		GenericMethods.clickElement(DeleteIcon_DNRPopUp);
  		GenericMethods.clickElement(OKbutton_DNRPopUp);
  		Thread.sleep(5000);
  	 }catch(Exception e){
  		 throw e;
  	 }
    }




    public void fn_ValidateDNRPopUp_Title() throws Exception
    {

      	 try
      	 {
      	   String str= GenericMethods.getText(DNR_PopUp);
      	   Assert.assertEquals(str, "DNR Room#209");
      	 }
      	 catch(Exception e)
      	 {
      		 throw e;
      	 }
           }

    public void fn_ValidateDNR_PopUp(WebElement roomNum, WebElement link) throws Exception
    {

      	 try
      	 {
      		 GenericMethods.clickElement(Current_Link);
      		 Thread.sleep(5000);
      		 GenericMethods.clickElement(Rooms_CB);
      	     Actions action = new Actions(GenericMethods.driver);
             action.contextClick(roomNum).build().perform();

             GenericMethods.clickElement(link);
      	 }
      	 catch(Exception e)
      	 {
      		 throw e;
      	 }

    }


public BasePage fn_NavigateAdminConsole()
{
	Actions act = new Actions(GenericMethods.driver);
	act.moveToElement(new FrontdeskLandingPage().Admin_lnk).contextClick().sendKeys("T").perform();
	act.sendKeys(Keys.chord(Keys.CONTROL,Keys.TAB)).perform();
	GenericMethods.driver.switchTo().defaultContent();
    BasePage BP=PageFactory.initElements(GenericMethods.driver, BasePage.class);
    return BP;

}





public void WindowScroll() throws InterruptedException
{
JavascriptExecutor jsx = (JavascriptExecutor)GenericMethods.driver;
Thread.sleep(2000);
jsx.executeScript("scroll(250, 0)");
//	  Actions action = new Actions(GenericMethods.driver);
//      action.sendKeys(Keys.PAGE_UP);

}


public void windowScrollUp()
{
	JavascriptExecutor jsx = (JavascriptExecutor)GenericMethods.driver;
	jsx.executeScript("scroll(0, -550)");

}

public  void getCountOfRooms1()
{
	   List<WebElement> rooms = GenericMethods.driver.findElements(By.xpath("//div[@id='rmtypehide44859']/div"));
	   int count = rooms.size();
	   System.out.println("Count: "+count);

	   for(int i = 0; i<count;i++)
	   {
		   String rm = rooms.get(i).getText();
		  // System.out.println(rm);
	   }
	List<WebElement> ChkBoxCount=GenericMethods.driver.findElements(By.xpath("//div[@id='rmtypehide44859']/div/div/input"));
 int count1 = ChkBoxCount.size();




WebElement abcd=ChkBoxCount.get(count1-1);
 abcd.click();

 //Code for Group booking....//

 /*

 WebElement abcd1=ChkBoxCount.get(count1-2);
 abcd1.click();

 WebElement abcd2=ChkBoxCount.get(count1-3);
 abcd2.click();

 WebElement abcd3=ChkBoxCount.get(count1-4);
 abcd3.click();


 */

//GenericMethods.js_Click(abcd);



}

public void fn_chkInclPkg() throws Exception
{

	Set<String> handles = GenericMethods.driver.getWindowHandles();

    int count = handles.size();


	Select sel=new Select(dd_rateType);
	List<WebElement> arr=sel.getOptions();
	int count1=arr.size();
	for(int i=0;i<count;i++)
	{
		String type=arr.get(i).getText();
		if(type.equals("Sample Package FD"))
		{
			    GenericMethods.driver.findElement(By.xpath("//select[@id='qrSelRateType']//option["+i+"]")).click();
			    WebElement ele2=GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtFirstName']"));
			    GenericMethods.js_Sendkey(ele2, "res");
				WebElement ele3 = GenericMethods.driver.findElement(By.xpath("//select[@id='salutation']"));
//				System.out.println(value);
				Select select = new Select(ele3);
				select.selectByValue("Mr.");
				Thread.sleep(2000);
				WebElement ele4=GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtLastName']"));
				GenericMethods.js_Sendkey(ele4, "Sample");
				//	mouse.mouseUp(c);
				Thread.sleep(1500);
				GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtPhone']")).sendKeys("9987");
				Thread.sleep(2000);
				GenericMethods.driver.findElement(By.xpath("//input[@id='qrEmail']")).sendKeys("kk@yahoo.com");
				Thread.sleep(2000);
				GenericMethods.driver.findElement(By.xpath("//button[@id='qrBtnReserve-button']")).click();
		}

		else
		{
			fn_NavigateAdminConsole();
		}
	}
}

public void fn_clk2Rooms()
{

	   List<WebElement> rooms = GenericMethods.driver.findElements(By.xpath("//div[@id='rmtypehide44859']/div"));
	   int count = rooms.size();
	   System.out.println("Count: "+count);

	   for(int i = 0; i<count;i++)


	   {
		   String rm = rooms.get(i).getText();
		  // System.out.println(rm);
	   }
	List<WebElement> ChkBoxCount=GenericMethods.driver.findElements(By.xpath("//div[@id='rmtypehide44859']/div/div/input"));
int count1 = ChkBoxCount.size();




WebElement abcd=ChkBoxCount.get(count1-1);
abcd.click();

//Code for Group booking....//



WebElement abcd1=ChkBoxCount.get(count1-2);
abcd1.click();

}


public void fn_clk3Rooms() throws InterruptedException
{

	   List<WebElement> rooms = GenericMethods.driver.findElements(By.xpath("//div[@id='rmtypehide44859']/div"));
	   int count = rooms.size();
	   System.out.println("Count: "+count);

	   for(int i = 0; i<count;i++)


	   {
		   String rm = rooms.get(i).getText();
		  // System.out.println(rm);
	   }
	List<WebElement> ChkBoxCount=GenericMethods.driver.findElements(By.xpath("//div[@id='rmtypehide44859']/div/div/input"));
int count1 = ChkBoxCount.size();




WebElement abcd=ChkBoxCount.get(count1-1);
abcd.click();

//Code for Group booking....//



WebElement abcd1=ChkBoxCount.get(count1-2);
GenericMethods.js_Click(abcd1);

WebElement abcd2=ChkBoxCount.get(count1-3);
GenericMethods.js_Click(abcd2);


}



public void fn_SingleResrvOneNT() throws InterruptedException, AWTException
{

	WebElement ele = GenericMethods.driver.findElement(By.xpath("//div[@id='bookingOwner']"));

	Dimension d1 = ele.getSize();
	System.out.println("Height:"+d1.height + "Width:" + d1.width);
	int Height = d1.height;
	int Width = d1.width;

	WebElement ele2 = GenericMethods.driver.findElement(By.xpath("//div[starts-with(@id,'rthead')]"));

	float WidthOfEachCell = (float) (Width/30.00);


	Point location = ele.getLocation();



	//..................aka.............................//
	Point location2 = ele2.getLocation();

	int x2 = location2.x;
	int y2 = location2.y;

	y2 = y2+81;
	System.out.println(x2);
	int x3 = x2 + 231;

	int x4 = x3+9;

	//............aka....................................//




	Dimension size = ele.getSize();
	System.out.println(location);
	System.out.println(size);
//
//	int x = location.x;
//	int y = location.y;





//...................aka.............................//

	int FromCoordinates = x3;
	int ToCoordinates= y2;
//.........................aka.....................//







//	int FromCoordinates = x+63;
//	int ToCoordinates = y+470;
	Actions builer = new Actions(GenericMethods.driver);


	Thread.sleep(10000);
//	int x1 = (int) mousePt.getX();
//	int y1 = (int) mousePt.getY();
	Robot robot = new Robot();
	Thread.sleep(5000);
	robot.mouseMove(FromCoordinates, ToCoordinates);
	Thread.sleep(1500);



	robot.mousePress(InputEvent.BUTTON1_MASK);
	//robot.mouseMove(50, 20);
    robot.mouseMove(FromCoordinates+45, ToCoordinates);
	robot.mouseRelease(InputEvent.BUTTON1_MASK);

//		Locatable locat = (Locatable) ele;
//		Mouse mouse = ((HasInputDevices) GenericMethods.driver).getMouse();
//		org.openqa.selenium.interactions.internal.Coordinates c=locat.getCoordinates();
	//	FrontdeskTest.click(c);
	//	c.onScreen();


	//	mouse.mouseDown(c);


	Thread.sleep(2000);
}




public void fn_SingleResrvTwoRoomNT() throws InterruptedException, AWTException
{

	WebElement ele = GenericMethods.driver.findElement(By.xpath("//div[@id='bookingOwner']"));

	Dimension d1 = ele.getSize();
	System.out.println("Height:"+d1.height + "Width:" + d1.width);
	int Height = d1.height;
	int Width = d1.width;

	WebElement ele2 = GenericMethods.driver.findElement(By.xpath("//div[starts-with(@id,'rthead')]"));

	float WidthOfEachCell = (float) (Width/30.00);


	Point location = ele.getLocation();



	//..................aka.............................//
	Point location2 = ele2.getLocation();

	int x2 = location2.x;
	int y2 = location2.y;

	y2 = y2+81;
	System.out.println(x2);
	int x3 = x2 + 231;

	int x4 = x3+9;

	//............aka....................................//




	Dimension size = ele.getSize();
	System.out.println(location);
	System.out.println(size);
//
//	int x = location.x;
//	int y = location.y;





//...................aka.............................//

	int FromCoordinates = x3;
	int ToCoordinates= y2;
//.........................aka.....................//







//	int FromCoordinates = x+63;
//	int ToCoordinates = y+470;
	Actions builer = new Actions(GenericMethods.driver);


	Thread.sleep(10000);
//	int x1 = (int) mousePt.getX();
//	int y1 = (int) mousePt.getY();
	Robot robot = new Robot();
	Thread.sleep(5000);
	robot.mouseMove(FromCoordinates, ToCoordinates);
	Thread.sleep(1500);



	robot.mousePress(InputEvent.BUTTON1_MASK);
	//robot.mouseMove(50, 20);
    robot.mouseMove(FromCoordinates+45, ToCoordinates);
	robot.mouseRelease(InputEvent.BUTTON1_MASK);

//		Locatable locat = (Locatable) ele;
//		Mouse mouse = ((HasInputDevices) GenericMethods.driver).getMouse();
//		org.openqa.selenium.interactions.internal.Coordinates c=locat.getCoordinates();
	//	FrontdeskTest.click(c);
	//	c.onScreen();


	//	mouse.mouseDown(c);


	Thread.sleep(2000);
}



public void fn_SingleResrv_ThreeRoomNT() throws InterruptedException, AWTException
{

	WebElement ele = GenericMethods.driver.findElement(By.xpath("//div[@id='bookingOwner']"));

	Dimension d1 = ele.getSize();
	System.out.println("Height:"+d1.height + "Width:" + d1.width);
	int Height = d1.height;
	int Width = d1.width;

	WebElement ele2 = GenericMethods.driver.findElement(By.xpath("//div[starts-with(@id,'rthead')]"));

	float WidthOfEachCell = (float) (Width/30.00);


	Point location = ele.getLocation();



	//..................aka.............................//
	Point location2 = ele2.getLocation();

	int x2 = location2.x;
	int y2 = location2.y;

	y2 = y2+81;
	System.out.println(x2);
	int x3 = x2 + 231;

	int x4 = x3+9;

	//............aka....................................//




	Dimension size = ele.getSize();
	System.out.println(location);
	System.out.println(size);
//
//	int x = location.x;
//	int y = location.y;





//...................aka.............................//

	int FromCoordinates = x3;
	int ToCoordinates= y2;
//.........................aka.....................//







//	int FromCoordinates = x+63;
//	int ToCoordinates = y+470;
	Actions builer = new Actions(GenericMethods.driver);


	Thread.sleep(10000);
//	int x1 = (int) mousePt.getX();
//	int y1 = (int) mousePt.getY();
	Robot robot = new Robot();
	Thread.sleep(5000);
	robot.mouseMove(FromCoordinates, ToCoordinates);
	Thread.sleep(1500);



	robot.mousePress(InputEvent.BUTTON1_MASK);
	//robot.mouseMove(50, 20);
    robot.mouseMove(FromCoordinates+75, ToCoordinates);
	robot.mouseRelease(InputEvent.BUTTON1_MASK);

//		Locatable locat = (Locatable) ele;
//		Mouse mouse = ((HasInputDevices) GenericMethods.driver).getMouse();
//		org.openqa.selenium.interactions.internal.Coordinates c=locat.getCoordinates();
	//	FrontdeskTest.click(c);
	//	c.onScreen();


	//	mouse.mouseDown(c);


	Thread.sleep(2000);
}


public void fn_SingleResrv_FourNT() throws InterruptedException, AWTException
{

	WebElement ele = GenericMethods.driver.findElement(By.xpath("//div[@id='bookingOwner']"));

	Dimension d1 = ele.getSize();
	System.out.println("Height:"+d1.height + "Width:" + d1.width);
	int Height = d1.height;
	int Width = d1.width;

	WebElement ele2 = GenericMethods.driver.findElement(By.xpath("//div[starts-with(@id,'rthead')]"));

	float WidthOfEachCell = (float) (Width/30.00);


	Point location = ele.getLocation();



	//..................aka.............................//
	Point location2 = ele2.getLocation();

	int x2 = location2.x;
	int y2 = location2.y;

	y2 = y2+81;
	System.out.println(x2);
	int x3 = x2 + 231;

	int x4 = x3+9;

	//............aka....................................//




	Dimension size = ele.getSize();
	System.out.println(location);
	System.out.println(size);
//
//	int x = location.x;
//	int y = location.y;





//...................aka.............................//

	int FromCoordinates = x3;
	int ToCoordinates= y2;
//.........................aka.....................//







//	int FromCoordinates = x+63;
//	int ToCoordinates = y+470;
	Actions builer = new Actions(GenericMethods.driver);


	Thread.sleep(10000);
//	int x1 = (int) mousePt.getX();
//	int y1 = (int) mousePt.getY();
	Robot robot = new Robot();
	Thread.sleep(5000);
	robot.mouseMove(FromCoordinates, ToCoordinates);
	Thread.sleep(1500);



	robot.mousePress(InputEvent.BUTTON1_MASK);
	//robot.mouseMove(50, 20);
    robot.mouseMove(FromCoordinates+94, ToCoordinates);
	robot.mouseRelease(InputEvent.BUTTON1_MASK);

//		Locatable locat = (Locatable) ele;
//		Mouse mouse = ((HasInputDevices) GenericMethods.driver).getMouse();
//		org.openqa.selenium.interactions.internal.Coordinates c=locat.getCoordinates();
	//	FrontdeskTest.click(c);
	//	c.onScreen();


	//	mouse.mouseDown(c);


	Thread.sleep(2000);
}






public void fn_fillAddQuickResrv() throws InterruptedException
{
	Set<String> handles = GenericMethods.driver.getWindowHandles();

	int count = handles.size();

    WebElement ele2=GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtFirstName']"));
    GenericMethods.js_Sendkey(ele2, "res");

	WebElement ele3 = GenericMethods.driver.findElement(By.xpath("//select[@id='salutation']"));
//	System.out.println(value);
	Select select = new Select(ele3);
	select.selectByValue("Mr.");
	Thread.sleep(2000);
	WebElement ele4=GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtLastName']"));
	GenericMethods.js_Sendkey(ele4, "Sample");
	//	mouse.mouseUp(c);
	Thread.sleep(1500);
	GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtPhone']")).sendKeys("9987");
	Thread.sleep(2000);
	GenericMethods.driver.findElement(By.xpath("//input[@id='qrEmail']")).sendKeys("kk@yahoo.com");
	Thread.sleep(2000);
	GenericMethods.driver.findElement(By.xpath("//button[@id='qrBtnReserve-button']")).click();
//	String text=GenericMethods.getText(tooltip);
//	System.out.println(text);


	//Thread.sleep(50000);
}

public void fn_verify1RoomDD()
{
	Select sel=new Select(roomDD);
	String selRMNum=sel.getFirstSelectedOption().getText();
	Assert.assertEquals(selRMNum, "1");
}



public EnableEditingPage fn_fillAddQuickSingleLnk() throws Exception
{
	Set<String> handles = GenericMethods.driver.getWindowHandles();

	int count = handles.size();

	fn_verify1RoomDD();
    WebElement ele2=GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtFirstName']"));
   GenericMethods.js_Sendkey(ele2, "res");

	WebElement ele3 = GenericMethods.driver.findElement(By.xpath("//select[@id='salutation']"));
//	System.out.println(value);
	Select select = new Select(ele3);
	select.selectByValue("Mr.");
	Thread.sleep(2000);
	WebElement ele4=GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtLastName']"));
	GenericMethods.js_Sendkey(ele4, "Sample");
	//	mouse.mouseUp(c);
	Thread.sleep(1500);
	GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtPhone']")).sendKeys("9987");
	Thread.sleep(2000);
	GenericMethods.driver.findElement(By.xpath("//input[@id='qrEmail']")).sendKeys("kk@yahoo.com");
	Thread.sleep(2000);
	//GenericMethods.driver.findElement(By.xpath("//button[@id='qrBtnReserve-button']")).click();
//	String text=GenericMethods.getText(tooltip);
//	System.out.println(text);
    GenericMethods.clickElement(singleLnk);
    EnableEditingPage EEP=PageFactory.initElements(GenericMethods.driver, EnableEditingPage.class);
    return EEP;

	//Thread.sleep(50000);
}


public EnableEditingPage fn_clkSingleLnk() throws Exception
{
    GenericMethods.clickElement(singleLnk);
    Thread.sleep(7000);
    EnableEditingPage EEP=PageFactory.initElements(GenericMethods.driver, EnableEditingPage.class);
    return EEP;

}

public EnableEditingPage fn_clkGroupLnk() throws Exception
{
    GenericMethods.clickElement(link_Group);
    Thread.sleep(7000);
    EnableEditingPage EEP=PageFactory.initElements(GenericMethods.driver, EnableEditingPage.class);
    return EEP;

}


public EnableEditingPage fn_clkAgntCorpLnk() throws Exception
{
    GenericMethods.clickElement(ag_corp_Lnk);
    Thread.sleep(7000);
    EnableEditingPage EEP=PageFactory.initElements(GenericMethods.driver, EnableEditingPage.class);
    return EEP;

}




public EnableEditingPage fn_fillAddQuickGroupLnk() throws Exception
{
	Set<String> handles = GenericMethods.driver.getWindowHandles();

	int count = handles.size();

	fn_verify2RoomDD();
    WebElement ele2=GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtFirstName']"));
   GenericMethods.js_Sendkey(ele2, "res");

	WebElement ele3 = GenericMethods.driver.findElement(By.xpath("//select[@id='salutation']"));
//	System.out.println(value);
	Select select = new Select(ele3);
	select.selectByValue("Mr.");
	Thread.sleep(2000);
	WebElement ele4=GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtLastName']"));
	GenericMethods.js_Sendkey(ele4, "Sample");
	//	mouse.mouseUp(c);
	Thread.sleep(1500);
	GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtPhone']")).sendKeys("9987");
	Thread.sleep(2000);
	GenericMethods.driver.findElement(By.xpath("//input[@id='qrEmail']")).sendKeys("kk@yahoo.com");
	Thread.sleep(2000);
	//GenericMethods.driver.findElement(By.xpath("//button[@id='qrBtnReserve-button']")).click();
//	String text=GenericMethods.getText(tooltip);
//	System.out.println(text);
    GenericMethods.clickElement(link_Group);
    EnableEditingPage EEP=PageFactory.initElements(GenericMethods.driver, EnableEditingPage.class);
    return EEP;

	//Thread.sleep(50000);
}


public EnableEditingPage fn_fillAddQuickAgntCorpLnk() throws Exception
{
	Set<String> handles = GenericMethods.driver.getWindowHandles();

	int count = handles.size();

	fn_verify2RoomDD();
    WebElement ele2=GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtFirstName']"));
   GenericMethods.js_Sendkey(ele2, "res");

	WebElement ele3 = GenericMethods.driver.findElement(By.xpath("//select[@id='salutation']"));
//	System.out.println(value);
	Select select = new Select(ele3);
	select.selectByValue("Mr.");
	Thread.sleep(2000);
	WebElement ele4=GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtLastName']"));
	GenericMethods.js_Sendkey(ele4, "Sample");
	//	mouse.mouseUp(c);
	Thread.sleep(1500);
	GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtPhone']")).sendKeys("9987");
	Thread.sleep(2000);
	GenericMethods.driver.findElement(By.xpath("//input[@id='qrEmail']")).sendKeys("kk@yahoo.com");
	Thread.sleep(2000);
	//GenericMethods.driver.findElement(By.xpath("//button[@id='qrBtnReserve-button']")).click();
//	String text=GenericMethods.getText(tooltip);
//	System.out.println(text);
    GenericMethods.clickElement(ag_corp_Lnk);
    EnableEditingPage EEP=PageFactory.initElements(GenericMethods.driver, EnableEditingPage.class);
    return EEP;

	//Thread.sleep(50000);
}



public void fn_fillAddQuickSeasonR() throws Exception
{
	Set<String> handles = GenericMethods.driver.getWindowHandles();

	int count = handles.size();

	fn_verify1RoomDD();
	GenericMethods.selectElementByIndex(dd_rateType, 0);
    WebElement ele2=GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtFirstName']"));
    GenericMethods.js_Sendkey(ele2, "res");

	WebElement ele3 = GenericMethods.driver.findElement(By.xpath("//select[@id='salutation']"));
//	System.out.println(value);
	Select select = new Select(ele3);
	select.selectByValue("Mr.");
	Thread.sleep(2000);
	WebElement ele4=GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtLastName']"));
	GenericMethods.js_Sendkey(ele4, "Sample");
	//	mouse.mouseUp(c);
	Thread.sleep(1500);
	GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtPhone']")).sendKeys("9987");
	Thread.sleep(2000);
	GenericMethods.driver.findElement(By.xpath("//input[@id='qrEmail']")).sendKeys("kk@yahoo.com");
	Thread.sleep(2000);
	GenericMethods.driver.findElement(By.xpath("//button[@id='qrBtnReserve-button']")).click();
//	String text=GenericMethods.getText(tooltip);
//	System.out.println(text);


	//Thread.sleep(50000);
}

public void fn_fillAddQuickRackR() throws Exception
{
	Set<String> handles = GenericMethods.driver.getWindowHandles();

	int count = handles.size();

	fn_verify1RoomDD();
	GenericMethods.selectElementByIndex(dd_rateType, 1);
    WebElement ele2=GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtFirstName']"));
    GenericMethods.js_Sendkey(ele2, "res");

	WebElement ele3 = GenericMethods.driver.findElement(By.xpath("//select[@id='salutation']"));
//	System.out.println(value);
	Select select = new Select(ele3);
	select.selectByValue("Mr.");
	Thread.sleep(2000);
	WebElement ele4=GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtLastName']"));
	GenericMethods.js_Sendkey(ele4, "Sample");
	//	mouse.mouseUp(c);
	Thread.sleep(1500);
	GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtPhone']")).sendKeys("9987");
	Thread.sleep(2000);
	GenericMethods.driver.findElement(By.xpath("//input[@id='qrEmail']")).sendKeys("kk@yahoo.com");
	Thread.sleep(2000);
	GenericMethods.driver.findElement(By.xpath("//button[@id='qrBtnReserve-button']")).click();
//	String text=GenericMethods.getText(tooltip);
//	System.out.println(text);


	//Thread.sleep(50000);
}



public void fn_fillAddQuickTaxPkg() throws Exception
{
	Set<String> handles = GenericMethods.driver.getWindowHandles();

	int count = handles.size();

	fn_verify1RoomDD();
	//GenericMethods.selectElementByIndex(rateType, 1);
	Select sel=new Select(dd_rateType);
	sel.selectByVisibleText("Sample Inclusive of tax pkg FD (2N)");
    WebElement ele2=GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtFirstName']"));
    GenericMethods.js_Sendkey(ele2, "res");

	WebElement ele3 = GenericMethods.driver.findElement(By.xpath("//select[@id='salutation']"));
//	System.out.println(value);
	Select select = new Select(ele3);
	select.selectByValue("Mr.");
	Thread.sleep(2000);
	WebElement ele4=GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtLastName']"));
	GenericMethods.js_Sendkey(ele4, "Sample");
	//	mouse.mouseUp(c);
	Thread.sleep(1500);
	GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtPhone']")).sendKeys("9987");
	Thread.sleep(2000);
	GenericMethods.driver.findElement(By.xpath("//input[@id='qrEmail']")).sendKeys("kk@yahoo.com");
	Thread.sleep(2000);
	GenericMethods.driver.findElement(By.xpath("//button[@id='qrBtnReserve-button']")).click();
//	String text=GenericMethods.getText(tooltip);
//	System.out.println(text);


	//Thread.sleep(50000);
}


public void fn_fillAddQuickChocBarPkg() throws Exception
{
	Set<String> handles = GenericMethods.driver.getWindowHandles();

	int count = handles.size();

	fn_verify2RoomDD();
	//GenericMethods.selectElementByIndex(rateType, 1);
	Select sel=new Select(dd_rateType);
	sel.selectByVisibleText("Sample Choc Bar Pkg FD (1N)");
    WebElement ele2=GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtFirstName']"));
    GenericMethods.js_Sendkey(ele2, "res");

	WebElement ele3 = GenericMethods.driver.findElement(By.xpath("//select[@id='salutation']"));
//	System.out.println(value);
	Select select = new Select(ele3);
	select.selectByValue("Mr.");
	Thread.sleep(2000);
	WebElement ele4=GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtLastName']"));
	GenericMethods.js_Sendkey(ele4, "Sample");
	//	mouse.mouseUp(c);
	Thread.sleep(1500);
	GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtPhone']")).sendKeys("9987");
	Thread.sleep(2000);
	GenericMethods.driver.findElement(By.xpath("//input[@id='qrEmail']")).sendKeys("kk@yahoo.com");
	Thread.sleep(2000);
	GenericMethods.driver.findElement(By.xpath("//button[@id='qrBtnReserve-button']")).click();
//	String text=GenericMethods.getText(tooltip);
//	System.out.println(text);


	//Thread.sleep(50000);
}

public void fn_fillAddQuickChocBarPA() throws Exception
{
	Set<String> handles = GenericMethods.driver.getWindowHandles();

	int count = handles.size();

	fn_verify2RoomDD();
	//GenericMethods.selectElementByIndex(rateType, 1);
    GenericMethods.selectElementByIndex(adultDD, 1);
	Select sel=new Select(dd_rateType);
	sel.selectByVisibleText("Choc Bar PA Pkg (1N)");
    WebElement ele2=GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtFirstName']"));
    GenericMethods.js_Sendkey(ele2, "res");

	WebElement ele3 = GenericMethods.driver.findElement(By.xpath("//select[@id='salutation']"));
//	System.out.println(value);
	Select select = new Select(ele3);
	select.selectByValue("Mr.");
	Thread.sleep(2000);
	WebElement ele4=GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtLastName']"));
	GenericMethods.js_Sendkey(ele4, "Sample");
	//	mouse.mouseUp(c);
	Thread.sleep(1500);
	GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtPhone']")).sendKeys("9987");
	Thread.sleep(2000);
	GenericMethods.driver.findElement(By.xpath("//input[@id='qrEmail']")).sendKeys("kk@yahoo.com");
	Thread.sleep(2000);
	GenericMethods.driver.findElement(By.xpath("//button[@id='qrBtnReserve-button']")).click();
//	String text=GenericMethods.getText(tooltip);
//	System.out.println(text);


	//Thread.sleep(50000);
}



public void fn_verify2RoomDD()
{
	Select sel=new Select(roomDD);
	String selRMNum=sel.getFirstSelectedOption().getText();
	Assert.assertEquals(selRMNum, "2");
}


public void fn_verify3RoomDD()
{
	Select sel=new Select(roomDD);
	String selRMNum=sel.getFirstSelectedOption().getText();
	Assert.assertEquals(selRMNum, "3");
}


public void fn_fillAddQuickResrv2RM() throws InterruptedException
{
	Set<String> handles = GenericMethods.driver.getWindowHandles();

	int count = handles.size();
	fn_verify2RoomDD();

    WebElement ele2=GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtFirstName']"));
   GenericMethods.js_Sendkey(ele2, "res");

	WebElement ele3 = GenericMethods.driver.findElement(By.xpath("//select[@id='salutation']"));
//	System.out.println(value);
	Select select = new Select(ele3);
	select.selectByValue("Mr.");
	Thread.sleep(2000);
	WebElement ele4=GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtLastName']"));
	GenericMethods.js_Sendkey(ele4, "Sample");
	//	mouse.mouseUp(c);
	Thread.sleep(1500);
	GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtPhone']")).sendKeys("9987");
	Thread.sleep(2000);
	GenericMethods.driver.findElement(By.xpath("//input[@id='qrEmail']")).sendKeys("kk@yahoo.com");
	Thread.sleep(2000);
	GenericMethods.driver.findElement(By.xpath("//button[@id='qrBtnReserve-button']")).click();
//	String text=GenericMethods.getText(tooltip);
//	System.out.println(text);


	//Thread.sleep(50000);
}

public void fn_fillAddQuickResrvWeekPkg() throws InterruptedException
{
	Set<String> handles = GenericMethods.driver.getWindowHandles();

	int count = handles.size();
	fn_verify2RoomDD();
	Select sel=new Select(dd_rateType);
	sel.selectByVisibleText("Sample Weekly Rate pkg FD (2N)");
    WebElement ele2=GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtFirstName']"));
   GenericMethods.js_Sendkey(ele2, "res");

	WebElement ele3 = GenericMethods.driver.findElement(By.xpath("//select[@id='salutation']"));
//	System.out.println(value);
	Select select = new Select(ele3);
	select.selectByValue("Mr.");
	Thread.sleep(2000);
	WebElement ele4=GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtLastName']"));
	GenericMethods.js_Sendkey(ele4, "Sample");
	//	mouse.mouseUp(c);
	Thread.sleep(1500);
	GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtPhone']")).sendKeys("9987");
	Thread.sleep(2000);
	GenericMethods.driver.findElement(By.xpath("//input[@id='qrEmail']")).sendKeys("kk@yahoo.com");
	Thread.sleep(2000);
	GenericMethods.driver.findElement(By.xpath("//button[@id='qrBtnReserve-button']")).click();
//	String text=GenericMethods.getText(tooltip);
//	System.out.println(text);


	//Thread.sleep(50000);
}




public void fn_fillAddQuickResrv3RM() throws InterruptedException
{
	Set<String> handles = GenericMethods.driver.getWindowHandles();

	int count = handles.size();
	fn_verify3RoomDD();

    WebElement ele2=GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtFirstName']"));
   GenericMethods.js_Sendkey(ele2, "res");

	WebElement ele3 = GenericMethods.driver.findElement(By.xpath("//select[@id='salutation']"));
//	System.out.println(value);
	Select select = new Select(ele3);
	select.selectByValue("Mr.");
	Thread.sleep(2000);
	WebElement ele4=GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtLastName']"));
	GenericMethods.js_Sendkey(ele4, "Sample");
	//	mouse.mouseUp(c);
	Thread.sleep(1500);
	GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtPhone']")).sendKeys("9987");
	Thread.sleep(2000);
	GenericMethods.driver.findElement(By.xpath("//input[@id='qrEmail']")).sendKeys("kk@yahoo.com");
	Thread.sleep(2000);
	GenericMethods.driver.findElement(By.xpath("//button[@id='qrBtnReserve-button']")).click();
//	String text=GenericMethods.getText(tooltip);
//	System.out.println(text);


	//Thread.sleep(50000);
}


public void fn_fillAddQuick3RMSeasonR() throws Exception
{
	Set<String> handles = GenericMethods.driver.getWindowHandles();

	int count = handles.size();

	fn_verify3RoomDD();
	GenericMethods.selectElementByIndex(dd_rateType, 0);
    WebElement ele2=GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtFirstName']"));
    GenericMethods.js_Sendkey(ele2, "res");

	WebElement ele3 = GenericMethods.driver.findElement(By.xpath("//select[@id='salutation']"));
//	System.out.println(value);
	Select select = new Select(ele3);
	select.selectByValue("Mr.");
	Thread.sleep(2000);
	WebElement ele4=GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtLastName']"));
	GenericMethods.js_Sendkey(ele4, "Sample");
	//	mouse.mouseUp(c);
	Thread.sleep(1500);
	GenericMethods.driver.findElement(By.xpath("//input[@id='qrTxtPhone']")).sendKeys("9987");
	Thread.sleep(2000);
	GenericMethods.driver.findElement(By.xpath("//input[@id='qrEmail']")).sendKeys("kk@yahoo.com");
	Thread.sleep(2000);
	GenericMethods.driver.findElement(By.xpath("//button[@id='qrBtnReserve-button']")).click();
//	String text=GenericMethods.getText(tooltip);
//	System.out.println(text);


	//Thread.sleep(50000);
}

public void fn_ChkinResrv1NT() throws InterruptedException, AWTException
{

	   List<WebElement> rooms = GenericMethods.driver.findElements(By.xpath("//div[@id='rmtypehide44859']/div"));
	   int count = rooms.size();
	   System.out.println("Count: "+count);

	   for(int i = 0; i<count;i++)


	   {
		   String rm = rooms.get(i).getText();
		  // System.out.println(rm);
	   }
	//List<WebElement> ChkBoxCount=GenericMethods.driver.findElements(By.xpath("//div[@id='rmtypehide44859']/div/div/input"));
	   List<WebElement> ChkBoxCount=GenericMethods.driver.findElements(By.xpath("//div[starts-with(@id,'rthead')]"));
	   int count1 = ChkBoxCount.size();



//	   List<WebElement> ChkBoxCount1=GenericMethods.driver.findElements(By.xpath("(//div[starts-with(@id,'rthead')])[1]//input"));
//       int count2=ChkBoxCount1.size();



	   List<WebElement> ChkBoxCount2=GenericMethods.driver.findElements(By.xpath("(//div[starts-with(@id,'rmtypehide')])[2]/div"));
       int count2=ChkBoxCount2.size();

       List<WebElement> ChkBoxCount3=GenericMethods.driver.findElements(By.xpath("(//div[starts-with(@id,'rmtypehide')])[3]/div"));
       int count3=ChkBoxCount3.size();

       List<WebElement> ChkBoxCount4=GenericMethods.driver.findElements(By.xpath("(//div[starts-with(@id,'rmtypehide')])[4]/div"));
       int count4=ChkBoxCount4.size();


       int totalcount=count+count1+count2+count3+count4;

WebElement abcd=ChkBoxCount.get(count1-1);
abcd.click();

//Code for Group booking....//
//int totalCount=count+count1+count2+count3+count4;

WebElement ele = GenericMethods.driver.findElement(By.xpath("//div[@id='bookingOwner']"));

Dimension d1 = ele.getSize();
System.out.println("Height:"+d1.height + "Width:" + d1.width);
int Height = d1.height;
int Width = d1.width;

WebElement ele2 = GenericMethods.driver.findElement(By.xpath("//div[starts-with(@id,'rthead')]"));

float WidthOfEachCell = (float) (Width/30.00);
float HeightOfEachCell=(float) (Height/(totalcount));

Point location = ele.getLocation();



//..................aka.............................//
Point location2 = ele2.getLocation();

int x2 = location2.x;
int y2 = location2.y;

y2 = (int) (y2+(count1*HeightOfEachCell)+190);
System.out.println(x2);
int x3 = x2 + 231;

int x4 = x3+9;

//............aka....................................//




Dimension size = ele.getSize();
System.out.println(location);
System.out.println(size);
//
//int x = location.x;
//int y = location.y;





//...................aka.............................//

int FromCoordinates = x3;
int ToCoordinates= y2;
//.........................aka.....................//







//int FromCoordinates = x+63;
//int ToCoordinates = y+470;
Actions builer = new Actions(GenericMethods.driver);


Thread.sleep(10000);
//int x1 = (int) mousePt.getX();
//int y1 = (int) mousePt.getY();
Robot robot = new Robot();
Thread.sleep(5000);
robot.mouseMove(FromCoordinates, ToCoordinates);
Thread.sleep(1500);



robot.mousePress(InputEvent.BUTTON1_MASK);
//robot.mouseMove(50, 20);
robot.mouseMove(FromCoordinates+10, ToCoordinates);
robot.mouseRelease(InputEvent.BUTTON1_MASK);


}

//public void fn_verifyReserv() throws InterruptedException, AWTException
//{
//
//	List<WebElement> ChkBoxCount=GenericMethods.driver.findElements(By.xpath("//div[starts-with(@id,'rthead')]"));
//	   int count = ChkBoxCount.size();
//
//
//	   WebElement abcd=ChkBoxCount.get(count-1);
//	   abcd.click();
//
//
//
//	   WebElement ele = GenericMethods.driver.findElement(By.xpath("//div[@id='bookingOwner']"));
//
//	   Dimension d1 = ele.getSize();
//	   System.out.println("Height:"+d1.height + "Width:" + d1.width);
//	   int Height = d1.height;
//	   int Width = d1.width;
//
//	   //WebElement ele2 = GenericMethods.driver.findElement(By.xpath("//div[starts-with(@id,'rthead')]"));
//
//	   WebElement ele2 = GenericMethods.driver.findElement(By.xpath("//div[starts-with(@id,'rthead')]"));
//
//
//	   float WidthOfEachCell = (float) (Width/30.00);
//
//
//
//	   List<WebElement> rooms = GenericMethods.driver.findElements(By.xpath("//div[@id='rmtypehide44859']/div"));
//	   int count1 = rooms.size();
//	   System.out.println("Count: "+count1);
//
//	   for(int i = 0; i<count1;i++)
//
//
//	   {
//		   String rm = rooms.get(i).getText();
//		   if(rm.contains(SaveRoomsPage.roomNumber))
//		   {
//			   WebElement ele3=GenericMethods.driver.findElement(By.xpath("(//div[starts-with(@id,'rmtypehide')])[1]//div["+i+"]//div"));
//			   Point location2 = ele3.getLocation();
//
//			   int x2 = location2.x;
//			   int y2 = location2.y;
//
//			   System.out.println(x2);
//			   int x3 = x2 + 231;
//
//			   int x4 = x3+9;
//
//			   int FromCoordinates = x3;
//			   int ToCoordinates= y2;
//
//			   Actions builer = new Actions(GenericMethods.driver);
//
//
//			   Thread.sleep(10000);
//			   //int x1 = (int) mousePt.getX();
//			   //int y1 = (int) mousePt.getY();
//			   Robot robot = new Robot();
//			   Thread.sleep(5000);
//			   robot.mouseMove(FromCoordinates, ToCoordinates);
//			   Thread.sleep(1500);
//
//
//
//			   robot.mousePress(InputEvent.BUTTON1_MASK);
//			   //robot.mouseMove(50, 20);
//			   robot.mouseMove(FromCoordinates+10, ToCoordinates);
//			   robot.mouseRelease(InputEvent.BUTTON1_MASK);
//			   break;
//
//
//		   }
//		  // System.out.println(rm);
//	   }
//
//
//
//
//}






public void fn_clickOnNewlyCreatedReservation(){
	WebElement ele1=GenericMethods.driver.findElement(By.cssSelector("div.rs-new"));
	   Boolean b=ele1.isDisplayed();
	   System.out.println(b);
	   String ele=ele1.getAttribute("class");
	   if(b.equals(true))
	   {
		   System.out.println("Reservation has been successfully saved on tapechart");
		   ele1.click();
	   }

	   else
	   {
		   System.out.println("Reservation failed");
	   }
}




public void fn_verifyReservation()
{
	WebElement ele1=GenericMethods.driver.findElement(By.cssSelector("div.rs-new"));
	   Boolean b=ele1.isDisplayed();
	   System.out.println(b);
	   String ele=ele1.getAttribute("class");
	   resvId=ele1.getAttribute("resrvid");
	   if(b.equals(true))
	   {
		   System.out.println("Reservation has been successfully saved on tapechart");
		   
	   }

	   else
	   {
		   System.out.println("Reservation failed");
	   }
}



public WebElement  getWebElement(String rid){
	
	WebElement ele=GenericMethods.driver.findElement(By.xpath("//div[@resrvid='"+rid+"']"));
	
	return ele;
}





public void fn_rightClickOnReservation(WebElement ele) throws Exception{
try{
	Thread.sleep(2000);
Actions action = new Actions(GenericMethods.driver).contextClick(ele);
Thread.sleep(2000);
action.build().perform();
Thread.sleep(2000);
}
catch(Exception e){
throw e;
}
	
}





public void fn_verifyResFromDetailPage()
{
	WebElement ele1=GenericMethods.driver.findElement(By.cssSelector("div.rs-new"));
	   Boolean b=ele1.isDisplayed();
	   System.out.println(b);
	   String ele=ele1.getAttribute("class");
	   if(b.equals(true))
	   {
		   System.out.println("Reservation has been successfully saved on tapechart");
		   ele1.click();
	   }

	   else
	   {
		   System.out.println("Reservation failed");
	   }
}


public ViewDetailsPage ClickOnView(){
	
	
	ViewDetailsPage VDP=PageFactory.initElements(GenericMethods.driver, ViewDetailsPage.class);
	return VDP;
	
}


public CheckinCard fn_verifyReservAndCheckin() throws Exception
{
   WebElement ele1=GenericMethods.driver.findElement(By.cssSelector("div.rs-new"));
   Boolean b=ele1.isDisplayed();
   System.out.println(b);
   String ele=ele1.getAttribute("class");
   if(b.equals(true))
   {
	   System.out.println("Reservation has been successfully saved on tapechart");
	   Actions obj=new Actions(GenericMethods.driver);
	   obj.contextClick(ele1).build().perform();
	   GenericMethods.clickElement(grpcheckin);
	   GenericMethods.ActionOnAlert("Accept");
   }
   else
   {
	   System.out.println("Reservation failed");
   }

Thread.sleep(6000);
CheckinCard CC=PageFactory.initElements(GenericMethods.driver, CheckinCard.class);
return CC;
}



public  ViewDetailsPage fn_clkViewBtn() throws Exception
{
   GenericMethods.clickElement(viewBtn);
   ViewDetailsPage VDP=PageFactory.initElements(GenericMethods.driver, ViewDetailsPage.class);
   return VDP;
}


public void fn_verifyAddQuickResrvTitle() throws InterruptedException
{
	Thread.sleep(2000);
   String text=GenericMethods.getText(addQuickResrv);
   Assert.assertEquals(text, "Add Quick Reservation");
}

public ViewDetailsPage fn_Rightclk(WebElement ID, WebElement Link) throws Exception
{try{
	 //GenericMethods.clickElement(Current_Link);
	
    Actions action = new Actions(GenericMethods.driver);
    Thread.sleep(2000);
    action.moveToElement(ID).contextClick().build().perform();
    GenericMethods.js_Click(Link);
    GenericMethods.ActionOnAlert("Accept");

    ViewDetailsPage VDP=PageFactory.initElements(GenericMethods.driver, ViewDetailsPage.class);
    return VDP;
}catch(Exception e){
	throw e;
}
}





public AddQuickReservationForm fn_ChkinResrv1NT(int iTestCaseRow) throws Exception
{

   List<WebElement> ele=GenericMethods.driver.findElements(By.xpath("//div[starts-with(@id,'rthead')]"));
   int RTsize=ele.size();
   for(int j=0;j<=RTsize-1;j++)
   {
       String str=ele.get(j).getText().trim();
       System.out.println(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_RoomTypeName)));
       if(str.trim().equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_RoomTypeName))))
           {
              Assert.assertEquals(str, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_RoomTypeName)));
              
            //List<WebElement> rooms = GenericClass.driver.findElements(By.xpath("(//div[starts-with(@id,'rowheaders')])["+j+"]/div/div"));

               String countOfRT =  ele.get(j).getAttribute("roomcount");
               String idRT=ele.get(j).getAttribute("id");
              
               WebElement ele1=GenericMethods.driver.findElement(By.id(idRT));
               int count=Integer.parseInt(countOfRT);
               System.out.println("Room Count: "+count);
               
               
               GenericMethods.driver.findElements(By.xpath("//input[starts-with(@id,'chk_room_')]")).get(count-1).click();
            		   
               

          
               //List<WebElement> rooms=GenericMethods.driver.findElements(By.xpath("(//div[starts-with(@id,'rowheaders')])["+j+"]//div"));
             
               //GenericMethods.driver.findElement(By.xpath("(//div[starts-with(@id,'rowheaders')])["+j+"]//div[starts-with(@id,'rhead')]/div/input"));
//               int count1 = size();
              /* for(WebElement rm:rooms)
               {
            	   if( rm.getText().equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_RoomNames))))
            	   {
            		 rm.click();
            	   }
               }
              */ 
               
               
              // List<WebElement> ChkBoxCount=GenericMethods.driver.findElements(By.xpath("//div[@id='rmtypehide44859']/div/div/input"));
            

            /*  WebElement abcd=rooms.get(count1-1);
               abcd.click();*/

               

                       Dimension d1 = ele1.getSize();
                       System.out.println("Height:"+d1.height + "Width:" + d1.width);
                       int Height = d1.height;
                       int Width = d1.width;
                      
                       float WidthOfEachCell = (float) (Width/30.00);
                       float HeightOfEachCell=(float) (Height/(count));

                       Point location = ele1.getLocation();
                      
                       int x2 = location.x;
                       int y2 = location.y;

                        y2 = (int) (y2+(count*HeightOfEachCell)+65);
                       System.out.println(x2);
                     
                       int x3 = x2 + 251;
                       int x4 = x3+9;
                      
                       int FromCoordinates = x3;
                       int ToCoordinates= y2;

                       Actions builer = new Actions(GenericMethods.driver);


                      Thread.sleep(10000);
                      Robot robot = new Robot();
                      Thread.sleep(5000);
                      robot.mouseMove(FromCoordinates, ToCoordinates);
                      Thread.sleep(2000);



                      robot.mousePress(InputEvent.BUTTON1_MASK);
                      robot.mouseMove(FromCoordinates+45, ToCoordinates);
                      Thread.sleep(2000);
                      robot.mouseRelease(InputEvent.BUTTON1_MASK);
                      
                      Thread.sleep(4000);
                      
                      break;

                     // break;

                   //}
                  
                 // break;
               //}
           }
       
      
   }
   AddQuickReservationForm AQRF=PageFactory.initElements(GenericMethods.driver, AddQuickReservationForm.class);
   return AQRF;
    
     
    /*//List<WebElement> ChkBoxCount=GenericMethods.driver.findElements(By.xpath("//div[@id='rmtypehide44859']/div/div/input"));
       List<WebElement> ChkBoxCount=GenericClass.driver.findElements(By.xpath("//div[starts-with(@id,'rthead')]"));
       int count1 = ChkBoxCount.size();



//       List<WebElement> ChkBoxCount1=GenericMethods.driver.findElements(By.xpath("(//div[starts-with(@id,'rthead')])[1]//input"));
//       int count2=ChkBoxCount1.size();



       List<WebElement> ChkBoxCount2=GenericClass.driver.findElements(By.xpath("(//div[starts-with(@id,'rmtypehide')])[2]/div"));
       int count2=ChkBoxCount2.size();

       List<WebElement> ChkBoxCount3=GenericClass.driver.findElements(By.xpath("(//div[starts-with(@id,'rmtypehide')])[3]/div"));
       int count3=ChkBoxCount3.size();

       List<WebElement> ChkBoxCount4=GenericClass.driver.findElements(By.xpath("(//div[starts-with(@id,'rmtypehide')])[4]/div"));
       int count4=ChkBoxCount4.size();


       int totalcount=count
               +count1+count2+count3+count4;

WebElement abcd=ChkBoxCount.get(count1-1);
abcd.click();

//Code for Group booking....//
//int totalCount=count+count1+count2+count3+count4;

WebElement ele1 = GenericClass.driver.findElement(By.xpath("//div[@id='bookingOwner']"));

Dimension d1 = ele1.getSize();
System.out.println("Height:"+d1.height + "Width:" + d1.width);
int Height = d1.height;
int Width = d1.width;

WebElement ele2 = GenericClass.driver.findElement(By.xpath("//div[starts-with(@id,'rthead')]"));

float WidthOfEachCell = (float) (Width/30.00);
float HeightOfEachCell=(float) (Height/(totalcount));

Point location = ele1.getLocation();



//..................aka.............................//
Point location2 = ele2.getLocation();

int x2 = location2.x;
int y2 = location2.y;

y2 = (int) (y2+(count1*HeightOfEachCell)+190);
System.out.println(x2);
int x3 = x2 + 231;

int x4 = x3+9;

//............aka....................................//




Dimension size = ele.getSize();
System.out.println(location);
System.out.println(size);
//
//int x = location.x;
//int y = location.y;





//...................aka.............................//

int FromCoordinates = x3;
int ToCoordinates= y2;
//.........................aka.....................//







//int FromCoordinates = x+63;
//int ToCoordinates = y+470;
Actions builer = new Actions(GenericClass.driver);


Thread.sleep(10000);
//int x1 = (int) mousePt.getX();
//int y1 = (int) mousePt.getY();
Robot robot = new Robot();
Thread.sleep(5000);
robot.mouseMove(FromCoordinates, ToCoordinates);
Thread.sleep(1500);



robot.mousePress(InputEvent.BUTTON1_MASK);
//robot.mouseMove(50, 20);
robot.mouseMove(FromCoordinates+10, ToCoordinates);
robot.mouseRelease(InputEvent.BUTTON1_MASK);
*/

}



public AddQuickReservationForm fn_DragAndDrop_FD() throws InterruptedException, AWTException
{

	WebElement ele = GenericMethods.driver.findElement(By.xpath("//div[@id='bookingOwner']"));

	Dimension d1 = ele.getSize();
	System.out.println("Height:"+d1.height + "Width:" + d1.width);
	int Height = d1.height;
	int Width = d1.width;

	WebElement ele2 = GenericMethods.driver.findElement(By.xpath("//div[starts-with(@id,'rthead')]"));

	float WidthOfEachCell = (float) (Width/30.00);


	Point location = ele.getLocation();



	//..................aka.............................//
	Point location2 = ele2.getLocation();

	int x2 = location2.x;
	int y2 = location2.y;

	y2 = y2+81;
	System.out.println(x2);
	int x3 = x2 + 231;

	int x4 = x3+9;

	//............aka....................................//




	Dimension size = ele.getSize();
	System.out.println(location);
	System.out.println(size);
//
//	int x = location.x;
//	int y = location.y;





//...................aka.............................//

	int FromCoordinates = x3;
	int ToCoordinates= y2;
//.........................aka.....................//







//	int FromCoordinates = x+63;
//	int ToCoordinates = y+470;
	Actions builer = new Actions(GenericMethods.driver);


	Thread.sleep(10000);
//	int x1 = (int) mousePt.getX();
//	int y1 = (int) mousePt.getY();
	Robot robot = new Robot();
	Thread.sleep(5000);
	robot.mouseMove(FromCoordinates, ToCoordinates);
	Thread.sleep(1500);



	robot.mousePress(InputEvent.BUTTON1_MASK);
	//robot.mouseMove(50, 20);
    robot.mouseMove(FromCoordinates+45, ToCoordinates);
	robot.mouseRelease(InputEvent.BUTTON1_MASK);

//		Locatable locat = (Locatable) ele;
//		Mouse mouse = ((HasInputDevices) GenericMethods.driver).getMouse();
//		org.openqa.selenium.interactions.internal.Coordinates c=locat.getCoordinates();
	//	FrontdeskTest.click(c);
	//	c.onScreen();


	//	mouse.mouseDown(c);


	Thread.sleep(2000);
	
	AddQuickReservationForm AQRF=PageFactory.initElements(GenericMethods.driver,AddQuickReservationForm.class);
	return AQRF;
	
}






public AddQuickReservationForm DragAndDropFor1N(String rtype) throws Exception{
	
	 List<WebElement> ele=GenericMethods.driver.findElements(By.xpath("//div[starts-with(@id,'rthead')]"));
	   int RTsize=ele.size();
	   for(int j=0;j<=RTsize-1;j++)
	   {
	       String str=ele.get(j).getText().trim();
	      
	       if(str.trim().equals(rtype))
	           {
	              Assert.assertEquals(str, rtype);
	              
	        
	               String countOfRT =  ele.get(j).getAttribute("roomcount");
	               String idRT=ele.get(j).getAttribute("id");
	              
	               WebElement ele1=GenericMethods.driver.findElement(By.id(idRT));
	               int count=Integer.parseInt(countOfRT);
	               System.out.println("Room Count: "+count);
	              

	                       Dimension d1 = ele1.getSize();
	                       System.out.println("Height:"+d1.height + "Width:" + d1.width);
	                       int Height = d1.height;
	                       int Width = d1.width;
	                      
	                       float WidthOfEachCell = (float) (Width/30.00);
	                       float HeightOfEachCell=(float) (Height/(count));

	                       Point location = ele1.getLocation();
	                      
	                       int x2 = location.x;
	                       int y2 = location.y;

	                        y2 = (int) (y2+(count*HeightOfEachCell)+65);
	                       System.out.println(x2);
	                     
	                       int x3 = x2 + 251;
	                       int x4 = x3+9;
	                      
	                       int FromCoordinates = x3;
	                       int ToCoordinates= y2;

	                       Actions builer = new Actions(GenericMethods.driver);


	                      Thread.sleep(10000);
	                      Robot robot = new Robot();
	                      Thread.sleep(5000);
	                      robot.mouseMove(FromCoordinates, ToCoordinates);
	                      Thread.sleep(2000);



	                      robot.mousePress(InputEvent.BUTTON1_MASK);
	                      Thread.sleep(2000);
	                      robot.mouseMove(FromCoordinates+10, ToCoordinates);
	                      Thread.sleep(2000);
	                      robot.mouseRelease(InputEvent.BUTTON1_MASK);
	                      
	                      Thread.sleep(5000);
	                      
	                      break;
	           }
	   }
	   AddQuickReservationForm AQRF=PageFactory.initElements(GenericMethods.driver,AddQuickReservationForm.class);
	   return AQRF;
	
}





public AddQuickReservationForm DragAndDropFor3N(String rtype) throws Exception{
	
	 List<WebElement> ele=GenericMethods.driver.findElements(By.xpath("//div[starts-with(@id,'rthead')]"));
	   int RTsize=ele.size();
	   for(int j=0;j<=RTsize-1;j++)
	   {
	       String str=ele.get(j).getText().trim();
	      
	       if(str.trim().equals(rtype))
	           {
	              Assert.assertEquals(str, rtype);
	              
	        
	               String countOfRT =  ele.get(j).getAttribute("roomcount");
	               String idRT=ele.get(j).getAttribute("id");
	              
	               WebElement ele1=GenericMethods.driver.findElement(By.id(idRT));
	               int count=Integer.parseInt(countOfRT);
	               System.out.println("Room Count: "+count);
	               Dimension d1 = ele1.getSize();
	                       System.out.println("Height:"+d1.height + "Width:" + d1.width);
	                       int Height = d1.height;
	                       int Width = d1.width;
	                      
	                       float WidthOfEachCell = (float) (Width/30.00);
	                       float HeightOfEachCell=(float) (Height/(count));

	                       Point location = ele1.getLocation();
	                      
	                       int x2 = location.x;
	                       int y2 = location.y;

	                        y2 = (int) (y2+(count*HeightOfEachCell)+65);
	                       System.out.println(x2);
	                     
	                       int x3 = x2 + 251;
	                       int x4 = x3+9;
	                      
	                       int FromCoordinates = x3;
	                       int ToCoordinates= y2;

	                       Actions builer = new Actions(GenericMethods.driver);


	                      Thread.sleep(10000);
	                      Robot robot = new Robot();
	                      Thread.sleep(5000);
	                      robot.mouseMove(FromCoordinates, ToCoordinates);
	                      Thread.sleep(2000);



	                      robot.mousePress(InputEvent.BUTTON1_MASK);
	                      robot.mouseMove(FromCoordinates+75, ToCoordinates);
	                      Thread.sleep(2000);
	                      robot.mouseRelease(InputEvent.BUTTON1_MASK);
	                      
	                      Thread.sleep(4000);
	                      
	                      break;
	           }
	   }
	   AddQuickReservationForm AQRF=PageFactory.initElements(GenericMethods.driver,AddQuickReservationForm.class);
	   return AQRF;
	
}



////div[starts-with(@id,'rthead')]["+j+"]//[starts-with(@id,'rhead')]

public void  SelectSingleAddedRoom(int iTestCaseRow) throws Exception{
	 List<WebElement> ele=GenericMethods.driver.findElements(By.xpath("//div[starts-with(@id,'rthead')]"));
		
	   int RTsize=ele.size();
	   for(int j=0;j<=RTsize-1;j++)
	   {
		   
		   
		  
	       String str=ele.get(j).getText().trim();
	      String s= ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_RoomTypeName));
	      System.out.println(s);
	     
	       if(str.trim().equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_RoomTypeName))))
	           {
	    	   
	  List<WebElement> allRooms=GenericMethods.driver.findElements(By.xpath("//div[@class='room']"));
	  for(int i=0; i<=allRooms.size()-1; i++){
		  String title=allRooms.get(i).getAttribute("title");
		  if(title.equals(AddRoomsPage.roomNumber) || title.equals(AddRoomsPage.roomNumber) || title.equals(AddRoomsPage.roomNumber)==true){
			  List<WebElement> chebox= GenericMethods.driver.findElements(By.xpath("//input[@class='checkbox']"));
			  chebox.get(i).click();
		  }
	  }
	  
	   	   }
	   }   

	
}




public void fn_createFDReserv(String roomtype,String from,String to) throws Exception{
	try{
	List<WebElement> ele=GenericMethods.driver.findElements(By.xpath("//div[starts-with(@id,'rthead')]"));
	   int RTsize=ele.size();
	   for(int j=0;j<=RTsize-1;j++){
		   int k=j+1;
	       String str=ele.get(j).getText().trim();
	        if(str.trim().equals(roomtype)) {
	              Assert.assertEquals(str, roomtype);
	            
	             WebElement ele2= GenericMethods.driver.findElement(By.xpath("(//div[@class='rtype'])["+k+"]//div[contains(@id,'crossblock')]["+from+"]"));
	             WebElement ele3= GenericMethods.driver.findElement(By.xpath("(//div[@class='rtype'])["+k+"]//div[contains(@id,'crossblock')]["+to+"]"));
                  Thread.sleep(2000);
	             Actions act=new Actions(GenericMethods.driver);
                
                  act.dragAndDrop(ele2, ele3).build().perform(); 
                  break;
               }
	           }
	}catch(Exception e){
		Thread.sleep(3000);
		List<WebElement> ele=GenericMethods.driver.findElements(By.xpath("//div[starts-with(@id,'rthead')]"));
		   int RTsize=ele.size();
		   for(int j=0;j<=RTsize-1;j++){
			   int k=j+1;
		       String str=ele.get(j).getText().trim();
		        if(str.trim().equals(roomtype)) {
		              Assert.assertEquals(str, roomtype);
		            
		             WebElement ele2= GenericMethods.driver.findElement(By.xpath("(//div[@class='rtype'])["+k+"]//div[contains(@id,'crossblock')]["+from+"]"));
		             WebElement ele3= GenericMethods.driver.findElement(By.xpath("(//div[@class='rtype'])["+k+"]//div[contains(@id,'crossblock')]["+to+"]"));
	                  Thread.sleep(2000);
		             Actions act=new Actions(GenericMethods.driver);
	                
	                  act.dragAndDrop(ele2, ele3).build().perform(); 
	                  break;
	               }
		           }
	}
               }



public void fn_FillQuickReservationForm(String rate,String roomnum,String salutation,String firstname) throws Exception{
	try{
		GenericMethods.selectElement(dd_rateType, rate);
		Thread.sleep(500);
		GenericMethods.selectElement(roomDD, roomnum);
		Thread.sleep(500);
		GenericMethods.selectElement(dd_salutation, salutation);
		Thread.sleep(500);
		GenericMethods.sendKeys(txtbox_fName, firstname);
		Thread.sleep(500);
		//String lastname=GenericMethods.generateRandomString();
		GenericMethods.sendKeys(txtbox_lName, GenericMethods.generateRandomString());
		Thread.sleep(500);
		GenericMethods.sendKeys(txtbox_phone, "85858585");
		Thread.sleep(500);
		String email=GenericMethods.generateRandomString()+"@gmail.com";
		GenericMethods.sendKeys(txtbox_email, email);
		Thread.sleep(500);
		try{
		GenericMethods.js_Click(btn_Reserve);
		}catch(Exception e){
			GenericMethods.js_Click(btn_Reserve);
		}
	}catch(UnhandledAlertException e){
		GenericMethods.ActionOnAlert("Accept");
	}catch(Exception e){
		throw e;
	}
    }


public EnableEditingPage fn_FillQuickReservationFormSG(String rate,String roomnum,String salutation,String firstname,WebElement link) throws Exception{
	try{
		GenericMethods.selectElement(dd_rateType, rate);
		Thread.sleep(500);
		GenericMethods.selectElement(roomDD, roomnum);
		Thread.sleep(500);
		GenericMethods.selectElement(dd_salutation, salutation);
		Thread.sleep(500);
		GenericMethods.sendKeys(txtbox_fName, firstname);
		Thread.sleep(500);
		//String lastname=GenericMethods.generateRandomString();
		GenericMethods.sendKeys(txtbox_lName, GenericMethods.generateRandomString());
		Thread.sleep(500);
		GenericMethods.sendKeys(txtbox_phone, "85858585");
		Thread.sleep(500);
		String email=GenericMethods.generateRandomString()+"@gmail.com";
		GenericMethods.sendKeys(txtbox_email, email);
		Thread.sleep(500);
		try{
		GenericMethods.js_Click(link);
		}		
		catch(Exception e){
			GenericMethods.js_Click(link);
			
		}
		
	}
	
	catch(UnhandledAlertException e){
		GenericMethods.ActionOnAlert("Accept");
	}catch(Exception e){
		throw e;
	}
	EnableEditingPage EEP=PageFactory.initElements(GenericMethods.driver, EnableEditingPage.class);
	return EEP;	
    }



public WebElement fn_getReservation(String fname) throws Exception{
	WebElement ele1 = null;
	try{
	
	List<WebElement> we=GenericMethods.driver.findElements(By.xpath("//div[@rsvstatus='CHECKIN']"));
	int count=we.size();
	String s=Character.toString(fname.charAt(0)).toUpperCase()+fname.substring(1, fname.length());
	for(WebElement ele:we){
		String str=ele.getAttribute("title");
		if(str.contains(s)){
			ele1=GenericMethods.driver.findElement(By.xpath("//div[@title='"+str+"']"));		
			break;
		}
	}
	
	}catch(Exception e){
		throw e;
	}
	return ele1;

}



public String fn_getreservationStatusCheckin(String fname) throws Exception{
	try{
		
	String status=null;
	List<WebElement> we=GenericMethods.driver.findElements(By.xpath("//div[@rsvstatus='CHECKIN']"));
	//int count=we.size();
	String s=Character.toString(fname.charAt(0)).toUpperCase()+fname.substring(1, fname.length());
	for(WebElement ele:we){
		//Thread.sleep(4000);
		String str=ele.getAttribute("title");
		if(str.toLowerCase().contains(s.toLowerCase())){
			WebElement ele1=GenericMethods.driver.findElement(By.xpath("//div[@title='"+str+"']"));
			status=ele1.getAttribute("rsvstatus");
			break;
		}
	}
	return status;
	}catch(NullPointerException e){
		
		Thread.sleep(3000);
		String status=null;
		List<WebElement> we=GenericMethods.driver.findElements(By.xpath("//div[@rsvstatus='CHECKIN']"));
		//int count=we.size();
		String s=Character.toString(fname.charAt(0)).toUpperCase()+fname.substring(1, fname.length());
		for(WebElement ele:we){
			//Thread.sleep(4000);
			String str=ele.getAttribute("title");
			if(str.contains(s)){
				WebElement ele1=GenericMethods.driver.findElement(By.xpath("//div[@title='"+str+"']"));
				status=ele1.getAttribute("rsvstatus");
				break;
			}
	}
		return status;
	}catch(Exception e){
		throw e;
	}
	
}


public String fn_getreservationStatusCheckout(String fname) throws Exception{
	try{
		
	String status=null;
	List<WebElement> we=GenericMethods.driver.findElements(By.xpath("//div[@rsvstatus='CHECKOUT']"));
	int count=we.size();
	String s=Character.toString(fname.charAt(0)).toUpperCase()+fname.substring(1, fname.length());
	for(WebElement ele:we){
		//Thread.sleep(4000);
		String str=ele.getAttribute("title");
		if(str.toLowerCase().contains(s.toLowerCase())){
			WebElement ele1=GenericMethods.driver.findElement(By.xpath("//div[@title='"+str+"']"));
			status=ele1.getAttribute("rsvstatus");
			break;
		}
	}
	return status;
	}catch(Exception e){
		throw e;
	}
}



public AccountStatementLandingPage fn_rtClk(String fname,WebElement link) throws Exception{
	try{
		
	
	List<WebElement> we=GenericMethods.driver.findElements(By.cssSelector("div:contains('CHECKIN')"));
	int count=we.size();
	String s=Character.toString(fname.charAt(0)).toUpperCase()+fname.substring(1, fname.length());
	for(WebElement ele:we){
		
		String str=ele.getAttribute("title");
		if(str.toLowerCase().contains(s.toLowerCase())){
  			WebElement ele1=GenericMethods.driver.findElement(By.xpath("//div[@title='"+str+"']"));
			Actions act=new Actions(GenericMethods.driver);			
			JavascriptExecutor js=(JavascriptExecutor)GenericMethods.driver;
            js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele1);
			act.contextClick(ele1).build().perform();
			act.click(link).build().perform();
			break;
		}
	}}catch(NoSuchElementException e){
		
		Thread.sleep(3000);
		List<WebElement> we=GenericMethods.driver.findElements(By.xpath("//div[@rsvstatus='CHECKIN']"));
		int count=we.size();
		String s=Character.toString(fname.charAt(0)).toUpperCase()+fname.substring(1, fname.length());
		for(WebElement ele:we){
			Thread.sleep(2000);
			String str=ele.getAttribute("title");
			if(str.toLowerCase().contains(s.toLowerCase())){
				Thread.sleep(3000);
				WebElement ele1=GenericMethods.driver.findElement(By.xpath("//div[@title='"+str+"']"));
				Actions act=new Actions(GenericMethods.driver);
				act.contextClick(ele1).build().perform();
				act.click(link).build().perform();
				break;
			}
		}
	}catch(StaleElementReferenceException e){
		/*Thread.sleep(4000);
		WebElement we=GenericMethods.driver.findElement(By.cssSelector("div:contains('"+fname+"')"));
		
		Actions act=new Actions(GenericMethods.driver);
		act.contextClick(we).build().perform();
		act.click(link).build().perform();*/
		
		Thread.sleep(1000);
		List<WebElement> we=GenericMethods.driver.findElements(By.xpath("//div[@rsvstatus='CHECKIN']"));
		int count=we.size();
		String s=Character.toString(fname.charAt(0)).toUpperCase()+fname.substring(1, fname.length());
		for(WebElement ele:we){
			Thread.sleep(2000);
			String str=ele.getAttribute("title");
			if(str.toLowerCase().contains(s.toLowerCase())){
				Thread.sleep(3000);
				WebElement ele1=GenericMethods.driver.findElement(By.xpath("//div[@title='"+str+"']"));
				Actions act=new Actions(GenericMethods.driver);
				act.contextClick(ele1).build().perform();
				act.click(link).build().perform();
				break;
			}
		}	
	}catch(ElementNotVisibleException e){
		WebElement ele=GenericMethods.driver.findElement(By.xpath("//a[text()='Payments']"));
		Actions act=new Actions(GenericMethods.driver);
		//act.contextClick(ele).build().perform();
		act.click(ele).build().perform();				
	}
	AccountStatementLandingPage  ASLP=PageFactory.initElements(GenericMethods.driver, AccountStatementLandingPage.class);
	return ASLP;
			
}



public ViewDetailsPage fn_rtClk1(String fname,WebElement link) throws Exception{
	
	try{
	try{
		
	//String status=null;
		Thread.sleep(900);
		
		/*JavascriptExecutor js = (JavascriptExecutor) GenericMethods.driver;
		
		List<WebElement> labels = (List<WebElement>) js.executeScript("return document.getElementsByXPath('//div[@rsvstatus='CHECKIN']');");
		 int count=labels.size();
		for(WebElement label: labels)
		 {
		  //System.out.println(label.getAttribute("id"));
			
		
		  System.out.println(label.getText());
		 }*/
		
	List<WebElement> we=GenericMethods.driver.findElements(By.xpath("//div[@rsvstatus='CHECKIN']"));
	int count=we.size();
	String s=Character.toString(fname.charAt(0)).toUpperCase()+fname.substring(1, fname.length());
	for(WebElement ele:we){
		Thread.sleep(2000);
		String str=ele.getAttribute("title");
		if(str.toLowerCase().contains(s.toLowerCase())){
			Thread.sleep(3000);			
			WebElement ele1=GenericMethods.driver.findElement(By.xpath("//div[@title='"+str+"']"));
			//WebElement ele1=GenericMethods.js_getwebelement("//div[contains(text(),'"+str+"']");
			/*boolean b=ele1.isDisplayed();
			System.out.println("Displayed" +b);
			boolean c=ele1.isEnabled();
			System.out.println("Enabled "+c);*/
			//GenericMethods.HighlightWebElement(ele1);
			//status=ele1.getAttribute("rsvstatus");
			
			new WebDriverWait(GenericMethods.driver, 60).until(ExpectedConditions.elementToBeClickable(ele));
			
			Actions act=new Actions(GenericMethods.driver);
			//Thread.sleep(3000);
			act.moveToElement(ele1).build().perform();
			Thread.sleep(100);
			act.contextClick(ele1).build().perform();
			act.click(link).build().perform();
			break;
		}
	}
	
	}catch(NoSuchElementException e){
		Thread.sleep(4000);
		List<WebElement> we=GenericMethods.driver.findElements(By.xpath("//div[@rsvstatus='CHECKIN']"));
		int count=we.size();
		String s=Character.toString(fname.charAt(0)).toUpperCase()+fname.substring(1, fname.length());
		for(WebElement ele:we){
			Thread.sleep(2000);
			String str=ele.getAttribute("title");
			if(str.contains(s)){
				Thread.sleep(3000);
				WebElement ele1=GenericMethods.driver.findElement(By.xpath("//div[@title='"+str+"']"));
				//status=ele1.getAttribute("rsvstatus");
				
				new WebDriverWait(GenericMethods.driver, 60).until(ExpectedConditions.elementToBeClickable(ele));
				//ExpectedConditions.elementToBeClickable(ele);
				
				Actions act=new Actions(GenericMethods.driver);
				//Thread.sleep(3000);
				act.contextClick(ele1).build().perform();
				act.click(link).build().perform();
				break;
			}
		}
	}catch(ElementNotVisibleException e){
		WebElement ele=GenericMethods.driver.findElement(By.xpath("//a[text()='Payments']"));
		Actions act1=new Actions(GenericMethods.driver);
		act1.click(ele).build().perform();
	}catch(Exception e){
		throw e;
	}
	}catch(Exception e){
		throw e;
	}
	ViewDetailsPage  VDP=PageFactory.initElements(GenericMethods.driver, ViewDetailsPage.class);
	return VDP;
			
}




public void fn_refreshFD() throws InterruptedException{
	try{
	GenericMethods.driver.navigate().refresh();
	Thread.sleep(5000);
	}catch(UnhandledAlertException e){
		GenericMethods.Alert_Accept();
	}
}









}




