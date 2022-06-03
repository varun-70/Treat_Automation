package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import io.appium.java_client.android.AndroidDriver;

public class SignInPage {

	// Declaration -----------------------------------------------

	@FindBy(xpath = "//android.widget.Button[@text='Sign In']")
	private WebElement signIn;

	@FindBy(id = "Navigate up")
	private WebElement navigateBack;

	@FindBy(id = "com.xpresspa.treatmobile.dev:id/edit_email")
	private WebElement email;

	@FindBy(id = "com.xpresspa.treatmobile.dev:id/edit_password")
	private WebElement password;

	@FindBy(id = "Show password")
	private WebElement showPassword;

	@FindBy(id = "com.xpresspa.treatmobile.dev:id/forgot_password")
	private WebElement forgotPassword;


	// Utilization ---------------------------------------------

	public WebElement getSignIn() {
		Reporter.log("Sign In", true);
		return signIn;
	}

	public WebElement getNavigateBack() {
		return navigateBack;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getpassword() {
		return password;
	}

	public WebElement getShowPassword() {
		return showPassword;
	}

	public WebElement getForgotPassword() {
		return forgotPassword;
	}

	// Initialization ------------

	public SignInPage(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(driver, this);
	}
}
