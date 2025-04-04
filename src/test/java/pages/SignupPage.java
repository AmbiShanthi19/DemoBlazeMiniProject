package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethods;

public class SignupPage extends ProjectSpecificationMethods{

		public SignupPage(WebDriver driver) {
			this.driver=driver;
		}
		
		public SignupPage enterUserName() {
			driver.findElement(By.id("sign-username")).sendKeys("Ambikaaa");
			return this;
		}
		public SignupPage enterPass() {
			driver.findElement(By.id("sign-password")).sendKeys("ambika");
			return this;
		}
		
		public HomePage clickSignupButton() {
			
			driver.findElement(By.xpath("//button[text()='Sign up']")).click();
			//System.out.println(driver.switchTo().alert().getText());
			//driver.switchTo().alert().accept();
			return new HomePage(driver);
		}	
}
