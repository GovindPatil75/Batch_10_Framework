package com.Utility;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	
	public static ExtentTest test;
	
	public static void custom_sendkeys(WebElement element,String value,String fieldname) {
		try {
			element.sendKeys(value);
			test.log(Status.PASS, fieldname+"=Value Succesfully Send ="+value);
			
		}catch(Exception e) {
			test.log(Status.FAIL,e.getMessage());
			
		}
	}
	
	public static void custom_click(WebElement element,String fieldName) {
		try {
			element.click();
			test.log(Status.PASS, "Clicked Succesfully on =" +fieldName);
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
			
		}
	}

}
