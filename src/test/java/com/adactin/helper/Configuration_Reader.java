package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	public Configuration_Reader() throws Throwable {
		
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Adactin_Cucumber\\src\\test\\java\\com\\adactin\\helper");
		
		FileInputStream fis = new FileInputStream(f);
		
		Properties p = new Properties();
		p.load(fis);
		
	}
	
	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	
	public String geturl() {
		String url = p.getProperty("url");
		return url;
	}
	
	public String getpassword() {
		String password = p.getProperty("password");
		return password;
	}
	
	public String CreditCardNo() {
		String CreditCardNo = p.getProperty("CreditCardNo");
		return CreditCardNo;
	}
	
	public String CreditCardtype() {
		String CreditCardtype = p.getProperty("CreditCardtype");
		return CreditCardtype;
	}
	
	public String ExpiryMonth() {
		String ExpiryMonth = p.getProperty("ExpiryMonth");
		return ExpiryMonth;
	}
	
	public String ExpiryYear() {
		String ExpiryYear = p.getProperty("ExpiryYear");
		return ExpiryYear;
	}
	
	public String getCVV() {
		String getCVV = p.getProperty("getCVV");
		return getCVV;
	}

}
