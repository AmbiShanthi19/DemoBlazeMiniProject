package test;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.CartPage;
import pages.HomePage;
import pages.ProductdetailsandAddtocartPage;

public class TC_004ProductdetailsandAddtocartTest extends ProjectSpecificationMethods {
	
	@BeforeTest
	public void setup() throws IOException {
		
		//sheetname="LoginData";
		testName="Productdetails and Add to cart";
		testDescription="Testing the login functionality with positive and negative cases";
		testAuthor="Ambika S";
		testCategory="Smoke Testing";
	}
	
	
	@Test 
	public void ProductPage() throws Exception {
		
		HomePage obj = new HomePage(driver);
		obj.clickLogin()
		.enterusername()
		.enterpass()
		.clickLoginButton()
		.clickmobile1();
		ProductdetailsandAddtocartPage objprod=new ProductdetailsandAddtocartPage(driver);
		objprod.Productdetails()
		.Productprice1()
		.clickaddtocart();
		HomePage objh = new HomePage(driver);
		objh.clickHome()
		.clickmobile2();
		ProductdetailsandAddtocartPage objprod2=new ProductdetailsandAddtocartPage(driver);
		objprod2.Productprice1()
		.clickaddtocart()
		.clickcart();
	}
	


}
