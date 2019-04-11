package com.w2a.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.pages.crm.accounts.AccountsPage;

public class CRMTopMenu{
	//CRMTopMenu class is encapsulated inside the Page class so, you cannot extends Page class here
	
	WebDriver driver;

	public CRMTopMenu(WebDriver driver) {
		this.driver = driver;
	}

	public void gotoHome() {

	}

	public AccountsPage gotoAccounts() {
		
		driver.findElement(By.cssSelector("div[data-value='Accounts']")).click();
		
		return new AccountsPage();
	}

	public void gotoLeads() {

	}

	public void gotoContacts() {

	}

	public void gotoDeals() {
		
	}
	
	public void signOut() {
		
	}
	
}