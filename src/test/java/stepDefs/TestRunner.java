package stepDefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

/*
 * tags = {"@tag"} is unchanged
 * 
 * tags = {"~tag"} becomes tags = {"not tag"}
 * 
 * tags = {"@tag1,@tag2") becomes tags = {"@tag1 or @tag2"}
 * 
 * tags = {"@tag1","@tag2"} becomes tags = {"@tag1 and @tag2"}
 * 
 * tags = {"@tag1","@tag2,@tag3"} becomes tags = {"@tag1 and (@tag2 or @tag3)"}
 */
@CucumberOptions(
		plugin = {"html:target/html-cucmber", "json:target/cucumber.json"},
		features = "src/test/java/features",
		tags = {"@Feature_Login"},
		// tags = {"@Sanity"}, // runs single tag
		// tags = {"@Sanity, @Regression"}, runs multiple tags either comma/OR
		// tags = {"@Sanity or @Regression"}, runs multiple tags either comma/OR
		// tags = {"@Regression and @Rapid"}, runs tags with both present using AND
		// tags = {"@Regression", "@Rapid"}, // runs tags with both present using separate tags
		// tags = {"@Sanity or @Regression and @Rapid"},
		// tags = {"@Calculator_Feature"},
		glue = {"stepDefs"}
		)
public class TestRunner {

}
