package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import base.ProjectSpecificationMethods; 

public class ProductdetailsandAddtocartPage extends ProjectSpecificationMethods {

	@FindBy(xpath = "//h3[@class='price-container']")
	WebElement Price1;

	@FindBy(xpath = "//a[text()='Add to cart']")
	WebElement addtocart;
	
	@FindBy(xpath = "(//a[@class='nav-link'])[1]")
	WebElement home;
	
	@FindBy(id="cartur")
	WebElement cart;
	

	@FindBy(xpath = "//button[text()='Place Order']")
	WebElement Placeorder;
	
	public ProductdetailsandAddtocartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public ProductdetailsandAddtocartPage Productprice1() throws Exception {
		String Mobile1Price=Price1.getText();
		System.out.println("The price of Mobile:" +Mobile1Price);
		return this;
	}
	
	public HomePage clickHome() {
		home.click();
		return new HomePage(driver);
	}
	public ProductdetailsandAddtocartPage Productdetails() {
		String PriceText=Price1.getText();
		System.out.println("Price of Mobile :" +PriceText);
		String ExpectedText="$360 *includes tax";
		Assert.assertEquals(PriceText,ExpectedText,"The prices is not matching");
		return this;
	}
	

	public HomePage clickaddtocart() throws InterruptedException {
		addtocart.click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		return new HomePage(driver);
		
	}
	public CartPage clickcart() throws Exception
	{
		cart.click();
		System.out.println("cart items are displayed here");
		Thread.sleep(2000);
		return new CartPage(driver);
	}
	
}

