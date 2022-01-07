package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	public static WebDriver driver;
	
	@FindBy(id="first_name")
	   private WebElement FirstName;
	   
	   @FindBy(id="last_name")
	   private WebElement LastName;
	   
	   @FindBy(id="address")
	   private WebElement Address;
	   
	   @FindBy(id="cc_num")
	   private WebElement CreditCardNo;
	   
	   @FindBy(id="cc_type")
	   private WebElement CreditCardtype;
	   
	   @FindBy(id="cc_exp_month")
	   private WebElement ExpiryMonth;
	   
	   @FindBy(id="cc_exp_year")
	   private WebElement ExpiryYear;
	   
	   @FindBy(id="cc_cvv")
	   private WebElement CVV;
	   
	   @FindBy(id="book_now")
	   private WebElement BookNow;

	public BookHotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCreditCardNo() {
		return CreditCardNo;
	}

	public WebElement getCreditCardtype() {
		return CreditCardtype;
	}

	public WebElement getExpiryMonth() {
		return ExpiryMonth;
	}

	public WebElement getExpiryYear() {
		return ExpiryYear;
	}

	public WebElement getCVV() {
		return CVV;
	}

	public WebElement getBookNow() {
		return BookNow;
	}
	   

}
