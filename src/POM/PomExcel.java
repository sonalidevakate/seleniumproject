package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PomExcel {
	// Declaration
		@FindBy(xpath = "//input[@name='firstname']")private WebElement fName;
		@FindBy(xpath = "//input[@name='lastname']")private WebElement lName;
		@FindBy(xpath = "//input[@name='reg_email__']")private WebElement email;
		@FindBy(xpath = "//input[@name=\"reg_email_confirmation__\"]")private WebElement cemail;
		@FindBy(xpath = "//input[@type=\"password\"]")private WebElement newPass;

		@FindBy(xpath = "//select[@name=\"birthday_day\"]")private WebElement days;
		@FindBy(xpath = "//select[@title='Month']")private WebElement months;
		@FindBy(xpath = "//select[@title='Year']")private WebElement years;
		@FindBy(xpath = "//input[@value='1']")private WebElement radioBtn;
		@FindBy(xpath = "//input[@value='2']")private WebElement radioBtn2;

		// Intilization

		PomExcel(WebDriver dd) {
			PageFactory.initElements(dd, this);
		}

		// Usage
		public void enterFirstName(String name) {
			fName.sendKeys(name);
		}

		public void enterLastName(String lastName) {
			lName.sendKeys(lastName);
		}

		public void enterEmail(String emailID) {
			email.sendKeys(emailID);
		}
		public void ConfirmEmail(String cfemail) {
			cemail.sendKeys(cfemail);
		}

		public void enterNewPassword(String pass) {
			newPass.sendKeys(pass);
		}

		public void selectDay(String day) {
			Select s = new Select(days);
			s.selectByVisibleText(day);
		}

		public void selectMonth(String month) {
			Select ss = new Select(months);
			ss.selectByVisibleText(month);

		}

		public void selectYear(String year) {
			Select sss = new Select(years);
			sss.selectByValue(year);
		}

		public void clickOnRadio() {
			radioBtn.click();
		}
		public void clickOnRadio2() {
			radioBtn2.click();
		}

	}

	


