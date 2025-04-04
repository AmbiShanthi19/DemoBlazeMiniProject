package test;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.CartPage;
import pages.HomePage;
import pages.ProductdetailsandAddtocartPage;
import pages.PurchasePage;

public class TC_006PurchaseTest extends ProjectSpecificationMethods {

	
	@BeforeTest
	public void setup() throws IOException {
		

		
		testName="PurchaseTest";
		testDescription="Testing the login functionality with positive and negative cases";
		testAuthor="Ambika S";
		testCategory="Smoke Testing";
	}
	
	
	@Test
	public void Purchase() throws Exception {
		
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
		CartPage objcar=new CartPage(driver);
		objcar.TotalPrice()
		.DeleteProduct()
		.Placeorder();
		PurchasePage objpur=new PurchasePage(driver);
		objpur.Name()
		.Country()
		.city()
		.card()
		.month()
		.year()
		.ClickPurchase();
	}


	
}

