package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import base.ProjectSpecificationMethods;

public class HomePage extends ProjectSpecificationMethods{
	
	@FindBy(id ="signin2")
	WebElement signup;
	
	@FindBy(id = "login2")
	WebElement login;
	
	@FindBy(xpath = "(//a[@class='nav-link'])[1]")
	WebElement home;
	
	@FindBy(xpath = "(//a[@class='nav-link'])[2]")
	WebElement contact;
	
	@FindBy(id = "nameofuser")
	WebElement nameofuser;
	

	@FindBy(xpath = "//a[@id='cat']")
	WebElement cat;
	
	@FindBy(xpath = "//a[@id='nava']")
	WebElement logo;
	
	@FindBy(xpath = "//a[text()='Samsung galaxy s6']")
	WebElement mobile1;
	
	@FindBy(xpath = "//a[text()='Nokia lumia 1520']")
	WebElement mobile2;
	
	@FindBy(id="cartur")
	WebElement cart;
	
	@FindBy(xpath = "//a[text()='Log out']")
	WebElement logoutButton;
	
	
	public HomePage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	
	
public SignupPage clickSignup() {
		
		signup.isDisplayed();
		System.out.println("signup isDisplayed :" +signup.isDisplayed());
		signup.isSelected();
		System.out.println("signup is clickable :" +signup.isSelected());
		signup.click();
		return new SignupPage(driver);   // Constructor chaining
	}

public LoginPage clickLogin() {
	login.isDisplayed();
	System.out.println("Login isDisplayed :"+login.isDisplayed());
	login.isSelected();
	System.out.println("Login is clickable :" +login.isSelected());
	login.click();
	return new LoginPage(driver);
}

public ProductdetailsandAddtocartPage clickmobile1() {
	
	mobile1.click();
	System.out.println("Redirecting to product details Page");
	return new ProductdetailsandAddtocartPage(driver);
	
}

public ProductdetailsandAddtocartPage clickmobile2() {
	
	mobile2.click();
	System.out.println("Redirecting to product details Page");
	return new ProductdetailsandAddtocartPage(driver);
	
}

public HomePage ProductCategoriesandDisplay() {
	
	boolean Username = nameofuser.isDisplayed();
	Assert.assertTrue(Username,"Username is displayed");
	System.out.println("Name of the user is displayed:" +Username);
	boolean Home = home.isDisplayed();
	Assert.assertTrue(Home,"Home menu is displayed");
	System.out.println("Home menu is displayed:" +Home);
	boolean Contact = contact.isDisplayed();
	Assert.assertTrue(Contact,"Contact menu is displayed");
	System.out.println("Contact menu is displayed: " +Contact);
	boolean Categories = cat.isDisplayed();
	Assert.assertTrue(Categories,"categories menu is displayed");
	System.out.println("Categories is dispalyed :"  +Categories);
	boolean Logo = logo.isDisplayed();
	Assert.assertTrue(Logo,"Logo is displayed");
	System.out.println("Logo is dispalyed :" +Logo);
	return this;
}	

public HomePage clickHome() {
	home.click();
	return this;
}

public CartPage clickcart() throws Exception
{
	cart.click();
	System.out.println("cart items are displayed here");
	Thread.sleep(2000);
	return new CartPage(driver);
}

public HomePage clickLogoutButton() throws Exception {
	Thread.sleep(5000);
	logoutButton.click();
	return new HomePage(driver);
}	


/*public HomePage validateLogin(String testType, String expectedText) {
	
	if(testType.equalsIgnoreCase("ValidUsernameValidPassword")){
		
		String actualText=validLoginText.getText();
		//Hard Assertion
		Assert.assertEquals(actualText, expectedText);
	} 
	else if(testType.equalsIgnoreCase("InValidUsernameValidPassword")){
		String actualText=invalidLoginText.getText();
		// Soft Assertion
		SoftAssert asserObj = new SoftAssert();
		asserObj.assertEquals(actualText, expectedText);
		asserObj.assertAll();
	}
	return this;
}	*/
}

