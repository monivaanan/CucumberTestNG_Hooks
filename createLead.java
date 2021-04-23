package steps;

	import java.time.Duration;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class createLead extends BaseClass {

@When("Click on Create Lead")
		public void leadClick() {
			driver.findElement(By.linkText("Create Lead")).click();

		}

@When("Enter the Company Name as {string}")
		public void companyName(String compName) {
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compName);

		}

@When("Enter the First Name as {string}")
		public void firstName(String firstName) {
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);

		}

@When("Enter the Last Name as {string}")
		public void lastName(String lastName) {
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);

		}

@Then("Submit button is clicked")
		public void submitButton() {
			driver.findElement(By.name("submitButton")).click();

}

}


