package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class HomePage extends OpentapsWrappers  {

	public HomePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Opentaps Open Source ERP + CRM")){
			reportStep("This is not Home Page", "FAIL");
		}
	}
	//LogOut Functionality
	public LoginPage clickLogOut(){
		clickByClassName("decorativeSubmit");
		return new LoginPage(driver, test); 
	}
}
