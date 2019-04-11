package com.w2a.pages.crm.accounts;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class AccountsPage extends Page {
	
	public CreateAccountPage goToCreateAccount() {
		driver.findElement(By.cssSelector("button[class='lyte-button lytePrimaryBtn']")).click();
		
		return new CreateAccountPage();
		
	}
	
	public void goToImportAccounts() {
		
	}

}
