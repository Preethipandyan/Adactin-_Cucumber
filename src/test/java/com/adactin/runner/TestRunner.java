package com.adactin.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.BaseClass.BaseClass;
import com.adactin.helper.File_Reader_Manager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src//test//java//com//adactin//feature//Adactin.feature",
glue = "com\\adactin\\stepdefinition")





 


public class TestRunner {
	
	public static WebDriver driver;
	
	 
	@BeforeClass
	
	public static void Set_up() throws Throwable {
	    String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();
		driver = BaseClass.getDriver("browser");

	}

}
