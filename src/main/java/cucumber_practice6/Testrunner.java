package cucumber_practice6;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber.json"}
		,features = "Feature6"
		,glue= {"step_defination"}
		)

public class Testrunner {

}
