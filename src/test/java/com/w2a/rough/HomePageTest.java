package com.w2a.rough;

import com.w2a.pages.HomePage;

public class HomePageTest {

	public static void main(String[] args) {
		
		HomePage home = new HomePage();
		home.gotoLoginPage();//Got NullPoint exception as the driver in HomePage was not initialized
		//Create the Home page constructor and give WebDriver driver under arguments
		

	}

}
