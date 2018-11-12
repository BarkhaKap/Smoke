package com.hotelogix.smoke.admin.General;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hotelogix.smoke.genericandbase.BasePage;
import com.hotelogix.smoke.genericandbase.Constant;
import com.hotelogix.smoke.genericandbase.ExcelUtil;
import com.hotelogix.smoke.genericandbase.GenericMethods;

public class Discounts_AddSpclDiscount 
{

	@FindBy(xpath="//input[@name='title']")
	public static WebElement txtbox_spclDiscTitle;
	
	@FindBy(xpath="//input[@name='amount']")
	public static WebElement txtbox_Discount;
	
	@FindBy(xpath="//select[@id='requirementId']")
	public static WebElement drpdown_RequirementID;
	
	@FindBy(xpath="//textarea[@name='description']")
	public static WebElement txtbox_Description;
	
	@FindBy(xpath="//input[@value='Save']")
	public static WebElement btn_Save;
	
	@FindBy(xpath="//input[@id='publishonweb']")
	public static WebElement chkbox_publonWeb;
	
	@FindBy(xpath="//input[@value='>>']")
	public static WebElement btn_moveRight;
	
	
	
	
	public Discounts_SpecialDiscountLP fn_addSpclDiscount(int iTestCaseRow) throws Exception
	{
		try
		{
						  
		PageFactory.initElements(GenericMethods.driver, Discounts_AddSpclDiscount.class);
		GenericMethods.sendKeys(txtbox_spclDiscTitle, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_SpclDiscountTitle)));
	    GenericMethods.sendKeys(txtbox_Discount, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_Discount)));	   
	    GenericMethods.selectElementByIndex(drpdown_RequirementID, 0);
	    GenericMethods.clickElement(btn_moveRight);
	    GenericMethods.sendKeys(txtbox_Description, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_Description)));
	    GenericMethods.clickElement(chkbox_publonWeb);
	    GenericMethods.clickElement(btn_Save);
	
	    Discounts_SpecialDiscountLP SDP=PageFactory.initElements(GenericMethods.driver, Discounts_SpecialDiscountLP.class);
	    return SDP;
	
		}
		catch(Exception e)
		{
			throw e;
		}
	
	
	
	
	
	}
	
	
	
}
