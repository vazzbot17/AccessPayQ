package com.accesspay.mavenproject;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
/*@RunWith(Cucumber.class)
@Cucumber.Options(
		//features="Sample",
	    //glue="{StepDefinition}",
	   // plugin= {"pretty","html:HTML-Reports"},
		format={"SimpleHtmlReport:report/smokeTest.html"},
		tags={"@smoketest"})
//Public class JUnitRunner 
public class TestRunner1 
{

	

}*/

@RunWith(Cucumber.class)
@CucumberOptions(tags= "@smoketest")
public class TestRunner1 
{
	
}
