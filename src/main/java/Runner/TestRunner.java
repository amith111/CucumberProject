package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Users\\amith\\Desktop\\Performance_task\\src\\main\\java\\features"
		
		,glue = {"C:\\Users\\amith\\Desktop\\Performance_task\\src\\main\\java\\stepDefenations"}
		
//		format = {"pretty","html :test-outout"}
		)

public class TestRunner {

}
