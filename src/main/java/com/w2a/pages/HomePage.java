package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;

public class HomePage extends Page {// By extending the Page class, you don't have to cerate constructor for each class
	
	public LoginPage gotoLoginPage() {
		
		driver.findElement(By.cssSelector("a[class='zh-login']")).click();
		
		return new LoginPage();//new keyword should be used
	}
	
	public void gotoCustomersPage() {
		
		driver.findElement(By.cssSelector("a[class='zh-customers']")).click();
	}
	
	public void validateFooterLink() {
		
	}

}
