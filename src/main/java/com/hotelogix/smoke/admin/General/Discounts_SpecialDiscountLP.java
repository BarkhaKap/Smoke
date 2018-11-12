package com.hotelogix.smoke.admin.General;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hotelogix.smoke.genericandbase.GenericMethods;

public class Discounts_SpecialDiscountLP 
{

	@FindBy(xpath="//table[@class='list_viewnew']//tr")
	public static List<WebElement> trcount;
	
	@FindBy(xpath="//a[@title='Add a Discount']")
	public static WebElement lnk_addDiscount;
	
	
	
	
	public void verify_spclDiscountPresence(int iTestCaseRow) throws Exception
	{
		try
		{
		int count=GenericMethods.tr_count(trcount);
		if(count<=4==true)
		{
			GenericMethods.clickElement(lnk_addDiscount);
			Discounts_AddSpclDiscount ASD=new Discounts_AddSpclDiscount();
			ASD.fn_addSpclDiscount(iTestCaseRow);
			
		}
		}
		catch(Exception e)
		{
			throw e;
		}
	}
}
