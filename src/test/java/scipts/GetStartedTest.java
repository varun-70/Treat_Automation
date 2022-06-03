package scipts;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import base.Base;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import pages.GetStartedPage;
import util.SwipingUtils;
import util.TappingUtils;
import util.VisualTestUtils;

public class GetStartedTest extends Base{
	@Test
	public void test() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		GetStartedPage landingScreen = new GetStartedPage(driver);
		VisualTestUtils.textAssertion(landingScreen.getDescText(), "Your health and wellness travel champion —from inspiration to planning to integrated care, online and en-route. Start your journey.");
		landingScreen.getGetStarted().click();

		SwipingUtils swipe = new SwipingUtils(driver);
		SwipingUtils.swipingLocation(3, 0, 4, 4);
		SwipingUtils.swipingLocation(1, 4, 4, 4);
		
		landingScreen.getBackIcon().click();
		
		TappingUtils tap = new TappingUtils(driver);
//		tap.tapByElement(landingScreen.getGetStarted());
		landingScreen.getGetStarted().click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		landingScreen.getGetStarted().click();

		VisualTestUtils.textAssertion(landingScreen.getDescTextOnWelcome(), "Treat is the ultimate travel companion, connecting people with integrated health & wellness services so they can explore the world with confidence.");
		
		landingScreen.getForwardIcon().click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		landingScreen.getGetStarted().click();
		landingScreen.getForwardIcon().click();
		
		VisualTestUtils.textAssertion(landingScreen.getDescTextOnWelcome(), "As travelers, we need new tools that will allow us to protect our health and venture out with confidence. We crave a way to roam freely and the assurance of knowing that we’re doing it responsibly.");
		VisualTestUtils.textAssertion(landingScreen.getheaderText(), "We believe travel and exploration are intrinsic parts of a healthy lifestyle.");
		
		

		
	}
}
