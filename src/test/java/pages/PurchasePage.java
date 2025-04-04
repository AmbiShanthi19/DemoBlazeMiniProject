package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.ProjectSpecificationMethods;


public class PurchasePage extends ProjectSpecificationMethods {

	@FindBy(xpath ="//button[text()='Purchase']")
	WebElement purchase;
	
	@FindBy(xpath ="//button[text()='Ok']")
	WebElement ok;
	
	@FindBy(xpath ="//p[contains(@class,'lead text-muted')]")
	WebElement message;
	

	
		public PurchasePage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	
	public PurchasePage Name() {
		driver.findElement(By.id("name")).sendKeys("Ambika");
		return this;
	}

	public PurchasePage Country() {
		driver.findElement(By.id("country")).sendKeys("India");
	return this;
	}
	
	public PurchasePage city() {
		driver.findElement(By.id("city")).sendKeys("Tirupur");
		return this;
	}
	
	public PurchasePage card() {
		driver.findElement(By.id("card")).sendKeys("1234567891234567");
		return this;
	}
	
	public PurchasePage month() {
		driver.findElement(By.id("month")).sendKeys("11");
		return this;
	}
	
	public PurchasePage year() {
		driver.findElement(By.id("year")).sendKeys("2026");
		return this;
	}
	
	public HomePage ClickPurchase() throws Exception {
		purchase.click();
		Thread.sleep(3000);
		System.out.println(message.getText());
		return new HomePage(driver);
	}
	
}
