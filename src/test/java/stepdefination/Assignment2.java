package stepdefination;

import org.junit.Assert;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objects.BaseClass;
import objects.HomePageObjects;

public class Assignment2 {
	AppiumDriver driver;
	// Create Obj for Page class
	HomePageObjects obj;

	@When("^User Click on Controls$")
	public void user_Click_on_Controls() throws Throwable {

		
		driver = BaseClass.baseDriver;
		obj = new HomePageObjects(driver);
	
		obj.ControlsOption.click();

	}

	@When("^User Click on Holo or old theme$")
	public void user_Click_on_Holo_or_old_theme() throws Throwable {

		
		obj.HoloOldTheme.click();

	}

	@Then("^Verify Check box selection and Radio button$")
	public void verify_Check_box_selection_and_Radio_button() throws Throwable {

		obj.chkBox.click();
		Thread.sleep(2000);
		// Verify whether check box is selected
		Assert.assertEquals(obj.chkBox.getAttribute("checked"), "true");
		// Select radio button
		obj.rdoBtn.click();
		Thread.sleep(2000);
		// Verify whether radio button is selected
		Assert.assertEquals(obj.rdoBtn.getAttribute("checked"), "true");
		// Click on drop down and select an element
		obj.lstDropDown.click();
		// Select earth element
		obj.eleEarth.click();
		Thread.sleep(2000);
		

	}
}
