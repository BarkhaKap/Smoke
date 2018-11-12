package com.hotelogix.smoke.frontdesk.WebReservation.GuestConsole;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.hotelogix.smoke.genericandbase.GenericMethods;



public class WebGuestSelectRoomPage {



	@FindBy(xpath="//table[@class='tbl-contentNew']//tbody//tr[3]//td[2]//table//td[3]//input")
	public static WebElement RoomToSelect;



public WebGuestAddMoreRoomPage SelectRoom() throws Exception
{
	try
	{
GenericMethods.clickElement(RoomToSelect);
WebGuestAddMoreRoomPage WMR=PageFactory.initElements(GenericMethods.driver, 	WebGuestAddMoreRoomPage.class);
return WMR;
	}
	catch(Exception e)
	{
		throw e;
	}
}


}
