package stepdefination;

import java.io.File;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class Assignment1 {
	
	public TouchAction touch;

	@Given("user navigate to apidemo application and click on views")
	public void user_navigate_to_apidemo_application_and_click_on_views() throws Exception {
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

		AppiumDriver<MobileElement> driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capability);

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

	@Given("user click on Tabs")
	public void user_click_on_Tabs() {

	}

	@When("user click on Dialog")
	public void user_click_on_Dialog() {

	}

	@When("user click on content by factory")
	public void user_click_on_content_by_factory() {

	}

	@When("user click on tabOne")
	public void user_click_on_tabOne() {

	}

	@Then("user validate the tabOne text")
	public void user_validate_the_tabOne_text() {

	}

	@Then("user click on tabTwo")
	public void user_click_on_tabTwo() {

	}

	@Then("user validate the tabTwo text")
	public void user_validate_the_tabTwo_text() {

	}

	@Then("user click on tabThree")
	public void user_click_on_tabThree() {

	}

	@Then("user validate the tabThree text")
	public void user_validate_the_tabThree_text() {

	}

}
