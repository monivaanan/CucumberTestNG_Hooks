package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DuplicateLead extends BaseClass {
	
	@Then("Click on Find Leads for Duplicate Lead")
	public void clickOnFindLeads() {
			
			driver.findElement(By.linkText("Find Leads")).click();

		}
		
	@Then("Click on phone Number tab for Duplicate Lead")
	public void clickOnPhoneNumberTab() {
			
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		}
		
	@And ("Enter Phone Number as {string} for Duplicate Lead")
	public void enterPhoneNumber(String phoneNum) {
			
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNum);
		}
		
	@And ("Click on Find Leads button for Duplicate Lead")
	public void findLeadsButton() throws InterruptedException {
			
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(2000);
		}
		
	@Then("Click on Lead Record to create a Duplicate Lead")
	public void clickLeadRecord() {
			
			//leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			//driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			
		}
	
	@Given ("Click on Duplicate Lead")
	public void clickDuplicateLeadButton() {
			
			driver.findElement(By.linkText("Duplicate Lead")).click();
		}
		
	@And ("Click on createLead button")
	public void createDuplicateLead() {
			
			driver.findElement(By.name("submitButton")).click();
		}
		

}
