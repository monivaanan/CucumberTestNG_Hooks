package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass {
	
	@Given("Enter username as {string}")
	public void  enterUserName(String username){
		driver.findElement(By.id("username")).sendKeys(username);
		
	}
	
	@Given("Enter password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@When("click on Login button")
	public void clickLoginButton() {
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}
	
	@Then("HomePage should be displayed")
	public void verifyHomePage() {
		
		String title=driver.getTitle();
		if(title.contentEquals("Leaftaps - TestLeaf Automation Platform"))
			System.out.println("Logged into Homescreen");
	
	}
	
	@But ("Error message should be displayed")
	public void verifyErrorMessage() {
		System.out.println("Error Page is displayed");
	}
	


}


