package stepDef;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends ProjectDefinitionMethods{

	String compName="";
	
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
	
	@And("Click Find Leads Link")
	public void clickFindLeads()
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@When("Type the first name as (.*)$")
	public void typeFirstName(String firstName)
	{
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(firstName);
	}
	
	@And("Click Find Leads Button")
	public void clickFindLeadsButton()
	{
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
	}
	
	@And("Select first Lead ID")
	public void selectFirstLeadID() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
	}
	
	@And("Click on Edit Button")
	public void clickEditButton()
	{
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
	}
	
	@When("Edit the company name as (.*)$")
	public void editCompnayName(String companyName)
	{
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
		compName=companyName;
	}
	
	@And("Click on Update Button")
	public void clickUpdateButton()
	{
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
	}
	
	@Then("Verify if the change is made")
	public void verifyChangeMade()
	{
     String change = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		if(change.contains(compName))
		{
			System.out.println("Change made");
		}
		else
		{
			System.out.println("Change not Made");
		}
	}
	
	
}
