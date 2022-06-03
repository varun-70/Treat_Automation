package util;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class ScrollUtils {
	AndroidDriver<WebElement> driver;

	public ScrollUtils(AndroidDriver<WebElement> driver) {
		this.driver = driver;
	}
	
	public void scrollByText(String text) {
//		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text +"\"));");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + text + "\").instance(0))"));
		
	}
	
	public void scrollByTextAndScrollable(WebElement scrollable, String text) {
//		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"" + scrollable + "\")).scrollIntoView(new UiSelector().textMatches(\"" + text + "\").instance(0));"));
		
//		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"" + scrollable + "\")).scrollIntoView(new UiSelector().textMatches(\"" + text + "\").instance(0));");
		
		
	}
}
