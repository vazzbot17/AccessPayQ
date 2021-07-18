import org.testng.annotations.Test;
import org.testng.TestNG;
import org.testng.remote.RemoteTestNG;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(
	    features="<mavenproject/src/test/com/accesspay/mavenproject/Sample.feature>",
	    glue="<mavenproject/src/test/com/accesspay/mavenproject/StepDefinition.java>",
	    plugin= {"pretty","html:HTML-Reports"},
	    monochrome=true
	    )
	public class TestRunner extends AbstractTestNGCucumberTests
	{
	}