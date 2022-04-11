package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignupPom {
	//Declaration
		@FindBy(xpath="//input[@name='firstname']")private WebElement fName;
		@FindBy(xpath="//input[@name='lastname']")private WebElement lName;
		@FindBy(xpath="//input[@name='reg_email__']")private WebElement email;
		@FindBy(xpath="//input[@name=\"reg_email_confirmation__\"]")private WebElement cemail;
		@FindBy(xpath="//input[@type=\"password\"]")private WebElement newPass;
		
		@FindBy(xpath="//select[@name=\"birthday_day\"]")private WebElement bday;
		@FindBy(xpath="//select[@title='Month']")private WebElement bmonth;
		@FindBy(xpath="//select[@title='Year']")private WebElement byear;
		@FindBy(xpath="//input[@value='1']")private WebElement radioBtn;

		//Intilization
		SignupPom(WebDriver ddd){   //Signuppom is a constructor
			PageFactory.initElements(ddd, this); //PageFactory is class	
		}
		
		
		//Usage
		public void enterFirstName() {
			fName.sendKeys("sonali");
		}
		
		public void enterLastName() {
			lName.sendKeys("Devakate");
		}
		
		public void enterEmail() {
			email.sendKeys("sonali@gamil.com");
		}
		public void ConfirmEmail() {
			cemail.sendKeys("sonali@gamil.com");
		}
		
		public void enterNewPassword() {
			newPass.sendKeys("123456");
		}
		public void selectDay() {
			Select s=new Select(bday);
			s.selectByVisibleText("25");
		}
		public void selectMonth() {
			Select ss=new Select(bmonth);
			ss.selectByIndex(8);
		}
		public void selectYear() {
			Select sss=new Select(byear);
			sss.selectByValue("1996");;
		}
		public void clickOnRadio() {
			radioBtn.click();
		}

	}




