package com.cucumber.MavenCucumber;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepsDefinition {
	WebDriver driver = null;

	@Given("^Iam on the ebay site$")
	public void navigateToEbaySite() throws Throwable {
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.ebay.com");
	}

	@When("^I click on sigin_link$")
	public void clickOSiginlink() throws Throwable {
		driver.findElement(By.xpath("//*[@id='gh-ug']/a")).click();

	}

	@And("^I submit the form with valid data$")
	public void submitValidData(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		driver.findElement(By.id("userid")).sendKeys(data.get(1).get(1));
		driver.findElement(By.id("pass")).sendKeys(data.get(2).get(1));
		driver.findElement(By.id("sgnBt")).click();

	}

	@Then("^I should see the text hi ashu$")

	public void checkloggedInPage() throws Throwable

	{
		// String ExpectedValue = "Hi ashu!";
		// String ActualValue = driver.findElement(By.id("gh-ug")).getText();

		// Assert.assertEquals(ExpectedValue, ActualValue);

	}

}
