package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DeleteLead extends BaseClass{
	
	@Then("Click on Find Leads for Delete lead")
	public void clickOnFindLeadsDeleteLead() {
			  
			driver.findElement(By.linkText("Find Leads")).click();

		}
		
	@Then("Click on phone Number tab for Delete lead")
	public void clickOnPhoneNumberTabDeleteLead() {
			
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		}
		
	@And ("Enter Phone Number as {string} for Delete lead")
	public void enterPhoneNumberDeleteLead(String phoneNum) {
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNum);
		}
		
	@And ("Click on Find Leads button for Delete lead")
	public void findLeadsButtonDeleteLead() throws InterruptedException {
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(2000);
		}
		
	@Then("Click on Lead Record for Delete lead")
	public void clickLeadRecordDeleteLead() {
			
			leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
			System.out.println("The lead ID to be deleted :" +leadID);
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			
		}
		
	@Then ("Click on Delete Lead button")
	public void clickDeleteLead() {
			
			driver.findElement(By.linkText("Delete")).click();
		}
		
	@Then ("Verify if Lead is deleted")
	public void deleteVerify() {
			
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			String text = driver.findElement(By.className("x-paging-info")).getText();
			if (text.equals("No records to display")) {
				System.out.println("Text matched");
			} else {
				System.out.println("Text not matched");
			}
			
		}



}
