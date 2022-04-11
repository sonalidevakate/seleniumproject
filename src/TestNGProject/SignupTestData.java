package TestNGProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignupTestData {
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

	// Initilization

	SignupTestData(WebDriver dd) {
		PageFactory.initElements(dd, this);
	}

	// Usage
	public void enterFirstname(String name) {
		fName.sendKeys(name);
	}

	public void enterLastname(String lastName) {
		lName.sendKeys(lastName);
	}

	public void enteremail(String emailID) {
		email.sendKeys(emailID);
	}
	public void Confirmemail(String cfemail) {
		cemail.sendKeys(cfemail);
	}

	public void enterNewpassword(String pass) {
		newPass.sendKeys(pass);
	}

	public void selectday(String day) {
		Select s = new Select(days);
		s.selectByVisibleText(day);
	}

	public void selectmonth(String month) {
		Select ss = new Select(months);
		ss.selectByVisibleText(month);

	}

	public void selectyear(String year) {
		Select sss = new Select(years);
		sss.selectByVisibleText(year);
	}

	public void clickOnradio() {
		radioBtn.click();
	}
	public void clickOnradio2() {
		radioBtn2.click();
	}

}

