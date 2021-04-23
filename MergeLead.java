package steps;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MergeLead extends BaseClass {

	@Given("Click on Merge leads")
	public void clickOnMergeLeads() {
		driver.findElement(By.linkText("Merge Leads")).click();
	}

	@Then("Click on From Lead Look up")
	public void clickOnFromLeadLookUp() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
	}

	@Then("Enter first name as {string} From lookup")
	public void enterFirstNameAsFromLookup(String firstNameFrom) {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstNameFrom);

	}

	@Then("Click on From lead record")
	public void clickOnFromLeadRecord() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		leadIDMerge = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles.get(0));
	}


	@Then("Click on To Lead Look up")
	public void clickOnToLeadLookUp() {

		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
			Set<String> allWindows2 = driver.getWindowHandles();
			allhandles2 = new ArrayList<String>(allWindows2);
			driver.switchTo().window(allhandles2.get(1));
	}

	@Then("Enter first name as {string} To lookup")
	public void enterFirstNameAsToLookup(String firstNameTo) {
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstNameTo);
	}

	@Then("Click on To lead record")
	public void clickOnToLeadRecord() throws InterruptedException {

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles2.get(0));
	}

	@Then("Click on Merge button")
	public void clickOnMergeButton() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
	}

	@Then("Click on Alert")
	public void clickOnAlert() {
	   driver.switchTo().alert().accept();
	}

	@When("Click on Find Leads and verify if from Lead ID retruns")
	public void clickOnFindLeadsAndVerifyIfFromLeadIDRetruns() {
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadIDMerge);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched. Merge Leads Successful");
		}
	}

	
}
