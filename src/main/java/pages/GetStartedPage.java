package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import io.appium.java_client.android.AndroidDriver;

/**This class contains all the elements on the Get Started screens**/
public class GetStartedPage {

	// Declaration -----------------------------------------------

	@FindBy(id = "com.xpresspa.treatmobile.dev:id/get_started_button")
	private WebElement getStarted;

	@FindBy(id = "com.xpresspa.treatmobile.dev:id/btn_guest_user")
	private WebElement continueAsGuest;

	@FindBy(id = "com.xpresspa.treatmobile.dev:id/app_desc")
	private WebElement descText;
	
	@FindBy(id = "com.xpresspa.treatmobile.dev:id/bt_back")
	private WebElement backIcon;
	
	@FindBy(id = "com.xpresspa.treatmobile.dev:id/bt_forward")
	private WebElement forwardIcon;
	
	@FindBy(id = "com.xpresspa.treatmobile.dev:id/textView3")
	private WebElement descTextOnWelcome;
	
	@FindBy(id = "com.xpresspa.treatmobile.dev:id/textView2")
	private WebElement headerText;

	// Utilization ---------------------------------------------

	public WebElement getGetStarted() {
		Reporter.log("Get Started", true);
		return getStarted;
	}

	public WebElement getContinueAsGuest() {
		Reporter.log("Continue as Guest user", true);
		return continueAsGuest;
	}

	public WebElement getDescText() {
		return descText;
	}

	public WebElement getBackIcon() {
		Reporter.log("Application back icon", true);
		return backIcon;
	}

	public WebElement getForwardIcon() {
		Reporter.log("Application forward icon", true);
		return forwardIcon;
	}
	
	public WebElement getDescTextOnWelcome() {
		return descTextOnWelcome;
	}
	
	public WebElement getheaderText() {
		return headerText;
	}
	
	// Initialization ------------

	public GetStartedPage(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(driver, this);
	}

}
