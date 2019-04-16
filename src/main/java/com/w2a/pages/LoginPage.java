package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;

public class LoginPage extends Page {
	
	public ZohoAppPage doSIgnIn(String username, String password) {
		
		type("#lid", username);
		type("#pwd", password);
		click("#signin_submit");
		
		return new ZohoAppPage();
		
	}

}
