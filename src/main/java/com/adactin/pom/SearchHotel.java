package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	
	public static WebDriver driver;
	
	@FindBy(id="location")
	   private WebElement Location;
	   
	   @FindBy(id="hotels")
	   private WebElement Hotel;
	   
	   @FindBy(id="room_type")
	   private WebElement RoomType;
	   
	   @FindBy(id="room_nos")
	   private WebElement RoomNos;
	   
	   @FindBy(id="adult_room")
	   private WebElement Adults;
	   
	   @FindBy(id="child_room")
	   private WebElement Child;
	   
	   @FindBy(id="Submit")
	   private WebElement Search;

	public SearchHotel(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotel() {
		return Hotel;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getRoomNos() {
		return RoomNos;
	}

	public WebElement getAdults() {
		return Adults;
	}

	public WebElement getChild() {
		return Child;
	}

	public WebElement getSearch() {
		return Search;
	}
	   

}
