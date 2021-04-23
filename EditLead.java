package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends BaseClass{

	
	@Then("Click on Find Leads")
	public void clickOnFindLeads() {
			
			driver.findElement(By.linkText("Find Leads")).click();

		}
		
	@Then("Click on phone Number tab")
	public void clickOnPhoneNumberTab() {
			
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		}
		
	@And ("Enter Phone Number as {string}")
	public void enterPhoneNumber(String phoneNum) {
			
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNum);
		}
		
	@And ("Click on Find Leads button")
	public void findLeadsButton() throws InterruptedException {
			
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(2000);
		}
		
	@Then("Click on Lead Record")
	public void clickLeadRecord() {
			
			//leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			//driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			
		}
		
	@And ("Click on Edit button")
	public void editButton() {
			
			driver.findElement(By.linkText("Edit")).click();
		}
		
	@And ("Edit CompanyName as {string}")
	public void editCompanyName(String compName) {
			
			driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(compName);
		}
		
	@And ("Click on Submit button")
	public void updateLead() {
			
			driver.findElement(By.name("submitButton")).click();
		}
	

}
