package com.hotelogix.smoke.frontdesk.Payment;

import java.util.List;

import org.openqa.selenium.By;
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

import com.hotelogix.smoke.frontdesk.FrontdeskHome.CheckoutCard;
import com.hotelogix.smoke.frontdesk.FrontdeskHome.FrontdeskLandingPage;
import com.hotelogix.smoke.frontdesk.SampleRestaurantPage.OrderFolioPage;
import com.hotelogix.smoke.frontdesk.ViewDetailsPage.ViewDetailsPage;
import com.hotelogix.smoke.genericandbase.GenericMethods;



public class AccountStatementLandingPage {

	
	public static String POSPoint;
	public static String item;
	
	
	public static String exp_msg="Consolidate Now? \n"+" Accounts Consolidate automatically at Night Audit";

	@FindBy(xpath="//table[@class='payment_total']/tbody/tr[2]/td[2]")
	public WebElement Txt_BookingTotal;
	
	@FindBy(xpath="//td[contains(normalize-space(text()),'ACCOUNT STATEMENT')]")
	public  WebElement PaymentPage;

	@FindBy(xpath="//input[@id='btnConsolidate']")
	public  WebElement ConsolidateAccountBtn;

	@FindBy(xpath="//input[@type='checkbox']")
	public  List<WebElement> AllThePostedItemToAccount;

	@FindBy(xpath="//table[@class='payment_total']//tbody//tr[4]//td[2]")
	public  WebElement RoomTax;

	@FindBy(xpath="//input[@id='btnCustomCharges']")
	public  WebElement CustomChargeBtn;

	@FindBy(xpath="//td[text()='Custom Charge/Allowance']")
	public  WebElement CustomChargeAllowanceTitle;

	@FindBy(xpath="//a[text()='Close']")
	public  WebElement CloseBtnOnPopUp;

	@FindBy(xpath="//select[@id='selPOS']")
	public  WebElement POSDropdownInCustomCharge;

	@FindBy(xpath="//input[@id='ocTxtProduct']")
	public  WebElement DescriptionForCustomCharge;

	@FindBy(xpath="//input[@id='price']")
	public  WebElement PriceForCustomCharge;

	@FindBy(xpath="//input[@id='ocTxtQuantity']")
	public  WebElement QuantityForCustomCharge;

	@FindBy(xpath="//button[@id='ocBtnSave-button']")
	public  WebElement SaveCustomCharge;

	@FindBy(xpath="//input[@id='btnAddNewCharges']")
	public   WebElement OtherChargesBtn;

	@FindBy(xpath="//select[@id='selPOSGuest']")
	public  WebElement ChargeToDropdown;

	@FindBy(xpath="//select[@id='selPOS']")
	public  WebElement POSPointDropdown;

	@FindBy(xpath="//select[@id='SelocTxtProduct']")
	public  WebElement  ProductDropdown;

	@FindBy(xpath="//input[@id='ocTxtQuantity']")
	public  WebElement QtyForOtherCharges;

	@FindBy(xpath="//button[@id='ocBtnSave-button']")
	public  WebElement SaveOtherCharges;

	@FindBy(xpath="//td[text()='Other Charges']")
	public  WebElement OtherChargesPopUpTitle;

	@FindBy(xpath="//a[text()='Close']")
	public  WebElement CloseBtnForOtherCharges;

	@FindBy(xpath="//input[@id='btnGenarateFolio']")
	public  WebElement GeneratorFolio;

	@FindBy(xpath="//input[@id='BtnPaymentsDeletLedger']")
	public  WebElement DeletePerfomaInvoiceBtn;

	@FindBy(xpath="//table[@class='payment_total']//tr[8]//td[@class='frn_total_g']")
	public  WebElement booking_bal;

	@FindBy(xpath="//input[@name='btnGenarateFolio']")
	public  WebElement generateFolioBtn;

	@FindBy(xpath="//table[@class='frn_paytbl_fllist']//tr[3]//table//td[1]//span")
	public  WebElement Nofolio;

	@FindBy(xpath="//input[@name='BtnPaymentsDeletLedger']")
	public  WebElement delPerformaInvoice;

	@FindBy(xpath="//input[@name='btnAddNewCharges']")
	public  WebElement otherCharges;

	@FindBy(xpath="//input[@name='btnGrpOtherCharge']")
	public  WebElement otherCharges1;

	@FindBy(xpath="//select[@name='selPOSGuest']")
	public  WebElement chargeTo;

	@FindBy(xpath="//select[@name='selPOSRoomOwner']")
	public  WebElement chargeToGrp;

	@FindBy(xpath="//select[@name='selPOS']")
	public  WebElement posPoint;

	@FindBy(xpath="//select[@name='SelocTxtProduct']")
	public  WebElement posProduct;

	@FindBy(xpath="//input[@name='ocTxtDiscount']")
	public  WebElement discount;

	@FindBy(xpath="//button[@id='ocBtnSave-button']")
	public  WebElement saveOtherCharge;

	@FindBy(xpath="//td[@class='front_tbl_lft']//tr//td[2]//input")
	public  List<WebElement> chkboxCount;

	@FindBy(xpath="//input[@name='btnCreateNewFolio']")
	public  WebElement routeToNewFolio;

	@FindBy(xpath="//div[@id='PanelSingleCreateNewFolio_h']")
	public  WebElement createFolioTitle;

	@FindBy(xpath="//div[@id='PanelCreateNewFolioGr_h']")
	public  WebElement createFolioTitleGrp;

	@FindBy(xpath="//input[@name='btnCustomCharges']")
	public  WebElement customChargeBtn;

	@FindBy(xpath="//input[@name='btnGrpCustomCharge']")
	public  WebElement customChrgGrp;

	@FindBy(xpath="//input[@name='ocTxtProduct' and @type='text']")
	public  WebElement description;

	@FindBy(xpath="//input[@name='price']")
    public  WebElement price;

	@FindBy(xpath="//select[@name='selGuestIds']")
	public  WebElement selGuestId;

	@FindBy(xpath="//button[@id='newFolioCreate-button']")
	public  WebElement createFolio;

	@FindBy(xpath="//input[@name='btnTransactionRoute']")
    public  WebElement routeChargesbtn;

	@FindBy(xpath="//div[@id='PanelRouteTr_h']")
	public  WebElement routeChargesTitle;

	@FindBy(xpath="//div[@id='PanelRouteGroupTr_h']")
	public  WebElement RCGroup;

	@FindBy(xpath="//button[@id='routeGoSave-button']")
    public  WebElement routeBtn;

	@FindBy(xpath="//select[@name='payTypesMode']")
    public  WebElement paymentMode;

	@FindBy(xpath="//select[@name='payTypes']")
	public  WebElement payTypes;

	@FindBy(xpath="//input[@name='amount']")
    public  WebElement amount;

    @FindBy(xpath="//input[@name='btnPaymentPayNow']")
    public  WebElement payNowBtn;

    @FindBy(xpath="//input[@name='btnRoutePay']")
    public  WebElement routePaymentBtn;

    @FindBy(xpath="//input[@name='btnRoutePayment']")
    public  WebElement routePaymentGrp;

    @FindBy(xpath="//div[@id='PanelRouteGroupPay_h']")
    public  WebElement routePaymentTitle;

    @FindBy(xpath="//button[@id='routePayGoSave-button']")
    public  WebElement routePaymentSave;

    @FindBy(xpath="//button[@id='refundDone-button']")
    public  WebElement refund;

    @FindBy(xpath="//input[@name='btnRefundTransaction']")
    public  WebElement refundBtn;

    @FindBy(xpath="//div[@id='PanelSingleRefund_h']")
    public  WebElement refundTitle;

    @FindBy(xpath="//div[@id='PanelGroupRefund_h']")
    public  WebElement refundTitleGrp;

    @FindBy(xpath="//td[@class='front_tbl_lft']//tr//td[4]")
	public  List<WebElement> rowCount;

    @FindBy(xpath="//table[@class='frn_paytbl_fllist']//tr[4]//td[2]")
    public  WebElement invoiceText;

    @FindBy(xpath="//input[@name='BtnPaymentsDeletLedgerGr']")
	public  WebElement delPIGrp;

    @FindBy(xpath="(//td[@class='front_tbl_lft'])[2]//tr")
	public  List<WebElement> count_ASTable;

    @FindBy(xpath="//input[@name='btnTaxExmptGR']")
    public  WebElement TaxExemptbtn;

    @FindBy(xpath="//div[@id='PanelEXemptTaxTrGR_h']")
    public  WebElement TaxExemptTitle;

    @FindBy(xpath="//select[@name='taxExmptReson']")
    public  WebElement TaxExemptReason;

    @FindBy(xpath="//table[@class='pnl_rates']//tr[2]//td[4]//input[2]")
    public  WebElement TECheckbox;

    @FindBy(xpath="//button[@id='txExmptSave-button']")
    public  WebElement TEBtn;

    @FindBy(xpath="//input[@name='chkshowAllgstId']")
    public  WebElement showAll;

    @FindBy(xpath="//table[@class='dont-print-me-hidden']//table//tr")
    public  List<WebElement> folioCount;

    @FindBy(xpath="//input[@name='ccChequeNo']")
    public  WebElement chequeNum;

    @FindBy(xpath="//input[@name='btnSettleFolio']")
    public  WebElement settleFolio;

    @FindBy(xpath="//table[@class='payment_total']//tr[8]//td[2]")
    public  WebElement totalBal;

    @FindBy(xpath="//input[@value='Check-out']")
	public  WebElement CheckOut_BT;

    @FindBy(xpath="//span[@class='lockfolio-img']")
	public  WebElement LockFolio_IMG;

    @FindBy(xpath="//span[@class='panel-link']")
    public  WebElement moreLink;

    @FindBy(xpath="//input[@id='txtRouteAmnt']")
    public  WebElement routeAmount;

	@FindBy(xpath="//a[@id='addNewAccountCode']")
	public  WebElement addnewaccnt;

	@FindBy(xpath="//input[@id='title']")
	public  WebElement acc_title;

	@FindBy(xpath="//input[@id='accountCode']")
	public  WebElement acc_code;

	@FindBy(xpath="//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only']")
	public  WebElement acc_savebtn;

	@FindBy(xpath="//div[@class='ui-dialog-buttonset']//button[2]")
	public  WebElement acc_cancelbtn;

	@FindBy(xpath="//select[@id='accountCodeId']")
	public  WebElement accountcode;

	@FindBy(xpath="(//td[@class='front_tbl_lft'])[2]//tr")
	public  List<WebElement> Discription_COUNT;

    @FindBy(xpath="//span[@class='closebtn']")
    public  WebElement btn_close;
    
    @FindBy(xpath="//input[@value='Check-out']")
    public WebElement btn_Checkout;
    
    @FindBy(xpath="//input[@id='btnGrpChkOut']")
    public WebElement btn_GrpCheckout;
    
    @FindBy(xpath="//input[starts-with(@value,'Express')]")
    public WebElement btn_ExpressCheckout;
    
    @FindBy(xpath="//div[@id='MsgBox']//div[2]")
    public WebElement txt_ExpChkoutMsg;
    
    @FindBy(xpath="//button[text()='Yes']")
    public WebElement btn_ExpChkoutYes;
    
    @FindBy(xpath="//button[text()='Ok']")
    public WebElement btn_ok;
    
    @FindBy(xpath="//input[@id='btnGuestCheckout']")
    public WebElement btn_GuestCheckout;
    
    @FindBy(xpath="//button[@id='btnCheckoutGst-button']")
    public WebElement btn_GuestChkoutAlert;
    
    @FindBy(xpath="//div[@id='PanelGuestCheckout']//table//tr")
    public List<WebElement> count_guestList;
    
    @FindBy(xpath="//input[@value='Back']")
    public WebElement btn_Back;
    
    @FindBy(xpath="//button[text()='Ok']")
    public WebElement btn_guestChkoutOK;
    
    @FindBy(xpath="//input[@id='btnCheckoutSelectedFromPay']")
    public WebElement btn_chkoutSelected;
    
    @FindBy(xpath="//div[@id='PanelGroupPaymentCheckoutSelected']//table//tr")
    public List<WebElement> count_chkoutSelecRow;
    
    @FindBy(xpath="//button[@id='btnSelRsvChkOut-button']")
    public WebElement btn_chkOut;
    
    @FindBy(xpath="//input[@name='btnPaymentsCheckOut']")
    public WebElement btn_paymentChkOut;


    

	public static String ChequeNum;
	
	public void fn_clkClose() throws Exception{
		try{
		GenericMethods.js_Click(btn_close);
		}catch(Exception e){
			throw e;
		}
	}
	
	
	
public void fn_consolidateAccount() throws Exception
	{
		try
		{		
		GenericMethods.clickElement(ConsolidateAccountBtn);
		GenericMethods.ActionOnAlert("Accept");		
		}catch(Exception e){
			throw e;
		}
	}
	
	

public static String folioNum;



public void fn_verifyRouteCharges()
{
	String text=GenericMethods.getText(routeChargesTitle);
	Assert.assertEquals(text, "Route Charges");

}

public void fn_verifyRCGrpTitle() throws Exception
{
	try
	{
	String text=GenericMethods.getText(RCGroup);
	Assert.assertEquals(text, "Route Charges");
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

public void fn_selectGuestIdRouteCharge() throws Exception
{
	Select sel=new Select(selGuestId);
	sel.selectByVisibleText("Gaurav X (PI 85)");
	GenericMethods.clickElement(routeBtn);
	Thread.sleep(4000);
}



public void fn_selectGuestIDRouteCharge1() throws Exception
{
	//GenericMethods.clickElement(showAll);
	Select sel=new Select(selGuestId);
	List<WebElement> li=sel.getOptions();
	for(WebElement li1:li)
	{
		String PI=li1.getText();
		if(PI.contains(afterPI))
		{
			WebElement ele=GenericMethods.driver.findElement(By.xpath("//select[@name='selGuestIds']//option"));
			//GenericMethods.js_Click(ele);
			Actions actobj=new Actions(GenericMethods.driver);
			actobj.click(ele).build().perform();
			break;
		}
	}
	GenericMethods.clickElement(routeBtn);
	Thread.sleep(4000);
}


public void fn_selectGuest2RouteCharge() throws Exception
{
	Select sel=new Select(selGuestId);
	List<WebElement> li=sel.getOptions();
	//li.size();
	for(int i=0;i<=li.size();i++)
	{
		String Guest2N=li.get(i).getText();
		if(Guest2N.contains("David"))
		{
			li.get(i).click();
		//	WebElement ele=GenericMethods.driver.findElement(By.xpath("//select[@name='selGuestIds']//option["+i+"]"));
			//GenericMethods.js_Click(ele);
//			Actions actobj=new Actions(GenericMethods.driver);
//			actobj.click(ele).build().perform();
			Thread.sleep(3000);
			break;
		}
	}
	GenericMethods.clickElement(routeBtn);
	Thread.sleep(12000);
}




public static String RouteToPI;
public void fn_selectGuest2RouteChargeGrp() throws Exception
{
	try
	{
	Thread.sleep(3000);
	GenericMethods.clickElement(showAll);
	Thread.sleep(2000);
	Select sel=new Select(selGuestId);
	List<WebElement> li=sel.getOptions();
	for(int i=0;i<=li.size();i++)
	{
		String Guest2N=li.get(i).getText();
		int a=Guest2N.indexOf("(");
		RouteToPI=Guest2N.substring(a+1,Guest2N.indexOf(")"));
		if(Guest2N.contains("Richard"))
		{
			li.get(i).click();
			//WebElement ele=GenericMethods.driver.findElement(By.xpath("//select[@name='selGuestIds']//option"));
			//GenericMethods.js_Click(ele);
			//Actions actobj=new Actions(GenericMethods.driver);
			//actobj.click(ele).build().perform();
            Thread.sleep(3000);
			break;
		}
	}
	GenericMethods.js_Click(routeBtn);
	Thread.sleep(4000);
	}
	catch(Exception e)
	{
		throw e;
	}
}

public ReservationFolioPage fn_verifyRoutedOtherChrgeG2Grp() throws Exception
{
	try
	{
    int count1=GenericMethods.tr_count(folioCount);
    if(count1>=10)
    {
        GenericMethods.js_Click(moreLink);
        for(int i=4;i<=count1;i++)
        {
        	String actual=GenericMethods.driver.findElement(By.xpath("//table[@class='dont-print-me-hidden']//table//tr["+i+"]")).getText();
        	if(actual.contains("Richard") && actual.contains(RouteToPI))
        	{
        	  WebElement ele=GenericMethods.driver.findElement(By.xpath("//table[@class='dont-print-me-hidden']//table//tr["+i+"]//td[2]"));
        	  ele.click();

        	  //System.out.println("Charges has been successfully routed to the selected guest ID.");
        	  //Assert.assertEquals(actual, afterPI);
        	  break;
        	}
        	else
        		if(actual.contains("Group Owner")||actual.contains("Room Type"))
        		{
        			System.out.println("Header row is being displayed");
        		}
        		else

                	if(actual.contains("Richard") && actual.contains(RouteToPI))
                	{
                	  WebElement ele=GenericMethods.driver.findElement(By.xpath("//table[@class='dont-print-me-hidden']//table//tr["+i+"]//td[2]"));
                	  ele.click();

                	  //System.out.println("Charges has been successfully routed to the selected guest ID.");
                	  //Assert.assertEquals(actual, afterPI);
                	  break;
                	}
        }

    }

    else
    {
    	for(int i=4;i<=count1;i++)
        {
        	String actual=GenericMethods.driver.findElement(By.xpath("//table[@class='dont-print-me-hidden']//table//tr["+i+"]")).getText();
        	if(actual.contains("Group Owner")||actual.contains("Room Type"))

        	{
        		System.out.println("Header row is being displayed");
        	}

        	else

        	if(actual.contains("Richard"))
        	{
        	  WebElement ele=GenericMethods.driver.findElement(By.xpath("//table[@class='dont-print-me-hidden']//table//tr["+i+"]//td[2]"));
        	  ele.click();

        	  //System.out.println("Charges has been successfully routed to the selected guest ID.");
        	  //Assert.assertEquals(actual, afterPI);
        	  break;
        	}
        }

    }
      ReservationFolioPage RFP=PageFactory.initElements(GenericMethods.driver, ReservationFolioPage.class);
      return RFP;
	}
	catch(Exception e)
	{
		throw e;
	}

}



public static String amt="50";
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


public static String amt1="1.00";
public void fn_clkPayNowGrp() throws Exception
{
	try
	{
    Select sel=new Select(paymentMode);
    sel.selectByValue("cash");
    //Select sel1=new Select(paymentTypes);
    //sel1.selectByValue("");
    Actions acobj= new Actions(GenericMethods.driver);
	acobj.sendKeys(amount, Keys.chord(Keys.CONTROL, "a"), amt1).build().perform() ;
	//amt=GenericMethods.getText(amount);
	GenericMethods.js_Click(payNowBtn);
	Thread.sleep(3000);
	}
	catch(Exception e)
	{
		throw e;
	}
}

public static String num=GenericMethods.generateRandomnum();
public void fn_payNowCheque() throws Exception
{

	try
	{
	    Select sel=new Select(paymentMode);
	   // sel.selectByValue("cheque");
	    sel.selectByIndex(2);
	    Thread.sleep(4000);
	    Select sel1=new Select(payTypes);
	    //sel1.selectByVisibleText("Cheque1");
	    sel1.selectByIndex(1);
	    Thread.sleep(4000);
	    Actions acobj= new Actions(GenericMethods.driver);
		acobj.sendKeys(amount, Keys.chord(Keys.CONTROL, "a"), amt1).build().perform() ;
		Thread.sleep(4000);
		GenericMethods.js_Sendkey(chequeNum,num );
        Thread.sleep(3000);
		//amt=GenericMethods.getText(amount);
		GenericMethods.js_Click(payNowBtn);
		Thread.sleep(3000);
	}
	catch(Exception e)
	{
		throw e;
	}

}




public void fn_makeFullPayment() throws Exception
{
	try
	{
	Select sel=new Select(paymentMode);
    sel.selectByValue("cheque");
    Thread.sleep(4000);
    Select sel1=new Select(payTypes);
    //sel1.selectByVisibleText("Cheque1");
    sel1.selectByIndex(1);
    Thread.sleep(3000);
    GenericMethods.js_Sendkey(chequeNum, num);
    Thread.sleep(3000);
    GenericMethods.js_Click(payNowBtn);
	Thread.sleep(3000);
	}
	catch(Exception e)
	{
		throw e;
	}
}




public void fn_clkSettleFolio() throws Exception
{
   String balance=GenericMethods.getText(totalBal);
   if(balance!="Rs 0.00")
   {
	   fn_makeFullPayment();
	   Thread.sleep(3000);
	   GenericMethods.clickElement(settleFolio);
	   Thread.sleep(3000);
   }

   else
   {


    Thread.sleep(3000);

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
		   Assert.assertEquals(str.contains(expmsg),true);
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


public void fn_verifyPaidAmt() throws Exception
{
	try
	{
	int count=GenericMethods.tr_count(chkboxCount);
    for(int i=2;i<=count;i+=2)
    {
    	String str1=GenericMethods.driver.findElement(By.xpath("(//table[@class='frn_paytbl'])[2]//tbody//tr["+i+"]//td[4]")).getText();
    	//li.add(str1);
    	if(str1.contains("with Cash"))
    	{
    		String str=GenericMethods.driver.findElement(By.xpath("(//table[@class='frn_paytbl'])[2]//tbody//tr["+i+"]//td[9]")).getText();
    		if(str.contains(amt1))
    		{
    		Assert.assertTrue(str.contains(amt1));
//    		WebElement ele1=GenericMethods.driver.findElement(By.xpath("//table[@class='frn_paytbl']//tbody//tr["+i+"]//td[2]"));
//    		ele1.click();
            System.out.println("Paid amount has been successfully posted in Account Statement.");
            break;
    		}

    	}
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



public void fn_verifyPaidAmtChequeGrp() throws Exception{
	try{

	JavascriptExecutor jsx = (JavascriptExecutor)GenericMethods.driver;
	jsx.executeScript("scroll(0, -550)");
	int count=GenericMethods.tr_count(chkboxCount);
    for(int i=2;i<=count;i+=2)
    {

    	//Thread.sleep(3000);
    	String str1=GenericMethods.driver.findElement(By.xpath("(//table[@class='frn_paytbl'])[2]//tbody//tr["+i+"]//td[4]")).getText();
    	//li.add(str1);
    	if(str1.contains("with Cheque ("+num+")"))
    	{
    		String str=GenericMethods.driver.findElement(By.xpath("(//table[@class='frn_paytbl'])[2]//tbody//tr["+i+"]//td[9]")).getText();
    		if(str.contains(amt1))
    		{
    		Assert.assertTrue(str.contains(amt1));
//    		WebElement ele1=GenericMethods.driver.findElement(By.xpath("//table[@class='frn_paytbl']//tbody//tr["+i+"]//td[2]"));
//    		ele1.click();
            System.out.println("Amount paid by cheque has been successfully posted in Account Statement.");
            break;
    		}

    	}
    }
	}catch(Exception e){
		throw e;
	}

}




public static String str1Value;



public void fn_clkRoutePaymentGrp() throws Exception
{
	try
	{
	int count=GenericMethods.tr_count(chkboxCount);
	//int count1=count-2;
    for(int i=2;i<=count;i+=2)
    {
    	String str1=GenericMethods.driver.findElement(By.xpath("(//table[@class='frn_paytbl'])[2]//tbody//tr["+i+"]//td[4]")).getText();
    	//li.add(str1);
        String[] parts=str1.split(" ");
        str1Value=parts[2]+" "+parts[3];
    	if(str1.contains("Paid by "+str1Value+" with Cash"))
    	{
    		String str=GenericMethods.driver.findElement(By.xpath("(//table[@class='frn_paytbl'])[2]//tbody//tr["+i+"]//td[5]")).getText();
    		if(str.equalsIgnoreCase(""))
    		{
    		Assert.assertTrue(str.contains(""));
    		String str2=GenericMethods.driver.findElement(By.xpath("(//table[@class='frn_paytbl'])[2]//tbody//tr["+i+"]//td[9]")).getText();
    		if(str2.contains(amt1))
    		{
    		WebElement ele1=GenericMethods.driver.findElement(By.xpath("//table[@class='frn_paytbl']//tbody//tr["+i+"]//td[2]//input"));
    		ele1.click();
    		break;
    		}
    	}

    	}
    }
    GenericMethods.clickElement(routePaymentGrp);
    Thread.sleep(15000);
	}catch(Exception e){
		throw e;
	}catch(AssertionError e){
		throw e;
	}
}



public void fn_verifyRoutePaymentTitle() throws Exception
{
	try
	{
	String text=GenericMethods.getText(routePaymentTitle);
	Assert.assertEquals(text, "Route Payment");
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




public ReservationFolioPage fn_clkFolio() throws Exception
{
	try
	{
	int count=GenericMethods.tr_count(folioCount);
	if(count>10)
	{
		GenericMethods.clickElement(moreLink);
		for(int i=4;i<=count;i++)
	    {
	    	String actual=GenericMethods.driver.findElement(By.xpath("//table[@class='dont-print-me-hidden']//table//tr["+i+"]")).getText();
	    	if(actual.contains(afterPI))
	    	{
	    	  WebElement ele=GenericMethods.driver.findElement(By.xpath("//table[@class='dont-print-me-hidden']//table//tr["+i+"]//td[3]"));
	    	  GenericMethods.js_Click(ele);
	    	  Thread.sleep(4000);
	    	  //Assert.assertEquals(actual, afterPI);
	    	  break;
	    	}
	    	else
	    		if(actual.contains("Group Owner")||actual.contains("Room Type"))
		    	{
		    		System.out.println("Header row is being displayed");
		    	}
	    		else
	    	    	if(actual.contains(afterPI))
	    	    	{
	    	    	  WebElement ele=GenericMethods.driver.findElement(By.xpath("//table[@class='dont-print-me-hidden']//table//tr["+i+"]//td[3]"));
	    	    	  GenericMethods.js_Click(ele);
	    	    	  Thread.sleep(4000);
	    	    	  //Assert.assertEquals(actual, afterPI);
	    	    	  break;
	    	    	}
	    }
	}

	else
	{
		for(int i=4;i<=count;i++)
	    {
	    	String actual=GenericMethods.driver.findElement(By.xpath("//table[@class='dont-print-me-hidden']//table//tr["+i+"]")).getText();
	    	if(actual.contains("Group Owner")||actual.contains("Room Type"))
	    	{
	    		System.out.println("Header row is being displayed");
	    	}
	    	else
	    	if(actual.contains(afterPI))
	    	{
	    	  WebElement ele=GenericMethods.driver.findElement(By.xpath("//table[@class='dont-print-me-hidden']//table//tr["+i+"]//td[3]"));
	    	  GenericMethods.js_Click(ele);
	    	  Thread.sleep(4000);
	    	  //Assert.assertEquals(actual, afterPI);
	    	  break;
	    	}
	    }
	}



    ReservationFolioPage RFP=PageFactory.initElements(GenericMethods.driver, ReservationFolioPage.class);
    return RFP;
	}
	catch(Exception e)
	{
		throw e;
	}
}

public void fn_LockFolio() throws Exception
{
	try
	{

		int size=folioCount.size();
		String text=folioCount.get(size-1).getText();
		//boolean value=moreLink.isDisplayed();
		if(text.contains("More >>"))
		{
			GenericMethods.clickElement(moreLink);
		}
	      int count=GenericMethods.tr_count(folioCount);

		Thread.sleep(3000);
		for(int i=3;i<=count;i++)
	    {
	    	String actual=GenericMethods.driver.findElement(By.xpath("//table[@class='dont-print-me-hidden']//table//tr["+i+"]")).getText();
	    	if(actual.contains(afterPI))
	    	{
	    		Assert.assertTrue(actual.contains(afterPI));
	    	  WebElement ele=GenericMethods.driver.findElement(By.xpath("//table[@class='dont-print-me-hidden']//table//tr["+i+"]//td[7]//span"));
	    	  GenericMethods.js_Click(ele);
	    	  Thread.sleep(4000);
	    	  String msg=GenericMethods.ActionOnAlert("Accept");
	    	  Assert.assertEquals(msg, "Do you wish to Close this Folio?");
	    	  //Assert.assertEquals(actual, afterPI);
	    	  break;
	    	}
	    }

	}catch(Exception e){
		throw e;
	}catch(AssertionError e){
		throw e;
	}

}


public void fn_verifyLockFolioPopup() throws Exception
{
	try
	{
		Thread.sleep(3000);;
	String msg=GenericMethods.ActionOnAlert("Accept");
	Assert.assertEquals(msg, "Do you wish to Close this Folio?");
	}catch(Exception e){
		throw e;
	}catch(AssertionError e){
		throw e;
	}
}


public void fn_verifyLockedFolio() throws Exception
{
	try
	{
	int size=folioCount.size();
	String text=folioCount.get(size-1).getText();
	if(text.contains("More >>"))
	{
		GenericMethods.clickElement(moreLink);
	}

	Thread.sleep(3000);
	int count=GenericMethods.tr_count(folioCount);


		for(int i=3;i<=count;i++)
	    {
	    	String actual=GenericMethods.driver.findElement(By.xpath("//table[@class='dont-print-me-hidden']//table//tr["+i+"]")).getText();
	    	if(actual.contains("INV"))
	    	{
//	    	  WebElement ele=GenericMethods.driver.findElement(By.xpath("//table[@class='dont-print-me-hidden']//table//tr["+i+"]//td[7]//span"));
//	    	  GenericMethods.js_Click(ele);
              Assert.assertTrue(actual.contains("INV"));
              String lockValue=GenericMethods.driver.findElement(By.xpath("//table[@class='dont-print-me-hidden']//table//tr["+i+"]//td[7]//span")).getAttribute("class");
              Assert.assertEquals(lockValue, "unlockfolio-img");
	    	  System.out.println("Settled folio has been successfully locked.");
	    	  //Assert.assertEquals(actual, afterPI);
	    	  break;
	    	}
	    }
	}catch(Exception e){
		throw e;
	}catch(AssertionError e){
		throw e;
	}

}





public void fn_clkRefund() throws Exception
{
	try
	{
	GenericMethods.clickElement(refund);
	Thread.sleep(5000);
	}
	catch(NoSuchElementException e)
	{
		Thread.sleep(2000);
		GenericMethods.js_Click(refund);
	}
	catch(Exception e)
	{
		throw e;
	}
}




public void fn_verifyRefundTitle() throws Exception
{
	try
	{
	String text=GenericMethods.getText(refundTitleGrp);
	Assert.assertEquals(text, "Refund");
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





public static String substring1;
public static String substring2;

public void fn_getPreviousFolioNumber()
{
	//int count=GenericMethods.tr_count(chkboxCount);
     int   size1=rowCount.size();
     String text=rowCount.get(size1-2).getText();
     System.out.println(text);
     String answer = text.substring(text.indexOf("(")+1,text.indexOf(")"));
     substring1=answer.substring(7);
     System.out.println(substring1);
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


public void fn_verifyGeneratedFolio() throws Exception
{
	String text=GenericMethods.getText(invoiceText);
	Assert.assertTrue(text.contains("PI"));
	System.out.println("Folio has been generated successfully");
	WebElement ele=GenericMethods.driver.findElement(By.xpath("//table[@class='frn_paytbl_fllist']//tr[4]//td[1]//input"));
	ele.click();
	GenericMethods.clickElement(delPIGrp);
	GenericMethods.ActionOnAlert("Accept");
}





public void fn_verifyTaxExemptTitle()
{
	String text=GenericMethods.getText(TaxExemptTitle);
	Assert.assertTrue(text.contains("Tax Exempt Res ID#"));
}


public void fn_saveTaxExempt() throws Exception
{
    Select sel=new Select(TaxExemptReason);
    //sel.selectByVisibleText("Training");
    sel.selectByIndex(1);
    GenericMethods.clickElement(TECheckbox);
    GenericMethods.clickElement(TEBtn);
}



public static String afterPI;






public static int firstNum;
public void fn_getPINum1()
{
   String[] num=afterPI.split(" ");
   firstNum = Integer.valueOf(num[1]);
   System.out.println(firstNum);

}



public void fn_afterRoutePaymentPI() throws Exception
{
	try
	{
	int count=GenericMethods.tr_count(chkboxCount);
    for(int i=2;i<=count;i+=2)
    {
    	String str1=GenericMethods.driver.findElement(By.xpath("(//table[@class='frn_paytbl'])[2]//tbody//tr["+i+"]//td[4]")).getText();
    	//li.add(str1);
    	if(str1.contains("Paid by "+str1Value+" with Cash"))
    	{
    		String str=GenericMethods.driver.findElement(By.xpath("(//table[@class='frn_paytbl'])[2]//tbody//tr["+i+"]//td[9]")).getText();
    		if(str.contains(amt1))
    		{
    		Assert.assertTrue(str.contains(amt1));
    		afterPI=GenericMethods.driver.findElement(By.xpath("//table[@class='frn_paytbl']//tbody//tr["+i+"]//td[5]//a")).getText();
    		//ele1.click();
    		break;
    		}
    	}
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



public void fn_verifyRoutedFolio() throws Exception
{
	try
	{
    int count=GenericMethods.tr_count(folioCount);
    if(count>10)
    {
    	GenericMethods.clickElement(moreLink);
    	for(int i=4;i<=count;i++)
        {
        	String actual=GenericMethods.driver.findElement(By.xpath("//table[@class='dont-print-me-hidden']//table//tr["+i+"]//td[2]/a")).getText();
        	if(actual.equals(afterPI))
        	{
        	  System.out.println("Charges has been successfully routed to the selected guest ID.");
        	  Assert.assertEquals(actual, afterPI);
        	  break;
        	}
        }
    }

    else
    {
    	for(int i=4;i<=count;i++)
        {
        	String actual=GenericMethods.driver.findElement(By.xpath("//table[@class='dont-print-me-hidden']//table//tr["+i+"]//td[2]/a")).getText();
        	if(actual.equals(afterPI))
        	{
        	  System.out.println("Charges has been successfully routed to the selected guest ID.");
        	  Assert.assertEquals(actual, afterPI);
        	  break;
        	}
        }
    }
	}
	catch(Exception e)
	{
		throw e;
	}
}


public void fn_verifySettleFolioMsg() throws Exception
{
   //GenericMethods.clickElement(settleFolio);
   String text=GenericMethods.ActionOnAlert("Dismiss");
   Assert.assertEquals(text, "Do you wish to settle all folios?");

}


public void fn_ValidatePayAmount()
{

  	 try
  	 {
  		Select sel=new Select(paymentMode);
  	   	sel.selectByVisibleText("Cash");

  	    Select sel1=new Select(payTypes);
	   	sel1.selectByVisibleText("Cash");

	   	GenericMethods.sendKeys(amount, "1");
        GenericMethods.clickElement(payNowBtn);
  	 }
  	 catch(Exception e)
  	 {
  		// throw e;
  		 String str=e.getMessage();
  		 System.out.println(str);
  	 }

    }

public void fn_ValidateGenerateFolio_BT() throws Exception
{

  	 try
  	 {
  		GenericMethods.clickElement(generateFolioBtn);
  		GenericMethods.clickElement(CheckOut_BT);
  		GenericMethods.ActionOnAlert("Dismiss");
  		System.out.println(GenericMethods.value);
  		GenericMethods.ActionOnAlert("Dismiss");
  	 }
  	 catch(Exception e)
  	 {
  		 throw e;
  	 }

}


public void fn_ValidateLockFolio_IMG() throws Exception
{

  	 try
  	 {
  		GenericMethods.clickElement(LockFolio_IMG);
  		//GenericMethods.ActionOnAlert("Dismiss");
  		String str=GenericMethods.Alert_Dismiss();
  		Assert.assertEquals(str, "Do you wish to Close this Folio?");
  		//System.out.println(GenericMethods.value);
  	 }
  	 catch(Exception e)
  	 {
  		 throw e;
  	 }

}


public void fn_ValidatePayAmountByCheque()
{

    try{
          Select sel=new Select(paymentMode);
          sel.selectByVisibleText("Cheque");

          Select sel1=new Select(payTypes);
          sel1.selectByVisibleText("Cheque");

          ChequeNum=GenericMethods.generateRandomString();

          GenericMethods.sendKeys(chequeNum, ChequeNum);
          GenericMethods.sendKeys(amount, "1");
          GenericMethods.clickElement(payNowBtn);
    }
    catch(Exception e)
    {
       // throw e;
          String str=e.getMessage();
          System.out.println(str);
    }

 }

public void fn_ValidatePaidAMTby_Checqe() throws Exception{
try{
    int count=Discription_COUNT.size();
    for(int i=3; i<=count-1; i+=2){
        String str=GenericMethods.driver.findElement(By.xpath("(//td[@class='front_tbl_lft'])[2]//tr["+i+"]//td[4]")).getText();

        if(str.contains(ChequeNum)){
            String sr=GenericMethods.driver.findElement(By.xpath("(//td[@class='front_tbl_lft'])[2]//tr["+i+"]//td[9]")).getText();
            System.out.println(sr);
            Assert.assertTrue(sr.contains("1"));
            break;
        }
    }
}catch(Exception e){
    throw e;
}
}



public void fn_ClickSettleFolio_BT(String Alertcommand) throws Exception
{
    GenericMethods.clickElement(settleFolio);
    //GenericMethods.ActionOnAlert(Alertcommand);
    String str=GenericMethods.Alert_Dismiss();
    Assert.assertEquals(str, "Do you wish to settle all folios?");
}


public void fn_ClickSettleFolio_Dismiss() throws Exception
{
    GenericMethods.clickElement(settleFolio);
    //GenericMethods.ActionOnAlert(Alertcommand);
    String str=GenericMethods.Alert_Dismiss();
    Assert.assertEquals(str, "Do you wish to settle all folios?");
}


public void fn_ClickSettleFolio_Accept() throws Exception
{
	try
	{
    GenericMethods.clickElement(settleFolio);
    //GenericMethods.ActionOnAlert(Alertcommand);
    String str=GenericMethods.Alert_Accept();
    Assert.assertEquals(str, "Do you wish to settle all folios?");
	}catch(Exception e){
		throw e;
	}catch(AssertionError e){
		throw e;
	}
}

public void scroll_windowDown()
{
	JavascriptExecutor jse = (JavascriptExecutor)GenericMethods.driver;
	jse.executeScript("window.scrollBy(0,250)", "");
}

public void windowScrollUp()
{
	JavascriptExecutor jsx = (JavascriptExecutor)GenericMethods.driver;
	jsx.executeScript("scroll(0, -550)");

}



public CheckoutCard fn_clkCheckoutBtn() throws Exception{
	try{
	GenericMethods.clickElement(btn_Checkout);
	CheckoutCard COC=PageFactory.initElements(GenericMethods.driver, CheckoutCard.class);
	return COC;
	}catch(Exception e){
		throw e;
	}
}

public CheckoutCard fn_clkGrpCheckoutBtn() throws Exception{
	try{
	GenericMethods.clickElement(btn_GrpCheckout);
	CheckoutCard COC=PageFactory.initElements(GenericMethods.driver, CheckoutCard.class);
	return COC;
	}catch(Exception e){
		throw e;
	}
}



public CheckoutCard fn_clkExpressCheckoutBtn(String msg1,String msg2) throws Exception{
	try{
	GenericMethods.clickElement(btn_ExpressCheckout);
	String str=GenericMethods.getText(txt_ExpChkoutMsg);
	Assert.assertEquals(str.contains(msg1), true);
	GenericMethods.clickElement(btn_ExpChkoutYes);	
	}catch(AssertionError e){
		throw e;
	}catch(UnhandledAlertException e){		
		String str1=GenericMethods.Alert_Accept();
		Assert.assertEquals(str1.equals(msg2), true);
	}
	CheckoutCard COC=PageFactory.initElements(GenericMethods.driver, CheckoutCard.class);
	return COC;
}


public void fn_clkGuestCheckoutBtn(String msg,String fname) throws Exception{
	try{
	GenericMethods.clickElement(btn_GuestCheckout);
	Thread.sleep(3000);
	int count=GenericMethods.tr_count(count_guestList);
	for(int i=2;i<=count-2;i++){
		String name=GenericMethods.driver.findElement(By.xpath("//div[@id='PanelGuestCheckout']//table//tr["+i+"]//td[3]")).getText();
	    if(name.toLowerCase().contains(fname.toLowerCase())==false){
	    	GenericMethods.driver.findElement(By.xpath("//div[@id='PanelGuestCheckout']//table//tr["+i+"]//td[2]")).click();
	    }
	
	}
	GenericMethods.clickElement(btn_GuestChkoutAlert);
	Thread.sleep(3000);
	String str=GenericMethods.getText(txt_ExpChkoutMsg);
	Assert.assertEquals(str.equals(msg), true);
	GenericMethods.clickElement(btn_guestChkoutOK);
	}catch(AssertionError e){
		throw e;
	}catch(Exception e){
		throw e;
	}
}



public ViewDetailsPage fn_clkBackBtn() throws Exception{
	try{
	GenericMethods.clickElement(btn_Back);
	ViewDetailsPage VDP=PageFactory.initElements(GenericMethods.driver, ViewDetailsPage.class);
	return VDP;
	}catch(Exception e){
		throw e;
	}
}



public CheckoutCard fn_clkCheckoutSelected(String name,String msg) throws Exception{
	try{
	GenericMethods.clickElement(btn_chkoutSelected);
    int count=GenericMethods.tr_count(count_chkoutSelecRow);
    for(int i=2;i<=count-2;i++){
    	String str=GenericMethods.driver.findElement(By.xpath("//div[@id='PanelGroupPaymentCheckoutSelected']//table//tr["+i+"]//td[4]")).getText();
        if(str.toLowerCase().contains(name.toLowerCase())){
        	GenericMethods.driver.findElement(By.xpath("//div[@id='PanelGroupPaymentCheckoutSelected']//table//tr["+i+"]//td[2]/input")).click();
        	break;
        }       
    }	
    GenericMethods.clickElement(btn_chkOut);
    String str=GenericMethods.Alert_Accept();
    Assert.assertEquals(str.contains(msg), true);
	}catch(UnhandledAlertException e){
		GenericMethods.Alert_Accept();
	}catch(Exception e){
		throw e;
	}	
	CheckoutCard COC=PageFactory.initElements(GenericMethods.driver, CheckoutCard.class);
	return COC;
}



public CheckoutCard fn_clkChkoutBtn(String msg) throws Exception{
	try{
	GenericMethods.clickElement(btn_paymentChkOut);
	String str1=GenericMethods.Alert_Accept();
	Assert.assertEquals(str1.contains(msg), true);	
	}catch(AssertionError e){
		throw e;
	}catch(Exception e){
		throw e;
	}
	CheckoutCard COC=PageFactory.initElements(GenericMethods.driver, CheckoutCard.class);
	return COC;
}



public void fn_verifyCnclNoShowCharge(String text,String charge) throws Exception{
	try{
	int count=GenericMethods.tr_count(count_ASTable);
	for(int i=2;i<=count;i++){
		String str=GenericMethods.driver.findElement(By.xpath("(//td[@class='front_tbl_lft'])[2]//tr["+i+"]//td[4]")).getText();
		if(str.contains(text)){
			Assert.assertEquals(str.contains(text), true);
			String chrg=GenericMethods.driver.findElement(By.xpath("(//td[@class='front_tbl_lft'])[2]//tr["+i+"]//td[7]")).getText();
		    Assert.assertEquals(chrg.contains(charge), true);
		    break;
		}
	}
	}catch(AssertionError e){
		throw e;
	}catch(Exception e){
		throw e;
	}
	
	
}


}



