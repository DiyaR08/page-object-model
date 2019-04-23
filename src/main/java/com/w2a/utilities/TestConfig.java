package com.w2a.utilities;

public class TestConfig {
	
	public static String server="smtp.gmail.com";
	public static String from = "DiyaRao08@gmail.com";
	public static String password = "squirrel@123";
	public static String[] to ={"VeenaR08@gmail.com","DiyaRao08@gmail.com"};
	public static String subject = "Test Report";
	
	public static String messageBody ="TestMessage";
	public static String attachmentPath="/Users/veena/Documents/workspace_git/udemy-selenium-tutorial/src/test/resources/files/error.png";
	public static String attachmentName="error.png";
	
	
	
	//SQL DATABASE DETAILS	
	public static String driver="net.sourceforge.jtds.jdbc.Driver"; 
	public static String dbConnectionUrl="jdbc:jtds:sqlserver://192.101.44.22;DatabaseName=monitor_eval"; 
	public static String dbUserName="sa"; 
	public static String dbPassword="$ql$!!1"; 
	
	
	//MYSQL DATABASE DETAILS
	public static String mysqldriver="com.mysql.cj.jdbc.Driver";
	public static String mysqluserName = "root";
	public static String mysqlpassword = "password";
	public static String mysqlurl = "jdbc:mysql://localhost:3306/DatabaseConnectivity?serverTimezone=UTC";

}
