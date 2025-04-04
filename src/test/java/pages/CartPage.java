package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.ProjectSpecificationMethods;

public class CartPage extends ProjectSpecificationMethods{
	
	@FindBy(xpath ="(//a[text()='Delete'])[2]")
	WebElement delete;
	
	@FindBy(xpath ="//h3[@id='totalp']")
	WebElement total;
		
	@FindBy(xpath ="//button[text()='Place Order']")
	WebElement placeorder;
	
	
	public CartPage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	
	public CartPage TotalPrice() {
		String TotalPrice=total.getText();
		System.out.println("Total Price :" +TotalPrice);
		return this;
	}

	public CartPage DeleteProduct() throws Exception
	{

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		System.out.println(total.getText());
		delete.click();
		Thread.sleep(3000);
		System.out.println("You deleted an item from cart");
		System.out.println("Updated cart value is : " +total.getText());
		System.out.println("Clearing the produccts from the cart is reflected in UI");
		return this;
	}
	
	
	public PurchasePage Placeorder() throws Exception
	{
		placeorder.click();
		Thread.sleep(3000);
		return new PurchasePage(driver);
	}
	
}
