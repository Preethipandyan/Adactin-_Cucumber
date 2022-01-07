package com.pom.manager;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookHotel;
import com.adactin.pom.LoginPage;
import com.adactin.pom.ScreenshotandLogout;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;

public class PageObjectManager {
	
	
	public static WebDriver driver;
	
	private LoginPage lp;
	
	private SearchHotel sh;
	
	private SelectHotel sh2;
	
	private BookHotel bh;
	
	private ScreenshotandLogout sl;

	public PageObjectManager(WebDriver pomdriver) {
		
		this.driver=pomdriver;
	}

	public LoginPage getLP() {
		
		lp = new LoginPage(driver);
		
		return lp;
	}

	public SearchHotel getSh() {
		
		sh = new SearchHotel(driver);
		
		return sh;
	}

	public SelectHotel getSh2() {
		
		sh2 = new SelectHotel(driver);
		
		return sh2;
	}

	public BookHotel getBH() {
		
		bh = new BookHotel(driver);
		
		return bh;
	}

	public ScreenshotandLogout getSl() {
		
		sl = new ScreenshotandLogout(driver);
		
		return sl;
	}

		
}
