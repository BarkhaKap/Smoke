package com.hotelogix.smoke.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import com.hotelogix.anonymousTest.generalTest;
import com.hotelogix.smoke.emailaccount.EmailHomePage;
import com.hotelogix.smoke.genericandbase.Constant;
import com.hotelogix.smoke.genericandbase.ExcelUtil;
import com.hotelogix.smoke.genericandbase.GenericMethods;

public class EmailAccountLoginPage {



	@FindBy(xpath="//input[@id='Email']")
	public static WebElement UserMailId;

	@FindBy(xpath="//input[@id='Passwd']")
	public static WebElement Password;

	@FindBy(xpath="//input[@id='signIn']")
	public static WebElement SignInBtn;


	@FindBy(xpath="//input[@name='login_username']")
	public static WebElement UserName;

	@FindBy(xpath="//input[@name='secretkey']")
	public static WebElement PasswdField;


	@FindBy(xpath="//input[@value='Login']")
	public static WebElement Login;
	
	@FindBy(xpath="//input[@id='next']")
	public static WebElement NextButton;
	
	private int iTestCaseRow;
	

	public void DoGmailLogin(int iTestCaseRow) throws Exception{

try
{
		GenericMethods.sendKeys(UserMailId, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_InboxId)));
		GenericMethods.clickElement(NextButton);
		Thread.sleep(8000);
		GenericMethods.sendKeys(Password, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_InboxPassword)));
		System.out.println(SignInBtn.isEnabled());
		System.out.println(SignInBtn.isDisplayed());
		Actions a=new Actions(GenericMethods.driver);
		//a.click(SignInBtn);
		GenericMethods.js_Click(SignInBtn);
		Thread.sleep(2000);
		//GenericMethods.js_Click(GenericMethods.driver.findElement(By.xpath("//span[text()='Stay signed in']")));
		//Thread.sleep(2000);
		//GenericMethods.js_Click(GenericMethods.driver.findElement(By.xpath("//span[text()='Sign in']")));
		//Thread.sleep(2000);
//		EmailHomePage EHP=PageFactory.initElements(GenericMethods.driver, EmailHomePage.class);
//		return EHP;
}
catch(Exception e)
{
	throw e;
	}
	}

	public void DoSquirrelMailLogin(int iTestCaseRow) throws Exception
	{
		try
		{
		GenericMethods.sendKeys(UserName, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_InboxId)));
		GenericMethods.sendKeys(PasswdField, ExcelUtil.getCellData(iTestCaseRow, ExcelUtil.GetColumnIndex(Constant.Col_InboxPassword)));
		GenericMethods.clickElement(Login);
//		EmailHomePage EHP=PageFactory.initElements(GenericMethods.driver, EmailHomePage.class);
//		return EHP;
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public EmailHomePage DoSpecificEmailLogin(int iTestCaseRow) throws Exception
	{
		try
		{
		String url=GenericMethods.driver.getCurrentUrl();
		if(url.contains("http://mail.stayezee.com/squirrelmail/src/login.php"))
		{
			 //EmailAccountLoginPage EAP=new EmailAccountLoginPage();
			DoSquirrelMailLogin(iTestCaseRow);
		}
		else
		{
			DoGmailLogin(iTestCaseRow);
		}
		
		EmailHomePage EHP=PageFactory.initElements(GenericMethods.driver, EmailHomePage.class);
		return EHP;
		}
		catch(Exception e)
		{
			throw e;
		}
	}


	
	

}
