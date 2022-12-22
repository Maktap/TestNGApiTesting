package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class CraterLoginPage {
	
	public CraterLoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	
	}
	
	@FindBy(name ="email")
	public WebElement useremail;
	
	@FindBy(name = "password")
	public WebElement password;
	
	@FindBy(linkText = "Forgot Password")
	public WebElement forgetPasswordLink;
	
	@FindBy(xpath = "//button[text()= 'Login']" )
	public WebElement loginButton;
	
	@FindBy(xpath = "//p[contains(text, 'Copyright @ Crater']" )
	public WebElement copyRightText;
	
	@FindBy()
	public WebElement businessTagLine;

	@FindBy()
	public WebElement businessSubText;
	
	@FindBy()
	public WebElement invalidUserErrorMsg;
}
