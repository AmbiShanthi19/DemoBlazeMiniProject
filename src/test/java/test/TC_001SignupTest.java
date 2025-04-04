package test;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_001SignupTest extends ProjectSpecificationMethods{

	@BeforeTest
	public void setup() throws IOException {
		/*filepath="C:\\Users\\DELL\\eclipse-workspace\\Demoblazewebsite\\src\\test\\resources\\SignUpData.Properties";
		readFromPropFile(filepath);*/
		//sheetname="SignupData";
		testName="SignUp Test";
		testDescription="Testing the login functionality with positive and negative cases";
		testAuthor="Ambika S";
		testCategory="Smoke Testing";
	}
	@Test
	public void SignupTest() {
	
		HomePage obj = new HomePage(driver);
		obj.clickSignup()
		.enterUserName()
		.enterPass()
		.clickSignupButton();
		
	}

}