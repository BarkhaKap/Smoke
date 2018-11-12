package com.hotelogix.smoke.FrontdeskTest;

import java.util.ArrayList;
import java.util.Set;

import javax.media.rtp.rtcp.Report;


import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.hotelogix.smoke.frontdesk.ViewDetailsPage.EnableEditingPage;
import com.hotelogix.smoke.frontdesk.ViewDetailsPage.GroupToSingleReservationPage;
import com.hotelogix.smoke.frontdesk.ViewDetailsPage.ViewDetailsPage;
import com.hotelogix.smoke.frontdesk.WebReservation.AddOnsPage;
import com.hotelogix.smoke.frontdesk.WebReservation.WebAddMoreRoomPage;
import com.hotelogix.smoke.frontdesk.WebReservation.WebConfirmReservationPage;
import com.hotelogix.smoke.frontdesk.WebReservation.WebConfirmReservationPrintPage;
import com.hotelogix.smoke.frontdesk.WebReservation.WebMoreDetailsPage;
import com.hotelogix.smoke.frontdesk.WebReservation.WebReservationHomePage;
import com.hotelogix.smoke.frontdesk.WebReservation.WebSelectRoomPage;
import com.hotelogix.smoke.frontdesk.WebReservation.GuestConsole.WebGuestAddMoreRoomPage;
import com.hotelogix.smoke.frontdesk.WebReservation.GuestConsole.WebGuestConfirmReservationPage;
import com.hotelogix.smoke.frontdesk.WebReservation.GuestConsole.WebGuestConfirmReservationPrintPage;
import com.hotelogix.smoke.frontdesk.WebReservation.GuestConsole.WebGuestConsoleLandingPage;
import com.hotelogix.smoke.frontdesk.WebReservation.GuestConsole.WebGuestSelectRoomPage;
import com.hotelogix.smoke.frontdesk.WebReservation.GuestConsole.WebGuestStayDetailsPage;
import com.beust.jcommander.Parameter;
import com.hotelogix.smoke.admin.BaseClass.AdmineHome;
import com.hotelogix.smoke.admin.General.Discounts_SpecialDiscountLP;
import com.hotelogix.smoke.admin.General.IdentificationTypesList;
import com.hotelogix.smoke.admin.PriceManager.AddActivationDateWeb;
import com.hotelogix.smoke.admin.PriceManager.AddEditPackage;
import com.hotelogix.smoke.admin.PriceManager.AddonLandingPage;
import com.hotelogix.smoke.admin.PriceManager.FrontDeskPackageDetailPage;
import com.hotelogix.smoke.admin.PriceManager.FrontdeskPackagesListPage;
import com.hotelogix.smoke.admin.PriceManager.ListOfPackagesFrontdesk;
import com.hotelogix.smoke.admin.PriceManager.ListOfPackagesPage;
import com.hotelogix.smoke.admin.PriceManager.ListOfPackagesWeb;
import com.hotelogix.smoke.admin.PriceManager.ListofPackagesInPackageMaster;
import com.hotelogix.smoke.admin.PriceManager.PackageDetailsWeb;
import com.hotelogix.smoke.admin.PriceManager.RoomPricesLandingPage;
import com.hotelogix.smoke.admin.PriceManager.SaveAddonsPage;
import com.hotelogix.smoke.admin.PriceManager.attachPackages;
import com.hotelogix.smoke.admin.roommanager.RoomsLandingPage;
import com.hotelogix.smoke.admin.roommanager.AddRoomsPage;
import com.hotelogix.smoke.emailaccount.EmailHomePage;
import com.hotelogix.smoke.emailaccount.InboxMailPage;
import com.hotelogix.smoke.frontdesk.Accounts.AccountsLandingPage;
//import com.hotelogix.smoke.admin.WebBookingEngine.SelectRoom_Packages;
//import com.hotelogix.smoke.admin.WebBookingEngine.WebReservationConsole;
import com.hotelogix.smoke.frontdesk.CashCounter.CashCounterPage;
import com.hotelogix.smoke.frontdesk.CashCounter.NightAuditPdfPage;
import com.hotelogix.smoke.frontdesk.CashCounter.NightAuditVideoPage;
import com.hotelogix.smoke.frontdesk.FrontdeskHome.AddQuickReservationForm;
import com.hotelogix.smoke.frontdesk.FrontdeskHome.CheckinCard;
import com.hotelogix.smoke.frontdesk.FrontdeskHome.CheckoutCard;
import com.hotelogix.smoke.frontdesk.FrontdeskHome.FrontdeskLandingPage;
import com.hotelogix.smoke.frontdesk.FrontdeskHome.GroupReservationPage;
import com.hotelogix.smoke.frontdesk.FrontdeskHome.NightAuditLandingPage;
import com.hotelogix.smoke.frontdesk.FrontdeskHome.SingleReservationPage;
import com.hotelogix.smoke.frontdesk.FrontdeskTrialPage.FrontdeskContinueTrialPage;
import com.hotelogix.smoke.frontdesk.Payment.AccountStatementLandingPage;
import com.hotelogix.smoke.frontdesk.Payment.ReservationFolioPage;
import com.hotelogix.smoke.frontdesk.Report.CashierReportPage;
import com.hotelogix.smoke.frontdesk.Report.DailySalesReportPage;
import com.hotelogix.smoke.frontdesk.Report.DiscountAllowanceReportPage;
import com.hotelogix.smoke.frontdesk.Report.FRMonthlySummeryReport;
import com.hotelogix.smoke.frontdesk.Report.LiveSupportLandingWindow;
import com.hotelogix.smoke.frontdesk.Report.NoShowReportPage;
import com.hotelogix.smoke.frontdesk.Report.ORHouseCountReport;
import com.hotelogix.smoke.frontdesk.Report.ReportLandingPage;
import com.hotelogix.smoke.frontdesk.ReservationSearchResult.ReservationSearchResultLandingPage;
import com.hotelogix.smoke.frontdesk.SampleRestaurantPage.ConfirmOrderPage;
import com.hotelogix.smoke.frontdesk.SampleRestaurantPage.ConfirmOrderPage1;
import com.hotelogix.smoke.frontdesk.SampleRestaurantPage.OrderFolioPage;
import com.hotelogix.smoke.frontdesk.SampleRestaurantPage.OrderFromNewTab;
import com.hotelogix.smoke.frontdesk.SampleRestaurantPage.SampleRestaurantPage;
import com.hotelogix.smoke.frontdesk.SampleRestaurantPage.TransactionListPage;
import com.hotelogix.smoke.genericandbase.BasePage;
import com.hotelogix.smoke.genericandbase.Constant;
import com.hotelogix.smoke.genericandbase.ExcelUtil;
import com.hotelogix.smoke.genericandbase.GenericMethods;
import com.hotelogix.smoke.login.AdminLoginPage;
import com.hotelogix.smoke.login.EmailAccountLoginPage;
import com.hotelogix.smoke.login.FrontdeskLoginPage;
import com.hotelogix.smoke.login.WebGuestConsoleLoginPage;



public class FrontdeskTest {

	


	public WebDriver driver;
	private  String sTestCaseName;
	private int iTestCaseRow;
	public static ArrayList<String> a1=new ArrayList<String>();
	public static ArrayList<String> gd=new ArrayList<String>();
	public static String Discount="SP Discount(10.00%)";
	private FrontdeskLoginPage AL;

	FrontdeskContinueTrialPage FCT=new FrontdeskContinueTrialPage();

	
	@BeforeMethod	
	public void LaunchApp() throws Exception{

		sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
		ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
		iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
		try
		{
			AL = GenericMethods.fn_OpenFrontdesk(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_Browser)), ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_AppURL)));
			//AL.Frontdesklogin_12725();
		}catch(Exception e){
			Thread.sleep(4000);
			System.out.println("System is showing problem during login");
			FrontdeskLoginPage AL = GenericMethods.fn_OpenFrontdesk(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_Browser)), ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_AppURL)));
		}
	}



	@Test(priority=1,description="Navigate to Web Console by clicking 'Web Reservation' link on frontdesk, and create a web reservation.Verify rates and taxes posted for booking on frontdesk.")
	public void TC_180_181_182_183_184_185_186_187_188() throws Throwable{


		try
		{
			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
			//FrontdeskLoginPage AL=new FrontdeskLoginPage();
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			FP.fn_ClickCancelButtonAlert();
			//GenericMethods.driver.navigate().refresh();
			Thread.sleep(2000); 
			WebReservationHomePage WRHP=FP.ClickOnWebReservation();
			GenericMethods.switchToWindowHandle("Web Reservation");
			WRHP.fn_ValidateStaydetailsPage(iTestCaseRow);
			WebSelectRoomPage WSRP=WRHP.fn_CheckAvability();
			String text=WSRP.fn_ValidateRoomPackagesSection();
			Assert.assertEquals(text.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2))), true);
			WebAddMoreRoomPage WARP=WSRP.fn_SelectRoomandRate();
			String text1=WARP.fn_pageVerify();
			Assert.assertEquals(text1.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult3))), true);
			WebConfirmReservationPage WCRP=WARP.ClickOnConfirmBtn();
			String text2=WCRP.fn_ConfirmBookingPaymentPage();
			Assert.assertEquals(text2.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult4))), true);
			WebConfirmReservationPrintPage WCPP=WCRP.ConfirmBooking(iTestCaseRow);
			String text3=WCPP.verify_pageHeader();
			Assert.assertEquals(text3.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult5))), true);
			String reserId=WCPP.GetReservationId();
			Thread.sleep(4000);
			ArrayList<String> arr1=WCPP.GetAmtDetails("Total Amount (with Tax):");
			GenericMethods.driver.close();
			GenericMethods.switchToWindowHandle("Frontdesk");
			GenericMethods.driver.navigate().refresh();
			Thread.sleep(3000);
			FP.fn_ClickCancelButtonAlert();
			//  FP.clk_CalenderCurrentDate();
			ReservationSearchResultLandingPage RSRP=FP.fn_SearchByReservationID(reserId.trim());
			ViewDetailsPage VDP=RSRP.fn_ClickOnSearchedRecord();
			Thread.sleep(6000);
			ArrayList<String> arr2=VDP.GetAmtDetails();
			Assert.assertEquals(arr1.equals(arr2), true);

 
			System.out.println("TC_180_181_182_183_184_185_186_187_188  Executed");
		}catch(Throwable e)
		{GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
		throw e;
		}        
	}



	@Test(priority=2,description="Attach a master package to web and verify published price on web console.")
	public void TC_189_190() throws Throwable
	{

		try
		{		
			
			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
			//FrontdeskLoginPage AL=new FrontdeskLoginPage();
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			FP.fn_ClickCancelButton();
			GenericMethods.driver.navigate().refresh();
			Thread.sleep(4000); 
			FP.fn_ClickCancelButton();
			Thread.sleep(4000); 
			FP.fn_clkAdminLnk();
			GenericMethods.switchToWindowHandle("Administrator Console");
			BasePage BP=new BasePage();
			Thread.sleep(2000);
			ListofPackagesInPackageMaster LPM=BP.fn_navigatePackageMaster();
			AddEditPackage AEP=LPM.fn_NavigateToAddEditPackage();
			AEP.makePackage("1");
			ListOfPackagesWeb LOPW=BP.fn_navigateWebPkg();
			//String a=GenericMethods.GetCurrentWindowID();
			attachPackages AP=LOPW.attachPackage();
			//GenericMethods.windowHandle(a);
			GenericMethods.switchToWindowHandle("Attach Package");
			AP.selectpkgFrmMaster(AddEditPackage.pkgName);
			// GenericMethods.Switch_Parent_Window(a);
			GenericMethods.switchToWindowHandle("Administrator Console");
			LOPW.view_All();
			PackageDetailsWeb PDW=LOPW.confgr_attachedPkgWeb();
			PDW.get_PkgName();
			PDW.get_PublishedPkgPrice();
			PDW.clickOnSave_BT();
			AddActivationDateWeb AAW=LOPW.NavTo_ActivationDateWeb();
			GenericMethods.switchToWindowHandle("Add Activation Date");
			AAW.activateForeverPackateWeb();
			Thread.sleep(4000);
			GenericMethods.switchToWindowHandle("Frontdesk");
			WebReservationHomePage WRHP=FP.ClickOnWebReservation();
			GenericMethods.switchToWindowHandle("Web Reservation");
			WebSelectRoomPage WSRP=WRHP.fn_CheckAvability();
			String text=WSRP.fn_ValidateRoomPackagesSection();
			Assert.assertEquals(text.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1))), true);
			WSRP.verify_PublishedPkgPrice(); 


			System.out.println("TC_189_190 Executed");
		}
		catch(Throwable e)
		{GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
		throw e;
		}

	}



	@Test(priority=3,description="Select Last Min Rate checkbox corresponding to any of the room type in room price list page and verify published rate on web console.")
	public void TC_191() throws Throwable
	{
		try
		{
			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
			//FrontdeskLoginPage AL=new FrontdeskLoginPage();
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			FP.fn_ClickCancelButton();
			GenericMethods.driver.navigate().refresh();
			Thread.sleep(2000); 
			FP.fn_ClickCancelButton();
			Thread.sleep(2000);
			FP.fn_clkAdminLnk();
			GenericMethods.switchToWindowHandle("Administrator Console");
			BasePage BP=new BasePage();
			RoomPricesLandingPage RPL=BP.fn_navigatePriceManagerRP();
			Thread.sleep(4000);
			RPL.verify_RTPublishedOnWeb(iTestCaseRow);
			//RPL.clk_cancel();
			GenericMethods.switchToWindowHandle("Frontdesk");
			WebReservationHomePage WRHP=FP.ClickOnWebReservation();   
			GenericMethods.switchToWindowHandle("Web Reservation");
			WebSelectRoomPage WSRP=WRHP.fn_CheckAvability();
			String text=WSRP.fn_ValidateRoomPackagesSection();
			Assert.assertEquals(text.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1))), true);
			WSRP.verify_LastMinPrice();

			System.out.println("TC_191 Executed");
		}
		catch(Throwable e)
		{GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
		throw e;
		}

	}



	@Test(priority=4,description="Apply special discount while creating web reservation and verify discounted amount on Web More Detail page.")
	public void fn_verifyPriceAndDiscAmtOnMoreDetailPage() throws Throwable
	{
		try
		{
			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
			//FrontdeskLoginPage AL=new FrontdeskLoginPage();
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			FP.fn_ClickCancelButton();
			GenericMethods.driver.navigate().refresh();
			Thread.sleep(2000); 
			FP.fn_ClickCancelButton();
			Thread.sleep(3000); 
			FP.fn_clkAdminLnk();
			GenericMethods.switchToWindowHandle("Administrator Console");
			BasePage BP=new BasePage();
			IdentificationTypesList ITL=BP.fn_navigateIdentiTypes();
			ITL.verify_IdentiTypesPresence(iTestCaseRow);
			Discounts_SpecialDiscountLP DSP=BP.fn_navigateSpclDiscount();
			DSP.verify_spclDiscountPresence(iTestCaseRow);	
			GenericMethods.switchToWindowHandle("Frontdesk");
			WebReservationHomePage WRHP=FP.ClickOnWebReservation();
			GenericMethods.switchToWindowHandle("Web Reservation");
			WebSelectRoomPage WSRP=WRHP.spclDisc_chkAvailability();
			String text=WSRP.fn_ValidateRoomPackagesSection();
			Assert.assertEquals(text.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1))), true);
			WSRP.fn_getPkgPriceDisc();
			WebMoreDetailsPage WMDP=WSRP.fn_clkMoreDetails();
			WMDP.fn_verifyPriceDisc();      

			System.out.println("TC_192_193 Executed");
		}
		catch(Throwable e)
		{
			GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
			throw e;
		}
	}


	@Test(priority=5,description="Create a web reservation.Verify rates and taxes in booking confirmation mail.Navigate to guest console by clicking on link provided in Account Detail mail and create a web resevration by clicking 'Book Now' link.")
	public void TC_194_195_196_197_198_199_200_201() throws Throwable
	{
		try
		{
			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
			//FrontdeskLoginPage AL=new FrontdeskLoginPage();
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			FP.fn_ClickCancelButtonAlert();
			//GenericMethods.driver.navigate().refresh();
			Thread.sleep(2000); 
			BasePage BP=FP.fn_clkAdminLnk();
			GenericMethods.switchToWindowHandle("Administrator Console");
			String hotel=BP.fn_getHotelName();
			AddonLandingPage AOP=BP.addonsLandingPage();
			AOP.fn_verifyAddOnPresence(); 
			GenericMethods.switchToWindowHandle("Frontdesk");
			WebReservationHomePage WRHP=FP.ClickOnWebReservation();
			GenericMethods.switchToWindowHandle("Web Reservation");
			WebSelectRoomPage WSRP=WRHP.fn_CheckAvability();
			Thread.sleep(2000);
			WebAddMoreRoomPage WAMP=WSRP.fn_SelectRoomandRate();
			AddOnsPage ADOP=WAMP.fn_ClickAddOnsLink();
			Thread.sleep(2000);
			ADOP.fn_SelectAddons();
			WAMP.fn_ValidateAddedAddOns();
			WebConfirmReservationPage WCRP=WAMP.ClickOnConfirmBtn();
			Thread.sleep(2000);
			WebConfirmReservationPrintPage WCPP=WCRP.ConfirmBooking(iTestCaseRow);
			Thread.sleep(2000);
			String txt=WCPP.verify_pageHeader();
			Assert.assertEquals(txt.equals("Booking Confirmation"), true);
			String resrvId=WCPP.GetReservationId();
			ArrayList<String> arr1=WCPP.GetResrvDetails();
			GenericMethods.switchToWindowHandle("Frontdesk");
			//FP.fn_ClickCancelButton();
			ReservationSearchResultLandingPage RSRP=FP.fn_SearchReservationID(resrvId.trim());
			ViewDetailsPage VDP=RSRP.fn_ClickOnSearchedRecord();
			Thread.sleep(2000);
			String reservID1= VDP.GetResveration();
			Thread.sleep(2000);
			Assert.assertEquals(resrvId.trim().equals(reservID1.trim()), true);
			FP.fn_clkClose();
			Thread.sleep(2000);
			FP.fn_clkClose();
			Thread.sleep(2000);
			EmailAccountLoginPage EAP=GenericMethods.fn_OpenSpecificEmailBox(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_Browser)), ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_AppURL)));
			EmailHomePage EHP=EAP.DoSpecificEmailLogin(iTestCaseRow);
			ArrayList<String> at=EHP.fn_navigateToSpecificInbox(iTestCaseRow);
			Thread.sleep(2000);
			GenericMethods.driver.close();
			Thread.sleep(2000);
			WebGuestConsoleLoginPage WGCL=GenericMethods.fn_OpenWebGuestConsolePage("FF", at.get(0).toString());
			Thread.sleep(2000);
			Assert.assertEquals("Web Reservation Login", GenericMethods.getText(GenericMethods.driver.findElement(By.xpath("//td[text()='Web Reservation Login']"))));
			Thread.sleep(2000);
			WebGuestConsoleLandingPage WGCLP=WGCL.DoLogin(at.get(1).toString(),at.get(2).toString(), at.get(3).toString());
			Thread.sleep(2000);
			Assert.assertEquals("Reservation Details", GenericMethods.getText(WebGuestConsoleLandingPage.GuestReservationPageTitle).trim());
			Thread.sleep(2000);
			WebGuestStayDetailsPage WGS=WGCLP.ClickOnBookNow();
			Thread.sleep(2000);
			String text=WGS.ValidateTitle();
			Assert.assertEquals(text.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1))), true);
			WebGuestSelectRoomPage WGSR=WGS.fn_CheckAvability();
			Thread.sleep(2000);
			WebGuestAddMoreRoomPage WGAMR=WGSR.SelectRoom();
			Thread.sleep(2000);
			WebGuestConfirmReservationPage WGCRP=WGAMR.ClickOnConfirmBtn();
			Thread.sleep(2000);
			String text1=WGCRP.VerifyTitle();
			Assert.assertEquals(text1.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2))), true);
			WebGuestConfirmReservationPrintPage WCRPP=WGCRP.ConfirmBooking(iTestCaseRow);
			Thread.sleep(2000);
			String rid=WCRPP.GetReservationId();
			Thread.sleep(2000);
			//GenericMethods.driver.close();
			//Thread.sleep(2000);	
			GenericMethods.switchToWindowHandle("Frontdesk");
			Thread.sleep(2000);
			//GenericMethods.driver.navigate().refresh();
			//FP.fn_ClickCancelButton();
			//	FP.fn_SearchByIDGuest(rid.trim());
			//	Thread.sleep(3000);
			//	RSRP.VerifyReservationById(rid.trim());


			System.out.println("TC_194_195_196_197_198_199_200_201 Executed");
		}
		catch(Throwable e)
		{GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
		throw e;
		}
	}




	@Test(priority=6,description="Click on 'Perform Auto Night Audit' on cancel pop-up.Once night audit has been performed, navigate to 'Accounts' page and verify folio postings.")
	public void fn_verifyAutoNAPostingsInAccounts() throws Throwable
	{
		try
		{

			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
			//FrontdeskLoginPage AL=new FrontdeskLoginPage();
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			GenericMethods.driver.navigate().refresh();
			Thread.sleep(2000);
			FP.fn_AutoNightAudit1();
			Thread.sleep(10000);
			//FP.fn_ClickCancelButtonAlert();
			//Thread.sleep(3000);
			String str=GenericMethods.GetCurrentWindowID();
			Thread.sleep(3000);
			AccountsLandingPage ALP=FP.fn_ClickAccounts_Link();
			Thread.sleep(2000);
			GenericMethods.windowHandle(str);
			Thread.sleep(3000);
			String text=ALP.fn_ValidateAccountsPage(iTestCaseRow);
			Assert.assertEquals(text.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1))), true);
			Thread.sleep(2000);
			ALP.fn_ClickHotel();
			String text1=ALP.fn_validateHotelPage();
			Assert.assertEquals(text1.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2))), true);
			GenericMethods.Switch_Parent_Window(str);

			System. out.println("TC_202_203_204_205 Executed");
		}

		catch(Throwable e)
		{GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
		throw e;
		}


	}

	@Test(priority=8,description="Verify House Count Report for selected room type and selected date range")
	public void fn_verifyHouseCountReportForSpecificDateRange() throws Throwable
	{
		try
		{
			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
			//FrontdeskLoginPage AL=new FrontdeskLoginPage();
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			FP.fn_ClickCancelButton();
			Thread.sleep(3000);
			String str=GenericMethods.GetCurrentWindowID();
			ReportLandingPage RLP=FP.fn_ReportButton();
			Thread.sleep(3000);
			GenericMethods.windowHandle(str);
			Thread.sleep(3000);
			String text=RLP.fn_VerifyReportPage();
			Assert.assertEquals(text.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1))), true);
			Thread.sleep(3000);
			RLP.fn_ClickOccupancyReport();
			Thread.sleep(3000);
			ORHouseCountReport HCR=RLP.fn_ClickHouseCountReport();
			Thread.sleep(3000);
			String text1=HCR.HouseCountReportSection();
			Assert.assertEquals(text1.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2))), true);
			Thread.sleep(3000);
			HCR.fn_GetMonthlyReport();
			Thread.sleep(3000);
			HCR.fn_VerifySearchedDate();
			GenericMethods.driver.close();
			GenericMethods.Switch_Parent_Window(str);

			System.out.println("TC_206_207_208 Executed");
		}

		catch(Throwable e)
		{GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
		throw e;
		}

	}


	@Test(priority=9,description="Verify monthly summary report for selected month and year.")
	public void fn_verifyMonthlySummaryReportForSpecificMonth() throws Throwable
	{
		try
		{

			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
			//FrontdeskLoginPage AL=new FrontdeskLoginPage();
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			FP.fn_ClickCancelButton();
			Thread.sleep(3000);
			String str=GenericMethods.GetCurrentWindowID();
			ReportLandingPage RLP=FP.fn_ReportButton();
			Thread.sleep(3000);
			GenericMethods.windowHandle(str);
			Thread.sleep(3000);
			RLP.fn_ClickOFinancialReport();
			Thread.sleep(3000);
			FRMonthlySummeryReport MSR=RLP.fn_ClickMonthlySummaryReport_BT();
			Thread.sleep(3000);
			String text=MSR.Fn_MonthlySummaryReportPage();
			Assert.assertEquals(text.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1))), true);
			MSR.fn_VerifyMonthlyReport("Jun", "2015");
			GenericMethods.driver.close();
			GenericMethods.Switch_Parent_Window(str);

			System.out.println("TC_209_210 Executed");
		}
		catch(Throwable e)
		{GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
		throw e;
		}
	}


	@Test(priority=10,description="Verify Cashier report for selected counter,POS Point and date range.Also verify 'Print' and 'Export' button functionality.")
	public void fn_verifyPrintAndExportBtnInCashierReport() throws Throwable
	{

		try
		{
			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);

			//FrontdeskLoginPage AL=new FrontdeskLoginPage();
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			FP.fn_ClickCancelButton();
			Thread.sleep(3000);
			String str=GenericMethods.GetCurrentWindowID();
			ReportLandingPage RLP=FP.fn_ReportButton();
			Thread.sleep(3000);
			GenericMethods.windowHandle(str);
			Thread.sleep(3000);
			RLP.fn_ClickRevenueReport();
			Thread.sleep(3000);
			CashierReportPage MSR=RLP.fn_ClickCashierReport();
			Thread.sleep(3000);
			MSR.fn_InputDate("Default Counter", "-All POS Points/Frontdesk-");
			Thread.sleep(3000);
			MSR.fn_ClickPrintBT();
			MSR.fn_PrintWindowhandle();
			Thread.sleep(3000);
			MSR.DownloadNightAuditReportFile();
			Thread.sleep(3000);
			GenericMethods.driver.close();
			GenericMethods.Switch_Parent_Window(str);

			System.out.println("TC_211_212 Executed");
		}
		catch(Throwable e)
		{GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
		throw e;
		}
	}


	@Test(priority=11,description="Verify No show report for specific date range.Also verify 'Print' and 'Export' button functionality.")
	public void fn_verifyPrintAndExportBtnInNoShowReport() throws Throwable
	{
		try
		{
			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
			//FrontdeskLoginPage AL=new FrontdeskLoginPage();
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			FP.fn_ClickCancelButton();
			Thread.sleep(3000);
			String str=GenericMethods.GetCurrentWindowID();
			ReportLandingPage RLP=FP.fn_ReportButton();
			Thread.sleep(3000);
			GenericMethods.windowHandle(str);
			Thread.sleep(3000);
			RLP.fn_ReservationReport();
			Thread.sleep(3000);
			NoShowReportPage NSR=RLP.fn_NoShowReport_Link();
			Thread.sleep(3000);
			NSR.fn_InputDate();
			Thread.sleep(3000);
			NSR.fn_ClickPrintBT();
			NSR.fn_PrintWindowhandle();
			Thread.sleep(3000);
			NSR.DownloadNightAuditReportFile();
			GenericMethods.driver.close();
			GenericMethods.Switch_Parent_Window(str);

			System.out.println("TC_213_214 Executed");
		}
		catch(Throwable e)
		{GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
		throw e;
		}
	}


	@Test(priority=12,description="Verify 'Export' button functionality for monthly summary report")
	public void fn_verifyPrintAndExportOfMonthlySummaryReport() throws Throwable
	{
		try
		{
			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);

			//FrontdeskLoginPage AL=new FrontdeskLoginPage();
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			FP.fn_ClickCancelButton();
			Thread.sleep(3000);
			String str=GenericMethods.GetCurrentWindowID();
			ReportLandingPage RLP=FP.fn_ReportButton();
			Thread.sleep(3000);
			GenericMethods.windowHandle(str);
			Thread.sleep(3000);
			RLP.fn_ClickOFinancialReport();
			Thread.sleep(2500);
			FRMonthlySummeryReport MSR=RLP.fn_ClickMonthlySummaryReport_BT();
			Thread.sleep(2500);
			MSR.fn_ClickPrintBT();
			Thread.sleep(5000);
			MSR.fn_PrintWindowhandle();
			Thread.sleep(3000);
			MSR.DownloadNightAuditReportFile();
			Thread.sleep(5000);
			GenericMethods.driver.close();
			GenericMethods.Switch_Parent_Window(str);

			System.out.println("TC_215_216 Executed");
		}
		catch(Throwable e)
		{GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
		throw e;
		}
	}



	@Test(priority=13,description="Verify discounted report for specific counter,POS Point and date range.Also verify 'Print' and 'Export' button functionality.")
	public void fn_verifyPrintAndExportBtnOfDiscountReport() throws Throwable
	{
		try
		{
			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);

			//FrontdeskLoginPage AL=new FrontdeskLoginPage();
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			FP.fn_ClickCancelButton();
			Thread.sleep(3000);
			String str=GenericMethods.GetCurrentWindowID();
			ReportLandingPage RLP=FP.fn_ReportButton();
			Thread.sleep(3000);
			GenericMethods.windowHandle(str);
			Thread.sleep(3000);
			RLP.fn_DiscountReport();
			Thread.sleep(3000);
			DiscountAllowanceReportPage DARP=RLP.fn_DiscountAllowance_Link();
			Thread.sleep(3000);
			DARP.fn_InputDate("Default Counter", "-All POS Points/Frontdesk-");
			Thread.sleep(3000);
			DARP.fn_ClickPrintBT();
			Thread.sleep(5000);
			DARP.fn_PrintWindowhandle();
			Thread.sleep(3000);
				
			DARP.DownloadNightAuditReportFile();
			GenericMethods.driver.close();
			GenericMethods.Switch_Parent_Window(str);

			System.out.println("TC_217_218 Executed");
		}
		catch(Throwable e)
		{
			GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
			throw e;
		}
	}


	@Test(priority=14,description="Verify Daily sales report for specific counter,POS Point and date range.Also verify 'Print' and 'Export' button functionality.")
	public void fn_verifyPrintAndExportBtnInDailySalesReport() throws Throwable
	{
		try
		{
			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);

			//FrontdeskLoginPage AL=new FrontdeskLoginPage();
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			FP.fn_ClickCancelButton();
			Thread.sleep(3000);
			String str=GenericMethods.GetCurrentWindowID();
			ReportLandingPage RLP=FP.fn_ReportButton();
			Thread.sleep(3000);
			GenericMethods.windowHandle(str);
			Thread.sleep(3000);
			RLP.fn_POSReport();
			Thread.sleep(3000);
			DailySalesReportPage DSRP=RLP.fn_DailySalesReport_Link();
			Thread.sleep(3000);
			DSRP.fn_InputDate("Default Counter", "All POS Points");
			Thread.sleep(3000);
			DSRP.fn_ClickPrintBT();
			Thread.sleep(3000);
			DSRP.fn_PrintWindowhandle();
			Thread.sleep(3000);
			DSRP.DownloadNightAuditReportFile();
			GenericMethods.driver.close();
			GenericMethods.Switch_Parent_Window(str);


			System.out.println("TC_219_220 Executed");
		}
		catch(Throwable e)
		{GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
		throw e;
		}
	}


	//@Test(priority=15,description="Verify calculation displayed in house count report")
	public void fn_verifyCalcOfHouseCountReport() throws Throwable
	{
		try
		{
			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);

			//FrontdeskLoginPage AL=new FrontdeskLoginPage();
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			FP.fn_ClickCancelButton();
			Thread.sleep(3000);
			String str=GenericMethods.GetCurrentWindowID();
			ReportLandingPage RLP=FP.fn_ReportButton();
			Thread.sleep(3000);
			GenericMethods.windowHandle(str);
			Thread.sleep(3000);
			RLP.fn_ClickOccupancyReport();
			ORHouseCountReport HCR=RLP.fn_ClickHouseCountReport();
			HCR.HouseCountReportSection();
			HCR.fn_GetMonthlyReport();
			GenericMethods.driver.close();
			GenericMethods.Switch_Parent_Window(str);

			System.out.println("TC_221 Executed");


		}
		catch(Throwable e)
		{GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
		throw e;
		}
	}


	@Test(priority=16,description="Create a group reservation on web console.Verify posted rates and taxes on frontdesk.")
	public void fn_CreateGroupReservOnWeb() throws Throwable
	{
		try
		{
			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
			//FrontdeskLoginPage AL=new FrontdeskLoginPage();
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			FP.fn_ClickCancelButtonAlert();
			//GenericMethods.driver.navigate().refresh();
			Thread.sleep(2000); 
			BasePage BP=FP.fn_clkAdminLnk();
			GenericMethods.switchToWindowHandle("Administrator Console");
			BP.fn_getHotelName();
			GenericMethods.switchToWindowHandle("Frontdesk");
			Thread.sleep(3000);
			WebReservationHomePage WRHP=FP.ClickOnWebReservation();
			GenericMethods.switchToWindowHandle("Web Reservation");
			WRHP.fn_ValidateStaydetailsPage(iTestCaseRow);
			WebSelectRoomPage WSRP=WRHP.fn_CheckAvability();

			String text=WSRP.fn_ValidateRoomPackagesSection();
			Assert.assertEquals(text.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2))), true);
			WebAddMoreRoomPage WARP=WSRP.fn_SelectRoomandRate();
			String text1=WARP.fn_pageVerify();
			Thread.sleep(3000);
			Assert.assertEquals(text1.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult3))), true);
			WebConfirmReservationPage WCRP=WARP.fn_selectRoomAndConfirm();
			String text2=WCRP.fn_ConfirmBookingPaymentPage();

			Thread.sleep(3000);
			Assert.assertEquals(text2.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult4))), true);
			WebConfirmReservationPrintPage WCPP=WCRP.ConfirmBooking(iTestCaseRow);
			String text3=WCPP.verify_pageHeader();
			Assert.assertEquals(text3.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult5))), true);
			String resrvId=WCPP.GetGrpReservationId();
			ArrayList<String> arr1=WCPP.GetResrvDetails();
			GenericMethods.switchToWindowHandle("Frontdesk");
			//FP.fn_ClickCancelButton();
			ReservationSearchResultLandingPage RSRP=FP.fn_SearchReservationID(resrvId.trim());
			ViewDetailsPage VDP=RSRP.fn_ClickOnSearchedRecord();
			Thread.sleep(2000);
			String reservID1= VDP.GetGrpResveration();
			Thread.sleep(2000);
			Assert.assertEquals(resrvId.trim().equals(reservID1.trim()), true);
			FP.fn_clkClose();
			Thread.sleep(2000);
			FP.fn_clkClose();
			Thread.sleep(2000);
			EmailAccountLoginPage EAP=GenericMethods.fn_OpenSpecificEmailBox(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_Browser)), ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_AppURL)));
			EmailHomePage EHP=EAP.DoSpecificEmailLogin(iTestCaseRow);
			ArrayList<String> at=EHP.fn_navigateToSpecificInbox(iTestCaseRow);
			Thread.sleep(2000);
			GenericMethods.driver.close();
			Thread.sleep(2000);
			WebGuestConsoleLoginPage WGCL=GenericMethods.fn_OpenWebGuestConsolePage("FF", at.get(0).toString());
			Thread.sleep(2000);
			Assert.assertEquals("Web Reservation Login", GenericMethods.getText(GenericMethods.driver.findElement(By.xpath("//td[text()='Web Reservation Login']"))));
			Thread.sleep(2000);
			WebGuestConsoleLandingPage WGCLP=WGCL.DoLogin(at.get(1).toString(),at.get(2).toString(), at.get(3).toString());
			Thread.sleep(2000);
			Assert.assertEquals("Reservation Details", GenericMethods.getText(WebGuestConsoleLandingPage.GuestReservationPageTitle).trim());
			Thread.sleep(2000);
			WebGuestStayDetailsPage WGS=WGCLP.ClickOnBookNow();
			Thread.sleep(2000);
			String text5=WGS.ValidateTitle();
			Assert.assertEquals(text5.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1))), true);
			WebGuestSelectRoomPage WGSR=WGS.fn_CheckAvability();
			Thread.sleep(2000);
			WebGuestAddMoreRoomPage WGAMR=WGSR.SelectRoom();
			Thread.sleep(2000);
			WebGuestConfirmReservationPage WGCRP=WGAMR.ClickOnConfirmBtn();
			Thread.sleep(2000);
			String text4=WGCRP.VerifyTitle();
			System.out.println(text4);
			System.out.println(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult6)));
			Assert.assertEquals(text4.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult6))), true);
			WebGuestConfirmReservationPrintPage WCRPP=WGCRP.ConfirmBooking(iTestCaseRow);
			Thread.sleep(2000);
			String rid=WCRPP.GetReservationId();
			Thread.sleep(2000);
			//GenericMethods.driver.close();
			//Thread.sleep(2000);	
			GenericMethods.switchToWindowHandle("Frontdesk");

			Thread.sleep(2000);
			//GenericMethods.driver.navigate().refresh();
			//FP.fn_ClickCancelButton();
			//    		FP.fn_SearchByIDGuest(rid.trim());
			//    		Thread.sleep(3000);
			//    		RSRP.VerifyReservationById(rid.trim());

			System.out.println("TC_223 Executed");

		}
		catch(Throwable e)
		{GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
		throw e;
		}
	}



	@Test(priority=17,description="Create a single reservation and verify 'Checkin' button on Enable Editing page.")
	public void fn_verifyEnableEditingCheckinBtnInSingleReserv() throws Throwable{
		try{
			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FLP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			FLP.fn_ClickCancelButton();
			Thread.sleep(4000);
			BasePage BP=FLP.fn_clkAdminLnk();
			GenericMethods.switchToWindowHandle("Administrator Console");
			RoomsLandingPage RLP=BP.roomsPageNavigate();
			AddRoomsPage ARP= RLP.click_AddRoom();
			ARP.addRoomName();
			GenericMethods.switchToWindowHandle("Frontdesk");
			GenericMethods.driver.navigate().refresh();
			Thread.sleep(7000);
			FLP.fn_ClickCancelButton();
			Thread.sleep(6000);
			FLP.fn_createFDReserv(ARP.rtype, "3", "3");
			Thread.sleep(2000);
			String fname=GenericMethods.generateRandomString();
			FLP.fn_FillQuickReservationForm("Seasonal Rate","1","Mr.",fname);
			ViewDetailsPage VDP=FLP.fn_Rightclk(FLP.link_newReserv, FLP.rightClk_viewDetails);
			EnableEditingPage EEP=VDP.ClickOnEnableEditing();
			CheckinCard CC=EEP.fn_clkCheckInBtn();
			Thread.sleep(4000);
			GenericMethods.switchToWindowHandle("Room Reservation Check In");
			Thread.sleep(4000);
			CC.fn_clkCloseBtn();
			GenericMethods.switchToWindowHandle("Frontdesk");
			GenericMethods.driver.navigate().refresh();
			Thread.sleep(4000);
			FLP.fn_ClickOnCancelButton();
			String status=FLP.fn_getreservationStatusCheckin(fname);
			Assert.assertEquals(status.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1))), true);
			System.out.println("TC_225 Executed");
		}catch(Throwable e){
			GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
			throw e;
		}
	}



	@Test(priority=18,description="Create 1N1R reservation,click 'Single' link and then click 'Checkin' button")
	public void fn_verifySingleLinkAndCheckinBtn() throws Throwable{
		try{
			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FLP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			FLP.fn_ClickCancelButton();
			Thread.sleep(4000);
			BasePage BP=FLP.fn_clkAdminLnk();
			GenericMethods.switchToWindowHandle("Administrator Console");
			RoomsLandingPage RLP=BP.roomsPageNavigate();
			AddRoomsPage ARP= RLP.click_AddRoom();
			ARP.addRoomName();
			GenericMethods.switchToWindowHandle("Frontdesk");
			GenericMethods.driver.navigate().refresh();
			FLP.fn_ClickCancelButton();
			Thread.sleep(4000);
			FLP.fn_createFDReserv(ARP.rtype, "3", "3");
			Thread.sleep(2000);
			String fname=GenericMethods.generateRandomString();
			EnableEditingPage EEP=FLP.fn_FillQuickReservationFormSG("Seasonal Rate","1","Mr.",fname,FLP.singleLnk);
			CheckinCard CC=EEP.fn_clkCheckInBtn();
			Thread.sleep(4000);
			GenericMethods.switchToWindowHandle("Room Reservation Check In");
			Thread.sleep(4000);
			CC.fn_clkCloseBtn();
			GenericMethods.switchToWindowHandle("Frontdesk");
			GenericMethods.driver.navigate().refresh();
			Thread.sleep(4000);
			FLP.fn_ClickOnCancelButton();
			String status=FLP.fn_getreservationStatusCheckin(fname);
			Assert.assertEquals(status.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1))), true);

			System.out.println("TC_226 Executed");

		}catch(Throwable e){
			throw e;
		}

	}
	
	@Test(priority=19,description="Create 1N1R reservation,and verify 'Early Checkin' button on Enable Editing page.")
	public void fn_verifyEarlyCheckinBtnInSingleReserv() throws Throwable{
		try{
			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FLP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			FLP.fn_ClickCancelButton();
			Thread.sleep(4000);
			BasePage BP=FLP.fn_clkAdminLnk();
			GenericMethods.switchToWindowHandle("Administrator Console");
			RoomsLandingPage RLP=BP.roomsPageNavigate();
			AddRoomsPage ARP= RLP.click_AddRoom();
			ARP.addRoomName();
			GenericMethods.switchToWindowHandle("Frontdesk");
			GenericMethods.driver.navigate().refresh();
			FLP.fn_ClickCancelButton();
			Thread.sleep(4000);
			FLP.fn_createFDReserv(ARP.rtype, "3", "3");
			Thread.sleep(2000);
			String fname=GenericMethods.generateRandomString();
			FLP.fn_FillQuickReservationForm("Seasonal Rate","1","Mr.",fname);
			ViewDetailsPage VDP=FLP.fn_Rightclk(FLP.link_newReserv, FLP.rightClk_viewDetails);
			EnableEditingPage EEP=VDP.ClickOnEnableEditing();
			CheckinCard CC=EEP.fn_clkEarlyCheckinBtn("Early Flight Arrival", ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1)));
			Thread.sleep(4000);
			GenericMethods.switchToWindowHandle("Room Reservation Check In");
			Thread.sleep(4000);
			CC.fn_clkCloseBtn();
			GenericMethods.switchToWindowHandle("Frontdesk");
			GenericMethods.driver.navigate().refresh();
			Thread.sleep(4000);
			FLP.fn_ClickOnCancelButton();
			String status=FLP.fn_getreservationStatusCheckin(fname);
			Assert.assertEquals(status.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2))), true);

			System.out.println("TC_227 Executed");

		}catch(Throwable e){
			GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
			throw e;
		}

	}


	@Test(priority=20,description="Create 1N1R reservation,click 'Single' link and then click 'EarlyCheckin' button")
	public void fn_verifySingleLinkAndEarlyCheckinBtn() throws Throwable{
		try{
			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FLP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			FLP.fn_ClickCancelButton();
			Thread.sleep(4000);
			BasePage BP=FLP.fn_clkAdminLnk();
			GenericMethods.switchToWindowHandle("Administrator Console");
			RoomsLandingPage RLP=BP.roomsPageNavigate();
			AddRoomsPage ARP= RLP.click_AddRoom();
			ARP.addRoomName();
			GenericMethods.switchToWindowHandle("Frontdesk");
			GenericMethods.driver.navigate().refresh();
			FLP.fn_ClickCancelButton();
			Thread.sleep(4000);
			FLP.fn_createFDReserv(ARP.rtype, "3", "3");
			Thread.sleep(2000);
			String fname=GenericMethods.generateRandomString();
			EnableEditingPage EEP=FLP.fn_FillQuickReservationFormSG("Seasonal Rate","1","Mr.",fname,FLP.singleLnk);
			CheckinCard CC=EEP.fn_clkEarlyCheckinBtn("Early Flight Arrival", ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1)));
			Thread.sleep(4000);
			GenericMethods.switchToWindowHandle("Room Reservation Check In");
			Thread.sleep(4000);
			CC.fn_clkCloseBtn();
			GenericMethods.switchToWindowHandle("Frontdesk");
			GenericMethods.driver.navigate().refresh();
			Thread.sleep(4000);
			FLP.fn_ClickOnCancelButton();
			String status=FLP.fn_getreservationStatusCheckin(fname);
			Assert.assertEquals(status.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2))), true);

			System.out.println("TC_228 Executed");
		}catch(Throwable e){
			GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
			throw e;
		}
	}


	@Test(priority=21,description="Create 1N1R reservation,and verify 'Guest Checkin' link on Enable Editing page.")
	public void fn_verifyGuestCheckInLnkForSingleReserv() throws Throwable{
		try{
			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FLP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			FLP.fn_ClickCancelButton();
			Thread.sleep(4000);
			BasePage BP=FLP.fn_clkAdminLnk();
			GenericMethods.switchToWindowHandle("Administrator Console");
			RoomsLandingPage RLP=BP.roomsPageNavigate();
			AddRoomsPage ARP= RLP.click_AddRoom();
			ARP.addRoomName();
			GenericMethods.switchToWindowHandle("Frontdesk");
			GenericMethods.driver.navigate().refresh();
			Thread.sleep(4000);
			FLP.fn_ClickCancelButton();
			Thread.sleep(4000);
			FLP.fn_createFDReserv(ARP.rtype, "3", "3");
			Thread.sleep(2000);
			String fname=GenericMethods.generateRandomString();
			FLP.fn_FillQuickReservationForm("Seasonal Rate","1","Mr.",fname);
			ViewDetailsPage VDP=FLP.fn_Rightclk(FLP.link_newReserv, FLP.rightClk_viewDetails);
			EnableEditingPage EEP=VDP.ClickOnEnableEditing();
			CheckinCard CC=EEP.fn_clkGuestCheckInLnk(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1)));
			Thread.sleep(4000);
			GenericMethods.switchToWindowHandle("Room Reservation Check In");
			Thread.sleep(6000);
			CC.fn_clkCloseBtn();
			GenericMethods.switchToWindowHandle("Frontdesk");
			GenericMethods.driver.navigate().refresh();
			Thread.sleep(4000);
			FLP.fn_ClickOnCancelButton();
			String status=FLP.fn_getreservationStatusCheckin(fname);
			Assert.assertEquals(status.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2))), true);

			System.out.println("TC_229 Executed");

		}catch(Throwable e){
			GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
			throw e;
		}

	}


	@Test(priority=22,description="Create 1N1R reservation, click Single link and verify 'Guest Checkin' link")
	public void fn_verifySingleLnkAndGuestCheckinLnk() throws Throwable{
		try{
			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FLP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			FLP.fn_ClickCancelButton();
			Thread.sleep(4000);
			BasePage BP=FLP.fn_clkAdminLnk();
			GenericMethods.switchToWindowHandle("Administrator Console");
			RoomsLandingPage RLP=BP.roomsPageNavigate();
			AddRoomsPage ARP= RLP.click_AddRoom();
			ARP.addRoomName();
			GenericMethods.switchToWindowHandle("Frontdesk");
			GenericMethods.driver.navigate().refresh();
			FLP.fn_ClickCancelButton();
			Thread.sleep(4000);
			FLP.fn_createFDReserv(ARP.rtype, "3", "3");
			Thread.sleep(2000);
			String fname=GenericMethods.generateRandomString();
			EnableEditingPage EEP=FLP.fn_FillQuickReservationFormSG("Seasonal Rate","1","Mr.",fname,FLP.singleLnk);
			CheckinCard CC=EEP.fn_clkGuestCheckInLnk(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1)));
			Thread.sleep(4000);
			GenericMethods.switchToWindowHandle("Room Reservation Check In");
			Thread.sleep(4000);
			CC.fn_clkCloseBtn();
			GenericMethods.switchToWindowHandle("Frontdesk");
			GenericMethods.driver.navigate().refresh();
			Thread.sleep(4000);
			FLP.fn_ClickOnCancelButton();
			String status=FLP.fn_getreservationStatusCheckin(fname);
			Assert.assertEquals(status.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2))), true);

			System.out.println("TC_230 Executed");

		}catch(Throwable e){
			GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
			throw e;
		}
	}


	@Test(priority=23,description="Create 1N1R reservation, and verify 'Guest Early Checkin' link")
	public void fn_verifyGuestEarlyCheckinLnkInSingleReserv() throws Throwable{
		try{
			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FLP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			FLP.fn_ClickCancelButton();
			Thread.sleep(4000);
			BasePage BP=FLP.fn_clkAdminLnk();
			GenericMethods.switchToWindowHandle("Administrator Console");
			RoomsLandingPage RLP=BP.roomsPageNavigate();
			AddRoomsPage ARP= RLP.click_AddRoom();
			ARP.addRoomName();
			GenericMethods.switchToWindowHandle("Frontdesk");
			GenericMethods.driver.navigate().refresh();
			FLP.fn_ClickCancelButton();
			Thread.sleep(4000);
			FLP.fn_createFDReserv(ARP.rtype, "3", "3");
			Thread.sleep(2000);
			String fname=GenericMethods.generateRandomString();
			FLP.fn_FillQuickReservationForm("Seasonal Rate","1","Mr.",fname);
			ViewDetailsPage VDP=FLP.fn_Rightclk(FLP.link_newReserv, FLP.rightClk_viewDetails);
			EnableEditingPage EEP=VDP.ClickOnEnableEditing();
			CheckinCard CC=EEP.fn_clkGuestEarlyCheckinLnk("Early Flight Arrival", ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1)));
			Thread.sleep(4000);
			GenericMethods.switchToWindowHandle("Room Reservation Check In");
			Thread.sleep(4000);
			CC.fn_clkCloseBtn();
			GenericMethods.switchToWindowHandle("Frontdesk");
			GenericMethods.driver.navigate().refresh();
			Thread.sleep(4000);
			FLP.fn_ClickOnCancelButton();
			String status=FLP.fn_getreservationStatusCheckin(fname);
			Assert.assertEquals(status.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2))), true);

			System.out.println("TC_231 Executed");

		}catch(Throwable e){
			GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
			throw e;
		}	 
	}


	@Test(priority=24,description="Create 1N1R reservation, click Single link and verify 'Early guest Checkin' link")
	public void fn_verifySingleLnkAndEarlyGuestCheckinLnk() throws Throwable{
		try{
			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FLP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			FLP.fn_ClickCancelButton();
			Thread.sleep(4000);
			BasePage BP=FLP.fn_clkAdminLnk();
			GenericMethods.switchToWindowHandle("Administrator Console");
			RoomsLandingPage RLP=BP.roomsPageNavigate();
			AddRoomsPage ARP= RLP.click_AddRoom();
			ARP.addRoomName();
			GenericMethods.switchToWindowHandle("Frontdesk");
			GenericMethods.driver.navigate().refresh();
			FLP.fn_ClickCancelButton();
			Thread.sleep(4000);
			FLP.fn_createFDReserv(ARP.rtype, "3", "3");
			Thread.sleep(2000);
			String fname=GenericMethods.generateRandomString();
			EnableEditingPage EEP=FLP.fn_FillQuickReservationFormSG("Seasonal Rate","1","Mr.",fname,FLP.singleLnk);
			CheckinCard CC=EEP.fn_clkGuestEarlyCheckinLnk("Early Flight Arrival", ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1)));
			Thread.sleep(4000);
			GenericMethods.switchToWindowHandle("Room Reservation Check In");
			Thread.sleep(4000);
			CC.fn_clkCloseBtn();
			GenericMethods.switchToWindowHandle("Frontdesk");
			GenericMethods.driver.navigate().refresh();
			Thread.sleep(4000);
			FLP.fn_ClickOnCancelButton();
			String status=FLP.fn_getreservationStatusCheckin(fname);
			Assert.assertEquals(status.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2))), true);

			System.out.println("TC_232 Executed");
		}catch(Throwable e){
			GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
			throw e;
		}     	 
	}


	@Test(priority=25,description="Create 1N2R reservation, and verify 'Group Checkin' button.") 
	public void fn_verifyEnableEditingGroupCheckinBtn() throws Throwable{
		try{
			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FLP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			FLP.fn_ClickCancelButton();
			Thread.sleep(4000);
			BasePage BP=FLP.fn_clkAdminLnk();
			GenericMethods.switchToWindowHandle("Administrator Console");
			RoomsLandingPage RLP=BP.roomsPageNavigate();
			AddRoomsPage ARP= RLP.click_AddRoom();
			ARP.addRoomName();
			GenericMethods.switchToWindowHandle("Frontdesk");
			GenericMethods.driver.navigate().refresh();
			FLP.fn_ClickCancelButton();
			Thread.sleep(4000);
			FLP.fn_createFDReserv(ARP.rtype, "3", "3");
			Thread.sleep(2000);
			String fname=GenericMethods.generateRandomString();
			FLP.fn_FillQuickReservationForm("Seasonal Rate","2","Mr.",fname);
			ViewDetailsPage VDP=FLP.fn_Rightclk(FLP.link_newReserv, FLP.rightClk_viewDetails);
			EnableEditingPage EEP=VDP.ClickOnEnableEditing();
			CheckinCard CC=EEP.fn_clkGrpCheckinbtn(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1)));
			Thread.sleep(4000);
			GenericMethods.switchToWindowHandle("Room Reservation Check In");
			Thread.sleep(4000);
			CC.fn_clkCloseBtn();
			GenericMethods.switchToWindowHandle("Frontdesk");
			GenericMethods.driver.navigate().refresh();
			Thread.sleep(4000);
			FLP.fn_ClickOnCancelButton();
			String status=FLP.fn_getreservationStatusCheckin(fname);
			Assert.assertEquals(status.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2))), true);

			System.out.println("TC_233 Executed");

		}catch(Throwable e){
			GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
			throw e;
		}
	}



	@Test(priority=26,description="Create 1N2R reservation, and verify 'Checkin Selected' button")
	public void fn_verifyCheckinSelectedInGrpReserv() throws Throwable{
		try{
			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FLP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			FLP.fn_ClickCancelButton();
			Thread.sleep(4000);
			BasePage BP=FLP.fn_clkAdminLnk();
			GenericMethods.switchToWindowHandle("Administrator Console");
			RoomsLandingPage RLP=BP.roomsPageNavigate();
			AddRoomsPage ARP= RLP.click_AddRoom();
			ARP.addRoomName();
			GenericMethods.switchToWindowHandle("Frontdesk");
			GenericMethods.driver.navigate().refresh();
			FLP.fn_ClickCancelButton();
			Thread.sleep(4000);
			FLP.fn_createFDReserv(ARP.rtype, "3", "3");
			Thread.sleep(2000);
			String fname=GenericMethods.generateRandomString();
			FLP.fn_FillQuickReservationForm("Seasonal Rate","2","Mr.",fname);
			ViewDetailsPage VDP=FLP.fn_Rightclk(FLP.link_newReserv, FLP.rightClk_viewDetails);
			EnableEditingPage EEP=VDP.ClickOnEnableEditing();
			CheckinCard CC=EEP.fn_AcceptCheckinSelected(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1)));
			Thread.sleep(4000);
			GenericMethods.switchToWindowHandle("Room Reservation Check In");
			Thread.sleep(4000);
			CC.fn_clkCloseBtn();
			GenericMethods.switchToWindowHandle("Frontdesk");
			GenericMethods.driver.navigate().refresh();
			Thread.sleep(4000);
			FLP.fn_ClickOnCancelButton();
			WebElement ele=FLP.fn_getReservation(fname);
			FLP.fn_Rightclk(ele, FLP.rightClk_viewDetails);
			VDP.ClickOnEnableEditing();
			EEP.fn_verifyCheckedIStatus(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2)));
			EEP.fn_clkGrpSave();

			System.out.println("TC_234 Executed");

		}catch(Throwable e){
			GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
			throw e;
		}
	}



	@Test(priority=27,description="Create 1N1R group reservation by clicking 'Group' link, and verify 'Group Checkin' button.")
	public void fn_verifyGrpLinkAndGroupCheckinBtn() throws Throwable{
		try{
			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FLP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			FLP.fn_ClickCancelButton();
			Thread.sleep(4000);
			BasePage BP=FLP.fn_clkAdminLnk();
			GenericMethods.switchToWindowHandle("Administrator Console");
			RoomsLandingPage RLP=BP.roomsPageNavigate();
			AddRoomsPage ARP= RLP.click_AddRoom();
			ARP.addRoomName();
			GenericMethods.switchToWindowHandle("Frontdesk");
			GenericMethods.driver.navigate().refresh();
			FLP.fn_ClickCancelButton();
			Thread.sleep(4000);
			FLP.fn_createFDReserv(ARP.rtype, "3", "3");
			Thread.sleep(2000);
			String fname=GenericMethods.generateRandomString();
			EnableEditingPage EEP=FLP.fn_FillQuickReservationFormSG("Seasonal Rate", "1", "Mr.", fname,FLP.link_Group );
			CheckinCard CC=EEP.fn_clkGrpCheckinbtn(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1)));
			Thread.sleep(4000);
			GenericMethods.switchToWindowHandle("Room Reservation Check In");
			Thread.sleep(4000);
			CC.fn_clkCloseBtn();
			GenericMethods.switchToWindowHandle("Frontdesk");
			GenericMethods.driver.navigate().refresh();
			Thread.sleep(4000);
			FLP.fn_ClickOnCancelButton();
			Thread.sleep(4000);
			String status=FLP.fn_getreservationStatusCheckin(fname);
			Assert.assertEquals(status.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2))), true);

			System.out.println("TC_235 Executed");

		}catch(Throwable e){
			GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
			throw e;
		}
	}



	@Test(priority=28,description="Create 1N2R group reservation, and verify 'Checkin' button for individual guest/room.")
	public void fn_verifyCheckinBtnForSingleGuestInGrpReserv() throws Throwable{
		try{
			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FLP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			FLP.fn_ClickCancelButton();
			Thread.sleep(7000);
			BasePage BP=FLP.fn_clkAdminLnk();
			GenericMethods.switchToWindowHandle("Administrator Console");
			RoomsLandingPage RLP=BP.roomsPageNavigate();
			AddRoomsPage ARP= RLP.click_AddRoom();
			ARP.addRoomName();
			GenericMethods.switchToWindowHandle("Frontdesk");
			GenericMethods.driver.navigate().refresh();
			FLP.fn_ClickCancelButton();
			Thread.sleep(4000);
			FLP.fn_createFDReserv(ARP.rtype, "3", "3");
			Thread.sleep(2000);
			String fname=GenericMethods.generateRandomString();
			FLP.fn_FillQuickReservationForm("Seasonal Rate","2","Mr.",fname);
			ViewDetailsPage VDP=FLP.fn_Rightclk(FLP.link_newReserv, FLP.rightClk_viewDetails);
			EnableEditingPage EEP=VDP.ClickOnEnableEditing();
			Thread.sleep(3000);
			String FN=EEP.fn_addSingleGuestDetails();
			Thread.sleep(3000);
			GroupToSingleReservationPage GTS=EEP.fn_ClickAddGuestDetails_Link();
			CheckinCard CC=GTS.fn_clkCheckinBtn(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1)));
			Thread.sleep(4000);
			GenericMethods.switchToWindowHandle("Room Reservation Check In");
			Thread.sleep(4000);
			CC.fn_clkCloseBtn();
			GenericMethods.switchToWindowHandle("Frontdesk");
			EEP.fn_clkGrpSaveBtn();
			Thread.sleep(6000);
			GenericMethods.driver.navigate().refresh();
			Thread.sleep(4000);
			FLP.fn_ClickOnCancelButton();
			Thread.sleep(4000);
			String status=FLP.fn_getreservationStatusCheckin(FN);
			Assert.assertEquals(status.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2))), true);

			System.out.println("TC_236 Executed");


		}catch(Throwable e){
			GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
			throw e;
		}

	}


	@Test(priority=29,description="Create 1N2R group reservation, and verify 'Early Checkin'button for individual guest/room.")
	public void fn_verifyEarlyCheckinBtnForSingleGuestInGrpReserv() throws Throwable{
		try{
			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FLP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			FLP.fn_ClickCancelButton();
			Thread.sleep(4000);
			BasePage BP=FLP.fn_clkAdminLnk();
			GenericMethods.switchToWindowHandle("Administrator Console");
			RoomsLandingPage RLP=BP.roomsPageNavigate();
			AddRoomsPage ARP= RLP.click_AddRoom();
			ARP.addRoomName();
			GenericMethods.switchToWindowHandle("Frontdesk");
			GenericMethods.driver.navigate().refresh();
			Thread.sleep(5000);
			FLP.fn_ClickCancelButton();
			Thread.sleep(4000);
			FLP.fn_createFDReserv(ARP.rtype, "3", "3");
			Thread.sleep(2000);
			String fname=GenericMethods.generateRandomString();
			FLP.fn_FillQuickReservationForm("Seasonal Rate","2","Mr.",fname);
			ViewDetailsPage VDP=FLP.fn_Rightclk(FLP.link_newReserv, FLP.rightClk_viewDetails);
			EnableEditingPage EEP=VDP.ClickOnEnableEditing();
			Thread.sleep(3000);
			EEP.fn_addSingleGuestDetails();
			Thread.sleep(3000);
			GroupToSingleReservationPage GTS=EEP.fn_ClickAddGuestDetails_Link();
			Thread.sleep(7000);
			CheckinCard CC=GTS.fn_clkEarlyCheckinBtn("Early Flight", ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1)));
			Thread.sleep(7000);
			GenericMethods.switchToWindowHandle("Room Reservation Check In");
			Thread.sleep(4000);
			CC.fn_clkCloseBtn();
			GenericMethods.switchToWindowHandle("Frontdesk");
			EEP.fn_clkGrpSaveBtn();
			// GenericMethods.driver.navigate().refresh();
			Thread.sleep(6000);
			//FLP.fn_ClickOnCancelButton();
			//Thread.sleep(4000);
			String status=FLP.fn_getreservationStatusCheckin(EEP.fname);
			Assert.assertEquals(status.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2))), true);

			System.out.println("TC_237 Executed");

		}catch(Throwable e){
			GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
			throw e;
		} 	     	     
	}



	@Test(priority=30,description="Create 1N2R group reservation, and verify 'Guest Checkin'button for individual guest/room.")
	public void fn_verifyGuestCheckinLnkForSingleGuestInGrpReserv() throws Throwable{
		try{
			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FLP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			FLP.fn_ClickCancelButton();
			Thread.sleep(7000);
			BasePage BP=FLP.fn_clkAdminLnk();
			GenericMethods.switchToWindowHandle("Administrator Console");
			RoomsLandingPage RLP=BP.roomsPageNavigate();
			AddRoomsPage ARP= RLP.click_AddRoom();
			ARP.addRoomName();
			GenericMethods.switchToWindowHandle("Frontdesk");
			FLP.fn_refreshFD();
			FLP.fn_ClickCancelButton();
			Thread.sleep(4000);
			FLP.fn_createFDReserv(ARP.rtype, "3", "3");
			Thread.sleep(2000);
			String fname=GenericMethods.generateRandomString();
			FLP.fn_FillQuickReservationForm("Seasonal Rate","2","Mr.",fname);
			Thread.sleep(4000);
			ViewDetailsPage VDP=FLP.fn_Rightclk(FLP.link_newReserv, FLP.rightClk_viewDetails);
			Thread.sleep(4000);
			EnableEditingPage EEP=VDP.ClickOnEnableEditing();
			Thread.sleep(3000);
			EEP.fn_addSingleGuestDetails();
			Thread.sleep(3000);
			GroupToSingleReservationPage GTS=EEP.fn_ClickAddGuestDetails_Link();
			Thread.sleep(4000);
			CheckinCard CC=GTS.fn_clkGuestCheckInLnk(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1)));
			Thread.sleep(4000);
			GenericMethods.switchToWindowHandle("Room Reservation Check In");
			Thread.sleep(4000);
			CC.fn_clkCloseBtn();
			GenericMethods.switchToWindowHandle("Frontdesk");
			EEP.fn_clkGrpSaveBtn();
			// GenericMethods.driver.navigate().refresh();
			Thread.sleep(8000);
			//FLP.fn_ClickOnCancelButton();
			//Thread.sleep(4000);
			String status=FLP.fn_getreservationStatusCheckin(EEP.fname);
			Assert.assertEquals(status.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2))), true);

			System.out.println("TC_238 Executed");

		}catch(Throwable e){
			GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
			throw e;
		}         
	}



	@Test(priority=31,description="Create 1N2R group reservation, and verify 'Guest Early Check-in'button for individual guest/room.")
	public void fn_verifyGuestEarlyCheckinLnkForSingleGuestInGrpReserv() throws Throwable{

		try{
			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FLP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			FLP.fn_ClickCancelButton();
			Thread.sleep(4000);
			BasePage BP=FLP.fn_clkAdminLnk();
			GenericMethods.switchToWindowHandle("Administrator Console");
			RoomsLandingPage RLP=BP.roomsPageNavigate();
			AddRoomsPage ARP= RLP.click_AddRoom();
			ARP.addRoomName();
			GenericMethods.switchToWindowHandle("Frontdesk");
			GenericMethods.driver.navigate().refresh();
			FLP.fn_ClickCancelButton();
			Thread.sleep(4000);
			FLP.fn_createFDReserv(ARP.rtype, "3", "3");
			Thread.sleep(2000);
			String fname=GenericMethods.generateRandomString();
			FLP.fn_FillQuickReservationForm("Seasonal Rate","2","Mr.",fname);
			ViewDetailsPage VDP=FLP.fn_Rightclk(FLP.link_newReserv, FLP.rightClk_viewDetails);
			EnableEditingPage EEP=VDP.ClickOnEnableEditing();
			Thread.sleep(3000);
			EEP.fn_addSingleGuestDetails();
			Thread.sleep(3000);
			GroupToSingleReservationPage GTS=EEP.fn_ClickAddGuestDetails_Link();
			Thread.sleep(4000);
			CheckinCard CC=GTS.fn_clkGuestEarlyCheckInLnk("Early Flight", ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1)));
			Thread.sleep(4000);
			GenericMethods.switchToWindowHandle("Room Reservation Check In");
			Thread.sleep(4000);
			CC.fn_clkCloseBtn();
			GenericMethods.switchToWindowHandle("Frontdesk");
			EEP.fn_clkGrpSaveBtn();
			//GenericMethods.driver.navigate().refresh();
			Thread.sleep(8000);
			//FLP.fn_ClickOnCancelButton();
			//Thread.sleep(4000);
			String status=FLP.fn_getreservationStatusCheckin(EEP.fname);
			Assert.assertEquals(status.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2))), true);

			System.out.println("TC_239 Executed");
		}catch(Throwable e){
			GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
			throw e;
		}
	}



	@Test(priority=32,description="Create 1N1R reservation,right click on it and verify 'Checkout' link.")
	public void fn_verifyRtClkCheckoutInSingleReserv() throws Throwable{
		try{

			sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
			ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
			iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
			FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
			Thread.sleep(4000);
			CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
			Thread.sleep(4000);
			FrontdeskLandingPage FLP=CCP.fn_ClickContinueButton();
			Thread.sleep(4000);
			FLP.fn_ClickCancelButton();
			Thread.sleep(4000);
			BasePage BP=FLP.fn_clkAdminLnk();
			GenericMethods.switchToWindowHandle("Administrator Console");
			RoomsLandingPage RLP=BP.roomsPageNavigate();
			AddRoomsPage ARP= RLP.click_AddRoom();
			ARP.addRoomName();
			GenericMethods.switchToWindowHandle("Frontdesk");
			GenericMethods.driver.navigate().refresh();
			Thread.sleep(6000);
			FLP.fn_ClickCancelButton();
			Thread.sleep(4000);
			FLP.fn_createFDReserv(ARP.rtype, "3", "3");
			Thread.sleep(2000);
			String fname=GenericMethods.generateRandomString();
			EnableEditingPage EEP=FLP.fn_FillQuickReservationFormSG("Seasonal Rate", "1", "Mr.", fname,FLP.link_Group );
			Thread.sleep(3000);
			EEP.fn_addSingleGuestDetails();
			Thread.sleep(3000);
			EEP.fn_clkGrpSaveBtn();
			//GenericMethods.driver.navigate().refresh();
			Thread.sleep(7000);
			FLP.fn_refreshFD();
			Thread.sleep(7000);
			FLP.fn_AutoNightAudit1();
			Thread.sleep(6000);
			String fname1=EEP.fname;
			AccountStatementLandingPage ASLP=FLP.fn_rtClk(fname1, FLP.link_Payment);    	   	
			ASLP.fn_clkSettleFolioAccept(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1)));
 			Thread.sleep(5000);
			ASLP.fn_clkClose();
			FLP.fn_rtClk(fname1, FLP.link_Checkout);
			Thread.sleep(4000);
			//String a=GenericMethods.GetCurrentWindowID();
			CheckoutCard COC=ASLP.fn_clkGrpCheckoutBtn();
			//GenericMethods.windowHandle(a);
			GenericMethods.switchToWindowHandle("Room Reservation Check Out");
			Thread.sleep(3000);
			COC.fn_clkCloseBtn();
			GenericMethods.switchToWindowHandle("Frontdesk");
			String status=FLP.fn_getreservationStatusCheckout(fname1);    		 
			Assert.assertEquals(status.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2))), true);

			System.out.println("TC-240 Executed ");
		}catch(Throwable e){
			GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
			throw e;
		}

	}



    @Test(priority=33,description="Create 1N1R reservation,navigate to Enable Editing page and verify 'Checkout' button.")
    public void fn_verifyEnableEditingCheckoutInSingleReserv() throws Throwable{
    	try{
    	sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
		ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
		iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
		FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
		Thread.sleep(4000);
		CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
		Thread.sleep(4000);
		FrontdeskLandingPage FLP=CCP.fn_ClickContinueButton();
		Thread.sleep(4000);
		FLP.fn_ClickCancelButton();
		Thread.sleep(4000);
		BasePage BP=FLP.fn_clkAdminLnk();
		GenericMethods.switchToWindowHandle("Administrator Console");
		RoomsLandingPage RLP=BP.roomsPageNavigate();
		AddRoomsPage ARP= RLP.click_AddRoom();
		ARP.addRoomName();
		GenericMethods.switchToWindowHandle("Frontdesk");
		GenericMethods.driver.navigate().refresh();
		Thread.sleep(6000);
		FLP.fn_ClickCancelButton();
		Thread.sleep(4000);
		FLP.fn_createFDReserv(ARP.rtype, "3", "3");
		Thread.sleep(2000);
		String fname=GenericMethods.generateRandomString();
		FLP.fn_FillQuickReservationForm("Seasonal Rate","1","Mr.",fname);
		Thread.sleep(5000);
		FLP.fn_refreshFD();
		Thread.sleep(4000);
		FLP.fn_AutoNightAudit1();
		Thread.sleep(6000);
		//GenericMethods.driver.navigate().refresh();
	   // Thread.sleep(4000);
		AccountStatementLandingPage ASLP=FLP.fn_rtClk(fname, FLP.link_Payment);    	   	
		ASLP.fn_clkSettleFolioAccept(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1)));
		Thread.sleep(5000);
		ASLP.fn_clkClose();
        ViewDetailsPage VDP=FLP.fn_rtClk1(fname, FLP.rightClk_viewDetails);
        EnableEditingPage EEP=VDP.ClickToEnableEditingBtn();
        Thread.sleep(3000);
        EEP.fn_clk_CheckoutBtn();
        Thread.sleep(3000);
        CheckoutCard COC=ASLP.fn_clkCheckoutBtn();
        Thread.sleep(5000);
        GenericMethods.switchToWindowHandle("Room Reservation Check Out");
        COC.fn_clkCloseBtn();
		GenericMethods.switchToWindowHandle("Frontdesk");
		String status=FLP.fn_getreservationStatusCheckout(fname);    		 
		Assert.assertEquals(status.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2))), true);
    	
		System.out.println("TC-241 Executed");
    	}catch(Throwable e){
    		GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
    		throw e;
    	}
     
    }


    @Test(priority=34,description="Create 1N1R reservation,navigate to Enable Editing page and verify 'Late Checkout' button.")
    public void fn_verifyEnableEditingLateCheckoutInSingleReserv() throws Throwable{
    	try{
    	sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
		ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
		iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
		FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
		Thread.sleep(4000);
		CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
		Thread.sleep(4000);
		FrontdeskLandingPage FLP=CCP.fn_ClickContinueButton();
		Thread.sleep(4000);
		FLP.fn_ClickCancelButton();
		Thread.sleep(4000);
		BasePage BP=FLP.fn_clkAdminLnk();
		GenericMethods.switchToWindowHandle("Administrator Console");
		RoomsLandingPage RLP=BP.roomsPageNavigate();
		AddRoomsPage ARP= RLP.click_AddRoom();
		ARP.addRoomName();
		GenericMethods.switchToWindowHandle("Frontdesk");
		FLP.fn_refreshFD();
		Thread.sleep(6000);
		FLP.fn_ClickCancelButton();
		Thread.sleep(4000);
		FLP.fn_createFDReserv(ARP.rtype, "3", "3");
		Thread.sleep(2000);
		String fname=GenericMethods.generateRandomString();
		FLP.fn_FillQuickReservationForm("Seasonal Rate","1","Mr.",fname);
		Thread.sleep(7000);
		FLP.fn_refreshFD();
		Thread.sleep(5000);
		FLP.fn_AutoNightAudit1();
		Thread.sleep(6000);
		AccountStatementLandingPage ASLP=FLP.fn_rtClk(fname, FLP.link_Payment);    	   	
		ASLP.fn_clkSettleFolioAccept(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1)));
		Thread.sleep(5000);
		ASLP.fn_clkClose();
        ViewDetailsPage VDP=FLP.fn_rtClk1(fname, FLP.rightClk_viewDetails);
        Thread.sleep(3000);
        EnableEditingPage EEP=VDP.ClickToEnableEditingBtn();
        Thread.sleep(3000);
        EEP.fn_clkLateCheckoutBtn("Delay in flight", ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2)));
        Thread.sleep(6000);
		ASLP.fn_clkSettleFolioAccept(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1)));
		Thread.sleep(5000);
		CheckoutCard COC=ASLP.fn_clkCheckoutBtn();
		Thread.sleep(5000);
        GenericMethods.switchToWindowHandle("Room Reservation Check Out");
        COC.fn_clkCloseBtn();
		GenericMethods.switchToWindowHandle("Frontdesk");
		String status=FLP.fn_getreservationStatusCheckout(fname);    		 
		Assert.assertEquals(status.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult3))), true);

        System.out.println("TC_242 Executed");
    	}catch(Throwable e){
    		GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
    		throw e;
    	}
    }
    
   
    @Test(priority=35,description="Create 1N1R reservation,navigate to Payment page and verify 'Express Checkout' button.")
    public void fn_verifyExpressCheckoutInSingleReserv() throws Throwable{
    	try{
    	sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
		ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
		iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
		FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
		Thread.sleep(4000);
		CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
		Thread.sleep(4000);
		FrontdeskLandingPage FLP=CCP.fn_ClickContinueButton();
		Thread.sleep(4000);
		FLP.fn_ClickCancelButton();
		Thread.sleep(4000);
		BasePage BP=FLP.fn_clkAdminLnk();
		GenericMethods.switchToWindowHandle("Administrator Console");
		RoomsLandingPage RLP=BP.roomsPageNavigate();
		AddRoomsPage ARP= RLP.click_AddRoom();
		ARP.addRoomName();
		GenericMethods.switchToWindowHandle("Frontdesk");
		FLP.fn_refreshFD();
		Thread.sleep(6000);
		FLP.fn_ClickCancelButton();
		Thread.sleep(4000);
		FLP.fn_createFDReserv(ARP.rtype, "3", "3");
		Thread.sleep(4000);
		String fname=GenericMethods.generateRandomString();
		FLP.fn_FillQuickReservationForm("Seasonal Rate","1","Mr.",fname);
		Thread.sleep(6000);
		FLP.fn_refreshFD();
		Thread.sleep(6000);
		FLP.fn_AutoNightAudit1();
		Thread.sleep(7000);
		FLP.fn_clickCurrentLnk();
		Thread.sleep(3000);
		AccountStatementLandingPage ASLP=FLP.fn_rtClk(fname, FLP.link_Payment);
		CheckoutCard COC=ASLP.fn_clkExpressCheckoutBtn(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1)),ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult3)));
		Thread.sleep(5000);
        GenericMethods.switchToWindowHandle("Room Reservation Check Out");
        //COC.WindowScroll();
        COC.fn_clkCloseBtn();
		GenericMethods.switchToWindowHandle("Frontdesk");
		String status=FLP.fn_getreservationStatusCheckout(fname);    		 
		Assert.assertEquals(status.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2))), true);
		
		System.out.println("TC_243 Executed");
		
    	}catch(Throwable e){
    		GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
    		throw e;
    	}
		
    }
   
    
    @Test(priority=36,description="Create 1N1R reservation with more than 1 guest,navigate to Payment page and verify 'Guest Checkout' button.")
    public void fn_verifyGuestCheckoutInSingleReserv() throws Throwable{
       	try{
    	sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
    		ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
    		iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
    		FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
    		Thread.sleep(4000);
    		CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
    		Thread.sleep(4000);
    		FrontdeskLandingPage FLP=CCP.fn_ClickContinueButton();
    		Thread.sleep(4000);
    		FLP.fn_ClickCancelButton();
    		Thread.sleep(4000);
    		BasePage BP=FLP.fn_clkAdminLnk();
    		GenericMethods.switchToWindowHandle("Administrator Console");
    		RoomsLandingPage RLP=BP.roomsPageNavigate();
    		AddRoomsPage ARP= RLP.click_AddRoom();
    		ARP.addRoomName();
    		GenericMethods.switchToWindowHandle("Frontdesk");
    		GenericMethods.driver.navigate().refresh();
    		Thread.sleep(6000);
    		FLP.fn_ClickCancelButton();
    		Thread.sleep(4000);
    		FLP.fn_createFDReserv(ARP.rtype, "3", "3");
    		Thread.sleep(2000);
    		String fname=GenericMethods.generateRandomString();
			EnableEditingPage EEP=FLP.fn_FillQuickReservationFormSG("Seasonal Rate", "1", "Mr.", fname,FLP.singleLnk );
			Thread.sleep(6000);
            EEP.fn_addGuestDetails();
            Thread.sleep(4000);
    		EEP.fn_clkSaveBtn();
    		Thread.sleep(3000);
    		FLP.fn_refreshFD();
    		Thread.sleep(4000);
    		FLP.fn_AutoNightAudit1();
    		Thread.sleep(6000);
    		AccountStatementLandingPage ASLP=FLP.fn_rtClk(fname, FLP.link_Payment);
    		ASLP.fn_clkSettleFolioAccept(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1)));
    		Thread.sleep(5000);
            ASLP.fn_clkGuestCheckoutBtn(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2)),fname);
            ViewDetailsPage VDP=ASLP.fn_clkBackBtn();
            VDP.ClickOnEnableEditing();
            Thread.sleep(4000);
    		String status=EEP.fn_chkGuestStatus(fname);
    		Assert.assertEquals(status.trim().equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult3))), true);
    		EEP.fn_clkSaveBtn();
    		
    		System.out.println("TC_244 Executed");
       	}catch(Throwable e){
       		GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
    		throw e;
       	}
    		
    }
    
    
    
    @Test(priority=37,description="Create group reservation,right click on reservation & click 'Group Check-out'")
    public void fn_verifyRgtClickGroupCheckoutLink() throws Throwable{
    	try{
    	sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
		ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
		iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
		FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
		Thread.sleep(4000);
		CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
		Thread.sleep(4000);
		FrontdeskLandingPage FLP=CCP.fn_ClickContinueButton();
		Thread.sleep(4000);
		FLP.fn_ClickCancelButton();
		Thread.sleep(4000);
		BasePage BP=FLP.fn_clkAdminLnk();
		GenericMethods.switchToWindowHandle("Administrator Console");
		RoomsLandingPage RLP=BP.roomsPageNavigate();
		AddRoomsPage ARP= RLP.click_AddRoom();
		ARP.addRoomName();
		GenericMethods.switchToWindowHandle("Frontdesk");
		GenericMethods.driver.navigate().refresh();
		Thread.sleep(6000);
		FLP.fn_ClickCancelButton();
		Thread.sleep(4000);
		FLP.fn_createFDReserv(ARP.rtype, "3", "3");
		Thread.sleep(2000);
		String fname=GenericMethods.generateRandomString();
		EnableEditingPage EEP=FLP.fn_FillQuickReservationFormSG("Seasonal Rate", "1", "Mr.", fname,FLP.link_Group);
		Thread.sleep(6000);
        EEP.fn_addSingleGuestDetails();
        Thread.sleep(4000);
		EEP.fn_clkGrpSave();
		Thread.sleep(3000);
		FLP.fn_refreshFD();
		Thread.sleep(4000);
		FLP.fn_AutoNightAudit1();
		Thread.sleep(7000);
		AccountStatementLandingPage ASLP=FLP.fn_rtClk(EEP.fname, FLP.link_GroupCheckout);
		Thread.sleep(3000);
		ASLP.fn_clkSettleFolioAccept(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1)));
		Thread.sleep(3000);
		CheckoutCard COC=ASLP.fn_clkGrpCheckoutBtn();
		Thread.sleep(3000);
		GenericMethods.switchToWindowHandle("Room Reservation Check Out");
		COC.fn_clkCloseBtn();
		GenericMethods.switchToWindowHandle("Frontdesk");
		String status=FLP.fn_getreservationStatusCheckout(EEP.fname);
		Assert.assertEquals(status.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2))), true);
		
		System.out.println("TC_245 Executed");
    	}catch(Throwable e){
    		GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
    		throw e;
    	}
    }
    
  
    
    @Test(priority=38,description="Create 1N1R group reservation, and verify 'Group Checkout' button on Enable Editing page.")
    public void fn_verifyGrpChkoutBtnOnEnableEditing() throws Throwable{
    	try{
    	sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
		ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
		iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
		FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
		Thread.sleep(4000);
		CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
		Thread.sleep(4000);
		FrontdeskLandingPage FLP=CCP.fn_ClickContinueButton();
		Thread.sleep(4000);
		FLP.fn_ClickCancelButton();
		Thread.sleep(4000);
		BasePage BP=FLP.fn_clkAdminLnk();
		GenericMethods.switchToWindowHandle("Administrator Console");
		RoomsLandingPage RLP=BP.roomsPageNavigate();
		AddRoomsPage ARP= RLP.click_AddRoom();
		ARP.addRoomName();
		GenericMethods.switchToWindowHandle("Frontdesk");
		GenericMethods.driver.navigate().refresh();
		Thread.sleep(6000);
		FLP.fn_ClickCancelButton();
		Thread.sleep(4000);
		FLP.fn_createFDReserv(ARP.rtype, "3", "3");
		Thread.sleep(2000);
		String fname=GenericMethods.generateRandomString();
		EnableEditingPage EEP=FLP.fn_FillQuickReservationFormSG("Seasonal Rate", "1", "Mr.", fname,FLP.link_Group);
		Thread.sleep(6000);
        EEP.fn_addSingleGuestDetails();
        Thread.sleep(4000);
		EEP.fn_clkGrpSave();
		Thread.sleep(3000);
		FLP.fn_refreshFD();
		Thread.sleep(4000);
		FLP.fn_AutoNightAudit1();
		Thread.sleep(6000);
		ViewDetailsPage VDP=FLP.fn_rtClk1(EEP.fname,FLP.rightClk_viewDetails);
		Thread.sleep(4000);
		VDP.ClickOnEnableEditing();
		AccountStatementLandingPage ASLP=EEP.fn_clkGrpChkoutBtn();
		ASLP.fn_clkSettleFolioAccept(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1)));
		Thread.sleep(3000);
		CheckoutCard COC=ASLP.fn_clkGrpCheckoutBtn();
		Thread.sleep(3000);
		GenericMethods.switchToWindowHandle("Room Reservation Check Out");
		COC.fn_clkCloseBtn();
		GenericMethods.switchToWindowHandle("Frontdesk");
		String status=FLP.fn_getreservationStatusCheckout(EEP.fname);
		Assert.assertEquals(status.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2))), true);

		System.out.println("TC_246 Executed");
    	}catch(Throwable e){
    		GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
    		throw e;
    	}
    }
      
	
	
	@Test(priority=39,description="Create 1N1R group reservation, and verify 'Checkout Selected' button on Enable Editing page.")
    public void fn_verifyCheckoutSelectedInGrpReserv() throws Throwable{
		try{
    	sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
		ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
		iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
		FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
		Thread.sleep(4000);
		CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
		Thread.sleep(4000);
		FrontdeskLandingPage FLP=CCP.fn_ClickContinueButton();
		Thread.sleep(7000);
		FLP.fn_ClickCancelButton();
		Thread.sleep(4000);
		BasePage BP=FLP.fn_clkAdminLnk();
		GenericMethods.switchToWindowHandle("Administrator Console");
		RoomsLandingPage RLP=BP.roomsPageNavigate();
		AddRoomsPage ARP= RLP.click_AddRoom();
		ARP.addRoomName();
		GenericMethods.switchToWindowHandle("Frontdesk");
		GenericMethods.driver.navigate().refresh();
		Thread.sleep(6000);
		FLP.fn_ClickCancelButton();
		Thread.sleep(4000);
		FLP.fn_createFDReserv(ARP.rtype, "3", "3");
		Thread.sleep(2000);
		String fname=GenericMethods.generateRandomString();
		EnableEditingPage EEP=FLP.fn_FillQuickReservationFormSG("Seasonal Rate", "1", "Mr.", fname,FLP.link_Group);
		Thread.sleep(6000);
        EEP.fn_addSingleGuestDetails();
        Thread.sleep(4000);
		EEP.fn_clkGrpSave();
		Thread.sleep(3000);
		FLP.fn_refreshFD();
		Thread.sleep(4000);
		FLP.fn_AutoNightAudit1();
		Thread.sleep(6000);
		ViewDetailsPage VDP=FLP.fn_rtClk1(EEP.fname,FLP.rightClk_viewDetails);
		Thread.sleep(4000);
		VDP.ClickOnEnableEditing();
		Thread.sleep(4000);
		AccountStatementLandingPage ASLP=EEP.fn_clkCheckoutSelected(EEP.fname);
		ASLP.fn_clkSettleFolioAccept(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1)));
		Thread.sleep(2000);
		CheckoutCard COC=ASLP.fn_clkCheckoutSelected(EEP.fname,ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult3)));
		Thread.sleep(3000);
		GenericMethods.switchToWindowHandle("Room Reservation Check Out");
		GenericMethods.driver.manage().window().maximize();
		COC.fn_clkCloseBtn();
		GenericMethods.switchToWindowHandle("Frontdesk");
		String status=FLP.fn_getreservationStatusCheckout(EEP.fname);
		Assert.assertEquals(status.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2))), true);

		System.out.println("TC_247 Executed");
		}catch(Throwable e){
			GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
    		throw e;
		}
	}
    
    
    @Test(priority=40,description="Create 1N1R group reservation, and verify 'Group Check-out' button on Payment page.")
    public void fn_verifyGroupChkoutInGrpReserv() throws Throwable{
    	try{
    	sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
		ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
		iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
		FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
		Thread.sleep(4000);
		CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
		Thread.sleep(4000);
		FrontdeskLandingPage FLP=CCP.fn_ClickContinueButton();
		Thread.sleep(7000);
		FLP.fn_ClickCancelButton();
		Thread.sleep(4000);
		BasePage BP=FLP.fn_clkAdminLnk();
		GenericMethods.switchToWindowHandle("Administrator Console");
		RoomsLandingPage RLP=BP.roomsPageNavigate();
		AddRoomsPage ARP= RLP.click_AddRoom();
		ARP.addRoomName();
		GenericMethods.switchToWindowHandle("Frontdesk");
		GenericMethods.driver.navigate().refresh();
		Thread.sleep(6000);
		FLP.fn_ClickCancelButton();
		Thread.sleep(4000);
		FLP.fn_createFDReserv(ARP.rtype, "3", "3");
		Thread.sleep(2000);
		String fname=GenericMethods.generateRandomString();
		EnableEditingPage EEP=FLP.fn_FillQuickReservationFormSG("Seasonal Rate", "1", "Mr.", fname,FLP.link_Group);
		Thread.sleep(6000);
        EEP.fn_addSingleGuestDetails();
        Thread.sleep(4000);
		EEP.fn_clkGrpSave();
		Thread.sleep(3000);
		FLP.fn_refreshFD();
		Thread.sleep(4000);
		FLP.fn_AutoNightAudit1();
		Thread.sleep(6000);
		AccountStatementLandingPage ASLP=FLP.fn_rtClk(EEP.fname, FLP.link_Payment);
		Thread.sleep(2000);
		ASLP.fn_clkSettleFolioAccept(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1)));
		Thread.sleep(3000);
		CheckoutCard COC=ASLP.fn_clkGrpCheckoutBtn();
		Thread.sleep(3000);
		GenericMethods.switchToWindowHandle("Room Reservation Check Out");
		GenericMethods.driver.manage().window().maximize();
		COC.fn_clkCloseBtn();
		GenericMethods.switchToWindowHandle("Frontdesk");
		String status=FLP.fn_getreservationStatusCheckout(EEP.fname);
		Assert.assertEquals(status.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2))), true);

		System.out.println("TC_248 Executed");
    	}catch(Throwable e){
    		GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
    		throw e;
    	}
    }
    
    
    
    @Test(priority=41,description="Create 1N1R group reservation, and verify 'Express Check-out' button on Payment page.")
    public void fn_verifyExpressChkoutInGrpReserv() throws Throwable{
    	try{
    	
    	sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
		ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
		iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
		FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
		Thread.sleep(4000);
		CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
		Thread.sleep(4000);
		FrontdeskLandingPage FLP=CCP.fn_ClickContinueButton();
		Thread.sleep(7000);
		FLP.fn_ClickCancelButton();
		Thread.sleep(4000);
		BasePage BP=FLP.fn_clkAdminLnk();
		GenericMethods.switchToWindowHandle("Administrator Console");
		RoomsLandingPage RLP=BP.roomsPageNavigate();
		AddRoomsPage ARP= RLP.click_AddRoom();
		ARP.addRoomName();
		GenericMethods.switchToWindowHandle("Frontdesk");
		GenericMethods.driver.navigate().refresh();
		Thread.sleep(6000);
		FLP.fn_ClickCancelButton();
		Thread.sleep(4000);
		FLP.fn_createFDReserv(ARP.rtype, "3", "3");
		Thread.sleep(2000);
		String fname=GenericMethods.generateRandomString();
		EnableEditingPage EEP=FLP.fn_FillQuickReservationFormSG("Seasonal Rate", "1", "Mr.", fname,FLP.link_Group);
		Thread.sleep(6000);
        EEP.fn_addSingleGuestDetails();
        Thread.sleep(4000);
		EEP.fn_clkGrpSave();
		Thread.sleep(3000);
		FLP.fn_refreshFD();
		Thread.sleep(4000);
		FLP.fn_AutoNightAudit1();
		Thread.sleep(6000);
		AccountStatementLandingPage ASLP=FLP.fn_rtClk(EEP.fname, FLP.link_Payment);
		Thread.sleep(5000);
		CheckoutCard COC=ASLP.fn_clkExpressCheckoutBtn(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1)), ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2)));
		Thread.sleep(3000);
		GenericMethods.switchToWindowHandle("Room Reservation Check Out");
		GenericMethods.driver.manage().window().maximize();
		COC.fn_clkCloseBtn();
		GenericMethods.switchToWindowHandle("Frontdesk");
		String status=FLP.fn_getreservationStatusCheckout(EEP.fname);    		 
		Assert.assertEquals(status.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult3))), true);

		System.out.println("TC_249 Executed");
    	}catch(Throwable e){
    		GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
    		throw e;
    	}
    }
    
    
    @Test(priority=42,description="Create 1N1R group reservation, and verify 'Check-out' button for single guest.")
    public void fn_verifyChkoutForSingleGuestInGrpReserv() throws Throwable{
    	try{
    	sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
		ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
		iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
		FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
		Thread.sleep(4000);
		CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
		Thread.sleep(4000);
		FrontdeskLandingPage FLP=CCP.fn_ClickContinueButton();
		Thread.sleep(7000);
		FLP.fn_ClickCancelButton();
		Thread.sleep(4000);
		BasePage BP=FLP.fn_clkAdminLnk();
		GenericMethods.switchToWindowHandle("Administrator Console");
		RoomsLandingPage RLP=BP.roomsPageNavigate();
		AddRoomsPage ARP= RLP.click_AddRoom();
		ARP.addRoomName();
		GenericMethods.switchToWindowHandle("Frontdesk");
		GenericMethods.driver.navigate().refresh();
		Thread.sleep(6000);
		FLP.fn_ClickCancelButton();
		Thread.sleep(4000);
		FLP.fn_createFDReserv(ARP.rtype, "3", "3");
		Thread.sleep(2000);
		String fname=GenericMethods.generateRandomString();
		EnableEditingPage EEP=FLP.fn_FillQuickReservationFormSG("Seasonal Rate", "1", "Mr.", fname,FLP.link_Group);
		Thread.sleep(6000);
        EEP.fn_addSingleGuestDetails();
        Thread.sleep(4000);
        EEP.fn_clkGrpSave();
		Thread.sleep(3000);
		FLP.fn_refreshFD();
		Thread.sleep(4000);
		FLP.fn_AutoNightAudit1();
		Thread.sleep(7000);
		ViewDetailsPage VDP=FLP.fn_rtClk1(EEP.fname, FLP.rightClk_viewDetails);
		Thread.sleep(5000);
		VDP.ClickOnEnableEditing();
		Thread.sleep(2000);
		GroupToSingleReservationPage GTS=EEP.fn_clkSingleGuest();
		AccountStatementLandingPage ASLP=GTS.fn_clkChkoutBtn();		
		ASLP.fn_clkPayNow();
		Thread.sleep(3000);
		ASLP.fn_clkGenerateFolio();
		Thread.sleep(3000);
		ASLP.fn_clkChkoutBtn(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1)));
		Thread.sleep(3000);
		CheckoutCard COC=ASLP.fn_clkCheckoutBtn();
		Thread.sleep(2000);
		GenericMethods.switchToWindowHandle("Room Reservation Check Out");
		GenericMethods.driver.manage().window().maximize();
		COC.fn_clkCloseBtn();
		GenericMethods.switchToWindowHandle("Frontdesk");
		//ASLP.fn_clkClose();
		Thread.sleep(2000);
		String status=FLP.fn_getreservationStatusCheckout(EEP.fname);   
		System.out.println(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2)));
		Assert.assertEquals(status.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2))), true);
    	
    	System.out.println("TC_250 Executed");
    	
    	}catch(Throwable e){
    		GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
    		throw e;
    	}
    }
    
    
    
    @Test(priority=43,description="Create 1N1R group reservation, and verify 'Late Check-out' button for single guest.")
    public void fn_verifyLateChkoutForSingleGuestInGrpReserv() throws Throwable{
    	try{
    	sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
		ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
		iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
		FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
		Thread.sleep(4000);
		CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
		Thread.sleep(4000);
		FrontdeskLandingPage FLP=CCP.fn_ClickContinueButton();
		Thread.sleep(7000);
		FLP.fn_ClickCancelButton();
		Thread.sleep(4000);
		BasePage BP=FLP.fn_clkAdminLnk();
		GenericMethods.switchToWindowHandle("Administrator Console");
		RoomsLandingPage RLP=BP.roomsPageNavigate();
		AddRoomsPage ARP= RLP.click_AddRoom();
		ARP.addRoomName();
		GenericMethods.switchToWindowHandle("Frontdesk");
		GenericMethods.driver.navigate().refresh();
		Thread.sleep(6000);
		FLP.fn_ClickCancelButton();
		Thread.sleep(4000);
		FLP.fn_createFDReserv(ARP.rtype, "3", "3");
		Thread.sleep(2000);
		String fname=GenericMethods.generateRandomString();
		EnableEditingPage EEP=FLP.fn_FillQuickReservationFormSG("Seasonal Rate", "1", "Mr.", fname,FLP.link_Group);
		Thread.sleep(6000);
        EEP.fn_addSingleGuestDetails();
        Thread.sleep(4000);
        EEP.fn_clkGrpSave();
		Thread.sleep(3000);
		FLP.fn_refreshFD();
		Thread.sleep(4000);
		FLP.fn_AutoNightAudit1();
		Thread.sleep(7000);
		ViewDetailsPage VDP=FLP.fn_rtClk1(EEP.fname, FLP.rightClk_viewDetails);
		Thread.sleep(3000);
		VDP.ClickOnEnableEditing();
		Thread.sleep(2000);
		GroupToSingleReservationPage GTS=EEP.fn_clkSingleGuest();
		AccountStatementLandingPage ASLP=GTS.fn_clkLateChkout("Late flight departure", ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1)));
	    ASLP.fn_clkPayNow();
	    Thread.sleep(3000);
        ASLP.fn_clkGenerateFolio();
		Thread.sleep(4000);
		ASLP.fn_clkChkoutBtn(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult2)));
		Thread.sleep(5000);
		CheckoutCard COC=ASLP.fn_clkCheckoutBtn();
		GenericMethods.switchToWindowHandle("Room Reservation Check Out");
		GenericMethods.driver.manage().window().maximize();
		COC.fn_clkCloseBtn();
		GenericMethods.switchToWindowHandle("Frontdesk");
		Thread.sleep(3000);
		String status=FLP.fn_getreservationStatusCheckout(EEP.fname);    		 
		Assert.assertEquals(status.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult3))), true);

		System.out.println("TC_251 Executed");
    	}catch(Throwable e){
    		GenericMethods.getscreenshot(Thread.currentThread().getStackTrace()[1].getMethodName());
    		throw e;
    	}
    }
    
    
    
    
    
    /*@Test(priority=44,description="Create 1N1R reservation, & verify 'Cancel' button on enable editing page.")
    public void fn_verifyCancelBtnInSingleReserv() throws Exception{
    	sTestCaseName=Thread.currentThread().getStackTrace()[1].getMethodName();
		ExcelUtil.setExcelFile(Constant.Path_TestData1 +  Constant.File_livestableFrontdeskTestData,Constant.Sheet_Frontdesk2);
		iTestCaseRow=ExcelUtil.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
		FrontdeskContinueTrialPage CP=AL.FrontDeskLogin(iTestCaseRow);
		Thread.sleep(4000);
		CashCounterPage CCP=CP.fn_ClickCountinueWithTrail_BT();
		Thread.sleep(4000);
		FrontdeskLandingPage FLP=CCP.fn_ClickContinueButton();
		Thread.sleep(7000);
		FLP.fn_ClickCancelButton();e
		Thread.sleep(4000);
		BasePage BP=FLP.fn_clkAdminLnk();
		GenericMethods.switchToWindowHandle("Administrator Console");
		RoomsLandingPage RLP=BP.roomsPageNavigate();
		AddRoomsPage ARP= RLP.click_AddRoom();
		ARP.addRoomName();
		GenericMethods.switchToWindowHandle("Frontdesk");
		GenericMethods.driver.navigate().refresh();
		Thread.sleep(6000);
		FLP.fn_ClickCancelButton();
		Thread.sleep(4000);
		FLP.fn_createFDReserv(ARP.rtype, "3", "3");
		Thread.sleep(2000);
		String fname=GenericMethods.generateRandomString();
		FLP.fn_FillQuickReservationFormSG("Seasonal Rate", "1", "Mr.", fname,FLP.btn_Reserve);
		Thread.sleep(6000);
		ViewDetailsPage VDP=FLP.fn_rtClk1(fname, FLP.rightClk_viewDetails);
		Thread.sleep(5000);
		EnableEditingPage EEP=VDP.ClickOnEnableEditing();
		Thread.sleep(2000);
		EEP.fn_clkCancelBtn(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_Charge)));
		String text=EEP.fn_verifyCancelNoShowAlert();
		Assert.assertEquals(text.equals(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_ExpectedResult1))), true);
	    Thread.sleep(3000);	
		AccountStatementLandingPage ASLP=new AccountStatementLandingPage();
		ASLP.fn_verifyCnclNoShowCharge(ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_Exp)), charge);		
    }
    */
    
    
	@AfterMethod
	public void closeApp() throws Exception
	{
		try{
			GenericMethods.driver.quit();
		}catch(Exception e){
			Thread.sleep(2000);
			System.out.println("Heyy I am in closeApp method catch");
			GenericMethods.driver.quit();


		}
	}
}
