package com.hotelogix.smoke.admin.General;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hotelogix.smoke.genericandbase.Constant;
import com.hotelogix.smoke.genericandbase.ExcelUtil;
import com.hotelogix.smoke.genericandbase.GenericMethods;

public class AddEditPayType
{
   @FindBy(xpath="//input[@id='titBoxId']")
   public static WebElement payTypesTitle;

   @FindBy(xpath="//input[@id='payShortName']")
   public static WebElement PTShortName;

   @FindBy(xpath="//select[@name='paymentMode']")
   public static WebElement payMode;

   @FindBy(xpath="//a[@id='addNewAccountCode']")
	public static WebElement addnewaccnt;

	@FindBy(xpath="//input[@id='title']")
	public static WebElement acc_title;

	@FindBy(xpath="//input[@id='accountCode']")
	public static WebElement acc_code;

	@FindBy(xpath="//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only']")
	public static WebElement acc_savebtn;

	@FindBy(xpath="//div[@class='ui-dialog-buttonset']//button[2]")
	public static WebElement acc_cancelbtn;

	@FindBy(xpath="//select[@id='accountCodeId']")
	public static WebElement accountcode;

	@FindBy(xpath="//input[@value='Save']")
	public static WebElement saveBtn;



	public static String PTTitle;
	public static String shortName;
	public static String PayTypeAcntTitle;
    public static String PayTypeAcntCode;


    public static void accountCode() throws Exception
    {
    	try
    	{
	   GenericMethods.clickElement(addnewaccnt);
	   Thread.sleep(2000);
	   PayTypeAcntTitle=GenericMethods.generateRandomString();
 	   GenericMethods.sendKeys(acc_title, PayTypeAcntTitle);
 	   Thread.sleep(2000);
 	   PayTypeAcntCode=GenericMethods.generateRandomString();
 	   GenericMethods.sendKeys(acc_code, PayTypeAcntCode);
 	   Thread.sleep(2000);
 	   GenericMethods.clickElement(acc_savebtn);
 	   GenericMethods.ActionOnAlert("Accept");
    	}
    	catch(Exception e)
    	{
    		throw e;
    	}
    }



	public PayTypesPage fn_addPayTypeDetail(int iTestCaseRow) throws Exception
	{
		try
		{
		//PTTitle=GenericMethods.generateRandomString();
			int i=ExcelUtil.GetColumnIndex(Constant.Col_PayType);
		GenericMethods.sendKeys(payTypesTitle, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_PayType)));
		//shortName=GenericMethods.generateRandomString();
		GenericMethods.sendKeys(PTShortName, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_PayTypeShortN)));
		//GenericMethods.selectElement(accountcode, "Training");
		accountCode();
		Thread.sleep(2000);
		//GenericMethods.selectElement(payMode, "Cash");
		GenericMethods.selectElementByIndex(payMode, 2);
		GenericMethods.clickElement(saveBtn);
		PayTypesPage PTP = PageFactory.initElements(GenericMethods.driver, PayTypesPage.class);
		return PTP;
		}
		catch(Exception e)
		{
			throw e;
		}

	}



}
