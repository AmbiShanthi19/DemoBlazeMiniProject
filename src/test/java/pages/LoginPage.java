package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.ProjectSpecificationMethods;

public class LoginPage extends ProjectSpecificationMethods {

	
	@FindBy(id = "loginusername")
	WebElement usernamel;
	
	@FindBy(id = "loginpassword")
	WebElement pass;
	
	@FindBy(xpath = "//button[text()='Log in']")
	WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public LoginPage enterusername() {
		
		usernamel.sendKeys("ambike");
		return this;
	}
	
	public LoginPage enterpass() {
		
		pass.sendKeys("ambika");
		return this;
	}

	public HomePage clickLoginButton() throws Exception {
	
		loginButton.click();
		Thread.sleep(1000);
		return new HomePage(driver);
}	
	

}
