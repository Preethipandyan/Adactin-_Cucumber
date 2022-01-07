package com.adactin.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.adactin.BaseClass.BaseClass;
import com.adactin.pom.LoginPage;
import com.adactin.runner.TestRunner;
import com.pom.manager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDefinition extends BaseClass {
	
	
	public static WebDriver driver = TestRunner.driver;
	
	//LoginPage LP = new LoginPage(driver);
	
	PageObjectManager pom = new PageObjectManager(driver);
	
	@Given("^User launch the application$")
	public void user_launch_the_application()   {
		getUrl("https://adactinhotelapp.com/");
		implicitwait();
	      

	}

	@When("Title of login page is Adactin.com - Hotel Reservation system")
	public void title_of_login_page_is_adactin_com_hotel_reservation_system() {
	    getTitle();
	    
	}

	@Then("User enters username and password")
	public void user_enters_username_and_password() {
		inputValueElement(pom.getLP().getUsername(), "PreethiPandyan");
		inputValueElement(pom.getLP().getPassword(), "44Q815");
	    
	}
	
	@Then("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
	   clickOnElement(pom.getLP().getLogin());
	    
	}

	@Then("User is on home page")
	public void user_is_on_home_page() {

	    
	}

	@When("User selects the hotel location, hotel name and roon type")
	public void user_selects_the_hotel_location_hotel_name_and_roon_type() {
		selection(pom.getSh().getLocation(), "byvalue", "Paris");
		selection(pom.getSh().getHotel(), "byvalue", "Hotel Sunshine");
		selection(pom.getSh().getRoomType(), "byvalue", "Deluxe");
		
	}

	@Then("User selects the number of rooms, check in date, check out date and number of person per room")
	public void user_selects_the_number_of_rooms_check_in_date_check_out_date_and_number_of_person_per_room() {
		selection(pom.getSh().getRoomNos(), "byvalue", "2");
		selection(pom.getSh().getAdults(), "byvalue", "2");
		selection(pom.getSh().getChild(), "byvalue", "2");
	    
	}

	@Then("User clicks on the search button")
	public void user_clicks_on_the_search_button() {
		clickOnElement(pom.getSh().getSearch());
	   
	}

	@When("User selects the price and type of room")
	public void user_selects_the_price_and_type_of_room() {
		clickOnElement(pom.getSh2().getSelect());
	    
	}

	@When("User clicks on the continue button")
	public void user_clicks_on_the_continue_button() {
		clickOnElement(pom.getSh2().getContinue());
	    
	}

	@When("User enters his first name, last name and address")
	public void user_enters_his_first_name_last_name_and_address() {
		inputValueElement(pom.getBH().getFirstName(), "Preethi");
		inputValueElement(pom.getBH().getLastName(), "Pandyan");
		inputValueElement(pom.getBH().getAddress(), "No:24/8, paris");
	    
	}

	@Then("User enters Credit card details")
	public void user_enters_credit_card_details() {
		inputValueElement(pom.getBH().getCreditCardNo(), "1234567890123456");
		selection(pom.getBH().getCreditCardtype(), "byvalue", "MAST");
		selection(pom.getBH().getExpiryMonth(), "byvalue", "11");
		selection(pom.getBH().getExpiryYear(), "byvalue", "2022");
		inputValueElement(pom.getBH().getCVV(), "143");
	      
	}

	@Then("User clicks on the Book Now button")
	public void user_clicks_on_the_book_now_button() {
		clickOnElement(pom.getBH().getBookNow());
	    
	}

	@When("User takes a screenshot")
	public void user_takes_a_screenshot() throws Throwable {
		screenshot("C:\\Users\\ELCOT\\eclipse-workspace\\Adactin_Cucumber\\Screenshot\\ImgAuto.png");
	    
	}

	@Then("User logs out of the application")
	public void user_logs_out_of_the_application() {
		clickOnElement(pom.getSl().getLogout());
	    
	}

	@Then("User quits the browser")
	public void user_quits_the_browser() {
		quite();
	    
	}



}
