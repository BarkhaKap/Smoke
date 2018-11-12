package com.hotelogix.smoke.admin.General;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.hotelogix.smoke.genericandbase.GenericMethods;

public class IdentificationTypesList 

{
	@FindBy(xpath="//a[@title='Add Identification Type']")
	public  static WebElement lnk_addIdentiTypes; 
	
	@FindBy(xpath="//table[@class='list_viewnew']//tr")
	public static List<WebElement> trcount;
	
	
	public void verify_IdentiTypesPresence(int iTestCaseRow) throws Exception
	{
		try
		{
		int i=GenericMethods.tr_count(trcount);
		if(i<=4==true)
		{
			GenericMethods.clickElement(lnk_addIdentiTypes);
			AddIdentificationTypes AIT=new AddIdentificationTypes();
			AIT.fn_addIdentiType(iTestCaseRow);
		}
		
		}
		catch(Exception e)
		{
			throw e;
		}
	}
	
	public AddIdentificationTypes clk_addIdentiTypes() throws Exception
	{
		try
		{
		GenericMethods.clickElement(lnk_addIdentiTypes);
		
		AddIdentificationTypes AIT=PageFactory.initElements(GenericMethods.driver, AddIdentificationTypes.class);
		return AIT;
		}
		catch(Exception e)
		{
			throw e;
		}
	}
	
	
	
	
	
	
}
