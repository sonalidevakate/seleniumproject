package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPom {

	//Declaration
	
	@FindBy(xpath="//input[@id='email']")  private WebElement userName;
	
	@FindBy(xpath="//input[@id='pass']")  private WebElement password;
	
	@FindBy(xpath="//button[@name='login']")private WebElement loginBtn;
	
	//Intilization
	FacebookPom(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	//Usage
	public void enterUserName() {
		userName.sendKeys("Tester");
	}
	
	public void enterPassword() {
		password.sendKeys("12345");
	}
	
	public void clickonLogin() {
		loginBtn.click();
	}
	
	
}



