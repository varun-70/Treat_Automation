package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	public static AndroidDriver<WebElement> driver;

	@BeforeTest
	public void openapln() throws IOException, InterruptedException {

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/Resources/global.properties");
		Properties prop= new Properties();
		prop.load(fis);

		File appDir=new File("src/main/java/Resources");
		File app=new File(appDir, (String) prop.get("Treat"));

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
//		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
//		dc.setCapability(CapabilityType.PLATFORM_NAME, "Android");
//		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, prop.get("AndroidDevice"));
		dc.setCapability(CapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, prop.get("AndroidVersion"));
		dc.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

		URL url = new URL("http:0.0.0:4723/wd/hub");

		driver = new AndroidDriver<>(url, dc);
//		elements = new ElementsStore(driver);
//		function = new CommonFunctions(driver);
//		Initialize init = new Initialize(driver);
//		action = new TouchAction(driver);

	}

	@AfterTest
	public void closeapln() throws InterruptedException, IOException {
		Thread.sleep(2000);
		driver.quit();
	}
}
