package com.hotelogix.smoke.frontdesk.FrontdeskHome;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hotelogix.smoke.genericandbase.Constant;
import com.hotelogix.smoke.genericandbase.ExcelUtil;
import com.hotelogix.smoke.genericandbase.GenericMethods;
import com.itextpdf.text.log.SysoCounter;

public class AddQuickReservationForm {
	
	
	
	
	
	
	public String fname;
	public String lname;
	public String phno;
	public String email;
	public String  pakFrontdesk;
	
	
	@FindBy(xpath="//div[@id='PanelQuickRes_h']//table/tbody/tr/td[1]")
	public WebElement Text_FormTitle;
	
	
	
	
	@FindBy(xpath="//div[@id='lblRoomName']")
	public WebElement Text_RoomTypeName;
	
	
	@FindBy(xpath="//div[@id='PanelQuickRes_h']/table/tbody/tr/td[4]/input")
	public WebElement CB_AssignRoom;
	
	@FindBy(xpath="//div[@id='PanelQuickRes']/a")
	public WebElement Btn_CloseForm;
	
	
	
	@FindBy(xpath="//span[@id='qrDuration']")
	public WebElement Text_BookingDuration;
	
	
	@FindBy(xpath="//select[@id='qrSelAdult']")
	public WebElement DD_Adult;
	
	@FindBy(xpath="//select[@id='qrSelChildren']")
	public WebElement DD_Child;
	
	@FindBy(xpath="//select[@id='qrSelRateType']")
	public WebElement DD_RateType;
	
	@FindBy(xpath="//select[@id='noofRooms1']")
	public WebElement DD_Rooms;
	
	
	
	@FindBy(xpath="//select[@id='salutation']")
	public WebElement DD_Salutation;
	
	@FindBy(xpath="//input[@id='qrTxtFirstName']")
	public WebElement TxtBx_FirstName;
	
	@FindBy(xpath="//input[@id='qrTxtLastName']")
	public WebElement TxtBx_LastName;
	
	
	@FindBy(xpath="//input[@id='qrTxtPhone']")
	public WebElement TxtBx_Phone;
	
	
	@FindBy(xpath="//input[@id='rdPhAssign1']")
	public WebElement RB_Mobile;
	
	@FindBy(xpath="//input[@id='rdPhAssign2']")
	public WebElement RB_Teleph;
	
	
	
	@FindBy(xpath="//input[@id='qrEmail']")
	public WebElement TxtBx_EmailId;
	
	
	@FindBy(xpath="//div[@id='qrCCLinks']/table/tbody/tr/td/a[1]")
	public WebElement Link_CreditCardGuarantee;
	
	@FindBy(xpath="//span[@id='spnDeposit']")
	public WebElement Link_Deposit;
	
	
	@FindBy(xpath="//input[@id='chkBxkHold']")
	public WebElement CB_HoldTill;
	
	
	@FindBy(xpath="//button[@id='qrBtnBlock-button']")
	public WebElement Btn_TempReserve;
	
	@FindBy(xpath="//button[@id='qrBtnReserve-button']")
	public WebElement Btn_Reserve;
	
	
	@FindBy(xpath="//button[@id='qrBtnCheck-In-button']")
	public WebElement Btn_CheckIn;
	
	
	@FindBy(xpath="//a[@id='lnkQResFormSingleEnab']")
	public WebElement Link_SingleRes;
	
	@FindBy(xpath="//div[@id='PanelQuickRes']/div[3]/table/tbody/tr/td[3]/a[3]")
	public WebElement Link_GroupRes;
	
	
	@FindBy(xpath="//div[@id='PanelQuickRes']/div[3]/table/tbody/tr/td[3]/a[4]")
	public WebElement Link_AgentCorporate;
	
	@FindBy(xpath="//span[@id='resPricePn']")
	public WebElement Text_ResPerNPrice;
	
	
	@FindBy(xpath="//span[@id='resPrice']")
	public WebElement Text_TotalPrice;
	
	
	
	
	
public String GetTotalPrice(){
String b=null;
try{
	String price=GenericMethods.getText(Text_TotalPrice);
	
	if(price.contains(",")==true){
		String pri []=price.split(",");
		 b=pri[0].toString().substring(3, pri[0].length()) + pri[1].toString().substring(0, pri[1].length());
		System.out.println("Res Per night Price is"+ b);
		
		
	}
	else{
		
		b=price.substring(3,price.length()).trim();
		
	}
	}
	catch(Exception e){
		e.printStackTrace();
	}
	

	return b;
	
	
}






public String GetPrice(){
		String a=null;
		try{
		String price=GenericMethods.getText(Text_ResPerNPrice);
		
		if(price.contains(",")==true){
			String pri []=price.split(",");
			 a=pri[0].toString().substring(3, pri[0].length()) + pri[1].toString().substring(0, pri[1].length()-1).trim();
			System.out.println("Res Per night Price is"+ a);
			
			
		}
		else{
			
			a=price.substring(3,price.length()-1).trim();
			
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		

		return a;
	}
	
	
public FrontdeskLandingPage FillQuickResForm(int iTestCaseRow) throws Exception{
fname=	GenericMethods.generateRandomString();
lname=GenericMethods.generateRandomString();
phno=GenericMethods.generateRandomString();
email=GenericMethods.generateRandomString();
Thread.sleep(2000);
GenericMethods.selectElement(DD_Adult, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_AdultForRes)));
Thread.sleep(2000);
GenericMethods.selectElement(DD_Child, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ChildForRes)));
Thread.sleep(2000);
GenericMethods.selectElement(DD_RateType, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ResRateType)));
Thread.sleep(2000);
GenericMethods.selectElement(DD_Rooms, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_RoomsToBook)));
Thread.sleep(2000);
GenericMethods.selectElement(DD_Salutation, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_Salutation)));
Thread.sleep(2000);
GenericMethods.sendKeys(TxtBx_FirstName, fname);
Thread.sleep(2000);
GenericMethods.sendKeys(TxtBx_LastName,lname);	
Thread.sleep(2000);
GenericMethods.sendKeys(TxtBx_Phone,  phno);
Thread.sleep(2000);
GenericMethods.sendKeys(TxtBx_EmailId, email);
Thread.sleep(2000);
 GenericMethods.clickElement(Btn_Reserve);
 Thread.sleep(2000);

FrontdeskLandingPage FLP=PageFactory.initElements(GenericMethods.driver, FrontdeskLandingPage.class);
return FLP;

}


public SingleReservationPage FillQuickResvForm(int iTestCaseRow) throws Exception{
fname=	GenericMethods.generateRandomString();
lname=GenericMethods.generateRandomString();
phno=GenericMethods.generateRandomString();
email=GenericMethods.generateRandomString();
GenericMethods.selectElement(DD_Adult, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_AdultForRes)));
Thread.sleep(2000);
GenericMethods.selectElement(DD_Child, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ChildForRes)));
Thread.sleep(2000);
GenericMethods.selectElement(DD_RateType, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ResRateType)));
Thread.sleep(2000);
GenericMethods.selectElement(DD_Rooms, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_RoomsToBook)));
Thread.sleep(2000);
GenericMethods.selectElement(DD_Salutation, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_Salutation)));
Thread.sleep(2000);
GenericMethods.sendKeys(TxtBx_FirstName, fname);
Thread.sleep(2000);
GenericMethods.sendKeys(TxtBx_LastName,lname);	
Thread.sleep(2000);
GenericMethods.sendKeys(TxtBx_Phone,  phno);
Thread.sleep(2000);
GenericMethods.sendKeys(TxtBx_EmailId, email);
Thread.sleep(2000);
 GenericMethods.clickElement(Link_SingleRes);
 Thread.sleep(2000);
SingleReservationPage SRP=PageFactory.initElements(GenericMethods.driver, SingleReservationPage.class);
return SRP;

}


public GroupReservationPage FillQuickResvsForm(int iTestCaseRow,WebElement eleToClick) throws Exception{
fname=	GenericMethods.generateRandomString();
lname=GenericMethods.generateRandomString();
phno=GenericMethods.generateRandomString();
email=GenericMethods.generateRandomString();
Thread.sleep(2000);
GenericMethods.selectElement(DD_Adult, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_AdultForRes)));
Thread.sleep(2000);
GenericMethods.selectElement(DD_Child, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ChildForRes)));
Thread.sleep(2000);
GenericMethods.selectElement(DD_RateType, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ResRateType)));
Thread.sleep(2000);
GenericMethods.selectElement(DD_Rooms, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_RoomsToBook)));
Thread.sleep(2000);
GenericMethods.selectElement(DD_Salutation, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_Salutation)));
Thread.sleep(2000);
GenericMethods.sendKeys(TxtBx_FirstName, fname);
Thread.sleep(2000);
GenericMethods.sendKeys(TxtBx_LastName,lname);	
Thread.sleep(2000);
GenericMethods.sendKeys(TxtBx_Phone,  phno);
Thread.sleep(2000);
GenericMethods.sendKeys(TxtBx_EmailId, email);
Thread.sleep(2000);
 GenericMethods.clickElement(eleToClick);
 Thread.sleep(2000);
 GroupReservationPage SRP=PageFactory.initElements(GenericMethods.driver, GroupReservationPage.class);
return SRP;

}

	
	

public FrontdeskLandingPage FillQuickResvsFormBySelectingPak(int iTestCaseRow,String packg) throws Exception{
fname=	GenericMethods.generateRandomString();
lname=GenericMethods.generateRandomString();
phno=GenericMethods.generateRandomString();
email=GenericMethods.generateRandomString();
Thread.sleep(2000);
GenericMethods.selectElement(DD_Adult, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_AdultForRes)));
Thread.sleep(2000);
GenericMethods.selectElement(DD_Child, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ChildForRes)));
Thread.sleep(2000);
GenericMethods.selectElement(DD_RateType, packg);
Thread.sleep(2000);
GenericMethods.selectElement(DD_Rooms, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_RoomsToBook)));
Thread.sleep(2000);
GenericMethods.selectElement(DD_Salutation, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_Salutation)));
Thread.sleep(2000);
GenericMethods.sendKeys(TxtBx_FirstName, fname);
Thread.sleep(2000);
GenericMethods.sendKeys(TxtBx_LastName,lname);	
Thread.sleep(2000);
GenericMethods.sendKeys(TxtBx_Phone,  phno);
Thread.sleep(2000);
GenericMethods.sendKeys(TxtBx_EmailId, email);
Thread.sleep(2000);
 GenericMethods.clickElement(Btn_Reserve);
Thread.sleep(2000);
FrontdeskLandingPage FLP=PageFactory.initElements(GenericMethods.driver, FrontdeskLandingPage.class);
return FLP;

}

	
/*public  void GetPackage(boolean res,int iTestCaseRow) throws Exception{
if(res==true){
	
	Select s=new Select(DD_RateType);
	Thread.sleep(2000);
	s.selectByVisibleText(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_PakageName)));
	Thread.sleep(2000);
		
	
}

else{
	
}

}*/
	








public boolean CheckPackage(int iTestCaseRow ) throws Exception{
	
	boolean b=false;
	Select s=new Select(DD_RateType);
	List<WebElement> li=s.getOptions();
	for(int i=1;i<=li.size();i++){
		
		String pakname=li.get(i).getText();
		if(pakname.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_PakageName)))){
			b=true;
			break;
		
		
			
			
		}
		
		
		
	}
	return b;

	
	

	
}


public String GetSelectedPackage(String name) {
	String txt=null;
	
	try{
		
	
		
		
		
		
	Select s=new Select(DD_RateType);
	Thread.sleep(2000);
	List<WebElement> li=s.getOptions();
	for(WebElement we :li){
		if(we.getText().contains(name)){
			s.selectByVisibleText(we.getText());
		}
		
	}
	
	Thread.sleep(2000);
	txt=s.getFirstSelectedOption().getText();
	
	}
	catch(Exception e){
		e.printStackTrace();
	}
	
	return txt;
}


public String getAddQuickResTitle(){
	String tit=null;
try{
String title=GenericMethods.getText(Text_FormTitle);
if(title.contains("How to use?")){
	 tit=title.substring(0, title.indexOf("Ho")-1).trim();
	 Reporter.log("Environment is live", true);
}
else{
	tit=GenericMethods.getText(Text_FormTitle).trim();
}
}
catch(Exception e){
e.printStackTrace();
}
	
return tit;
}
	

}
