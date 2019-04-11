package com.w2a.pages.crm;

import org.openqa.selenium.By;

import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;

public class CRMHomePage extends Page {
	
	public void verifyWelcomeText() {
		
		driver.findElement(By.cssSelector("#show-uName")).getText();
	}

}
