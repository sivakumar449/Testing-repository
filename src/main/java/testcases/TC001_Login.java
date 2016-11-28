package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC001_Login extends OpentapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Login";
		testDescription="Login To Opentaps";
		browserName="chrome";
		dataSheetName="TC001";
		category="Smoke";
		authors="Babu";
	}

	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord,
			String loginName){

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(loginName)
		.clickLogOut();

	}

}
