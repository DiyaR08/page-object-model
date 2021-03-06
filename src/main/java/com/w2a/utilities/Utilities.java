package com.w2a.utilities;

import java.io.File;

import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;

import com.w2a.base.Page;
import com.w2a.utilities.ExcelReader;

//Common methods like capturing screenshot and getting data from excel file are placed here
public class Utilities extends Page {
	public static String screenshotName;
	public static void captureScreenshot() {
		//Timestamp is added to get unique screenshot everytime
		Date d = new Date();
		screenshotName = (d.toString().replace(":", "_").replace(" ", "_")+".jpg");
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//To move the screenshot file to particular location use FileUtils
		//FileUtils.copyFile(screenshot, new File (System.getProperty("user.dir")+"/test-output/html/"+screenshotName));
		
		try {
			FileUtils.copyFile(screenshot, new File(System.getProperty("user.dir") + "\\target\\surefire-reports\\html\\" + screenshotName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}



	@DataProvider()
	public static Object[][] getData(String sheetName) {
		
		int rowNum = excel.getRowCount(sheetName);
		int colNum = excel.getColumnCount(sheetName);
	
		Object[][] data = new Object[rowNum - 1][colNum];
	
		for (int rows = 2; rows <= rowNum; rows++) {
			for (int cols = 0; cols < colNum; cols++) {
	
				data[rows - 2][cols] = excel.getCellData(sheetName, cols, rows);
	
			}
	
		}
	
		return data;
	}
	
}
