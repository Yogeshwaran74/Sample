package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\java\\feature\\signin.feature",glue={"StepDefinition","hook"},plugin= {"pretty", "html:Reports/cucumber-reports.html",
		"json:Reports/json-reports.json",
"junit:Reports/junit-reports.xml"})
public class RunnerTestCase extends AbstractTestNGCucumberTests{
	
}
