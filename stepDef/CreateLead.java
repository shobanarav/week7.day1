package stepDef;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends ProjectDefinitionMethods{
	
	@Given("Click CRMSFA Link")
	public void clickCRMSFALink()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@And("Click Leads Tab")
	public void clickLeadsTab()
	{
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@And("Click Create Leads Link")
	public void clickCreateLeadsLink()
	{
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	@When("Type the company name as (.*)$")
	public void typeCompanayName(String compName)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compName);
	}
	
	@And("Type the first name as (.*)$")
	public void typFirstName(String firstName)
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}
	
	@And("Type the last name as (.*)$")
	public void typeLastname(String lastName)
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}
	
	@And("Click Create Leads Button")
	public void clickCreateLeadsButton()
	{
		driver.findElement(By.className("smallSubmit")).click();
	}
	
	@Then("Verify the View Leads Page")
	public void verifyViewLeadsPage()
	{
		String title = driver.getTitle();
		if(title.contains("View Leads"))
		{
		System.out.println("View Leads page loaded");
		}
	}

}
