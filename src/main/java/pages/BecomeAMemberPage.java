package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import io.appium.java_client.android.AndroidDriver;

public class BecomeAMemberPage {

	// Declaration -----------------------------------------------

	@FindBy(id = "com.xpresspa.treatmobile.dev:id/button_become_a_member")
	private WebElement becomeAMemberButton;

	@FindBy(id = "com.xpresspa.treatmobile.dev:id/scrollView")
	private WebElement scrollableView;
	
	@FindBy(id = "com.xpresspa.treatmobile.dev:id/content_control")
	private List<WebElement> chevron;
	
	@FindBy(id = "com.xpresspa.treatmobile.dev:id/faq_answer")
	private WebElement faqAnswer;
	
	// Utilization ---------------------------------------------

	public WebElement getBecomeAMemberButton() {
		Reporter.log("Become A Member Button - clicked", true);
		return becomeAMemberButton;
	}

	public WebElement getScrollableView() {
		return scrollableView;
	}
	
	public List<WebElement> getChevron() {
		return chevron;
	}
	
	public WebElement getfaqAnswer() {
		return faqAnswer;
	}
	
	// Initialization ------------

	public BecomeAMemberPage(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(driver, this);
	}

}
