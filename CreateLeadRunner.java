package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions ( 	features="src/test/java/features/createLead.feature",
					glue="steps",
					monochrome=true,
					publish=true
					//tags = "@smoke or @functional" //to execute all scenarios having @smoke
				)

public class CreateLeadRunner extends AbstractTestNGCucumberTests {
	

}