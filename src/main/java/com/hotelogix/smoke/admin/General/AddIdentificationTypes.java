package com.hotelogix.smoke.admin.General;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hotelogix.smoke.genericandbase.Constant;
import com.hotelogix.smoke.genericandbase.ExcelUtil;
import com.hotelogix.smoke.genericandbase.GenericMethods;

public class AddIdentificationTypes 
{
	
	@FindBy(xpath="//input[@name='title']")
	public static WebElement txtbox_ITypeTitle;
	
	@FindBy(xpath="//textarea[@name='description']")
	public static WebElement txtbox_ITypeDesc;
	
	@FindBy(xpath="//input[@value='Save Identification Type']")
	public static WebElement btn_Save;
	
	
	public IdentificationTypesList fn_addIdentiType(int iTestCaseRow) throws Exception
	{
		try
		{
			PageFactory.initElements(GenericMethods.driver, AddIdentificationTypes.class);
		GenericMethods.sendKeys(txtbox_ITypeTitle, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_IdentificationTypeTitle)));
		GenericMethods.sendKeys(txtbox_ITypeDesc, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_IdentificationTypeDesc)));
		GenericMethods.clickElement(btn_Save);
		
		IdentificationTypesList ITL=PageFactory.initElements(GenericMethods.driver, IdentificationTypesList.class);
		return ITL;				
		}
		catch(Exception e)
		{
			throw e;
		}
	}
	
}
