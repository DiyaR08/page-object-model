package com.w2a.rough;

import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.CRMHomePage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountPage;

public class LoginTest {
	
	public static void main(String[] args) {
		
		//Straight forward object creation each time
		/*HomePage home = new HomePage();
		home.gotoLoginPage();
		
		LoginPage lp = new LoginPage();
		lp.doSIgnIn("Diyarao08@gmail.com", "Testing@0987654321");
		
		ZohoAppPage apps = new ZohoAppPage();
		apps.gotoCRMPage();
		Page.menu.gotoAccounts();
		
		AccountsPage accPage = new AccountsPage();
		accPage.goToCreateAccount();
		
		CreateAccountPage createAccount = new CreateAccountPage();
		createAccount.createAccount("Tim");*/
		
		//Implementing PageObject by changing the void to which page it return using return type
		HomePage home = new HomePage();
		LoginPage lp = home.gotoLoginPage();
		ZohoAppPage apps = lp.doSIgnIn("Diyarao08@gmail.com", "Testing@0987654321");
		CRMHomePage cp = apps.gotoCRMPage();
		AccountsPage accPage = Page.menu.gotoAccounts();
		CreateAccountPage createAccount = accPage.goToCreateAccount();
		createAccount.createAccount("Tim");
	}

}
