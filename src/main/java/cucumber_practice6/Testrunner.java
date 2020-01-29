package cucumber_practice6;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature6"
		,glue= {"step_defination"}
		)

public class Testrunner {

}
