package test;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_003ProductCategoriesanddisplayTest extends ProjectSpecificationMethods{

	@BeforeTest
	public void setup() throws IOException {
		
		//sheetname="LoginData";
		testName="ProductCategories";
		testDescription="Testing the login functionality with positive and negative cases";
		testAuthor="Ambika S";
		testCategory="Smoke Testing";
	}
	
	@Test
	public void ProductCategories() throws Exception {
		
		HomePage obj = new HomePage(driver);
		obj.clickLogin()
		.enterusername()
		.enterpass()
		.clickLoginButton();	
	}
	
}
