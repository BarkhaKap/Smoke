package com.hotelogix.smoke.frontdesk.ViewDetailsPage;

import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.hotelogix.smoke.frontdesk.FrontdeskHome.CheckinCard;
import com.hotelogix.smoke.frontdesk.FrontdeskHome.FrontdeskLandingPage;
import com.hotelogix.smoke.frontdesk.Payment.AccountStatementLandingPage;
import com.hotelogix.smoke.genericandbase.Constant;
import com.hotelogix.smoke.genericandbase.ExcelUtil;
import com.hotelogix.smoke.genericandbase.GenericMethods;
import com.itextpdf.text.log.SysoCounter;
import com.sun.media.jai.codecimpl.WBMPCodec;

public class EnableEditingPage {
	
	
	
	

ArrayList<Double>  TaxPer= new ArrayList<Double>();
public static double TaxExBal;

static double sum=0;
static double totalTaxPercent=0;
static double totalamt1=0;
public  static String frmMonth;
public static String frmYear;
public static String frmDate;


@FindBy(xpath="//fieldset[text()='Room Tax(es)']")
public  WebElement RoomTaxes;

@FindBy(xpath="//div[starts-with(text(),'Standard')]")
public  WebElement stdRateGrp_Title;

@FindBy(xpath="//select[@id='taxExmptReson']")
public  WebElement TaxExemptDropdown;

@FindBy(xpath="//table[@class='pnl_rates']//input[@type='checkbox']")
public  List<WebElement> AllTaxesToExempt;

@FindBy(xpath="//table[@class='pnl_rates']//tr")
public  List<WebElement> AllTheTaxes;

@FindBy(xpath="//fieldset[@id='resLblRoomTariff']")
public  WebElement RoomRate;

@FindBy(xpath="//fieldset[@id='resLblBalance']")
public  WebElement TotalBalance;


@FindBy(xpath="//select[@id='SelPnRmType']")
public  WebElement AddNewRoomTypeForGroupDropdown;

@FindBy(xpath="//input[@id='grAddNewRoom']")
public  WebElement AddNewRoomG;

@FindBy(xpath="//select[@id='SelPnNoOfRm']")
public  WebElement RoomsDropdownInAddNewRoom;

@FindBy(xpath="//button[@id='pnBtnSave-button']")
public  WebElement AddBtn;

@FindBy(xpath="//select[@id='selAdultANR']")
public  WebElement AdultSelectionDD;

@FindBy(xpath="//input[@type='checkbox']")
public  List<WebElement> AllAddedRoom;

@FindBy(xpath="//input[@id='grEarlyCheckinRoom']")
public  WebElement EarlyCheckInSelectedBtn;

@FindBy(xpath="//div[text()='Early Checkin']")
public  WebElement EarlyCheckInTitle;

@FindBy(xpath="//input[@id='selCnclReason']")
public  WebElement ReasonForEarlyCheckIn;

@FindBy(xpath="//button[@id='btnResCanSave-button']")
public  WebElement EarlyCheckinBtn;

@FindBy(xpath="//input[@id='txtCnclCharge']")
public  WebElement txtbox_EarlyCheckinCharge;

@FindBy(xpath="//fieldset[@id='dvStrRsvStatus_0']")
public  WebElement StatusForGroupReservation;

@FindBy(xpath="//select[@id='selRsvStgr0']")
public  WebElement SelectReservationStatus;

@FindBy(xpath="//input[@id='grCancelNoShowSelected']")
public  WebElement NoShowSelected;

@FindBy(xpath="//div[text()='Cancel/No-Show Selected Reservation']")
public  WebElement NoShowPopUpTitle;

@FindBy(xpath="//select[@id='selCnclReason']")
public  WebElement drpdown_cancelNoShowReason;

@FindBy(xpath="//textarea[@id='txtCnclDesc']")
public  WebElement  txtbox_cancelNoShowDesc;

@FindBy(xpath="//button[@id='btnGrpCanSave-button']")
public  WebElement NoShowButton;

@FindBy(xpath="//td[@class='rite panel-link']//input[@id='linkStandardRateGR']")
public  WebElement PriceLink;

@FindBy(xpath="//input[@id='srdTxtDiscount0']")
public  WebElement DiscountTextBox;

@FindBy(xpath="//button[@id='srdBtnSave-button']")
public  WebElement DiscountDoneBtn;

@FindBy(xpath="//input[@id='btnGrpSave']")
public  WebElement btn_GrpSave;

@FindBy(xpath="//a[text()='Manage Sharer(s) ']")
public  WebElement ManageSharerLink;

@FindBy(xpath="//table[@class='table-cellspacing-patch']//tbody//tr")
public  List<WebElement> Sharers;

@FindBy(xpath="//button[@id='rsBtnSave-button']")
public  WebElement btn_manageSharerSave;

@FindBy(xpath="//div[@class='calheader']//a[2]")
public  WebElement ChooseMonYear ;

@FindBy(xpath="//div[@class='yui-cal-nav']/div/select")
public  WebElement select_FrmMnth;

@FindBy(xpath="//div[@class='yui-cal-nav']//div/input")
public  WebElement enterFrmYear;

@FindBy(xpath="//div[@class='yui-cal-nav']//div/span/button[text()='Ok']")
public  WebElement okButton_Frmcalander;

@FindBy(xpath="//table[@id='sr-calContainerPopup_t']/tbody")
public  WebElement chartfrom;

@FindBy(xpath="//table[@id='roomGrTableId']/tbody/tr[2]/td[8]")
public  WebElement CheckInCheckOut;

@FindBy(xpath="//table[@id='roomGrTableId']/tbody/tr[2]/td[8]/span[1]")
public  WebElement CheckInDate;

@FindBy(xpath="//fieldset[@id='changeLink']")
public  WebElement ChangePayTerm;

@FindBy(xpath="//select[@id='paidTypeGr']")
public  WebElement PayTermDropDown;

@FindBy(xpath="//input[@name='btnRsvSave']")
public  WebElement btn_Reserve;

@FindBy(xpath="//fieldset[@id='resLblDiscount']")
public  WebElement actualDisc;

@FindBy(xpath="//button[@id='srdBtnSave-button']")
public  WebElement doneBtn;

@FindBy(xpath="//input[@id='btnGrpSave']")
public  WebElement btn_SaveGrp;

@FindBy(xpath="//button[@id='grpTaxExempt-button']")
public  WebElement GroupTaxExempt;

@FindBy(xpath="//div[@class='frn_inclusions']//i")
public  WebElement addedIncl_txt;

@FindBy(xpath="//fieldset[@id='resLblInclusions']")
public  WebElement added_inclPrice;

@FindBy(xpath="//a[contains(@onclick,'RatesPackagesDate_Click')]")
public  WebElement date_lnk;

@FindBy(xpath="//input[contains(@ondblclick,'appPanels.StandardRates_Click')]")
public  WebElement beforeSplitPrice;

@FindBy(xpath="//table[@class='frn_ratestbl']//tr[2]//td[3]/input")
public  WebElement afterSplitPrice;

@FindBy(xpath="//table[@id='sr-calContainerPopup_t']//tr[5]//td[5]//a")
public  WebElement splitDate;

@FindBy(xpath="//span[@id='singleGuestEditSpan']")
public  WebElement addEditDetails;

@FindBy(xpath="//div[@id='PanelGuestDetails_h']")
public  WebElement detailForm_title;

@FindBy(xpath="//input[@name='srTxtFirstName']")
public  WebElement frstName;

@FindBy(xpath="//input[@name='srTxtLastName']")
public  WebElement lastName;

@FindBy(xpath="//input[@id='phoneNo']")
public  WebElement phone;

@FindBy(xpath="//button[@id='btnSave-button']")
public  WebElement saveBtn;

@FindBy(xpath="//td[@class='lineheight size13']//span[2]")
public  WebElement editedName;

@FindBy(xpath="//select[@name='extraBeds']")
public  WebElement extraBed;

@FindBy(xpath="//table[@class='pnl_rates']//tr[2]//td[5]//input[@id='srdTxtDiscount0']")
// @FindBy(xpath="//input[@name='srdTxtDiscount0']c
 public  WebElement discount;

@FindBy(xpath="//span[text()='Rack Rate']")
public  WebElement RackRate;

@FindBy(xpath="//input[@name='displayAmount0']")
public  WebElement amount;

@FindBy(xpath="//table[@id='roomGrTableId']//tr[2]//td[6]//table//td[1]")
public  WebElement guestName;

@FindBy(xpath="//table[@id='roomGrTableId']//tr")
public  List<WebElement> rowcount;

@FindBy(xpath="//input[@value='Check-In Selected']")
public  WebElement btn_checkInSelected;

@FindBy(xpath="//input[@value='Add New Room(s)']")
public  WebElement addNewRoombtn;

@FindBy(xpath="//div[@id='PanelGrpNewRoom_h']//tr//td")
public  WebElement addNewRoomTitle;

@FindBy(xpath="//a[@class='container-close']")
public  WebElement closeBtn;

@FindBy(xpath="//table[@id='roomGrTableId']//tr[2]//td[2]//input")
public  WebElement checkboxTE;

@FindBy(xpath="//table[@id='roomGrTableId']//tr")
public  List<WebElement> chkboxCount;

@FindBy(xpath="//select[@name='SelPnRmType']")
public  WebElement roomTypeDD;

@FindBy(xpath="//select[@name='selAdultANR']")
public  WebElement adultDD;

@FindBy(xpath="//select[@name='selChildANR']")
public  WebElement childDD;

@FindBy(xpath="//select[@name='SelPnNoOfRm']")
public  WebElement roomsDD;

@FindBy(xpath="//button[@id='pnBtnSave-button']")
public  WebElement addBtn;

@FindBy(xpath="//button[@id='grpTaxExempt-button']")
public  WebElement taxExempt;

@FindBy(xpath="//div[@id='PanelTaxExemptGR_h']//td[1]")
public  WebElement taxEexemptTitle;

@FindBy(xpath="//table[@id='roomGrTableId']//tr[2]//td[3]")
public  WebElement RoomReservationID;

@FindBy(xpath="//a[@id='link-selectInclusions']")
public  WebElement InclusionAddOns_Link;

@FindBy(xpath="//div[text()='Select Add-ons']")
public  WebElement InclusionAddOns_TitleTAB;

@FindBy(xpath="//select[@id='availIncId']//option")
public  WebElement inclusionname;

@FindBy(xpath="//input[@type='button']")
public  WebElement RightArrow_BT;

@FindBy(xpath="//button[@id='inclusionSave-button']")
public  WebElement Done_BT;

@FindBy(xpath="//fieldset[@id='fldGrpRateAndPkg']//i")
public  WebElement InclusionName_besideAddInclu;

@FindBy(xpath="//table[@id='roomGrTableId']//tr[2]//td[11]//input")
public  WebElement SingleGuestPrice_ED;

@FindBy(xpath="//td[text()='Preferences']")
public  WebElement BlackClick;

@FindBy(xpath="//table[@id='roomGrTableId']//tr[2]//td[5]")
public  WebElement AddGuestDetails_Link;

@FindBy(xpath="//table[@id='roomGrTableId']//tr[2]//td[6]")
public  WebElement GuestName_TX;

@FindBy(xpath="//div[@class='clear-yell-img']")
public  WebElement Clear_Link;

@FindBy(xpath="//table[@id='roomGrTableId']//tr[2]//td[9]//fieldset[2]")
public  WebElement Status_Link;

@FindBy(xpath="//table[@id='roomGrTableId']//tr[2]//td[8]//span[2]")
public  WebElement FirstGuestCheckoutDate_Link;

@FindBy(xpath="//table[@id='sr-calContainerPopup_t']//tr//td//a")
public  WebElement FirstGuestCheckoutDate_InCal;

@FindBy(xpath="//table[@id='roomGrTableId']//tr[3]//td[8]//span[2]")
public  WebElement SecondGuestCheckoutDate_Link;

@FindBy(xpath="//table[@id='sr-calContainerPopup_t']//tr[2]//td//a")
public  WebElement SecondGuestCheckoutDate_InCal;

@FindBy(xpath="//table[@id='sr-calContainerPopup_t']//tr[2]//td[2]//a")
public  WebElement PreviousCheckoutDate_InCal;

@FindBy(xpath="//table[@id='roomGrTableId']//tr[2]//td[2]/input")
public  WebElement FirstGuestCheckBox_CB;

@FindBy(xpath="//button[@id='grpTaxExempt-button']")
public  WebElement TaxExampt_BT;

@FindBy(xpath="//div[@id='PanelTaxExemptGR_h']//tr//td")
public  WebElement TaxExamptPopUp_Box;

@FindBy(xpath="//select[@id='taxExmptReson']")
public  WebElement TaxExemptReason_DD;

@FindBy(xpath="//button[@id='txExmptBtnSave-button']")
public  WebElement TaxExemptOKBT_InPopUp;

@FindBy(xpath="//div[@id='grImgCal1']")
public  WebElement CalIconz;

@FindBy(xpath="//table[@id='roomGrTableId']/tbody/tr")
public  List<WebElement> RoomsInGroup;

@FindBy(xpath="//input[@id='grCancelNoShowSelected']")
public  WebElement NoShowSelect;

@FindBy(xpath="//select[@id='selCnclReason']")
public  WebElement NoShowReason;

@FindBy(xpath="//textarea[@id='txtCnclDesc']")
public  WebElement NoShowDesc;

@FindBy(xpath="//button[@id='btnGrpCanSave-button']")
public  WebElement NoShowReservationBtn;

@FindBy(xpath="//span[@class='tname']")
public  WebElement TabTitle;

@FindBy(xpath="//input[@id='fNameGr']")
public  WebElement fnameGrp;

@FindBy(xpath="//input[@id='lNameGr']")
public  WebElement lnameGrp;

@FindBy(xpath="//input[@id='phoneNoGr']")
public  WebElement phGrp;

@FindBy(xpath="//select[@id='groupOwner']")
public  WebElement grpOwner;

@FindBy(xpath="//input[@id='travelAgent']")
public  WebElement taName;

@FindBy(xpath="//input[@id='cNameGr']")
public  WebElement compName;

@FindBy(xpath="//select[@id='salutationGr']")
public  WebElement salutation;

@FindBy(xpath="//table[@class='pnl_rates']//tr[2]//td[4]//span")
public  WebElement chkbox_TEValue;

@FindBy(xpath="//fieldset[@id='fldGrpTax']")
public  WebElement txt_Tax;

@FindBy(xpath="//input[@id='discountTypeP0']")
public  WebElement rb_disc;

@FindBy(xpath="//span[contains(@onclick,'changeDateGR_Click')]")
public  WebElement date_ChkInRoom;

@FindBy(xpath="//a[@id='link-selectInclusions']")
public WebElement Link_InclusionAddOns;

@FindBy(xpath="//input[@name='btnCheckIn']")
public WebElement Btn_CheckIn;

@FindBy(xpath="//div[@class='frn_inclusions']/span/i")
public WebElement Txt_AddedAddon;

@FindBy(xpath="//span[@id='singleGuestEditSpan']")
public WebElement Link_GuestEditDetailforSingleRes;

@FindBy(xpath="//input[@id='srTxtFirstName']")
public WebElement TxtbxguestInfo_fName;

@FindBy(xpath="//input[@id='srTxtLastName']")
public WebElement TxtbxguestInfo_lName;

@FindBy(xpath="//button[@id='btnSave-button']")
public WebElement BtnguestInfo_Save;

@FindBy(xpath="//table[@class='frn_ratestbl']/tbody/tr/td/a")
public WebElement Link_ToDateForSplit;

@FindBy(xpath="//table[@id='sr-calContainerPopup_t']/tbody/tr/td/a")
public WebElement Link_ActiveSplitDate;

@FindBy(xpath="//table[@class='frn_ratestbl']/tbody/tr/td/fieldset")
public List<WebElement> Txt_SplitedDays;

@FindBy(xpath="//input[@id='link-standardRates']")
public List<WebElement> Txt_StandardPriceforSplitedDays;

@FindBy(xpath="//input[@id='link-standardRates']")
public WebElement Text_stdRate;

@FindBy(xpath="//input[@name='btnErlyCheckIn']")
public WebElement btn_earlyCheckin;

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

@FindBy(xpath="//input[@id='btnGrpCheckIn']")
public WebElement btn_GroupCheckin;

@FindBy(xpath="//fieldset[starts-with(@id,'fldAttGstStr')]")
public WebElement link_addGuestDetails;

@FindBy(xpath="//input[starts-with(@id,'txtFname')]")
public WebElement txtbox_guestFName;

@FindBy(xpath="//select[starts-with(@id,'txtSalutionAtG')]")
public WebElement dropdown_Salutation;

@FindBy(xpath="//input[starts-with(@id,'txtLname')]")
public WebElement txtbox_guestLName;

@FindBy(xpath="//input[starts-with(@id,'txtPh')]")
public WebElement txtbox_guestPh;

@FindBy(xpath="//input[starts-with(@id,'btnAttOk')]")
public WebElement btn_OK;

@FindBy(xpath="//input[@name='btnCheckOut']")
public WebElement btn_Checkout;

@FindBy(xpath="//input[@name='btnErlyCheckOut']")
public WebElement btn_LateChekout;

@FindBy(xpath="//select[@id='srSelAdult']")
public WebElement drpdown_Adult;

@FindBy(xpath="//input[@value='First Name']")
public WebElement txtbox_sharerFN;

@FindBy(xpath="//input[@value='Last Name']")
public WebElement txtbox_sharerLN;

@FindBy(xpath="//input[@value='Phone No']")
public WebElement txtbox_sharerPH;

@FindBy(xpath="//input[@name='chargeSharer2']")
public WebElement chkbox_sharer;

@FindBy(xpath="//table[@id='tblRoomSharers']//tr")
public List<WebElement> count_sharerGuest;

@FindBy(xpath="//input[@id='btnGrpCheckOut']")
public WebElement btn_GrpCheckout;

@FindBy(xpath="//input[@value='Check-Out Selected']")
public WebElement btn_CheckoutSelected;

@FindBy(xpath="//input[@id='btnRsvCanceled']")
public WebElement btn_Cancel;

@FindBy(xpath="//input[@id='chkCnclEmail']")
public WebElement chkbox_cnclEmail;

@FindBy(xpath="//button[text()='Cancel Reservation']")
public WebElement btn_cancelReserv;

@FindBy(xpath="//input[@id='txtGstEmailSM']")
public WebElement txtbox_Email;

@FindBy(xpath="//button[text()='Send Mail']")
public WebElement btn_sendEmail;


public  String text;
public String rateBeforeDisc;
ArrayList<String> al=new ArrayList<String>();
public String fname;

public String giveDiscount(int iTestCaseRow) throws Exception{
	
	rateBeforeDisc=GenericMethods.GetWebElementAttributeValue(Text_stdRate, "value");
	Thread.sleep(1000);
	GenericMethods.clickElement(Text_stdRate);
	GenericMethods.sendKeys(Text_stdRate, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_GivenDiscount)));
	
	
	return text;
	
}



public FrontdeskLandingPage ClickOnSaveBtnOverEnableEditing(){
try{
GenericMethods.clickElement(btn_Reserve);		
}
catch(Exception e){
e.printStackTrace();
}
FrontdeskLandingPage FLP=PageFactory.initElements(GenericMethods.driver, FrontdeskLandingPage.class);
return FLP;
}



public void ClickOnAddEditDetails(){
try{
GenericMethods.clickElement(Link_GuestEditDetailforSingleRes);
	
}
catch(Exception e){
e.printStackTrace();
}
}



public ArrayList<String> getDetails() throws Exception{
try{
String fname=GenericMethods.GetWebElementAttributeValue(TxtbxguestInfo_fName, "value");
Thread.sleep(1000);
String lname=GenericMethods.GetWebElementAttributeValue(TxtbxguestInfo_lName, "value");
al.add(fname);
Thread.sleep(1000);
al.add(lname);

}
catch(Exception e){
throw e;
}
return al;
}


public ArrayList<String> setDetails() throws Exception{
try{
String fname=GenericMethods.generateRandomString();
String lname=GenericMethods.generateRandomString();
GenericMethods.sendKeys(TxtbxguestInfo_fName, fname);
GenericMethods.sendKeys(TxtbxguestInfo_lName, lname);
al.add(fname);
Thread.sleep(1000);
al.add(lname);
Thread.sleep(1000);
GenericMethods.clickElement(BtnguestInfo_Save);
}
catch(Exception e){
throw e;
}
return al;	
}




public CheckinCard fn_clkCheckInBtn() throws Exception{
try{
GenericMethods.clickElement(Btn_CheckIn);
GenericMethods.ActionOnAlert("Accept");
}
catch(UnhandledAlertException e){
	
GenericMethods.Alert_Accept();
}
CheckinCard CC=PageFactory.initElements(GenericMethods.driver,CheckinCard.class);
return CC;
	
}


public void ClickOnRoomTaxes() throws Exception
{
	try
	{
	GenericMethods.clickElement(RoomTaxes);
	}
	catch(NoSuchElementException e)
	{
		Thread.sleep(3000);
		GenericMethods.js_Click(RoomTaxes);
	}
	catch(Exception e)
	{
		throw e;
	}

}




public void AddNewRoomToG() throws Exception
{
	try
	{
	GenericMethods.clickElement(AddNewRoomG);
	String msg=GenericMethods.getText(addNewRoomTitle);
	Assert.assertEquals(msg, "Add New Room");
	Select s=new Select(AddNewRoomTypeForGroupDropdown);

	//s.selectByVisibleText("Semi-Deluxe");
	s.selectByIndex(2);
	Thread.sleep(1000);
	Select s2=new Select(AdultSelectionDD);
	s2.selectByVisibleText("1");
	Thread.sleep(1000);
	Select s1=new Select(RoomsDropdownInAddNewRoom);
	s1.selectByVisibleText("1");
	Thread.sleep(1000);
	GenericMethods.clickElement(AddBtn);
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


public void VerifyDeleteAlertAddedRoom(String alert) throws Exception
{
	try
	{
	int size=GenericMethods.tr_count(AllAddedRoom)+1;
	Thread.sleep(2000);
	for(int i=2;i<=size;i++)
	{
		Thread.sleep(2000);
		String stat=GenericMethods.driver.findElement(By.xpath("//table[@id='roomGrTableId']//tbody//tr["+i+"]//td[9]")).getText();
		if(stat.equals("Reserved"))
		{
			GenericMethods.driver.findElement(By.xpath("//table[@id='roomGrTableId']//tbody//tr["+i+"]//td[10]/div")).click();
			GenericMethods.ActionOnAlert(alert);
			Assert.assertEquals(GenericMethods.value, "Do you wish to delete selected room(s)?");
			break;
        }
    }
	}
	catch(Exception e)
	{
		throw e;
	}
}

public void VerifyDeletedRoom() throws Exception
{
	try
	{
	int size=GenericMethods.tr_count(AllAddedRoom)-48;
	System.out.println(size);
	Thread.sleep(2000);
	for(int i=2;i<=size;i++)
	{
		Thread.sleep(2000);
		String stat=GenericMethods.driver.findElement(By.xpath("//table[@id='roomGrTableId']//tbody//tr["+i+"]//td[9]")).getText();
		if(stat.equals("Reserved"))
		{

			break;

        }
    }
	}
	catch(Exception e)
	{
		throw e;
	}
}



public CheckinCard fn_clkEarlyCheckinBtn(String reason,String alertMsg) throws Exception{
	try{
	GenericMethods.clickElement(btn_earlyCheckin);
	GenericMethods.sendKeys(ReasonForEarlyCheckIn,reason);
	txtbox_EarlyCheckinCharge.clear();
	GenericMethods.sendKeys(txtbox_EarlyCheckinCharge, "100");
	GenericMethods.clickElement(EarlyCheckinBtn);
	String msg=GenericMethods.Alert_Accept();
	Assert.assertEquals(msg,alertMsg);
	CheckinCard CC=PageFactory.initElements(GenericMethods.driver, CheckinCard.class);
	return CC;
	}catch(Exception e){
		throw e;
	}
}




public CheckinCard VerifyEarlyCheckInPopUp() throws Exception
{
	try
	{
	//GenericMethods.driver.findElement(By.xpath("//input[@name='chkboxRes_0']")).click();
	//GenericMethods.clickElement(EarlyCheckInSelectedBtn);
	GenericMethods.sendKeys(ReasonForEarlyCheckIn,"Early flight arrival");
	txtbox_EarlyCheckinCharge.clear();
	GenericMethods.sendKeys(txtbox_EarlyCheckinCharge, "100");
	GenericMethods.clickElement(EarlyCheckinBtn);
	String msg=GenericMethods.Alert_Accept();
	Assert.assertEquals(msg,"Do you wish to early check-in the Selected Reservation?");
	CheckinCard CC=PageFactory.initElements(GenericMethods.driver, CheckinCard.class);
	return CC;
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



public void CheckInReservationAndVerifyCheckIn() throws Exception
{

	GenericMethods.clickElement(StatusForGroupReservation);
	Thread.sleep(2000);
	Select s=new Select(SelectReservationStatus);
	Thread.sleep(2000);
	s.selectByVisibleText("Checked-In");
	Thread.sleep(2000);
	GenericMethods.ActionOnAlert("Accept");
	//String stat=s.getFirstSelectedOption().getText();
	String stat1=GenericMethods.getText(StatusForGroupReservation);
	Thread.sleep(2000);
	Assert.assertEquals(stat1, "Checked In");
	Thread.sleep(2000);
}


public void VerifyNoShowPopUpAlert() throws Exception
{
	GenericMethods.driver.findElement(By.xpath("//input[@name='chkboxRes_0']")).click();
	GenericMethods.clickElement(NoShowSelected);
	GenericMethods.ActionOnAlert("Dismiss");
	Assert.assertEquals(GenericMethods.value,"Do you wish to cancel / No-Show selected reservation(s)?");
}



public void VerifyNoShowPopUpTitle() throws Exception
{
	try
	{
	GenericMethods.driver.findElement(By.xpath("//input[@name='chkboxRes_0']")).click();
	GenericMethods.clickElement(NoShowSelected);
	String str=GenericMethods.Alert_Accept();
	Assert.assertEquals(str,"Do you wish to cancel / No-Show selected reservation(s)?");
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

public void verify_NoShowTitle() throws Exception
{
	try
	{
    String text=GenericMethods.getText(NoShowPopUpTitle);
    Assert.assertEquals(text,"Cancel/No-Show Selected Reservation");
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


public  void fn_SelectDateFrmDatePicker(WebElement calIcon, String month, String year, String date1) throws Exception
{
	try
	{

	 frmMonth=month;
	 frmYear=year;
	 frmDate=date1;



	GenericMethods.clickElement(calIcon);
	GenericMethods.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	GenericMethods.clickElement(ChooseMonYear);

    //GenericMethods.selectElement(select_FrmMnth, frmMonth);
    Select sel1=new Select(select_FrmMnth);
    sel1.selectByVisibleText(frmMonth);
    Thread.sleep(700);
    //String mon=sel1.getFirstSelectedOption().getText();

    GenericMethods.clickElement(enterFrmYear);
    enterFrmYear.clear();
    GenericMethods.sendKeys(enterFrmYear, frmYear);

    String a=frmMonth+" "+"0"+frmDate;

    GenericMethods.clickElement(okButton_Frmcalander);
    Thread.sleep(3000);

    String classname = chartfrom.getAttribute("class");

    WebElement abc=  GenericMethods.driver.findElement(By.xpath("//table[@id='sr-calContainerPopup_t']//tbody//tr//td//a[contains(text(),('" + frmDate + "') )]"));
	abc.click();
	Thread.sleep(2000);
//     GenericMethods.Alert_Accept();
     Thread.sleep(2000);
	Assert.assertEquals(GenericMethods.getText(CheckInDate), a);
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




public GroupToSingleReservationPage ClickToRoomOrGuest() throws Exception
{

	try
	{
GenericMethods.clickElement(GenericMethods.driver.findElement(By.xpath("//fieldset[@id='dvStrRtype_0']")));
GroupToSingleReservationPage GSR=PageFactory.initElements(GenericMethods.driver, GroupToSingleReservationPage.class);
return GSR;
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




public void fn_addeditDetails() throws Exception
{
	try
	{
	 GenericMethods.clickElement(addEditDetails);
	 String str=GenericMethods.getText(detailForm_title);
	 Assert.assertEquals(str, "Guest Information");
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


public void fn_clkAddEditDetail() throws Exception
{
	try
	{
	 GenericMethods.clickElement(addEditDetails);
	}
	catch(NoSuchElementException e)
	{
		Thread.sleep(3000);
		GenericMethods.js_Click(addEditDetails);
	}
	catch(Exception e)
	{
		throw e;
	}
}


public static String fName;
public static String lName;


public void fn_editGuestDetail() throws Exception
{
	 fName=GenericMethods.generateRandomString();
	 frstName.clear();
	 GenericMethods.sendKeys(frstName, fName);
	 lName=GenericMethods.generateRandomString();
	 lastName.clear();
	 GenericMethods.sendKeys(lastName, lName);
	 GenericMethods.clickElement(saveBtn);
	 Thread.sleep(3000);

	 String actualText=GenericMethods.getText(editedName);
	 String[] a=actualText.split(" ");
     String actual1=a[1];
     String actual2=a[2];
     Assert.assertTrue(actual1.equalsIgnoreCase(fName));
     Assert.assertTrue(actual2.equalsIgnoreCase(lName));

}

public FrontdeskLandingPage fn_addGuestDetailSingle() throws Exception
{
	 fName=GenericMethods.generateRandomString();
	 //frstName.clear();
	 GenericMethods.sendKeys(frstName, fName);
	 lName=GenericMethods.generateRandomString();
	 //lastName.clear();
	 GenericMethods.sendKeys(lastName, lName);
	 Thread.sleep(3000);
	 GenericMethods.sendKeys(phone,"234566");
	 GenericMethods.clickElement(btn_Reserve);
	 Thread.sleep(6000);

	 FrontdeskLandingPage AHO = PageFactory.initElements(GenericMethods.driver, FrontdeskLandingPage.class);
	 return AHO;
}

public FrontdeskLandingPage fn_addGuestDetailGroup() throws Exception
{
	 fName=GenericMethods.generateRandomString();
	 //frstName.clear();
	 GenericMethods.sendKeys(fnameGrp, fName);
	 lName=GenericMethods.generateRandomString();
	 //lastName.clear();
	 GenericMethods.sendKeys(lnameGrp, lName);
	 Thread.sleep(3000);
	 GenericMethods.sendKeys(phGrp, "34567");
	 GenericMethods.clickElement(btn_SaveGrp);
	 Thread.sleep(6000);
	 FrontdeskLandingPage AHO = PageFactory.initElements(GenericMethods.driver, FrontdeskLandingPage.class);
	 return AHO;
}



public void fn_addExtraBed() throws Exception
{
	try
	{
	 Select sel=new Select(extraBed);
	 sel.selectByValue("1");
	 String text=sel.getFirstSelectedOption().getText();
	 Assert.assertEquals(text, "1 Bed");
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


public FrontdeskLandingPage fn_clkSaveBtn() throws Exception
{
	try
	{
	 GenericMethods.clickElement(btn_Reserve);
	}
	catch(NoSuchElementException e)
	{
		Thread.sleep(1000);
		GenericMethods.js_Click(btn_Reserve);
	}
	catch(Exception e)
	{
		throw e;
	}
	 FrontdeskLandingPage AHO = PageFactory.initElements(GenericMethods.driver, FrontdeskLandingPage.class);
	 return AHO;
}


public FrontdeskLandingPage fn_clkAmtForDisc() throws Exception
{
	try
	{
	String text=beforeSplitPrice.getAttribute("value");
	 float f=Float.parseFloat(text);
	 String i="50";
   Actions acobj= new Actions(GenericMethods.driver);
   acobj.doubleClick(beforeSplitPrice).build().perform();


   if(rb_disc.isSelected())
   {
	   Assert.assertEquals(rb_disc.isSelected(), true);
	   System.out.println("Disc radio button is selected");
   }
   else
   {
	   rb_disc.click();
   }
   acobj.moveToElement(discount).click().perform();

	acobj.sendKeys(discount, Keys.chord(Keys.CONTROL, "a"), i).build().perform() ;
 
	Robot rb=new Robot();

	rb.keyPress(java.awt.event.KeyEvent.VK_ENTER);
	rb.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
	Thread.sleep(3000);
  
   String Percentage=discount.getAttribute("value");

   float j=Float.parseFloat(Percentage);
   float discPrice=(float)((j*f)/100);
   GenericMethods.clickElement(doneBtn);
   Thread.sleep(3000);

   String disc=GenericMethods.getText(actualDisc);
   String[] str=disc.split(" ");
   String str1=str[1];
   String[] str2=str1.split(",");
   String st=str2[0]+str2[1];
   float f2=Float.parseFloat(st);
   Assert.assertEquals(discPrice, f2);
   FrontdeskLandingPage AHO = PageFactory.initElements(GenericMethods.driver, FrontdeskLandingPage.class);
	 return AHO;
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


public static String gname;

public GroupToSingleReservationPage fn_clkGuestName() throws Exception
{
	try
	{
	 gname=GenericMethods.getText(guestName);
	 GenericMethods.clickElement(guestName);
	 GroupToSingleReservationPage GSP=PageFactory.initElements(GenericMethods.driver, GroupToSingleReservationPage.class);
	 return GSP;
	}
	catch(Exception e)
	{
		throw e;
	}
}


public GroupToSingleReservationPage fn_clkSingleGuest() throws Exception
{
	try
	{
	 int gcount=GenericMethods.tr_count(rowcount);
	 for(int i=2;i<=gcount;i++){
		 Thread.sleep(2000);
		 String text=GenericMethods.driver.findElement(By.xpath("//table[@id='roomGrTableId']//tr["+i+"]//td[9]//fieldset[2]")).getText();
		 if(text.equals("Checked In")){
			 WebElement ele=GenericMethods.driver.findElement(By.xpath("//table[@id='roomGrTableId']//tr["+i+"]//td[9]"));
			 GenericMethods.js_Click(ele);
			 break;
		 }
	 }
	}catch(Exception e){
		throw e;
	}
	Thread.sleep(4000);
	 GroupToSingleReservationPage GSP=PageFactory.initElements(GenericMethods.driver, GroupToSingleReservationPage.class);
	 return GSP;
}

public FrontdeskLandingPage fn_clkGrpSave() throws Exception
{
	try
	{
		Thread.sleep(4000);
	 GenericMethods.clickElement(btn_SaveGrp);
	 FrontdeskLandingPage AHO = PageFactory.initElements(GenericMethods.driver, FrontdeskLandingPage.class);
	 return AHO;
	}catch(Exception e){
		throw e;
	}
}


public void fn_verifyCancelledCheckin() throws Exception
{
	try{
	 int gcount=GenericMethods.tr_count(rowcount);
	 for(int i=2;i<=gcount;i++){
		 String text=GenericMethods.driver.findElement(By.xpath("//table[@id='roomGrTableId']//tr["+i+"]//td[9]//fieldset[2]")).getText();
		 if(text.equals("Reserved")){
			 System.out.println("Checked-in reservation has been successfully cancelled.");
			 break;
		 }
	 }
	}catch(Exception e){
		throw e;
	}
}


public CheckinCard fn_AcceptCheckinSelected(String msg) throws Exception
{
	try
	{
	 GenericMethods.clickElement(checkboxTE);
	gname=GenericMethods.driver.findElement(By.xpath("//table[@id='roomGrTableId']//tr[2]//td[3]")).getText();
	 GenericMethods.clickElement(btn_checkInSelected);
	 Thread.sleep(3000);
	 String text=GenericMethods.ActionOnAlert("Accept");
	 Assert.assertEquals(text, msg);
	}catch(UnhandledAlertException e){
		GenericMethods.Alert_Accept();
	}catch(Exception e){
		throw e;
	}catch(AssertionError e){
		throw e;
	}
	 CheckinCard CC=PageFactory.initElements(GenericMethods.driver, CheckinCard.class);
	 return CC;
}


public void fn_verifyCheckedIStatus(String status) throws Exception{
	try{
	int gcount=GenericMethods.tr_count(rowcount);
	 for(int i=2;i<=gcount;i++)
	 {
		 String text1=GenericMethods.driver.findElement(By.xpath("//table[@id='roomGrTableId']//tr[2]//td["+i+"]")).getText();
		 if(text1.equals(gname)){
			 String text=GenericMethods.driver.findElement(By.xpath("//table[@id='roomGrTableId']//tr["+i+"]//td[9]//fieldset[2]")).getText();
			 Assert.assertEquals(text.equals(status), true);
			 break;
		 }
	 }
	}catch(AssertionError e){
		throw e;
	}catch(Exception e){
		throw e;
	}
	
	
}

public void fn_clkAddNewRoom() throws Exception
{
	 GenericMethods.clickElement(addNewRoombtn);

}

public FrontdeskLandingPage fn_verifyAddNewRoom() throws Exception
{
	 String msg=GenericMethods.getText(addNewRoomTitle);
	 Assert.assertEquals(msg, "Add New Room");
	 GenericMethods.clickElement(closeBtn);
	 GenericMethods.clickElement(btn_SaveGrp);
	 FrontdeskLandingPage AHO = PageFactory.initElements(GenericMethods.driver, FrontdeskLandingPage.class);
	 return AHO;

}


public void fn_addNewRoomDetail() throws Exception
{
	Select sel=new Select(roomTypeDD);
	sel.selectByIndex(1);
	Thread.sleep(4000);
    //GenericMethods.selectElement(roomTypeDD, "HMS");
	Select sel1=new Select(adultDD);
	sel1.selectByIndex(1);
	Thread.sleep(3000);
    //GenericMethods.selectElement(adultDD, "1");
	Select sel2=new Select(childDD);
	sel2.selectByIndex(0);
    //GenericMethods.selectElement(childDD, "0");
	Select sel3=new Select(roomsDD);
	sel3.selectByIndex(1);
	Thread.sleep(3000);
    //GenericMethods.selectElement(roomsDD, "1");
    GenericMethods.clickElement(addBtn);
    Thread.sleep(3000);

}



public GroupToSingleReservationPage fn_ClickRoomReservationID() throws Exception
{
  	 try{
  		GenericMethods.clickElement(RoomReservationID);
  		GroupToSingleReservationPage GTS=PageFactory.initElements(GenericMethods.driver, GroupToSingleReservationPage.class);
  		return GTS;
  	 }catch(Exception e){
  		 throw e;
  	 }
}




public void fn_ValidateSelectedIncluAddons() throws Exception
{

  	 try
  	 {
  		//GenericMethods.clickElement(InclusionAddOns_Link);
  		GenericMethods.clickElement(inclusionname);
  		String str=GenericMethods.getText(inclusionname);
  		GenericMethods.clickElement(RightArrow_BT);
  		GenericMethods.clickElement(Done_BT);

  		Thread.sleep(4000);
  		String obj=GenericMethods.getText(InclusionName_besideAddInclu);

  		Assert.assertTrue(str.contains(obj));

  	 }catch(Exception e){
  		 throw e;
  	 }catch(AssertionError e){
  		 throw e;
  	 }

}

public static String price;
public void fn_ChangePrice() throws Exception
{
  	 try
  	 {
  		Actions actobj1=new Actions(GenericMethods.driver);
  		actobj1.click(SingleGuestPrice_ED).build().perform();
  		price=GenericMethods.generateRandomnum();
  		actobj1.moveToElement(SingleGuestPrice_ED);
  		GenericMethods.js_Sendkey(SingleGuestPrice_ED, price);
  		//.sendKeys(SingleGuestPrice_ED, Keys.chord(Keys.CONTROL, "a"), price).build().perform();
  		//GenericMethods.js_Sendkey(SingleGuestPrice_ED, price);
  		Thread.sleep(5000);
  		GenericMethods.selectElementByIndex(AdultSelectionDD, 1);
  		Thread.sleep(10000);
  		//GenericMethods.clickElement(SaveChangesBtn);
  		actobj1.click(btn_SaveGrp).build().perform();
  		Thread.sleep(4000);
  	 }
  	 catch(Exception e)
  	 {
  		 throw e;
  	 }

}

public void fn_verifyChangedPrice() throws Exception
{

	try
	{
	String str=SingleGuestPrice_ED.getAttribute("value");
	Assert.assertTrue(str.contains(price));
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


public void fn_ClickSave() throws Exception
{

  	 try
  	 {
  	 GenericMethods.clickElement(saveBtn);
  	 }catch(Exception e){
  		 throw e;
  	 }

}


public GroupToSingleReservationPage fn_ClickAddGuestDetails_Link() throws Exception{

  	 try{
  	 GenericMethods.js_Click(AddGuestDetails_Link);
  	  GroupToSingleReservationPage GTS=PageFactory.initElements(GenericMethods.driver, GroupToSingleReservationPage.class);
		return GTS;
  	 }catch(Exception e){
  		 throw e;
  	 }
    }


public void fn_ClickClearAndVerify_IMG(String Name) throws Exception
{

  	 try
  	 {

  		String str= GenericMethods.getText(GuestName_TX);
  		Assert.assertTrue(str.contains(Name));
  		GenericMethods.clickElement(Clear_Link);
  	 }catch(Exception e){
  		 throw e;
  	 }catch(AssertionError e){
  		 throw e;
  	 }

}



public GroupToSingleReservationPage fn_ClickOnStatusLink() throws Exception
{

  	 try
  	 {
  		String str= GenericMethods.getText(Status_Link);
  		Assert.assertTrue(str.contains("Checked In"));
  		GenericMethods.clickElement(Status_Link);
  		GroupToSingleReservationPage GTSP=PageFactory.initElements(GenericMethods.driver, GroupToSingleReservationPage.class);
  	    return GTSP;
  	 }catch(Exception e){
  		 throw e;
  	 }

}


	 public int CountRoomInGroup(){
			int count=0;
		int counts=	GenericMethods.tr_count(RoomsInGroup);
		for(int i=2;i<=counts;i++){
			if(GenericMethods.driver.findElement(By.xpath("//table[@id='roomGrTableId']//tr["+i+"]//td[2]/input")).isEnabled()){
				 count++;
				 System.out.println(count);
			}
			else
			{
				break;
			}
		}
		return count;

		}

	 public void AddRoomToGroup(String roomType,String adults,String roomNum) throws Exception
	 {
			GenericMethods.clickElement(AddNewRoomG);
			Thread.sleep(1000);
			Select s=new Select(AddNewRoomTypeForGroupDropdown);
			s.selectByVisibleText(roomType);
			Thread.sleep(1000);

			Select s2=new Select(AdultSelectionDD);
			s2.selectByVisibleText(adults);
			Thread.sleep(1000);
			Select s1=new Select(RoomsDropdownInAddNewRoom);
			s1.selectByVisibleText(roomNum);
			Thread.sleep(1000);
			GenericMethods.clickElement(AddBtn);
			Thread.sleep(2000);
			GenericMethods.clickElement(btn_SaveGrp);
		}



	 public void DeleteAddedRoomFromGroup(String id) throws Exception{
			int counts=	GenericMethods.tr_count(RoomsInGroup);
			for(int i=2;i<=counts;i++){
				if(GenericMethods.driver.findElement(By.xpath("//table[@id='roomGrTableId']//tr["+i+"]//td[2]/input")).isEnabled()){

				if(GenericMethods.driver.findElement(By.xpath("//table[@id='roomGrTableId']/tbody/tr["+i+"]/td[3]")).getText().trim().equals(id)){


					i=i+1;

					GenericMethods.driver.findElement(By.xpath("//table[@id='roomGrTableId']/tbody/tr["+i+"]/td[2]/input")).click();
					GenericMethods.clickElement(NoShowSelect);
					GenericMethods.ActionOnAlert("Accept");
					Select s=new Select(NoShowReason);
					s.selectByIndex(2);
					GenericMethods.sendKeys(NoShowDesc, "Goin To No show");
					GenericMethods.clickElement(NoShowReservationBtn);
					break;
				}

				}
				else
				{
					break;
				}
		}
		}


	 public void fn_verifySingleTab() throws Exception
	 {
		 try
		 {
		 String a=GenericMethods.getText(TabTitle);
		 Assert.assertEquals(a, "Single Reservation");
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



	 public void fn_verifyGroupTab() throws Exception
	 {
		 try
		 {
		 String a=GenericMethods.getText(TabTitle);
		 Assert.assertEquals(a, "Group Reservation");
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


	 public void fn_SetPreviousCheckOutDate()
	 {
	        try{
	            String str=GenericMethods.getText(SecondGuestCheckoutDate_Link);
	               Assert.assertTrue(str.contains("3"));
	               Thread.sleep(6000);
	               GenericMethods.clickElement(SecondGuestCheckoutDate_Link);
	               Thread.sleep(2000);
	               GenericMethods.clickElement(PreviousCheckoutDate_InCal);
	               Thread.sleep(6000);
	        }catch(Exception e){

	        }
	        catch(AssertionError e)
	        {
	        	throw e;
	        }
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

	 
	 
	 public CheckinCard fn_clkGuestEarlyCheckinLnk(String reason,String msg) throws Exception{
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
	 
	 
	 public CheckinCard fn_clkGrpCheckinbtn(String msg) throws Exception{
		 try{
		 GenericMethods.clickElement(btn_GroupCheckin);
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
	 
	 
	 public String fn_addSingleGuestDetails() throws Exception{
		try{
		 GenericMethods.clickElement(link_addGuestDetails);
		 Thread.sleep(3000);
		 //fname="Kirti";
			fname=GenericMethods.generateRandomString();
		 
		 //System.out.println(fname);
		 
		 GenericMethods.selectElementByIndex(dropdown_Salutation, 1);
		 //GenericMethods.TypeInField(txtbox_guestFName, fName);
		GenericMethods.js_Click(txtbox_guestFName);
		Thread.sleep(3000);
		
		
		JavascriptExecutor myExecutor = ((JavascriptExecutor) GenericMethods.driver);
		myExecutor.executeScript("document.getElementById('txtFname0').value= '"+fname+"';");
		
		 //Actions act=new Actions(GenericMethods.driver);
		// act.sendKeys(txtbox_guestFName, fname).build().perform();
		//GenericMethods.js_Sendkey(txtbox_guestFName, fname);
		 
		 //act.moveToElement(txtbox_guestFName).sendKeys(Keys.SPACE).build().perform();
		 //Thread.sleep(2000);
		// act.moveToElement(txtbox_guestFName).keyDown(Keys.ARROW_DOWN).click().build().perform();
		 //String gName=AddGuestDetails_Link.getText();
		 //fname=gName.split(" ")[0];
		 
		 GenericMethods.sendKeys(txtbox_guestLName, GenericMethods.generateRandomString());
		 GenericMethods.sendKeys(txtbox_guestPh, GenericMethods.generateRandomnum());
	    GenericMethods.clickElement(btn_OK);
	    Thread.sleep(5000);
		}catch(ElementNotVisibleException e){
			Thread.sleep(2000);
			fname=GenericMethods.generateRandomString();
			GenericMethods.js_Sendkey(txtbox_guestFName, fname);
			 GenericMethods.sendKeys(txtbox_guestLName, GenericMethods.generateRandomString());
			 GenericMethods.sendKeys(txtbox_guestPh, GenericMethods.generateRandomnum());
		     GenericMethods.clickElement(btn_OK);
		}catch(UnhandledAlertException e){
			Thread.sleep(3000);
			GenericMethods.Alert_Accept();
		}
		catch(Exception e){
			throw e;
		}
	 return fname;
	 }
	 

	 public void fn_clkGrpSaveBtn() throws Exception{
		 try{
		 GenericMethods.clickElement(btn_GrpSave);
		 }catch(UnhandledAlertException e){
			 GenericMethods.Alert_Accept();
		 }catch(Exception e){
			 throw e;
		 }
	 }
	 
	 
     public AccountStatementLandingPage fn_clk_CheckoutBtn() throws Exception{
    	try{
    	 GenericMethods.clickElement(btn_Checkout);
    	 AccountStatementLandingPage ASP=PageFactory.initElements(GenericMethods.driver, AccountStatementLandingPage.class);
    	 return ASP;
    	}catch(Exception e){
    		throw e;
    	}
     }
     
     
     
     public void fn_clkLateCheckoutBtn(String reason,String msg) throws Exception{
    	 try{
    	 GenericMethods.clickElement(btn_LateChekout);
    	 GenericMethods.sendKeys(txtbox_GuestEarlyCheckinReason, reason);
    	 GenericMethods.sendKeys(txtbox_EarlyCheckinCharge, "100");
    	 GenericMethods.clickElement(btn_GuestEarlyCheckin);
    	 String str=GenericMethods.Alert_Accept();
    	 Assert.assertEquals(str.equals(msg), true);
    	 }catch(AssertionError e){
    		 throw e;
    	 }catch(Exception e){
    		 throw e;
    	 }
     }
    
     
     public void fn_addGuestDetails() throws Exception{
    	try{
    		
    	 GenericMethods.selectElement(drpdown_Adult, "2");
    	 Thread.sleep(4000);
    	 GenericMethods.clickElement(ManageSharerLink);    	 
    	 Thread.sleep(3000);
    	 
    		JavascriptExecutor myExecutor = ((JavascriptExecutor) GenericMethods.driver);
    		myExecutor.executeScript("document.getElementById('fName2').value= '"+GenericMethods.generateRandomString()+"';");
    	 //GenericMethods.sendKeys(txtbox_sharerFN, GenericMethods.generateRandomString());
    	 GenericMethods.sendKeys(txtbox_sharerLN, GenericMethods.generateRandomString());
    	 GenericMethods.sendKeys(txtbox_sharerPH, "123456");
    	 GenericMethods.clickElement(chkbox_sharer);
    	 GenericMethods.clickElement(btn_manageSharerSave);
    	}catch(Exception e){
    		throw e;
    	}
    	 
     }
     
	 
     public String fn_chkGuestStatus(String fname) throws Exception{
    	try{
    	 String status=null;
    	 int count=GenericMethods.tr_count(count_sharerGuest);
    	 for(int i=2;i<=count;i++){
    		 String str=GenericMethods.driver.findElement(By.xpath("//table[@id='tblRoomSharers']//tr["+i+"]//td[3]")).getText();
    		 if(str.toLowerCase().contains(fname.toLowerCase())){
    			status=GenericMethods.driver.findElement(By.xpath("//table[@id='tblRoomSharers']//tr["+i+"]//td[8]")).getText();
    			break;
    		 }
    	 }
    	 
    	 return status;
    	}catch(Exception e){
    		throw e;
    	}
     }
     
     
     public AccountStatementLandingPage fn_clkGrpChkoutBtn() throws Exception{
    	 try{
    	 GenericMethods.clickElement(btn_GrpCheckout);
    	 AccountStatementLandingPage ASLP=PageFactory.initElements(GenericMethods.driver, AccountStatementLandingPage.class);
    	 return ASLP;
    	 }catch(Exception e){
    		 throw e;
    	 }
     }
             
     public AccountStatementLandingPage fn_clkCheckoutSelected(String name) throws Exception{
    	try{
    	 int count=GenericMethods.tr_count(rowcount);
    	 for(int i=2;i<=count;i++){
    		 String str=GenericMethods.driver.findElement(By.xpath("//table[@id='roomGrTableId']//tr["+i+"]//td[6]//td")).getText();
    	       if(str.toLowerCase().contains(name.toLowerCase())){
    	    	   GenericMethods.driver.findElement(By.xpath("//table[@id='roomGrTableId']//tr["+i+"]//td[2]/input")).click();
    	    	   break;
    	       }    	     	 
    	 }
    	GenericMethods.clickElement(btn_CheckoutSelected);
    	}catch(Exception e){
    		throw e;
    	}
    	 AccountStatementLandingPage ASLP=PageFactory.initElements(GenericMethods.driver, AccountStatementLandingPage.class);
    	 return ASLP;
     }
     
     
     public void fn_clkCancelBtn(String charge) throws Exception{
    	try{
    	 GenericMethods.clickElement(btn_Cancel);
    	 GenericMethods.selectElementByIndex(drpdown_cancelNoShowReason, 1);
    	 GenericMethods.sendKeys(txtbox_EarlyCheckinCharge,charge);
    	 GenericMethods.sendKeys(txtbox_cancelNoShowDesc, GenericMethods.generateRandomString());
    	 GenericMethods.clickElement(chkbox_cnclEmail);
    	 GenericMethods.clickElement(btn_cancelReserv);
    	 GenericMethods.sendKeys(txtbox_Email, GenericMethods.generateRandomString()+"@stayezee.com");
    	 GenericMethods.clickElement(btn_sendEmail);
    	 GenericMethods.clickElement(btn_cancelReserv);
    	}catch(Exception e){
    		throw e;
    	}
     }
     
     
     public String fn_verifyCancelNoShowAlert() throws Exception{
    	 try{
    	 String str=GenericMethods.Alert_Accept();
    	 return str;
    	 }catch(Exception e){
    		 throw e;
    	 }
     }
     
     
}
