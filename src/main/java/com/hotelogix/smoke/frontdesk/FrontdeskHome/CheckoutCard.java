package com.hotelogix.smoke.frontdesk.FrontdeskHome;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hotelogix.smoke.genericandbase.GenericMethods;

public class CheckoutCard {

	@FindBy(xpath="//input[@onclick='window.close();']")
    public  WebElement btn_close;
	
	
	public void WindowScroll() throws InterruptedException
	{
	JavascriptExecutor jsx = (JavascriptExecutor)GenericMethods.driver;
	Thread.sleep(2000);
	jsx.executeScript("scroll(250, 0)");
//		  Actions action = new Actions(GenericMethods.driver);
//	      action.sendKeys(Keys.PAGE_UP);

	}
	
	
	
	public FrontdeskLandingPage fn_clkCloseBtn() throws Exception
    {try{    
    	Thread.sleep(3000);
    	String str=GenericMethods.driver.getCurrentUrl();
    	//GenericMethods.driver.manage().window().maximize();
    	GenericMethods.js_Click(btn_close);
    	/*Actions act=new Actions(GenericMethods.driver);
    	act.click(btn_close).build().perform();*/
    	
    }catch(StaleElementReferenceException e){
    	Thread.sleep(3000);
    	String str=GenericMethods.driver.getCurrentUrl();
    	GenericMethods.closeWindowByJS(GenericMethods.driver);
    }catch(NoSuchElementException e){
    	String str=GenericMethods.driver.getCurrentUrl();
    	GenericMethods.closeWindowByJS(GenericMethods.driver);
    }
    catch(Exception e){
    	throw e;
    }FrontdeskLandingPage AHO = PageFactory.initElements(GenericMethods.driver, FrontdeskLandingPage.class);
    return AHO;
    }
	
}
