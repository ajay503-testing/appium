package stepdefination;

import org.junit.Assert;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objects.BaseClass;
import objects.HomePageObjects;

public class Assignment3 {

	// Create Object for Appium
	AppiumDriver driver;
	// Create Obj for Page class
	HomePageObjects obj;

	@When("^User Click on Date Widgets$")
	public void user_Click_on_Date_Widgets() throws Throwable {

		driver = BaseClass.baseDriver;
		obj = new HomePageObjects(driver);

		obj.eleDateWidgets.click();

	}

	@When("^User Click on Dialog$")
	public void user_Click_on_Dialog() throws Throwable {

		obj.eleDialog.click();

	}

	@Then("^Change date and verify the results$")
	public void change_date_and_verify_the_results() throws Throwable {

		
		String dtBefore = obj.eleDate.getAttribute("text");
		// Click on Change the date
		obj.btnChangeDate.click();
		obj.dtCalender.click();
		obj.btnOK.click();
		// get the date after changing
		String dtAfter = obj.eleDate.getAttribute("text");
		System.out.println(dtAfter);
		// Change before and after dates to date format
		Assert.assertEquals(dtAfter.split("-")[1], "10");

	}

}
