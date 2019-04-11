package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page {
	public CRMHomePage gotoCRMPage() {
		
		driver.findElement(By.cssSelector("span[class='zicon-apps-crm zicon-apps-96']")).click();
		
		return new CRMHomePage();
		
	}
	
	public void clickCalendar() {
		
		driver.findElement(By.cssSelector("span[class='zicon-apps-calendar zicon-apps-96']")).click();
		
	}

}
