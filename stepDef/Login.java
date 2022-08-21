package stepDef;


import org.openqa.selenium.By;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends ProjectDefinitionMethods{
	
	
	@Given("Type the username as {string}")
	public void enterUsername(String username)
	{
		driver.findElement(By.id("username")).sendKeys(username);
	}
	
	@And("Type the password as {string}")
	public void typePassword(String pwd)
	{
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	
	@When("Click on the Login button")
	public void clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Verify the home page is loaded")
	public void verifyHomePage()
	{
		String title = driver.getTitle();
		if(title.contains("Leaftaps - TestLeaf Automation Platform"))
		{
			System.out.println("Homepage is loaded");
		}
		else
		{
			System.err.println("Homepage not loaded");
		}
	}
	
	
}
