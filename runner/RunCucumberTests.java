package runner;

import io.cucumber.testng.CucumberOptions;
import stepDef.ProjectDefinitionMethods;

@CucumberOptions(features = "src/test/java/feature/EditLead.feature",
                 glue = "stepDef",
                 monochrome = true,
                 publish = true)
public class RunCucumberTests extends ProjectDefinitionMethods{

}
