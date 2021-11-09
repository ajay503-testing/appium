package stepdefination;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.io.File;
import java.net.URL;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objects.HomePageObjects;

public class Assignment {
	// Create Object for Appium
	AppiumDriver driver;
	// Create Obj for Page class
	HomePageObjects obj;
	
	public TouchAction touch;


	@Given("^User is on API demos home page$")
	public void user_is_on_API_demos_home_page() throws Throwable {
		File app = new File("C:\\Users\\Ajay\\Downloads", "ApiDemos-debug.apk");

		DesiredCapabilities capability = new DesiredCapabilities();

		capability.setCapability("device", "Android");
		capability.setCapability(CapabilityType.BROWSER_NAME, "");

		capability.setCapability(CapabilityType.VERSION, "22.0");
		capability.setCapability("app", "C:\\Users\\Ajay\\Downloads\\ApiDemos-debug.apk");

		capability.setCapability("deviceName", "emulator-5554");
		capability.setCapability("platformName", "Android");

		capability.setCapability("app-package", "io.appium.android.apis");

		capability.setCapability("app-activity", ".ApiDemos");

		AppiumDriver<MobileElement> driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),
				capability);

		@SuppressWarnings("unchecked")
		List<MobileElement> listElement = (List<MobileElement>) driver.findElementsById("android:id/text1");
		for (MobileElement li : listElement) {
			System.out.println(li.getText());
		}
		touch = new TouchAction(driver);
		MobileElement views = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='Views']"));
		touch.tap(tapOptions().withElement(element(views))).perform();
		Thread.sleep(2000);
	}

	@When("^User Click on Views$")
	public void user_Click_on_Views() throws Throwable {

		// Create object for Views Page class
		obj = new HomePageObjects(driver);

		// Tap on Views
		obj.viewsOption.click();
		Thread.sleep(2000);

	}

	@When("^User Click on Chronometer$")
	public void user_Click_on_Chronometer() throws Throwable {

		// Tap on Chronometer
		obj.ChronometerOption.click();
		Thread.sleep(2000);

	}

	@Then("^Verify Start, Stop and Rest Options$")
	public void verify_Start_Stop_and_Rest_Options() throws Throwable {

		// Click on start timer
		obj.btnStart.click();
		Thread.sleep(2000);

		// wait some time
		Thread.sleep(2000);

		// Click on Stop timer
		obj.btnStop.click();

		String stopTime = obj.intialTime.getAttribute("text");

		obj.btnReset.click();

		// Verify time is 00:00
		String resetTime = obj.intialTime.getAttribute("text");

	}

}
