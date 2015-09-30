package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class createaccount {

	@FindBy(id="FirstName")
	private WebElement varFirstName;
	public WebElement firstNameTextBox()
	{	return varFirstName;		}
	
	@FindBy(id="LastName")
	private WebElement varLastName;
	public WebElement lastNameTextBox()
	{	return varLastName;		}
	
	@FindBy(id="Passwd")
	private WebElement varPassword;
	public WebElement passwordTextBox()
	{	return varPassword;		}
	
	@FindBy(id="PasswdAgain")
	private WebElement varConfirmPassword;
	public WebElement confirmpasswordTextBox()
	{	return varConfirmPassword;		}
	
	@FindBy(xpath="//span[@id='BirthMonth']")
	private WebElement varBirthMonth;
	public WebElement birthMonthTextBox()
	{	return varBirthMonth;		}
	
	@FindBy(id="BirthDay")
	private WebElement varBirthDay;
	public WebElement birthDaySelect()
	{	return varBirthDay;		}
	
	@FindBy(id="BirthYear")
	private WebElement varBirthYear;
	public WebElement birthYearTextBox()
	{	return varBirthYear;		}
	
	@FindBy(id="Gender")
	private WebElement varGender;
	public WebElement genderSelect()
	{	return varGender;		}
	
	@FindBy(id="RecoveryPhoneNumber")
	private WebElement varPhoneNumber;
	public WebElement phonenoTextBox()
	{	return varPhoneNumber;		}
	
	@FindBy(id="RecoveryEmailAddress")
	private WebElement varEmailadd;
	public WebElement emailTextBox()
	{	return varEmailadd;		}
	
	@FindBy(id="SkipCaptcha")
	private WebElement varSkipCaptcha;
	public WebElement skipcaptchacheckbox()
	{	return varSkipCaptcha;		}
	
	@FindBy(id=":h")
	private WebElement varLocation;
	public WebElement locationSelect()
	{	return varLocation;		}
	
	@FindBy(id="TermsOfService")
	private WebElement varTerms;
	public WebElement termsCheckbox()
	{	return varTerms;	}
	
	@FindBy(id="submitbutton")
	private WebElement varSubmitbutton;
	public WebElement submitButton()
	{	return varSubmitbutton;		}
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
}
