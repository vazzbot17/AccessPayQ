package com.accesspay.mavenproject;

import cucumber.api.PendingExceptiom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

public class StepDefinition 
{
   WebDriver driver = new ChromeDriver();
	
	@Given("^Open Chrome browser and launch the application$")
	   public void openBrowser()
	   {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swetha vazzala\\Desktop\\Swetha Programs\\udemy notes\\Desktop\\drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		String baseURL = "http://automationpractice.com";
		driver.get(baseURL);
	   }
					
		@When("^User selects TShirts tab")
		public void clickOnTShirts()
		{
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")).click();
			driver.findElement(By.partialLinkText("TShirts")).click();
		}
}
