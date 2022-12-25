package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class VerifyLoginTest extends BaseClass {

	
	@Test
	public void verity_tc_01_loginwithvalidcredentials() {
		LoginPom login=PageFactory.initElements(driver,LoginPom.class);
		
		Library.custom_sendkeys(login.gettxt_emailid(),excel.getStrinData("Sheet1", 0, 0),"EmailId");
		Library.custom_sendkeys(login.gettxt_password(),excel.getStrinData("Sheet1", 0, 1),"Password");
		Library.custom_click(login.getbtn_login(),"Login");
	    Assert.assertTrue(false);	
		
		Library.custom_sendkeys(login.gettxt_emailid(),excel.getStrinData("Sheet1", 0, 0),"EmailId");
		Library.custom_sendkeys(login.gettxt_password(),excel.getStrinData("Sheet1", 0, 1),"Password");
		Library.custom_click(login.getbtn_login(),"Login");
	    Assert.assertTrue(false);	
		
		
		
	}
}
